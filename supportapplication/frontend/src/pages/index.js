import * as React from "react";
import { Component } from "react";
import Map from "./map/map";
import MapSidebar from "./map/map_sidebar";
import "../style/global.css";
import "../style/mainpage.css";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";

class App extends Component { // TODO: put this in App.js
	constructor() {
		super();
	}

	render() {
		return(
            <Router>
				<div className="mainpageContainer">
					{/* <Switch>
						<Route exact path="/">
							<Link to={"/sector/sector_details"}>
								<Map className="map"/>
							</Link>
						</Route>
						<Route exact path="/sector/sector">
							<Sector className="sector"/>
						</Route>
					</Switch> */}
					<Map className="map"/>
					<MapSidebar className="mapSidebar"></MapSidebar>
            	</div>
			</Router>
		)
	}

}

export default App;
