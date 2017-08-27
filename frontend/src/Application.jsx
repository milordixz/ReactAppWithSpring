"use strict";
import React from 'react';

export class Application extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: 'World',
        };
    }

    render() {
        const a = 50;
        return <div>
            Hi {this.state.name}
            </div>

    }

}
