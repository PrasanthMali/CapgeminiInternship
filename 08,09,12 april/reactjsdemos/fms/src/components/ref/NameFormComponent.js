import React, { Component } from "react";
 
export default class NameForm extends Component {
    constructor(props) {
      super(props);
      this.handleSubmit = this.handleSubmit.bind(this);
      this.name = React.createRef();
      this.email = React.createRef();
    }
  
    handleSubmit(event) {
      alert(this.name.current.value+ " "+this.email.current.value);
      event.preventDefault();
    }
  
    render() {
      return (
        <form onSubmit={this.handleSubmit}>
          <label>
            Name:
            <input type="text" ref={this.name}  defaultValue="Bob"  />
          </label>
          <label>
            Email:
            <input type="text" ref={this.email} />
          </label>
          <input type="submit" value="Submit" />
        </form>
      );
    }
  }