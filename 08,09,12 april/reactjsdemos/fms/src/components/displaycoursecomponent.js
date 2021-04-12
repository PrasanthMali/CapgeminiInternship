import React from 'react';
 
function DisplayCourseComponent(props) {
 
    return (
        <div>
            {
                props.courselist.map((course,index) => <div>{index+1}-{course}</div>)
            }
        </div>
    );
}
 
export default DisplayCourseComponent;