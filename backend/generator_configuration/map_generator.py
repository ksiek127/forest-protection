from sector import Sector
from map import Map
from random import uniform, randint
from datetime import datetime
import json
from json_formatter import *
import sys
from os.path import exists


def random_float(_from, _to, rounded: int) -> float:
    prefix = '{0:.' + str(rounded) + 'f}'
    return prefix.format(round(uniform(_from, _to), rounded))


class MapGenerator:
    def __init__(self, name, height, width, size):
        # list_of_sectors = self.random_initial_sector(height, width)
        list_of_sectors = self.empty_initial_sector(height, width)
        self.map = Map(forest_name=name,
                       height=height,
                       width=width,
                       sector_size=size,
                       sectors=list_of_sectors)

    @staticmethod
    def empty_initial_sector(height, width) -> list[Sector]:
        list_of_sectors = []
        for y in range(height):
            for x in range(width):
                list_of_sectors.append(
                    Sector(id=str(y) + "_" + str(x),
                           position=[y, x],
                           time=datetime.now().strftime("%d/%m/%Y %H:%M:%S"),
                           threat_level="none",
                           state_of_fire="none",
                           temperature=None,
                           wind_direction=None,
                           wind_speed=None,
                           air_humidity=None,
                           plant_litter_moisture=None,
                           aerosol_concentration=None,
                           carbon_dioxide_concentration=None))
        return list_of_sectors

    def random_initial_sector(self, height, width) -> list[Sector]:
        list_of_sectors = []
        for y in range(height):
            for x in range(width):
                list_of_sectors.append(
                    Sector(id=str(y) + "_" + str(x),
                           position=[y, x],
                           time=datetime.now().strftime("%d/%m/%Y %H:%M:%S"),
                           threat_level=self.random_threat_level(),
                           state_of_fire="none",
                           temperature=random_float(_from=15, _to=20, rounded=2),
                           wind_direction=self.random_wind_direction(),
                           wind_speed=random_float(_from=0, _to=1.5, rounded=2),
                           air_humidity=random_float(_from=40, _to=60, rounded=0),
                           plant_litter_moisture=random_float(_from=15, _to=45, rounded=0),
                           aerosol_concentration=random_float(_from=20, _to=80, rounded=0),
                           carbon_dioxide_concentration=random_float(_from=200, _to=400, rounded=0)))
        return list_of_sectors

    @staticmethod
    def random_threat_level() -> str:
        threat_level = ["none", "low", "medium", "high"]
        return threat_level[randint(0, len(threat_level) - 1)]

    @staticmethod
    def random_wind_direction() -> str:
        directions = ["N", "NE", "E", "SE", "S", "SW", "W", "NW"]
        return directions[randint(0, len(directions) - 1)]

if __name__ == '__main__':
    filename = sys.argv[1]
    name = sys.argv[2]
    height = int(sys.argv[3])
    width = int(sys.argv[4])
    sector_size = float(sys.argv[5])
    directory_path = '../../utils/json_maps/' + filename + '.json'
    if exists(directory_path):
        print('Filename reserved. Cannot overwrite the file')
    else:
        generated_map = MapGenerator(name, height, width, sector_size).map
        json_map = format_map(generated_map)
        save_map(json_map, filename, directory_path)
