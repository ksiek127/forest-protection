import datetime
from dataclasses import dataclass

@dataclass
class Sector:
    sector_name: str
    position: [int, int]
    time: datetime.datetime
    level_of_threat: str # {low, medium, high} TODO uncompleted, probably more
    temperature: float # [°C]
    wind_direction: str # {N, NE, E, SE, S, SW, W, NW}
    wind_speed: float # [m/s]
    air_humidity: float # [%]
    litter_moisture: float # [%]
    aerosol_concentration: float # [μg/m^3]
    carbon_dioxide_concentration : float # [ppm]