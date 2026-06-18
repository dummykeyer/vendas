import { ApiForm } from "../components";
import { Link } from "react-router-dom";
import { vendasService } from "../services/vendas.service";

export default function NovoVendaPage() {
  return (
    <div className="page">
      <Link to=".." relative="path" className="btn btn-outline btn-sm back-btn">← Voltar</Link>
      <h2 className="page-title">{`Cadastrar Venda`}</h2>
      <Link className="btn btn-outline" to="/vendas" style={{ margin: "0 0 20px 0" }}>{`Voltar para Listagem`}</Link>
      <ApiForm submit={vendasService.create} fields={[{"name":"dataVenda","label":"Data da Venda","type":"date","required":true},{"name":"valorTotal","label":"Valor Total","type":"number","required":true},{"name":"cliente","label":"Cliente","type":"text","required":true}]} submitLabel={`Salvar Venda`} />
    </div>
  );
}
