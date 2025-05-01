public class FilaArray implements Fila{
    public int capacidade; //capacidade máxima de espaços
    public int tamanho; //tamanho de espaços ocupados
    public  Object[] a;
    public int inicio;
    public int fim;

    // método construtor
    public FilaArray(int capacidade){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.a = new Object[capacidade];
        inicio = 0;
        fim = 0;
    }

    // métodos
    public boolean estaVazia(){
        if(tamanho ==0){
            return true;
        }else{
            return false;
        }
        // return tamanho == 0;
    };

    // public int tamanho(){
    //     // return tamanho -(inicio - fim) % tamanho
    // }

    public boolean isFull(){
        if (tamanho == capacidade){
            return true;
        }else{
            return false;
        }
    }

    public void enqueue(Object o){
        if (isFull()){
            int antigaCapacidade = capacidade;
            this.capacidade *= 2;
            Object[] b = new Object[capacidade];
            int j = 0;
            // fila não circular
            if (inicio < fim){
                for(int i = inicio; i < fim; i++){
                    b[j++] = a[i];
                }
            // fila circular
            }else{
                // for de inicio a capacidade (fim do array)
                for(int i = inicio; i < antigaCapacidade; i++){
                    b[j++] = a[i];
                }
                // for do indice 0 do array ate fim
                for(int i = 0; i < fim; i++){
                    b[j++] = a[i];
                }
            }
            a = b;
            inicio = 0;
            fim = tamanho;       
        }
        a[fim] = o;
        fim = (fim+1) % capacidade;
        tamanho++;
    }
    
    public Object dequeue(){
        if(estaVazia()){
            throw new EFilaVazia("Fila vazia");
        }
        
        Object resultado = this.a[inicio];
        this.a[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;

        return resultado;    
    }

    public Object inicio(){
        return a[inicio];
    }

    public int tamanho(){
        return tamanho;
    }
}
