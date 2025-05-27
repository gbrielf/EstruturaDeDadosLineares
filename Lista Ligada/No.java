public class No{
    private Object elemento;
    private No proximo;
    public No(){}
    public No(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public No getProximo(){
        return proximo;
    }
    public Object getElemento(){
        return elemento;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    public void setElemento(Object elemento){
        this.elemento = elemento;
    }
}
