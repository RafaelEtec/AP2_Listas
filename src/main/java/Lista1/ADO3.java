package Lista1;
/** 
   por Rafael Ferreira Goulart
**/
import java.util.Scanner;
/**
Entre com dois números, imprima a faixa de números e identifique quais são pares e impares.
Explique qual instrução de laço foi escolhida e o por que da escolha.
**/
public class ADO3 {
    
    /**
     * Utilizei-me do laço 'For' pois nele possuo mais experiência e entendo seu método e funcionamento.
     * Onde tecnicamente ou geralmente o utilizo quando há certeza de quantas repetições quero fazer.
    **/
    final static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] nums = recebeNums();
        
        mostraImparOuPar(nums);
    }
    
    public static void mostraImparOuPar(int[] nums) {
        int a, b;
        String msgP = " é Par", msgI = " é Ímpar";
        
        if (nums[0] <= nums[1]) {
            a = nums[0];
            b = nums[1];
        } else {
            a = nums[1];
            b = nums[0];
        }
        
        for (int pos = a; pos <= b; pos++) {
            if (pos%2 == 0) {
                System.out.println(pos + msgP);
            } else {
                System.out.println(pos + msgI);
            }
        }
    }
    
    public static int[] recebeNums() {
        boolean p = false;
        int[] nums = new int[]{-1, -1};
        int guarda = 0;
        String msgN = "Informe o Primeiro número: ", msgErro = "Inválido! \nInsira novamente: ";
        
        while(nums[0] <= 0 || nums[1] <= 0) {
            System.out.println(msgN);
            guarda = inp.nextInt();
            
            while (guarda == 0 || guarda < 0) {
                System.out.println(msgErro);
                guarda = inp.nextInt();  
                
            }
            
            if (!p) {
                nums[0] = guarda;
                msgN = "Informe o Segundo número: ";
                p = true;
            } else {
                nums[1] = guarda;
            }
        }
        return nums;
    }
}