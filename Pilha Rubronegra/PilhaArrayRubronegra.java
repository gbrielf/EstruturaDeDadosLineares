public class PilhaArrayRubronegra implements PilhaRubronegra {
    private int capacidade;
    private Object[] a;
    private int tRed;
    private int tBlack;
    private int FC;
    public PilhaArrayRubronegra (int capacidade, int crescimento){
        this.capacidade = capacidade;
        tRed = -1;
        tBlack = capacidade;
        FC = crescimento;
        if (crescimento <= 0)
            FC = 0;
        a = new Object[capacidade];
    }

    public void empty(){
        for (int i = 0; i <= tRed; i++){
            a[i] = null;
        }
        tRed = -1;

        for (int j = (capacidade - 1); j >= tBlack; j++){
            a[j] = null;
        }
        tBlack = capacidade;
    }

    public void pushRed(Object o){
        if(tRed  >= (tBlack - 1)){
            int antigaCapacidade = capacidade;
            capacidade *= 2;
            Object b[] = new Object[capacidade];

            for (int i = 0; i <= tRed; i++){
                b[i] = a[i];
            }

            int novaTBlack = capacidade - (antigaCapacidade - tBlack);
            for (int j = antigaCapacidade - 1; j >= tBlack; j--){
                b[novaTBlack - (j - tBlack)] = a[j];       
            }
            tBlack = novaTBlack;
            a = b;
        }

        a[++tRed] = o;
    }
}


    


