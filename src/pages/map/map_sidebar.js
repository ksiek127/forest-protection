import * as React from "react";
import { Component } from "react";
import "../../style/global.css";
import "../../style/map_sidebar.css";

class MapSidebar extends Component {
    forestName = "Las";

	constructor() {
		super();
        this.readJson();
	}

    readJson = function(){
        fetch('config.json')
        .then(response => {
            return response.json();
        }).then((data) => {
            console.log(data);
        })
    }

	render() {
		return(
			<div className="mapSidebarContainer">
                <h1 className="forestName">{this.forestName}</h1>
                <ul className="checkboxList">
                    <li>
                        <input type="checkbox" name="sensorType"/>
                        <label htmlFor="sensorType">Typ czujki</label>
                    </li>
                    <li>
                        <input type="checkbox" name="firefightersPosition"/>
                        <label htmlFor="firefightersPosition">Pozycja strażaków</label>
                    </li>
                    <li>
                        <input type="checkbox" name="forestType"/>
                        <label htmlFor="forestType">Typ lasu</label>
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