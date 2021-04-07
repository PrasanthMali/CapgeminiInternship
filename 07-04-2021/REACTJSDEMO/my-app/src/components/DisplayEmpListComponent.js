import React from 'react';
 
function DisplayEmpListComponent(props) {
 
    return (
        <div>
            {
                props.emplist.map(emp => <div>{emp.empno}-{emp.name}-{emp.email}</div>)
            }
        </div>
    );
}
 
export default DisplayEmpListComponent;