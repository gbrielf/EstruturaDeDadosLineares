public class VetorArray implements Vetor{
    int tamanho;
    int capacidade;
    Object[] V = new Object[capacidade];
    int r;
    Object o = new Object();

    public insertAtRank(r, o){
        for (int i = tamanho - 1; i > r; i--){
            V[i+1] = V[i];
        }
        V[r] = o;
        tamanho++;
    }

    public replaceAtRank(r, o){
        return V[r] = o;
    }

    public removeAtRank(r){
        for(i = r; i < capacidade; i++){
            V[i] = V[i+1];
        }
        tamanho--;
    }

    public elemAtRank(r){
        return V[r];
    }

    public size(){
        return capacidade;
    }

    public estaVazia(){
        if capacidade == 0: return true
        else: return false
    }
}