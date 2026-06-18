import { NavLink, Route, Routes } from "react-router-dom";
import HomePage from "./pages/HomePage";
import VendasPage from "./pages/VendasPage";
import NovoVendaPage from "./pages/NovoVendaPage";

export default function App() {
  return (
    <div className="app">
      <header className="navbar">
        <div className="navbar-inner">
          <span className="brand">CRUD de Vendas</span>
          <nav className="nav-links">
            <NavLink to="/vendas" className={({ isActive }) => (isActive ? "nav-link active" : "nav-link")}>Vendas</NavLink>
          </nav>
        </div>
      </header>
      <main className="content">
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/vendas" element={<VendasPage />} />
          <Route path="/vendas/novo" element={<NovoVendaPage />} />
        </Routes>
      </main>
    </div>
  );
}
