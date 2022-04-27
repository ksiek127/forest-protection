import * as React from "react";
import { Component } from "react";
import Map from "./map/map";
import MapSidebar from "./map/map_sidebar";
import "../style/global.css";
import "../style/mainpage.css";
import { Route, BrowserRouter as Router, Switch, Link } from "react-router-dom";
import Sector from "./sector/sector";

class App extends Component { // TODO: put this in App.js
	constructor() {
		super();
	}

	render() {
		return(
            <Router>
				<div className="mainpageContainer">
					<Switch>
						<Route exact path="/">
							<Link to={"/sector/sector"}>
								<Map className="map"/>
							</Link>
						</Route>
						<Route exact path="/sector/sector">
							<Sector className="sector"/>
						</Route>
					</Switch>
					<MapSidebar className="mapSidebar"></MapSidebar>
            	</div>
			</Router>
		)
	}

}

export default App;
