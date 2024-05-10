public class PratoPrincipal extends ItemMenu{

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "PratoPrincipal{" +
                "descricao='" + descricao + '\'' +
                "nome =" + super.getNome()+ '\'' +
                "preço =" + super.getPreco()+ '\'' +
                '}';
    }
}
