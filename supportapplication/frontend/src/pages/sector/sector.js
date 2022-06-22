import * as React from "react";
import { Component } from "react";
import "../../style/global.css";
import "../../style/sector.css";
import collapse from "../../images/collapse.png";
import Map from "../map/map";
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";
import App from "..";
import plot from "../../images/plot.png";

class Sector extends Component{
    constructor(){
        super();
    }

    render(){
        return(
            <Router>
                <Switch>
                    <Route exact path="/sector/sector">
                        <div className="sectorContainer">
                            <div className="upperContainer">
                                <div className="sectorHeader">
                                    <h1>Sektor 421</h1>
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
                    </Route>
                    <Route exact path="/">
                        <Link to={"/sector/sector"}>
							<Map className="map"/>
						</Link>
                    </Route>
                </Switch>
            </Router>
        )
    }
}

export default Sector;
