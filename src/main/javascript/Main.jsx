import React, { Component } from "react";
import ReactDOM from 'react-dom';
import './main.css';

class Main extends Component {
    render() {
        return (
            <div id="main">
                <h1>React Cot</h1>
                <img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"/>
            </div>
        );
    }
}

ReactDOM.render(
    <Main />,
    document.getElementById('react-app')
);