public class TestePilhaRubroNegra {
    public static void main(String[] args) {
        PilhaRubroNegra pilha = new PilhaRubroNegra(4);

        System.out.println("== Teste Vermelha ==");
        pilha.pushVermelha("A");
        pilha.pushVermelha("B");
        System.out.println("Topo vermelho: " + pilha.topoVermelho()); // B
        System.out.println("Pop vermelho: " + pilha.popVermelho());   // B
        System.out.println("Pop vermelho: " + pilha.popVermelho());   // A
        System.out.println("Está vazia vermelha? " + pilha.estaVaziaVermelha()); // true

        System.out.println("\n== Teste Preta ==");
        pilha.pushPreta(1);
        pilha.pushPreta(2);
        System.out.println("Topo preta: " + pilha.topoPreto()); // 2
        System.out.println("Pop preta: " + pilha.popPreto());   // 2
        System.out.println("Pop preta: " + pilha.popPreto());   // 1
        System.out.println("Está vazia preta? " + pilha.estaVaziaPreta()); // true

        System.out.println("\n== Teste de expansão ==");
        pilha.pushVermelha("R1");
        pilha.pushVermelha("R2");
        pilha.pushPreta("P1");
        pilha.pushPreta("P2");
        pilha.pushVermelha("R3"); // Deve disparar expansão
        System.out.println("Topo vermelho após expansão: " + pilha.topoVermelho()); // R3

        System.out.println("\n== Teste de exceções ==");
        try {
            pilha.popVermelho();
            pilha.popVermelho();
            pilha.popVermelho(); // Até aqui ok
            pilha.popVermelho(); // Aqui deve lançar erro
        } catch (RuntimeException e) {
            System.out.println("Exceção esperada (vermelha): " + e.getMessage());
        }

        try {
            pilha.popPreto();
            pilha.popPreto(); // Aqui deve lançar erro
        } catch (RuntimeException e) {
            System.out.println("Exceção esperada (preta): " + e.getMessage());
        }
    }
}
