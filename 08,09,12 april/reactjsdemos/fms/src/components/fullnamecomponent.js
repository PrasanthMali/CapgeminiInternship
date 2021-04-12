import React from 'react';

export default function FullNameComponent() {
    const user= {
        fname:'Avinash',
        lname:"Nagella"
    };
    return (
        <h3 style={{color:'red'}}>Full name: {formatName(user)}</h3>
    );
}
function formatName(user) {
    return user.fname + ' '+ user.lname; 
}