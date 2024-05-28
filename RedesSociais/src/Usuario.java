import exceptions.UncheckedException;
import java.util.HashSet;
public class Usuario{
    private String nome;
    private String email;
    private HashSet<RedeSocial> redesSociais;
    public Usuario(String nome, String email, HashSet<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }
    public void comandos(){
        for (RedeSocial rede : redesSociais){
            try {
                if(rede instanceof GooglePlus){
                    rede.postarFoto();
                    rede.curtirPublicacao();
                    ((GooglePlus) rede).compartilhar();
                }
                else if(rede instanceof Twitter){
                    ((Twitter) rede).compartilhar();
                    rede.postarFoto();
                    rede.curtirPublicacao();
                }
                else if(rede instanceof Instagram){
                    rede.postarFoto();
                    rede.postarComentario();
                    rede.curtirPublicacao();
                }
                else if(rede instanceof Facebook){
                    ((Facebook) rede).compartilhar();
                    ((Facebook) rede).fazStreaming();
                    rede.postarComentario();
                }
            }   catch (UncheckedException e){
                System.out.println(e.getMessage());
            }
            }
    }
    public HashSet<RedeSocial> getRedesSociais() {
        return redesSociais;
    }
}
