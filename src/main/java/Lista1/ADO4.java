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
        double sal = recebeSalario();
        double pedeEmpr = pedeEmprestimo();
        double maxEmpr = calculaEmprestimoMaximo(sal);
        
        validaEmprestimo(sal, pedeEmpr, maxEmpr);
    }
    
    public static void validaEmprestimo(double sal, double pedeEmpr, double maxEmpr) {
        String msgInfo = "Salário: " + sal + "\nEmpréstimo permitido: " + maxEmpr + "\nValor Pedido: " + pedeEmpr;
        String[] msgVal = new String[]{"Não é possível lhe conceder o Empréstimo!", "Empréstimo aceito!"};
        
        System.out.println(msgInfo);
        if (pedeEmpr > maxEmpr) {
            System.out.println(msgVal[0]);
        } else {
            System.out.println(msgVal[1]);
        }
    }
    
    public static double pedeEmprestimo() {
        String msgEmpr = "Informe o valor do empréstimo: ", msgErro = "Inválido! \nInforme novamente: ";
        
        System.out.println(msgEmpr);
        double empr = inp.nextDouble();
        while (empr <= 0) {
            System.out.println(msgErro);
            empr = inp.nextDouble();
        }
        return empr;
    }
    
    public static double recebeSalario() {
        String msgSal = "Informe seu salário: ", msgErro = "Inválido! \nInforme novamente: ";
        
        System.out.println(msgSal);
        double sal = inp.nextDouble();
        while (sal <= 0) {
            System.out.println(msgErro);
            sal = inp.nextDouble();
        }
        return sal;
    }
    
    public static double calculaEmprestimoMaximo(double sal) {
        double maxEmpr = sal * 0.30;
        return maxEmpr;
    }
}