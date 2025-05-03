public class TestePilhaRubronegra {
    public static void main(String[] args) {
        PilhaRubronegra pilha = new PilhaArrayRubronegra(4);

        System.out.println("== Teste Pilha Vermelha ==");
        pilha.pushVermelho("A");
        pilha.pushVermelho("B");
        System.out.println("Topo vermelho: " + pilha.topoVermelho()); // B
        System.out.println("Pop vermelho: " + pilha.popVermelho());  // B
        System.out.println("Topo vermelho: " + pilha.topoVermelho()); // A
        System.out.println("Pop vermelho: " + pilha.popVermelho());  // A
        System.out.println("Está vazia vermelha? " + pilha.estaVaziaVermelha()); // true

        System.out.println("\n== Teste Pilha Preta ==");
        pilha.pushPreto(1);
        pilha.pushPreto(2);
        System.out.println("Topo preta: " + pilha.topoPreto()); // 2
        System.out.println("Pop preta: " + pilha.popPreto());   // 2
        System.out.println("Pop preta: " + pilha.popPreto());   // 1
        System.out.println("Está vazia preta? " + pilha.estaVaziaPreta()); // true

        System.out.println("\n== Teste aumento automático de capacidade ==");
        pilha.pushVermelho("X");
        pilha.pushVermelho("Y");
        pilha.pushVermelho("Z");
        pilha.pushVermelho("W");
        pilha.pushPreto("P"); // Deve disparar aumento

        System.out.println("Topo vermelho: " + pilha.topoVermelho()); // W
        System.out.println("Topo preto: " + pilha.topoPreto());       // P

        System.out.println("\n== Teste erro ao desempilhar de pilha vazia ==");
        try {
            pilha.popPreto(); // Remove P
            pilha.popPreto(); // Erro esperado
        } catch (RuntimeException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("\n== Teste finalizado com sucesso ==");
    }
}
