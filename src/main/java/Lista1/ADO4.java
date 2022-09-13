package Lista1;
/** 
   por Rafael Ferreira Goulart
**/
import java.util.Scanner;
/**
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários públicos.
O valor máximo da prestação não poderá ultrapassar 30% do salario bruto.
Fazer um programa que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
**/
public class ADO4 {
    
    final static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        int sal = recebeSalario();
        System.out.println(sal);
    }
    
    public static int recebeSalario() {
        String msgSal = "Informe seu salário: ", msgErro = "Inválido! \nInforme novamente: ";
        
        System.out.println(msgSal);
        int sal = inp.nextInt();
        while (sal <= 0) {
            System.out.println(msgErro);
            sal = inp.nextInt();
        }
        return sal;
    }
}