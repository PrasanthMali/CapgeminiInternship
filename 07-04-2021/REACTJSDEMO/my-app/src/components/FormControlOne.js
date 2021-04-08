import React from 'react';
class FormComponent1 extends React.Component {
    constructor() {
        super();
        this.state = {
            username:''
        }
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleChange(event) {
        this.setState({
            username:event.target.value
        })
    }
    handleSubmit(event) {
        alert("Name: "+this.state.username);
    }
    render() {
        return (    
            <div> 
                <h2>Form Control 01</h2>  
            <form onSubmit={this.handleSubmit}>
                <label>Name:<input type="text" name="name" value={this.state.username} onChange={this.handleChange}/></label>
                <input type="submit" value="Submit" />
            </form>
            <h3>Username: {this.state.username}</h3>
            </div>     
        );
    }
}
export default FormComponent1;