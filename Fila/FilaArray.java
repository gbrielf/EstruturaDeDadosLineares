public class FilaArray {
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
    public boolean isEmpty(){
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
            this.capacidade *= 2;
            Object[] b = new Object[this.capacidade];
            int j = 0;
            if (inicio < fim){
                for(int i = inicio; i < fim; i++){
                    b[j++] = a[i];
                }
            }else{
                // for de inicio a capacidade (fim do array)
                for(int i = inicio; i < capacidade; i++){
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
        fim = (fim+1) % capacidade;
        a[fim] = o;
        tamanho++;
    }
    

    

    
}
