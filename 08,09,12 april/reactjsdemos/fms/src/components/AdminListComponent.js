import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Table } from 'reactstrap';
import Axios from 'axios';
import { Link } from 'react-router-dom';

class AdminListComponent extends React.Component {
    constructor() {
        super();
        this.state = {
            adminList: []
        }

    }

    componentDidMount() {
        Axios.get("http://localhost:8094/admins/getalladmins").then(response => {
            const admins = response.data;
            this.setState({
                adminList: admins
            });
        });
    }
    render() {

        return (
            <div>
                <h3>Admins List</h3>
                <Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>AdminId</th>
                            <th>AdminName</th>
                            <th>Update</th>
                            <th>Delete</th>
                            <th>View</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.adminList !== undefined && (
                            this.state.adminList.map(admins =>
                                <tr>
                                    <td>{admins.adminId}</td>
                                    <td>{admins.adminName}</td>
                                    <td>
                                    <Link to={`/updateadmin`}>Update</Link>
                                    </td>
                                    <td>
                                    <Link to={`/deleteadmin`}>Delete</Link>
                                    </td>
                                    <td>
                                    <Link to={`/getadmin/${admins.adminId}`}>View</Link>
                                    </td>
                                </tr>
                            ))}
                    </tbody>
                </Table>

            </div>
        );
    }
}
export default AdminListComponent;