import React from 'react';
import PropTypes from 'prop-types';

class Greets extends React.Component {
    render() {
        return(
            <div style={{backgroundColor: "lightblue"}}>
                <h1>Welcome back! {this.props.firstname} {this.props.lastname}</h1>
                <h1  style={{color: "red"}}>Hi! {this.props.firstname}</h1>
            </div>

        );
    }
}
Greets.propTypes = {
    firstname: PropTypes.string,
    lastname: PropTypes.string,

};
export default Greets;