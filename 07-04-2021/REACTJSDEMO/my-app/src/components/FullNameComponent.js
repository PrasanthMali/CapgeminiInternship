import React from 'react';
export default function FullNameComponent() {
    const user = {
        fname: "Rohit",
        lname: "Sharma"
    };
    return (
        <h3 style={{backgroundColor:"red"}}>Full Name: {formatName(user) }</h3>
    );
}
function formatName(user) {
    return user.fname + ' ' + user.lname;
  }