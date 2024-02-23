import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class aula {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int lanche1 = entrada.nextInt();
        int lanche2 = entrada.nextInt();
        int lanche3 = entrada.nextInt();
        int total = lanche1 + lanche2 + lanche3;
        double media = total / 3.0;
        System.out.println(media);
    }
}
