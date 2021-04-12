import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Table } from 'reactstrap';
import Axios from 'axios';

class AdminComponent extends React.Component {
    constructor() {
        super();
        this.state = {
            admin:{}
        }

    }

    componentDidMount() {
        let id = this.props.match.params.id
        Axios.get("http://localhost:8094/admins/getadmin/"+id).then(response => {
            const admins = response.data;
            this.setState({
                admin: admins
            });
        });
    }
    render() {

        return (
            <div>
                <h3>Admin By Id</h3>
                {
                this.state.admin !== undefined ?
                <Table striped bordered hover size="sm">
                    <thead>
                        <tr>
                            <th>AdminId</th>
                            <th>AdminName</th>
                        </tr>
                    </thead>
                    <tbody>
                      {
                          <tr>
                          <td>{this.state.admin.adminId}</td>
                          <td>{this.state.admin.adminName}</td>
                      </tr>
          
                      }  
                                
                    </tbody>
                
                </Table>
                :
                <h3>Loading</h3>
                };
            </div>
        );
    }
}
export default AdminComponent;