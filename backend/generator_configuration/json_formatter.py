from map import Map
from sector import Sector
import json

def format_map(repr_map: Map):
    return json.dumps(repr_map, default=lambda o: o.__dict__, indent=4)

def format_sector(repr_sector: Sector): # TODO temporarily unused could be expanded or deleted at the end
    return json.dumps(repr_sector, default=lambda o: o.__dict__, indent=4)

def save_map(json_map, filename: str, directory_path: str):
    # attention, this function may overwrite the file
    with open(directory_path, 'w') as outfile:
        outfile.write(json_map)
        print('Map ' + filename + ' has been added to json_maps')