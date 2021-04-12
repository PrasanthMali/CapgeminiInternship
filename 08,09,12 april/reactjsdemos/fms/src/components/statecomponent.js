import React from 'react';

class StateComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            counter: 0          
        }        
    }
    increment = () => {
        this.setState(state =>({
            counter : state.counter+1
        }));
    }

    decrement = () => {
        this.setState(state =>({
            counter : state.counter-1
        }));
    }

    render() {
        return (
            <div>
                <p>value:{this.state.counter}</p>
                <button onClick={this.increment}>+</button>
                <button onClick={this.decrement}>-</button>
            </div>
        )
    }

}
export default StateComponent;