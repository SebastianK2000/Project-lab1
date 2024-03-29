package Persons;

public class PracownikBiurowy extends Pracownik {
    private String numerBiura;
    public PracownikBiurowy(String name, String lastName,int age, String gender, int phoneNumber, String email, int id, KontoBankowe kontoBankowe, String stanowisko, String numerBiura)
    {
        super(name, lastName, age, gender, phoneNumber, email, id, kontoBankowe, stanowisko);
        this.numerBiura = numerBiura;
    }
    public void drukuj() {
        super.drukuj();
        System.out.println("Numer biura: " + numerBiura);
    }
}
