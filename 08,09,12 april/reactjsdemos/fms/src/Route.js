import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import AdminListComponent from './components/AdminListComponent';
import EmployeeDeleteForm from './components/deleteReq';
import AdminComponent from './components/getbyidcomponent';
import LandingComponent from './components/LandingComponent';
import EmployeeForm from './components/PostReq';
import UpdateAdmin from './components/updateReq';
 
const Routes = () => (
    <BrowserRouter>
        <Switch>
            <Route path='/' component={LandingComponent} exact />
            <Route path='/addadmin' component={EmployeeForm}/>       
            <Route path={`/deleteadmin`} component={EmployeeDeleteForm} />
            <Route path={`/getalladmins`} component={AdminListComponent} />
            <Route path={`/updateadmin`} component={UpdateAdmin}/>
            <Route path={`/getadmin/:id`} component={AdminComponent}/>
        </Switch>
    </BrowserRouter>
);
 
export default Routes;