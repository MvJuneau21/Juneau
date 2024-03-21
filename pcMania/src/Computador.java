public class Computador {
public String marca;
public float preco;
public MemoriaUSB mUsb = new MemoriaUSB();
public SistemaOperacional sys;
public HardwareBasico[] hardwares;

    public Computador() {
        this.sys = new SistemaOperacional();
        this.hardwares = new HardwareBasico[3];
    }

    public void mostraPCConfigs(){
        System.out.println("Configs: ");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema operacional: " + this.sys.nome);
        System.out.println("Tipo do sistema: " + this.sys.tipo);
        if (mUsb != null){
            System.out.println("Memória USB: " + mUsb.nome);
            System.out.println("Capacidade da memória: " + mUsb.capacidade);
        }
        for (int i = 0; i < hardwares.length; i++) {
            if(hardwares[i] != null){
                System.out.println("Peça: " + hardwares[i].nome);
                System.out.println("Capacidade da peça: " + hardwares[i].capacidade);
            }
        }
}
public void addMemoriaUSB(MemoriaUSB musb){
mUsb = musb;
}
}
