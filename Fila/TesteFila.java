public class TesteFila{
    public static void main(String[] args) {
        // Criando uma fila com capacidade inicial 1
        FilaArray fila = new FilaArray(1);

        // Inserindo elementos na fila
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);

        try {
            System.out.println(fila.inicio()); // 1
            fila.dequeue();

            System.out.println(fila.inicio()); // 2
            fila.dequeue();

            System.out.println(fila.inicio()); // 3
            fila.dequeue();

            System.out.println(fila.inicio()); // 4
            fila.dequeue();

            System.out.println(fila.inicio()); // Vai lançar exceção
            fila.dequeue();
        } catch (EFilaVazia erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
