public class ListaLigada {
    private No head;
    private No tail;
    private int size;

    public ListaLigada(){
        head = new No();
        tail = new No();
        head.setProximo(tail); 
    }

    public void insertAfter(No anterior, Object elemento){
        No no = new No(elemento);
        no.setProximo(anterior.getProximo());
        anterior.setProximo(no);
    }
    public void insertInicio(Object elemento){
        insertAfter(head, elemento);
    }

    public void mostrarElementos(){
        No aux = head.getProximo();
        while(aux != tail){
            System.out.println(aux.getElemento());
            aux = aux.getProximo();
        }
    }

    // public void mostrarLista() {
    //     No atual = sentinela.proximo; // pula o sentinela
    //     System.out.println("Elementos da lista:");
    //     while (atual != null) {
    //         System.out.println("- " + atual.valor);
    //         atual = atual.proximo;
    //     }
    // }
    
}