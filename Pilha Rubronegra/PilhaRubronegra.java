public interface PilhaRubronegra {
    public boolean estaVaziaVermelha(); //ok
    public boolean estaVaziaPreta(); //ok
    public int tamanhoVermelha(); //ok
    public int tamanhoPreta(); //ok
    public Object topoVermelho() throws PilhaVaziaExcecao; //ok
    public Object topoPreto() throws PilhaVaziaExcecao; //ok
    public void pushVermelho(Object o); //ok
    public void pushPreto(Object o); //ok
    public Object popVermelho() throws PilhaVaziaExcecao;
    public Object popPreto() throws PilhaVaziaExcecao;
} 
