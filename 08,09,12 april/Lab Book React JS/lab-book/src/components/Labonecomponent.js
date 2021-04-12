import React from 'react';
 
class Labonecomponent extends React.Component {
 
    constructor() {
        super();
        this.state = {
            id:'',
            name: '',
            salary: '',
            department: ''
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
        alert(this.state.id+" "+this.state.name+" "+this.state.salary+" "+this.state.department);
    }
 
    render() {
 
        return (    
            <div> 
                <h2>React JS Lab Book - 01</h2>  <br></br>
                <form onSubmit={this.handleSubmit}>
                    <label>id:<input type="text" name="id" value={this.state.id} onChange={this.handleInputChange}/></label><br></br><br></br>
                    <label>name:<input type="text" name="name" value={this.state.name} onChange={this.handleInputChange}/></label><br></br><br></br>
                    <label>salary:<input type="text" name="salary" value={this.state.salary} onChange={this.handleInputChange}/></label><br></br><br></br>
                    <label>department:<input type="text" name="department" value={this.state.department} onChange={this.handleInputChange}/></label><br></br><br></br>
                    <input type="submit" value="Submit" />
                </form>

                <h3>id: {this.state.id}</h3>
                <h3>name: {this.state.name}</h3>
                <h3>salary: {this.state.salary}</h3>
                <h3>department: {this.state.department}</h3>
            </div>     
        );
    }
}
 
export default Labonecomponent;