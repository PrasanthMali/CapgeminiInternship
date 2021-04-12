// import logo from './logo.svg';
import './App.css';
// import FormControl4 from './components/formcontrol4';
// import UpdateAdmin from './components/updateReq';
// import Routes from './Route';
import LikesCount from './components/hoc/LikesCount';
import CommentsCount from './components/hoc/CommentCount';
import NameFormComponent from './components/ref/NameFormComponent';

function App() {
  return (  
    <div>
      <CommentsCount/>
      <LikesCount/>
      <NameFormComponent/>     
    </div>   
    // <Routes/>       
    // <FormControl4/>
    // <UpdateAdmin/>
    // <AdminComponent/> 
   );
}

export default App;
