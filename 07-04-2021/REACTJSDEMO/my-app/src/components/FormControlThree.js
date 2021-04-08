import React from 'react';
class FormComponent3 extends React.Component {
    constructor() {
        super();
        this.state = {
            username:'',
            email: ''
        }
        this.handleInputChange = this.handleInputChange.bind(this);       
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleInputChange(event) {
        this.setState({
            [event.target.name]:event.target.value
        })
    }   
    handleSubmit(event) {
        alert("Name: "+this.state.username);
        alert("Email:"+this.state.email);
    }
    render() {
        return (    
            <div>
                <h2>Form Control 03</h2>   
            <form onSubmit={this.handleSubmit}>
                <label>Name:<input type="text" name="username" value={this.state.username} onChange={this.handleInputChange}/></label>
                <label>Email:<input type="text" name="email" value={this.state.email} onChange={this.handleInputChange}/></label>
                <input type="submit" value="Submit" />
            </form>
            <h3>Username: {this.state.username}</h3>
            <h3>Email: {this.state.email}</h3>
            </div>     
        );
    }
}
export default FormComponent3;