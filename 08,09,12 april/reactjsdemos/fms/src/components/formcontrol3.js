import react from 'react';

class FormControl3 extends react.Component {
    constructor() {
        super();
        this.state = {
            username: '',
            email: '',
            department: ''
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
        alert("Name: " + this.state.username);
        alert("Email: "+this.state.email);
        alert("Department: "+this.state.department);
    }

    render() {

        return (
            <div>
                <h2>FormController 3</h2>
                <form onSubmit={this.handleSubmit}>
                    <label>Name:<input type="text" name="username" value={this.state.username} onChange={this.handleInputChange} /></label>
                    <label>Email:<input type="text" name="email" value={this.state.email} onChange={this.handleInputChange} /></label>
                    <label>
                        Enter the department:
                    <select name="department" department={this.state.department} onChange={this.handleInputChange}>
                            <option department="cse">CSE</option>
                            <option department="ece">ECE</option>
                            <option department="eee">EEE</option>
                            <option department="mech">MECH</option>
                        </select>
                    </label>
                    <input type="submit" value="Submit" />
                </form>

                <h3>Username: {this.state.username}</h3>
                <h3>Email: {this.state.email}</h3>
                <h3>Department:{this.state.department}</h3>
            </div>
        );
    }
}
export default FormControl3;