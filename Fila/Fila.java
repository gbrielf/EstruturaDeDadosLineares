// 5. Implemente uma classe Fila usando a classe Vector para armazenar os elementos internamente.

public interface Fila{
    public int tamanho();
    public boolean estaVazia();
    public Object inicio() throws EFilaVazia;
    public void enqueue(Object o);
    public Object dequeue() throws EFilaVazia;

    // esquema FIFO, "First in, First Out"
    // inserções são feitas no fim da fila e remoções no início da fila
}