public class Product {
    private String nazwa;
    private  String producent;
    private int cena;

    public Product(String nazwa, String producent, int cena) {
        this.nazwa = nazwa;
        this.producent = producent;
        this.cena = cena;
    }

    public Product() {

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString (){

        String text="Nazwa: "+this.getNazwa()+", Producent: "+this.getProducent()+", Cena: "+this.getCena();
        return  text;
        }



    public String NajczestrzyProducent(Product[] tab){

        int ostatniePowtorzenie = 0;
        int powtorzenie = 0;
        String nazwaProducenta = tab[0].getProducent();

        for (int i = 1; i < tab.length; i++) {
            if (tab[i].getProducent().equals(tab[i - 1].getProducent()))
                powtorzenie++;

             if (powtorzenie > ostatniePowtorzenie) {
                 nazwaProducenta = tab[i - 1].getProducent();
                 ostatniePowtorzenie = powtorzenie;
                }


        }

        return nazwaProducenta;

    }
}
