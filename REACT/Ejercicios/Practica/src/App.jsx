import  React  from "react";
import  Contador  from "./components/Contador";
import  Jsx  from "./components/Jsx";
import Temperatura from "./components/Temperatura";
import Lista from "./components/Lista";

function App() {
  return (
    <div>
      <h1 className="titulo">PRACTICA EN REACT Y HOOKS</h1>
      <Contador />
      <Jsx />
      <Temperatura />
      <Lista />
    </div>
  );
}

export default App;
