package Project1;

public class KontoBankowe {
    private String nazwaBanku;
    private String numerKonta;

    public KontoBankowe(String nazwaBanku, String numerKonta) {
        this.nazwaBanku = nazwaBanku;
        this.numerKonta = numerKonta;
    }

    public void drukuj() {
        System.out.println("Nazwa banku: " + nazwaBanku);
        System.out.println("Numer konta bankowego: " + numerKonta);
    }
}
