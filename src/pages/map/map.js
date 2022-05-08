import * as React from "react";
import { Component } from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import { Link } from "gatsby";
import map from "../../images/map.jpg";
import "../../style/map.css";
import SectorDetails from "../sector/sector_details";
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
            {this.sectorData.map((s) => (<Link className='sector' to={'/sector/sector_details/:' + s.sector_name} key={s.sector_name}></Link>))}
          </div>
        </div>
    );
  }
}

export default Map;
