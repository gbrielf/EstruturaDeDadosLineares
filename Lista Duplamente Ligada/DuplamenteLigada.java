public class DuplamentaLigada{
    private No head;
    private No tail;
    int size = 0;

    // public DuplamenteLigada(){}

    public DuplamenteLigada(){
        head = new No();
        tail = new No();
        head.setProximo(tail);
        tail.setAnterior(head);
    }

    public void inserirAntes(No proximo, Object elemento){
      No no = new No(elemento);
      no.setProximo(proximo);
      no.setAnterior(proximo.getAnterior());
      no.getAnterior().setProximo(no);
      proximo.setAnterior(no);
      size++;
    }
       
    public void inserirDepois(No anterior, Object elemento){
        No no = new No(elemento);
        no.setAnterior(anterior);
        no.setProximo(anterior.getProximo());
        anterior.getProximo().setAnterior(no);
        anterior.setProximo(no);
        size++;
    }

    public void inserirNoInicio(Object elemento){
      inserirDepois(head,elemento);
    }

    public void inserirNoFinal(Object elemento){
      inserirAntes(tail,elemento);
    }

    public Object remove(No no){
        no.getAnterior().setProximo(no.getProximo());
        no.getProximo().setAnterior(no.getAnterior());
        size--;
        return no.getElemento();
    }

    public Object first(){
      return head.getProximo().getElemento();
    }

    public Object last(){
      return tail.getAnterior().getElemento();
    }

    public No before(No no){
      //verificar se anterior é head
      return no.getAnterior();
      
    }
  
    public No after(No no){
      //verificar se proximo é o tail
      if(no.getProximo() != tail){
        return no.getProximo();
      }else{
        return null;
      }
    }

    public void substituirElemento(No no, Object elemento){
        no.setElemento(elemento);
    }

    //vou trocar no1 por no2
    public void trocarNo(No no1, No no2){
        Object trocado = no1.getElemento();
        no1.setElemento(no2.getElemento());
        no2.setElemento(trocado);
    }

  
}