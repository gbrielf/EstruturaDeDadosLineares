public class No {
  private Object elemento;
  private No proximo;
  private No anterior;

  public No() {
  }
  public No(Object elemento) {
      this.elemento = elemento;
      this.proximo = null;
      this.anterior = null;
  }

  public No getAnterior(){
      return anterior;
  }
  public No getProximo(){
      return proximo;
  }
  public Object getElemento(){
      return elemento;
  }
  public void setAnterior(No anterior){
      this.anterior = anterior;
  }  
  public void setProximo(No proximo){
      this.proximo = proximo;
  }  
  public void setElemento(Object elemento){
      this.elemento = elemento;
  }  
  
  
}