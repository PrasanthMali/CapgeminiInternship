import React from 'react';
import DisplayCourseComponent from './displaycoursecomponent';
import DisplayEmpListComponent from './displayemplistcomponent';
 
function ListComponent() {
 
    let courses = ["java","angular","react"];
 
    let employees = [
        {
          "empno":101,
          "name": "raj",
          "email": "raj@tamil.com"
        },
          {
          "empno":102,
          "name": "sam",
          "email": "sam@tamil.com"
        },
         {
          "empno":103,
          "name": "kiran",
          "email": "kiran@tamil.com"
        }
       ]
 
    
    return (
        <div>
            <DisplayCourseComponent courselist={courses}/>
            <DisplayEmpListComponent emplist={employees}/>
        </div>
        
    );
}
 
export default ListComponent;