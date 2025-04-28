public interface PilhaRubronegra {
    public int size();
    public boolean isEmpty();
    public Object topRed() throws PilhaVaziaExcecao;
    public Object topBlack() throws PilhaVaziaExcecao;
    public void pushRed(Object o);
    public void pushBlack(Object o);
    public Object popRed() throws PilhaVaziaExcecao;
    public Object popBlack() throws PilhaVaziaExcecao;

} 
