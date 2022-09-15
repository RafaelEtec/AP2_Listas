package Lista1;
/** 
   por Rafael Ferreira Goulart
**/
import java.util.Scanner;
/** 
Explique as diferenças entre as instruções if e switch e dê exemplo de cada uma delas.
Explique qual o melhor cenário para utilizar cada instrução.
* 

* 
A Declaração 'If' é usada para especifiar uma condição para a execução de uma ou mais instruções.
A condição é uma expressão booleana (Equivalente a uma proposição em lógica matemática),
ou seja, uma expressão cujo resultado é verdadeiro(true) ou falso(false).
*
Já a declaração 'switch' é uma estrutura usada para determinar quais instruções devem ser executadas, dependendo do valor de uma expressão.
A escolha é feita da seguinte forma:
O resultado de uma expressão, que é chamada de expressão de controle, é comparado com uma série de constantes,
que estão associados a uma sequência de instruções.
Quando uma combinação é encontrada, as instruções associadas com a constante são executadas.
**/
public class ADO5 {
    
    public static String msgEscolha = 
            "+------------------------+\n"
          + "|          Menu          |";
    final static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean sair = false;
        String msgOpcoes = 
                  "+------------------------+\n"
                + "| <0> Jogar              |\n"
                + "| <1> Opções             |\n"
                + "| <2> Leaderboard        |\n"
                + "| <3> Sair               |\n"
                + "+------------------------+\n"
                + "| O que deseja fazer?:   |\n"
                + "+------------------------+\n";
        
        System.out.println(msgEscolha);
        while (!sair) {
            int opcao;
            
            System.out.println(msgOpcoes);
            opcao = inp.nextInt();
            while (opcao < 0 || opcao > 3) {
                System.out.println(
                  "| Inválido!              |");
                System.out.println(msgOpcoes);
                opcao = inp.nextInt();
            }
            sair = mudaMenu(opcao, sair);
        }
    }
    
    public static boolean mudaMenu(int opcao, boolean sair) {
        switch (opcao) {
            case 0:
                System.out.println(
                        "+------------------------+\n"
                      + "|         Jogar          |");
                break;
            case 1:
                System.out.println( 
                        "+------------------------+\n"
                      + "|         Opcões         |");
                break;
            case 2:
                System.out.println( 
                        "+------------------------+\n"
                      + "|       Leaderboard      |");
                break;
            case 3:
                System.out.println(
                          "+------------------------+\n"
                        + "| Realmente deseja sair? |\n"
                        + "| <S> Sim        <N> Não |\n"
                        + "+------------------------+\n");
                String saiOuNao = inp.next();
                if (saiOuNao.toLowerCase().equals("s")) {
                    sair = true;
                }
        }
        return sair;
    }
}