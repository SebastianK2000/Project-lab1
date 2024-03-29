package Persons;

public class Pracownik extends Osoba {
    protected int id;
    protected KontoBankowe kontoBankowe;
    protected String stanowisko;


    public Pracownik(String name, String lastName, int age, String gender, int phoneNumber, String email, int id, KontoBankowe kontoBankowe, String stanowisko)
    {
        super(name, lastName, age, gender, phoneNumber, email);
        this.id = id;
        this.kontoBankowe = kontoBankowe;
        this.stanowisko = stanowisko;
    }

    public void drukuj() {
        super.drukuj();
        System.out.println("Id: " + id);
        kontoBankowe.drukuj();
        System.out.println("Stanowisko: " + stanowisko);
    }
}