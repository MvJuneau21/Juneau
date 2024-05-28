public class Instagram extends RedeSocial{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Instagram...");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Instagram...");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentário no Instagram...");
    }
}
