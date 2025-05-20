public interface Vetor{
    public void insertAtRank(integer r, object o)  throws EColocacaoErrada, EVetorVazio;
    public Object replaceAtRank(integer r, object o)  throws EColocacaoErrada, EVetorVazio;
    public Object removeAtRank(integer r, object o) throws EColocacaoErrada, EVetorVazio;
    public Object elemAtRank(integer r);
    public void size();
    public void estaVazia();

}