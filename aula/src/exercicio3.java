import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int np3, npa;
        System.out.println("Insira a nota da NPA: ");
        npa = entrada.nextInt();
        if(npa >= 60){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Ainda da...");
            System.out.println("Insira a nota da np3: ");
            np3 = entrada.nextInt();
            if((np3 + npa)/2 >= 50){
                System.out.println("Aprovado!");
            }
            else
                System.out.println("Reprovado!");
        }
    }
}
