public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    public void compartilhar() {
        System.out.println("Compartilhando no G+...");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no G+...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no G+...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no G+...");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no G+...");
    }
}
