public class TesteListaLigada{
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();
        lista.insertInicio(3);
        lista.insertInicio(7);
        lista.insertInicio(4);
        lista.insertInicio(-5);
        lista.mostrarLista();
    }
}