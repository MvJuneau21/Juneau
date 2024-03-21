import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner CPF = new Scanner(System.in);
        Scanner option = new Scanner(System.in);
        Cliente cliente = new Cliente();
        float preco;
        int add;
        Computador computador1 = new Computador();
        computador1.preco = 3300;
        computador1.marca = "Positivo";
        computador1.sys.nome = "Ubuntu Linux";
        computador1.sys.tipo = 32;
        computador1.mUsb.nome = "Pendrive";
        computador1.mUsb.capacidade = 16;
        computador1.hardwares[0] = new HardwareBasico();
        computador1.hardwares[0].nome = "Intel Pentium I3";
        computador1.hardwares[0].capacidade = 2200;
        computador1.hardwares[1] = new HardwareBasico();
        computador1.hardwares[1].nome = "Memoria RAM";
        computador1.hardwares[1].capacidade = 8;
        computador1.hardwares[2] = new HardwareBasico();
        computador1.hardwares[2].nome = "HD";
        computador1.hardwares[2].capacidade = 500;
        Computador computador2 = new Computador();
        computador2.preco = 8800;
        computador2.marca = "Acer";
        computador2.sys.nome = "Windows 8";
        computador2.sys.tipo = 64;
        computador2.mUsb.nome = "Pendrive";
        computador2.mUsb.capacidade = 32;
        computador2.hardwares[0] = new HardwareBasico();
        computador2.hardwares[0].nome = "Pentium Core I5";
        computador2.hardwares[0].capacidade = 3370;
        computador2.hardwares[1] = new HardwareBasico();
        computador2.hardwares[1].nome = "Memoria RAM";
        computador2.hardwares[1].capacidade = 16;
        computador2.hardwares[2] = new HardwareBasico();
        computador2.hardwares[2].nome = "HD";
        computador2.hardwares[2].capacidade = 1000;
        Computador computador3 = new Computador();
        computador3.preco = 4800;
        computador3.marca = "Vaio";
        computador3.sys.nome = "Windows 10";
        computador3.sys.tipo = 64;
        computador3.mUsb.nome = "HD";
        computador3.mUsb.capacidade = 1000;
        computador3.hardwares[0] = new HardwareBasico();
        computador3.hardwares[0].nome = "Pentium Core I7";
        computador3.hardwares[0].capacidade = 4500;
        computador3.hardwares[1] = new HardwareBasico();
        computador3.hardwares[1].nome = "Memoria RAM";
        computador3.hardwares[1].capacidade = 32;
        computador3.hardwares[2] = new HardwareBasico();
        computador3.hardwares[2].nome = "HD";
        computador3.hardwares[2].capacidade = 2000;
        System.out.println("Entre com seu nome: ");
        cliente.nome = entrada.next();
        System.out.println("Entre com seu CPF: ");
        cliente.cpf = CPF.nextLong();
        System.out.println("Entre com 1 para comprar o PC1, 2 para o PC2, 3 para o PC3 e 0 para finalizar compra: ");
        int op = option.nextInt();
        int i = 0;
        while (op != 0){
            if(op == 1){
                cliente.computadores[i] = computador1;
                System.out.println("Deseja adicionar um Pendrive de 16gb? digite 0 para sim e 1 para não: ");
                add = entrada.nextInt();
                if(add == 0){
                    computador1.addMemoriaUSB(computador1.mUsb);
                }
                else computador1.mUsb = null;
            }
            else if(op == 2){
                cliente.computadores[i] = computador2;
                System.out.println("Deseja adicionar um Pendrive de 32gb? digite 0 para sim e 1 para não: ");
                add = entrada.nextInt();
                if(add == 0){
                    computador2.addMemoriaUSB(computador2.mUsb);
                }
                else computador2.mUsb = null;
            }
            else if(op == 3){
                cliente.computadores[i] = computador3;
                System.out.println("Deseja adicionar um HD de 1TB? digite 0 para sim e 1 para não: ");
                add = entrada.nextInt();
                if(add == 0){
                    computador3.addMemoriaUSB(computador3.mUsb);
                }
                else computador3.mUsb = null;
            }
            System.out.println("Entre com 1 para comprar o PC1, 2 para o PC2, 3 para o PC3 e 0 para finalizar compra: ");
            op = entrada.nextInt();
            i++;
        }
        System.out.println("Nome: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        if(op == 0){
            for (int j = 0; j < cliente.computadores.length; j++) {
                if(cliente.computadores[j] != null) {
                    cliente.computadores[j].mostraPCConfigs();
                }
            }
        }
        preco = cliente.calculaTotalCompra();
        System.out.println("Preço Total: " + preco);
    }
}