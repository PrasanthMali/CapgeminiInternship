
import React from 'react';
import PropTypes from 'prop-types';

function Customer(props) {
    return (
        <div>
            <h1>{props.firstName} {props.lastName}</h1>
            <p>Age: {props.age}</p>
            <p>Gender: {props.gender}</p>
        </div>
    );

}

Customer.propTypes = {
    firstName: PropTypes.string,
    lastName: PropTypes.string,
    age: PropTypes.number.isRequired,
    gender: PropTypes.oneOf(['female', 'male'])

};
export default Customer;