import { DataTable } from "../components";
import { Link } from "react-router-dom";
import { vendasService } from "../services/vendas.service";

export default function VendasPage() {
  return (
    <div className="page">
      <Link to=".." relative="path" className="btn btn-outline btn-sm back-btn">← Voltar</Link>
      <h2 className="page-title">{`Listagem de Vendas`}</h2>
      <div className="container-block">
        <Link className="btn btn-primary" to="/vendas/novo" style={{ margin: "0 0 16px 0" }}>{`Novo Venda`}</Link>
      </div>
      <DataTable load={vendasService.list} columns={[{"key":"dataVenda","label":"Data da Venda"},{"key":"valorTotal","label":"Valor Total"},{"key":"cliente","label":"Cliente"}]} idKey={"id"} fields={[{"name":"dataVenda","label":"Data da Venda","type":"date","required":true},{"name":"valorTotal","label":"Valor Total","type":"number","required":true},{"name":"cliente","label":"Cliente","type":"text","required":true}]} onUpdate={vendasService.update} onDelete={vendasService.remove} />
    </div>
  );
}
