public class AdapterCheminee implements Appareil {
    private Cheminee chemineeAdapter;
    public AdapterCheminee(Cheminee a){
        this.chemineeAdapter=a;
    }

    public void allumer() {
        this.chemineeAdapter.changerIntensite(this.chemineeAdapter.getIntensite()+10);
    }
    public void eteindre() {
        this.chemineeAdapter.changerIntensite(0);
    }

    public String toString(){
        return this.chemineeAdapter.toString();
    }
}
