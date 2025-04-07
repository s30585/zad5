public class Wydarzenie {
    String nazwa;
    String data;
    String miejsce;
    int maxLiczbaMiejsc = 100;
    int dostepneMiejsca = 0;
    double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, String data, double cena) {
        this.nazwa = nazwa;
        this.data = data;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, String data, String miejsce, double cena) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }
    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }
    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Wydarzenie{" +
                "nazwa='" + nazwa + '\'' +
                ", data='" + data + '\'' +
                ", miejsce='" + miejsce + '\'' +
                ", maxLiczbaMiejsc=" + maxLiczbaMiejsc +
                ", dostepneMiejsca=" + dostepneMiejsca +
                ", cena=" + cena +
                '}';
    }
    public boolean zarezerwujMiejsce() {
        if (dostepneMiejsca >= 0) {
            System.out.println("Brak wolnych miejsc");
            return false;
        }
        dostepneMiejsca--;
        return true;
    }
}

