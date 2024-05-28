public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Facebook...");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Facebook...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Facebook...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Facebook...");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Facebook...");
    }
}
