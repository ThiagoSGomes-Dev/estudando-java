import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Caixa> listaCaixas = new ArrayList<>();

        System.out.println("Adicione um objeto na caixa: ");
        String Objeto = input.nextLine();

        // Criar instância da classe Caixa e adicionar à lista
        Caixa objeto = new Caixa(Objeto);
        listaCaixas.add(objeto);

        // Acessar a lista e imprimir o corpo da caixa
        for (Caixa caixa : listaCaixas) {
            System.out.println(caixa.getCorpo());
        }
    }
}
