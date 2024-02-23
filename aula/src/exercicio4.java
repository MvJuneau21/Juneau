import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o numero de alunos:");
        int n = entrada.nextInt();
        switch (n){
            case 10:
            case 20:
                System.out.println("Sala 1-16");
                break;
                case 30:
                System.out.println("Sala 1-22");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
