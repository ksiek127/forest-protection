import * as React from "react";
import { Component } from "react";
import { Link, Route, Switch } from "react-router-dom";
import map from "../../images/map.jpg";
import "../../style/map.css";
import Sector from "../sector/sector";

class Map extends Component {
  constructor(){
    super();
  }

  render() {
    return (
        <div className="map">
          <img
              className="mapImg"
              alt="Mapa lasu"
              src={map}
            />
        </div>
    );
  }
}

export default Map;
