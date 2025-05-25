public class No{
    private Object elemento;
    private No proximo;
    public No(){}
    public No(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public No GetProximo(){
        return proximo;
    }
    public Object GetElemento(){
        return elemento;
    }
    public void SetProximo(No proximo){
        this.proximo = proximo;
    }
    public void SetElemento(No elemento){
        this.elemento = elemento;
    }
}