import React from "react";
import { Header } from "./components/Header/Header";
import { Pages } from "./components/Pages";
import "boxicons";
import { DataProvider } from "./context/Dataprovider";

function App() {
  return (
    <DataProvider>
    <div className="App">
      <div>
        <Header />
      </div>

      <div>
        <Pages />
      </div>
    </div>
    </DataProvider>
  );
}

export default App;
