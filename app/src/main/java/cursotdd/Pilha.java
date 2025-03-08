package cursotdd;

public class Pilha {
    private Object[] elementos;
    private int quantidade;


    public Pilha(int maximo){
        this.elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
    public int tamanho() {
        return quantidade;
    }

    public Object topo(){
        return elementos[quantidade - 1];
    }
    public void empilha(Object x) {
        if(quantidade == elementos.length){
            throw new PilhaCheiaException("Pilha cheia");
        }
        this.elementos[quantidade] = x;
        quantidade++;
    }
    public Object desempilha() {
        if(estaVazia()){
            throw new PilhaVaziaException("Pilha vazia");
        }
        Object topo = topo();
        this.elementos[quantidade] = null;
        quantidade--;
        return topo;
    }
}
