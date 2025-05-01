public class PilhaArrayRubronegra implements PilhaRubronegra {
    private int capacidade;
    private Object[] a;
    private int tVermelho;
    private int tPreto;
    public PilhaArrayRubronegra (int capacidade, int crescimento){
        this.capacidade = capacidade;
        tVermelho = -1;
        tPreto = capacidade;
        a = new Object[capacidade*2];
    }
    
    public boolean estaVaziaVermelha(){
       return tVermelho == -1;
    }

    public boolean estaVaziaPreta(){
        return tPreto == capacidade;
    }

    public int tamanhoVermelha(){
        return tVermelho;
    }

    public int tamanhoPreta(){
        return capacidade - tPreto;
    }

    public Object topoVermelho(){
        if (tVermelho == -1) {
            throw new RuntimeException("Pilha vermelha está vazia");
        }
        return a[tVermelho];
    }

    public Object topoPreto(){
        if (tPreto == capacidade) {
            throw new RuntimeException("Pilha preta está vazia");
        }
        return a[tPreto];
    }

    public void pushVermelho(Object o){
        if(estaCheio()){
            aumentarCapacidade();
        }
        a[++tVermelho] = o;
    }
    
    public void pushPreto(Object o){
        if(estaCheio()){
            aumentarCapacidade();
        }
        a[--tPreto] = o;
    }

    public Object popVermelho(){
        if(estaVaziaVermelha()){
            throw new RuntimeException("a Pilha Vermelha está vazia.");
        }
        Object resultado = a[tVermelho];
        a[tVermelho--] = null;
        return resultado;
    }

    public Object popPreto(){
        if(estaVaziaPreta()){
            throw new RuntimeException("a Pilha Preta está vazia.");
        }
        Object resultado = a[tPreto];
        a[tPreto++] = null;
        return resultado;
    }



    private void aumentarCapacidade(){
        int capacidadeAntiga = capacidade;
        capacidade *= 2;
        Object[] b = new Object[capacidade];
        
        for (int i = 0; i <= tVermelho; i++){
            b[i] = a[i];
        }
        
        int j = capacidade - 1;
        
        for( int i = capacidadeAntiga - 1; i >= tPreto; i--){
            b[j--] = a[i];
        }
        tPreto = j + 1;
        a = b;
    }
    
    
    
    public boolean estaCheio(){
        return tVermelho == tPreto -1;
    }
}


    


