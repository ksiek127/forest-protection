import * as React from "react";
import { Component } from "react";
import "../../style/global.css";
import "../../style/add_sensor.css";

class AddSensor extends Component{
    constructor(){
        super();
    }

    render(){
        return(
            <div className="addSensorContainer">
                <h1>Dodaj czujkę</h1>
            </div>
        )
    }
}

export default AddSensor;
