import * as React from "react";
import { Component } from "react";
import "../../style/global.css";
import "../../style/map_sidebar.css";

class MapSidebar extends Component {
	constructor() {
		super();
	}

	render() {
		return(
			<div className="mapSidebarContainer">
                <h1 className="forestName">Las Pisarzowski</h1>
                <ul className="checkboxList">
                    <li>
                        <input type="checkbox" name="sensorType"/>
                        <label for="sensorType">Typ czujki</label>
                    </li>
                    <li>
                        <input type="checkbox" name="firefightersPosition"/>
                        <label for="firefightersPosition">Pozycja strażaków</label>
                    </li>
                    <li>
                        <input type="checkbox" name="forestType"/>
                        <label for="forestType">Typ lasu</label>
                    </li>
                </ul>
                <div className="sidebarButtons">
                    <button>Dodaj czujkę</button>
                    <button>Wyloguj</button>
                </div>
			</div>
		)
	}

}

export default MapSidebar;