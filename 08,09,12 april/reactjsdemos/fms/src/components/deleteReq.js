import React from 'react';
import Axios from 'axios';
import { Button } from 'reactstrap'

class EmployeeDeleteForm extends React.Component {
    constructor() {
        super();
        this.state = {
            id: ''

        }
        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleInputChange(event) {
        this.setState({
            [event.target.name]: event.target.value
        })
    }

    handleSubmit(event) {
        event.preventDefault();
        Axios.delete(`http://localhost:8094/admins/deleteadmin/${this.state.id}`)
            .then(res => {
                console.log(res.admin);
            })
    }



    render() {

        return (
            <div>
                <form onSubmit={this.handleSubmit} >
                    <label>id:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label><br/><br/>

                    <Button variant="primary" type="submit">
                     Submit
                    </Button>
                </form>
            </div>
        );
    }
}
export default EmployeeDeleteForm;