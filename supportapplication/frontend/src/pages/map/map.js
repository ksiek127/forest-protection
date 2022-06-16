import * as React from "react";
import { Component } from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import { Link } from "gatsby";
import map from "../../images/map.jpg";
import "../../style/map.css";
import { forestData } from "../../config/config";
import Sector from "./sector";

class Map extends Component {
  sectors = []
  width;
  height;
  sectorsRef;
  sectorData = [];
  // sectorsInitialized = false;

  constructor(){
    super();
    this.width = forestData.width;
    this.height = forestData.height;
    this.sectorData = forestData.sectors;
    this.initSectors(this.width, this.height);
    console.log(this.sectors);
  }

  initSectors = function(width, height){
    for(let i=0; i<width; i++){
      let row = [];
      for(let j=0; j<height; j++){
        row.push(new Sector(this.sectorData[width * i + j].sector_name));
      }
      this.sectors.push(row);
    }
    // this.sectorsInitialized = true;
  }

  render() {
    // if(!this.sectorsInitialized) return null;
    return (
        <div className="mapContainer">
          <img
            className="mapImg"
            alt="Mapa lasu"
            src={map}
          />
          <div className="sectorsContainer">
            {this.sectorData.map((s) => (<Link className='sector' to={'/sector/' + s.sector_name} key={s.sector_name}
            style={{backgroundColor: s.level_of_threat == "low" ? "green" : s.level_of_threat == "moderate" ? "blue" : s.level_of_threat == "high" ? "yellow" : s.level_of_threat == "veryHigh" ? "orange" : s.level_of_threat == "extreme" ? "red" : "gray"}}></Link>))}
          </div>
        </div>
    );
  }
}

export default Map;
