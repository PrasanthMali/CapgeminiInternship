import React from 'react';
class FormComponent2 extends React.Component {
    constructor() {
        super();
        this.state = {
            username:'',
            email: ''
        }
        this.handleUsernameChange = this.handleUsernameChange.bind(this);
        this.handleEmailChange = this.handleEmailChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleUsernameChange(event) {
        this.setState({
            username:event.target.value
        })
    }

    handleEmailChange(event) {
        this.setState({
            email:event.target.value
        })
    }

    handleSubmit(event) {
        alert("Name: "+this.state.username);
        alert("Email:"+this.state.email);
    }
    render() {
        return (    
            <div>  
                <h2>Form Control 02</h2> 
            <form onSubmit={this.handleSubmit}>
                <label>Name:<input type="text" name="name" value={this.state.username} onChange={this.handleUsernameChange}/></label>
                <label>Email:<input type="text" name="email" value={this.state.email} onChange={this.handleEmailChange}/></label>
                <input type="submit" value="Submit" />
            </form>
            <h3>Username: {this.state.username}</h3>
            <h3>Email: {this.state.email}</h3>
            </div>     
        );
    }
}
export default FormComponent2;