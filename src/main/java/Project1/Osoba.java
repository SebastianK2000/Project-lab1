package Project1;

public class Osoba {

    protected String name;
    protected String lastName;
    public Osoba(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }

    public void drukuj()
    {
        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + lastName);
    }

}
