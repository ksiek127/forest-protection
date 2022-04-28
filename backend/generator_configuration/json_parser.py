from map import Map
from sector import Sector
import json


def parse_map(json_filename):
    with open(json_filename) as file:
        # return json.load(file)
        json_map = json.load(file)
        sectors = []
        for sector in json_map['sectors']:
            sectors.append(Sector(sector_name=sector['sector_name'],
                                  position=sector['position'],
                                  time=sector['time'],
                                  threat_level=sector['threat_level'],
                                  temperature=sector['temperature'],
                                  wind_direction=sector['wind_direction'],
                                  wind_speed=sector['wind_speed'],
                                  air_humidity=sector['air_humidity'],
                                  litter_moisture=sector['litter_moisture'],
                                  aerosol_concentration=sector['aerosol_concentration'],
                                  carbon_dioxide_concentration=sector['carbon_dioxide_concentration']))
        # print(sectors)
        return Map(forest_name=json_map['forest_name'],
                   height=json_map['height'],
                   width=json_map['width'],
                   sector_size=json_map['sector_size'],
                   sectors=sectors)


def parse_sector(json_filename, sector_name: str):
    with open(json_filename) as file:
        sectors = json.load(file)['sectors']
        for sector in sectors:
            if sector['sector_name'] == sector_name:
                return Sector(sector_name=sector['sector_name'],
                              position=sector['position'],
                              time=sector['time'],
                              threat_level=sector['threat_level'],
                              temperature=sector['temperature'],
                              wind_direction=sector['wind_direction'],
                              wind_speed=sector['wind_speed'],
                              air_humidity=sector['air_humidity'],
                              litter_moisture=sector['litter_moisture'],
                              aerosol_concentration=sector['aerosol_concentration'],
                              carbon_dioxide_concentration=sector['carbon_dioxide_concentration'])


filename = 'filled_100x100.json'
directory_path = '../../utils/json_maps/' + filename

# sample_execution
# print(parse_sector(directory_path, '1_3'))
# print(parse_map(directory_path))
