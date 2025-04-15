// 2 . Utilizando os arquivos PilhaArray.java, Pilha.java, TestePilha.java (Ver vídeo aula - Na página da disciplina),
// preencha a tabela abaixo, onde a linha superior diz o método de aumento da capacidade e a coluna da esquerda
// informa a quantidade de elementos colocados na pilha. Em cada célula da tabela deverá ser colocado o tempo,
// em milisegundos (use System.currentTimeMillis()), de se colocar os elementos. Utilize as duas estratégias de
// crescimento (constante e duplicação) parrara oy.
// incremento 10 incremento 100 incremento 1000 duplicação
// 10 elementos
// 100 elementos
// 1000 elementos
// 10000 elementos
// 100000 elementos
// 1000000 elementos
// Sugestão: Tente implementar a interface Pilha.java e use o arquivo PilhaArray.java só em último caso para tirar
// dúvidas.

public class PilhaArray implements Pilha {
    private int capacidade;
    private Object[] a;
    private int t;
    private int FC;
    public PilhaArray(int capacidade, int crescimento){

    this.capacidade=capacidade;
    t=-1;
    FC=crescimento;
    if (crescimento<=0)
        FC=0;
    a=new Object[capacidade];
    }
    
    public void push(Object o){
    if(t>=capacidade-1){
        if(FC==0)
            capacidade*=2;
        else
            capacidade+=FC;
        Object b[]=new Object[capacidade];
        for(int f=0;f<a.length;f++)
            b[f]=a[f];
        a=b;
    }
    a[++t]=o;
    }
    
    public Object pop() throws PilhaVaziaExcecao {
        if(isEmpty())throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r=a[t--];
        return r;
    }
    public Object top()throws PilhaVaziaExcecao {
        if(isEmpty())throw new PilhaVaziaExcecao("A Pilha está vazia");
        return a[t];
        
    }
    public boolean isEmpty(){
        return t==-1;
    }

    public int size(){
        return t+1;
    }
}
