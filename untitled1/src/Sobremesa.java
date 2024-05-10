public class Sobremesa extends ItemMenu{

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "tipo='" + tipo + '\'' +
                "nome =" + super.getNome()+ '\'' +
                "preço =" + super.getPreco()+ '\'' +
                '}';
    }
}
