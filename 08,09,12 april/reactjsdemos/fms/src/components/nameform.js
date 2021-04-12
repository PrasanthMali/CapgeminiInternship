import react from 'react';

class NameForm extends react.Component {
    constructor(props) {
        super(props)
        this.state={
            username:''
        };
        this.handleChange=this.handleChange.bind(this);
        this.handleSubmit=this.handleSubmit.bind(this)
    }
    handleChange(event) {
        this.setState({username: event.target.value});
      }
    handleSubmit(event) {
        alert("user name is:" +this.state.username)
    }

    render() {
        return(
            <form onSubmit={this.handleSubmit} >
                <label>
                    Name:<input type="text" value={this.state.username} onChange={this.handleChange}/>
                </label>
                <input type="submit" value="submit"/>
                <h3>UserName:{this.state.username}</h3>
            </form>
        )
    }
}

export default NameForm;