import java.util.Scanner;
public class CadastrarProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] cadastrarProduto = new String [5];
        int [] quantidadeDoProduto = new int [5];

        int opcao;
        int listaDeProduto = 0;

        do{
            System.out.println("+----MENU----+");
            System.out.println("""
                    1 - Cadastrar produto
                    2 - Listar produtos
                    0 - Sair""");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){

                case 1:
                    if (listaDeProduto < 5){
                        System.out.println("Digite o nome do produto: ");
                        cadastrarProduto[listaDeProduto] = sc.nextLine();
                        System.out.println("Digite a quantidade do produto: ");
                        quantidadeDoProduto[listaDeProduto] = sc.nextInt();
                        listaDeProduto++;
                    }else{
                        System.out.println("Limete atingido");
                    }
                    break;
                case 2:
                    for (int i = 0; i < listaDeProduto; i++) {
                        System.out.println((i + 1) + " - " + cadastrarProduto[i] + " - " + quantidadeDoProduto[i]);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        }while(opcao != 0);

        sc.close();

    }
}