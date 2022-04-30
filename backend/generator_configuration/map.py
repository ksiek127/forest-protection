from dataclasses import dataclass

@dataclass
class Map:
    forest_name: str
    height: int
    width: int
    sector_size: float # [m]
    sectors: list[dict]
