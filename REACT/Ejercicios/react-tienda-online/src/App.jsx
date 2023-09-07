import { Header } from "./components/Header/Header";
import { Pages } from "./components/Pages";
import "boxicons";

function App() {
  return (
    <div className="App">
      <div>
        <Header />
      </div>

      <div>
        <Pages />
      </div>
    </div>
  );
}

export default App;
