import * as React from "react";
import { Component } from "react";
import "../../style/global.css";
import "../../style/sector_details.css";
import collapse from "../../images/collapse.png";
import Map from "../map/map";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import { Link } from "gatsby";
import App from "..";
import plot from "../../images/plot.png";

class SectorDetails extends Component{
    constructor(){
        super();
    }

    render(){
        return(
            <div className="sectorContainer">
                <div className="upperContainer">
                    <div className="sectorHeader">
                        <h1>{this.props.sector_name}</h1>
                        <p className="dangerLevel">
                        Poziom zagrożenia: <br></br> umiarkowany
                        </p>
                    </div>
                    <image className="collapse">
                        <Link to={"/"}>
                            <img className="collapseIcon" src={collapse} alt="X"></img>
                        </Link>
                   </image>
                </div>
                <div className="chartNavbar">
                    <ul>
                        <li>Temperatura</li>
                        <li>Wiatr</li>
                        <li>Wilogność powietrza</li>
                        <li>Wilogność ściółki</li>
                        <li>Stężenie PM2,5</li>
                        <li>Stężenie CO2</li>
                    </ul>
                </div>
                <div className="chart">
                    <img src={plot} alt="chart"></img>
                </div>
                <ul className="parameters">
                    <li>Temperatura: 22°C</li>
                    <li>Wiatr: 17km/h NE</li>
                    <li>Wilogność powietrza: 46%</li>
                    <li>Wilogność ściółki: 24%</li>
                    <li>Stężenie PM2,5: 50µg/m³</li>
                    <li>Stężenie CO2: 400ppm</li>
                </ul>
            </div> 
        )
    }
}

export default SectorDetails;
