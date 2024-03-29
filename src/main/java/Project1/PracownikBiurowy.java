package Project1;

public class PracownikBiurowy extends Pracownik {
    private String numerBiura;
    public PracownikBiurowy(String name, String lastName, int id, KontoBankowe kontoBankowe, String numerBiura)
    {
        super(name, lastName, id, kontoBankowe);
        this.numerBiura = numerBiura;
    }
    public void drukuj() {
        super.drukuj();
        System.out.println("Numer biura: " + numerBiura);
    }
}
