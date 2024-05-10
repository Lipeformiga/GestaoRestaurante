import java.util.ArrayList;

public class Restaurante {

    private ArrayList<ItemMenu> lista = new ArrayList<>();

    public ArrayList<ItemMenu> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ItemMenu> lista) {
        this.lista = lista;
    }

    public void addListaMenu (ItemMenu itemMenu){
        this.lista.add(itemMenu);
    }


}
