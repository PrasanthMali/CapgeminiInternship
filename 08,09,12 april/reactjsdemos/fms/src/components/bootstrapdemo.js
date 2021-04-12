import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import { Button } from 'reactstrap';

function Bootdemo(props) {
    return (
        <div>
            <Button color="danger">Danger!</Button>
            <Button color="primary" >Primary</Button>
        </div>
    );
};
export default Bootdemo;