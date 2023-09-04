import {MiComponente} from './miComponente'
import NavBar from './navBar'
import Main2 from './Main2'
import Footer from './Footer'

import './App.css'

function App() {
  return (
    <>
    <div className="App">
      <h1>App en React/Vite</h1>
      <MiComponente/>
      
    </div>
    <div>
      <NavBar />
      <Main2 />
      <Footer />
    </div>

      
    </>
  )
}

export default App
