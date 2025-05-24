public interface Vetor{
    public void insertAtRank(int r, Object o)  throws EColocacaoErrada, EVetorVazio;
    public Object replaceAtRank(int r, Object o)  throws EColocacaoErrada, EVetorVazio;
    public Object removeAtRank(int r) throws EColocacaoErrada, EVetorVazio;
    public Object elemAtRank(int r);
    public int size();
    public boolean estaVazia();

}