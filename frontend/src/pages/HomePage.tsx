import { Hero } from "../components";

export default function HomePage() {
  return (
    <div className="page">
      <h2 className="page-title">{`CRUD de Vendas`}</h2>
      <Hero title={`Bem-vindo ao CRUD de Vendas`} subtitle={`Sistema para gestão de vendas`} />
    </div>
  );
}
