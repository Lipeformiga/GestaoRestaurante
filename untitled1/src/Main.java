import java.util.Scanner;

public class Main {

    static Restaurante r1 = new Restaurante();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){


        System.out.println("O que deseja fazer?" +
                "\n 1 - Adicionar prato principal" +
                "\n 2 - Adicionar sobremesa" +
                "\n 3 - listar pratos principais" +
                "\n 4 - listar sobremesas " +
                "\n 5 - listar todos os itens");
        int escolha = sc.nextInt();

        switch (escolha){
            case 1:

                PratoPrincipal p1 = new PratoPrincipal();
                System.out.println("Nome do prato principal:");
                p1.setNome(sc.next());
                System.out.println("Preço do prato:");
                p1.setPreco(sc.nextDouble());
                System.out.println("Descrição do prato:");
                p1.setDescricao(sc.next());

                r1.addListaMenu(p1);
                break;

            case 2:

                Sobremesa s1 = new Sobremesa();
                System.out.println("Nome da sobremesa:");
                s1.setNome(sc.next());
                System.out.println("Preço da sobremesa");
                s1.setPreco(sc.nextDouble());
                System.out.println("Tipo da sobremesa:");
                s1.setTipo(sc.next());

                r1.addListaMenu(s1);
                break;

            case 3:

                for (ItemMenu prato : r1.getLista() ){
                    if( prato.getClass().getName().equals("PratoPrincipal")){
                        System.out.println(((PratoPrincipal)prato).toString());
                    }
                }
                break;

            case 4:
                for (ItemMenu sobremesa : r1.getLista() ){
                    if( sobremesa.getClass().getName().equals("Sobremesa")){
                        System.out.println(((Sobremesa)sobremesa).toString());
                    }
                }
                break;

            case 5:

                for ( ItemMenu tudo : r1.getLista()){
                    System.out.println(tudo.toString());
                }

                break;

            }
        }
    }
}
