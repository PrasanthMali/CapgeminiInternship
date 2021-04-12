import React from 'react';
import GuestGreeting from './guestgreetingcomponent';
import UserGreeting from './usergreetingcomponent';

function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
        return <UserGreeting/>;
    }
    return <GuestGreeting/>;
}
export default Greeting