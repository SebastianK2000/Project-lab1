package Persons;

public class PracownikFizyczny extends Pracownik {
    protected String obowiazki;

    public PracownikFizyczny(String name, String lastName, int age, String gender, int phoneNumber, String email, int id, KontoBankowe kontoBankowe, String stanowisko, String obowiazki)
    {
        super(name, lastName, age, gender, phoneNumber, email, id, kontoBankowe, stanowisko);
        this.obowiazki = obowiazki;
    }

    public void drukuj()
    {
        super.drukuj();
        System.out.println("Obowiązki: " + obowiazki);
    }
}
