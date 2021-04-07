import logo from './logo.svg';
import './App.css';
import WelcomComponent from './components/WelcomeComponent';
import HelloComponent from './components/HelloComponent';
import FullNameComponent from './components/FullNameComponent';
import ListComponent from './components/ListComponent';
function App() {
  return (
    <div>
      <WelcomComponent/>
      <HelloComponent/>
      <FullNameComponent/>
      <ListComponent/>
    </div>
   
  );
}

export default App;