public class TesteVetorArray {
    public static void main(String[] args) {
        try {
            // Criando um vetor com capacidade 5
            Vetor vetor = new VetorArray(5);

            // Inserindo elementos
            vetor.insertAtRank(0, "A");
            vetor.insertAtRank(1, "B");
            vetor.insertAtRank(2, "C");
            vetor.insertAtRank(1, "D"); // Deve empurrar B e C para frente

            // Exibindo elementos
            System.out.println("Elementos do vetor:");
            for (int i = 0; i < vetor.size(); i++) {
                System.out.println("Posição " + i + ": " + vetor.elemAtRank(i));
            }

            // Substituindo elemento na posição 2
            System.out.println("\nSubstituindo na posição 2:");
            Object antigo = vetor.replaceAtRank(2, "X");
            System.out.println("Valor antigo: " + antigo);

            // Removendo elemento da posição 1
            System.out.println("\nRemovendo da posição 1:");
            Object removido = vetor.removeAtRank(1);
            System.out.println("Removido: " + removido);

            // Exibindo elementos novamente
            System.out.println("\nVetor após substituição e remoção:");
            for (int i = 0; i < vetor.size(); i++) {
                System.out.println("Posição " + i + ": " + vetor.elemAtRank(i));
            }

            // Testando se está vazio
            System.out.println("\nO vetor está vazio? " + vetor.estaVazia());

        } catch (EColocacaoErrada | EVetorVazio e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
