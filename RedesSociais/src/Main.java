import java.util.HashSet;
import exceptions.UncheckedException;
public class Main {
    public static void main(String[] args) {
        HashSet<RedeSocial> rede = new HashSet<>();
        Usuario marquin = new Usuario("Marquin", "markin@gmail.com", rede);
        Usuario lucas = new Usuario("Lucas", "lurca@hotmail.com", new HashSet<>());
        try {
            marquin.getRedesSociais().add(new Facebook("666888", 5000));
            marquin.getRedesSociais().add(new GooglePlus("888", 200));
            lucas.getRedesSociais().add(new Instagram("777666", 500));
            lucas.getRedesSociais().add(new Twitter("60066", 400));
            marquin.comandos();
            lucas.comandos();
        } catch (UncheckedException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}