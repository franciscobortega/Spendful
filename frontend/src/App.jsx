import { useState, useEffect } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import ExpenseForm from "./ExpenseForm";

function App() {
  const [count, setCount] = useState(0);

  const [hello, setHello] = useState("");

  useEffect(() => {
    fetch("./api/hello")
      .then((res) => res.text())
      .then((data) => setHello(data));
  }, []);

  return (
    <>
      <div>
        <a href="https://vitejs.dev" target="_blank">
          <img src={viteLogo} className="logo" alt="Vite logo" />
        </a>
        <a href="https://react.dev" target="_blank">
          <img src={reactLogo} className="logo react" alt="React logo" />
        </a>
      </div>
      <h1>{hello}</h1>
      {ExpenseForm}
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  );
}

export default App;
