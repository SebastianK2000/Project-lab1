package Project1;

public class Pracownik extends Osoba {
    private int id;
    private KontoBankowe kontoBankowe;


    public Pracownik(String name, String lastName, int id, KontoBankowe kontoBankowe )
    {
        super(name, lastName);
        this.id = id;
        this.kontoBankowe = kontoBankowe;
    }

    public void drukuj() {
        super.drukuj();
        System.out.println("Id: " + id);
        kontoBankowe.drukuj();
    }
}