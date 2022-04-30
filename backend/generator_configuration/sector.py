import datetime
from dataclasses import dataclass

@dataclass
class Sector:
    sector_name: str
    position: [int, int]
    time: datetime.datetime
    threat_level: str # {none, low, medium, high} TODO uncompleted, probably more
    state_of_fire: str # {none, low, medium, high}
    temperature: float # [°C]
    wind_direction: str # {N, NE, E, SE, S, SW, W, NW}
    wind_speed: float # [m/s]
    air_humidity: float # [%]
    plant_litter_moisture: float # [%]
    aerosol_concentration: float # [μg/m^3]
    carbon_dioxide_concentration : float # [ppm]
