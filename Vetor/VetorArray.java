public class VetorArray implements Vetor{
    private int capacidade;
    private Object[] V
    private int tamanho; //tamanho do vetor

    public VetorArray(int capacidade){
        this.capacidade = capacidade;
        this.V = new Object[capacidade];
        this.tamanho = 0;
    }
 
    public void insertAtRank(int r, Object o) throws EColocacaoErrada, EVetorVazio{
        if (tamanho >= capacidade){
            throw new EColocacaoErrada("Capacidade máxima atingida");
        }
        if (r < 0 || r > tamanho){
            throw new EColocacaoErrada("Posição inválida para inserção");
        }
        for (int i = tamanho - 1; i > r; i--){
            V[i+1] = V[i];
        }
        V[r] = o;
        tamanho++;
    }

    public Object replaceAtRank(int r, Object o) throws EColocacaoErrada, EVetorVazio{
        if (tamanho >= capacidade){
            throw new EColocacaoErrada("Capacidade máxima atingida");
        }
        if (r < 0 || r > tamanho){
            throw new EColocacaoErrada("Posição inválida para inserção");
        }
        Object antigo = V[r];
        V[r] = o;
        return antigo;
    }

    public Object removeAtRank(int r) throws EColocacaoErrada, EVetorVazio{
         if (tamanho >= capacidade){
            throw new EColocacaoErrada("Capacidade máxima atingida");
        }
        if (r < 0 || r > tamanho){
            throw new EColocacaoErrada("Posição inválida para inserção");
        }
        Object removido = V[r];
        for(int i = r; i < tamanho - 1; i++){
            V[i] = V[i+1];
        }
        V[tamanho-1] = null;
        tamanho--;
        return removido;
    }

    public Object elemAtRank(int r){
        if(r < 0 || r >= tamanho){
            throw new IndexOutOfBoundsExcepciton("Indice Inválido");
        }
        return V[r];
    }

    public int size(){
        return tamanho;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }
}