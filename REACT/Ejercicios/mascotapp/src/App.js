import "./App.css";
import { Detail } from "./components/public/Detail";
import { Footer } from "./components/public/Footer";
import Main from "./components/public/Main";
import Navbar from "./components/public/Navbar";
import { Switch, Route} from "react-router-dom";
import { UserForm } from "./components/public/UserForm";

function App() {
  return (
    <div>
      <Navbar />
      
      <Switch>
        <Route exact path={"/"} component={Main} />
        <Route path={"/details/:id"} component={Detail} />
        <Route path={"/user-form"} component={UserForm} />
      </Switch>
     
      <Footer />
    </div>
  );
}

export default App;
