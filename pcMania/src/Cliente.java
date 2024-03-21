public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computadores = new Computador[10];
    public float calculaTotalCompra(){
        float precoTotal = 0;
        for (int i = 0; i < computadores.length; i++) {
            if(computadores[i] != null) {
                precoTotal += computadores[i].preco;
            }
        }
        return precoTotal;
    }
}
