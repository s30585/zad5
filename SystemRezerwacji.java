import java.util.ArrayList;

public class SystemRezerwacji {
    ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();
    ArrayList<Klient> listaKlienta = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie w) {
        listaRezerwacji.add(w);
    }
    public void dodajWydarzenie(String nazwa, double cena) {
        Wydarzenie w = new Wydarzenie(nazwa, cena);
        listaRezerwacji.add(w);
    }
    public void dodajKlienta(Klient k) {
        listaKlienta.add(k);
    }
    public void dodajKlienta(String imie, String nazwisko) {
        Klient k = new Klient(imie, nazwisko);
        listaKlienta.add(k);
    }

    public void dokonajRezerwacji(Klient k, Wydarzenie w) {
        this.listaRezerwacji.add(w);
        this.listaKlienta.add(k);
        w.zarezerwujMiejsce();
        k.dodajRezerwacje(w);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaRezerwacji) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : listaKlienta) {
            if(k.getImie().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if (w != null) {
            throw new IllegalArgumentException("Wydzarzenie nie istnieje");
        }
        w.setCena(nowaCena);
    }
}
