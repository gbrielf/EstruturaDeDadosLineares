import java.util.ArrayList;
import java.util.Iterator;

public class ArvoreBinariaPesquisa {
    private No raiz;
    private int tamanho;

    public ArvoreBinariaPesquisa(Object o) {
        raiz = new No(null, o);
        tamanho = 1;
    }

    /* Classe interna para representar os nós da árvore */
    public class No {
        private Object o;
        private No pai;
        private No filhoDireito;
        private No filhoEsquerdo;

        public No(No pai, Object o) {
            this.pai = pai;
            this.o = o;
            this.filhoDireito = null;
            this.filhoEsquerdo = null;
        }

        public Object element() {
            return o;
        }

        public No parent() {
            return pai;
        }

        public void setElement(Object o) {
            this.o = o;
        }

        public Object getElement() {
            return o;
        }
    }

    /* Adiciona novo elemento à árvore */
    public void addChild(Object o) {
        addRecursivo(raiz, o);
    }

    private void addRecursivo(No atual, Object o) {
        Comparable novo = (Comparable) o;
        Comparable atualValor = (Comparable) atual.o;

        if (novo.compareTo(atualValor) < 0) {
            if (atual.filhoEsquerdo == null) {
                atual.filhoEsquerdo = new No(atual, o);
                tamanho++;
            } else {
                addRecursivo(atual.filhoEsquerdo, o);
            }
        } else {
            if (atual.filhoDireito == null) {
                atual.filhoDireito = new No(atual, o);
                tamanho++;
            } else {
                addRecursivo(atual.filhoDireito, o);
            }
        }
    }

    public No getRoot() {
        return raiz;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public No search(Object o) {
        return searchRecursivo(raiz, o);
    }

    private No searchRecursivo(No atual, Object o) {
        if (atual == null) {
            return null;
        }

        Comparable objetoProcurado = (Comparable) o;
        Comparable atualObjeto = (Comparable) atual.o;

        int comparacao = objetoProcurado.compareTo(atualObjeto);

        if (comparacao == 0) {
            return atual;
        } else if (comparacao < 0) {
            return searchRecursivo(atual.filhoEsquerdo, o);
        } else {
            return searchRecursivo(atual.filhoDireito, o);
        }
    }

    public int height() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return -1;
        }

        int alturaEsquerda = calcularAltura(no.filhoEsquerdo);
        int alturaDireita = calcularAltura(no.filhoDireito);

        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }

    public void clear() {
        raiz = null;
        tamanho = 0;
    }
}
