import * as React from "react";
import { Component } from "react";
import { BrowserRouter as Router, Link, Route, Switch } from "react-router-dom";
import { forestData } from "../../config/config";

class Sector extends Component{

    constructor(sectorName){
        super();
        this.sectorName = sectorName;
    }

    render(){
        return(
            // <Router>
            //     <Link to={"/sector/sector/" + this.id}></Link>
            // </Router>
            <Link to={"/sector/sector/" + this.sectorName}></Link>
        )
    }
}

export default Sector;