import React, { Component } from 'react'

export default class ConsructorDemo extends Component {
  constructor(props){
    super(props)
    this.state = {
      name: 'Constructor Method'
    }
  }
  render() {
    return (
      <div>
       <p> You have called a {this.state.name}</p>
      </div>
    )
  }
}