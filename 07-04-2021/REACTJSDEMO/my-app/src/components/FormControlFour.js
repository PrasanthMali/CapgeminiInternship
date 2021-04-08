import React from 'react';
class FormComponent4 extends React.Component {
    constructor() {
        super();
        this.state = {
            username:'',
            email: '',
            text:'',
            flavour:''
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
        alert("Text:"+this.state.text);
        alert("Flavour:"+this.state.flavour);
        // event.preventDefault();
    }
    render() {
        return (    
            <div> 
                <h2>Form Control 04</h2>  
            <form onSubmit={this.handleSubmit}>
                <label>Name:<input type="text" name="username" value={this.state.username} onChange={this.handleInputChange}/></label>
                <label>Email:<input type="text" name="email" value={this.state.email} onChange={this.handleInputChange}/></label>
                <label>Description:<textarea name="text" value={this.state.text} onChange={this.handleInputChange}/></label>
                <label>Pick your favorite flavor:
                    <select value={this.state.select} onChange={this.handleInputChange}>
                        <option value="grapefruit">Grapefruit</option>
                        <option value="lime">Lime</option>
                        <option value="coconut">Coconut</option>
                        <option value="mango">Mango</option>
                    </select>
                </label>
                <input type="submit" value="Submit" />
            </form>
            <h3>Username: {this.state.username}</h3>
            <h3>Email: {this.state.email}</h3>
            <h3>Description: {this.state.text}</h3>
            <h3>Flavour: {this.state.select}</h3>
            </div>     
        );
    }
}
export default FormComponent4;