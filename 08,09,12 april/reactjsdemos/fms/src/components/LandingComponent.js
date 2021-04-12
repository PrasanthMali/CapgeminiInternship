import React, { Component } from 'react';
 
import { Link } from 'react-router-dom';
 
class LandingComponent extends Component {
 
    render() {
        return (
            <div>
                <h2>Admin Page</h2>
                <p>
                    <Link to={`/addadmin`}>Add</Link>
                </p>
                <p>
                    <Link to={`/getalladmins`}>Get all</Link>
                </p>
 
            </div>
        );
 
    }
 
}
 
export default LandingComponent;