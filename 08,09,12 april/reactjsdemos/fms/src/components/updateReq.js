import React from 'react';
import Axios from 'axios';
import { Button } from 'reactstrap'

class UpdateAdmin extends React.Component {
    constructor() {
        super();
        this.state = {
            id: '',
            name: '',
            password: ''

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
        const admin = {
            adminId: this.state.id,
            adminName: this.state.name,
            adminPassword: this.state.password

        }
        Axios.put(`http://localhost:8094/admins/updateadmin/${this.state.id}`, admin)
            .then(res => {
                console.log(res.admin);
            })
    }



    render() {

        return (
            <div>
                <form onSubmit={this.handleSubmit} >
                    <label>id:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange} /></label><br /><br />
                    <label>name:<input type="text" name="name" value={this.state.name} onChange={this.handleInputChange} /></label><br /><br />
                    <label>password:<input type="password" name="password" value={this.state.password} onChange={this.handleInputChange} /></label><br /><br />
                    <Button variant="primary" type="submit">
                        Submit
                    </Button>
                </form>
            </div>
        );
    }
}
export default UpdateAdmin;