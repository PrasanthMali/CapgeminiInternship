import logo from './logo.svg';
import './App.css';
// import WelcomComponent from './components/WelcomeComponent';
// import HelloComponent from './components/HelloComponent';
// import FullNameComponent from './components/FullNameComponent';
// import ListComponent from './components/ListComponent';
// import StatefulComponent from './components/StatefulComponent';
// import Toggle from './components/Toggle';
// import Greeting from './components/ConditionalRenderingDemo';
// import LoginButton from './components/LoginButton';
// import Greeting from './ConditionalRenderingDemo';
import LoginControl from './components/LoginControl';
import FormComponent1 from './components/FormControlOne';
import FormComponent2 from './components/FormControlTwo';
import FormComponent3 from './components/FormControlThree';
import FormComponent4 from './components/FormControlFour';
import Labonecomponent from './components/Labonecomponent';
import Lab3 from './components/Labthreecomponent';

function App() {
  return (
    <div>
      {/* <WelcomComponent/>
      <HelloComponent/>
      <FullNameComponent/>
      <ListComponent/> */}
      {/* <StatefulComponent/><br></br><br></br>
      <Toggle/> */}
      {/* <Greeting isLoggedIn={false}/>  */}
      {/* <Greeting isLoggedIn={true}/>
      <LoginControl/> */}
      <FormComponent1/><br></br><br></br>
      <FormComponent2/><br></br><br></br>
      <FormComponent3/><br></br><br></br>
      <FormComponent4/><br></br><br></br>
      <Labonecomponent/><br></br><br></br>
      <Lab3/>
    </div>
   
  );
}

export default App;