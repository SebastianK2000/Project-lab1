package Persons;

public class Manager extends Pracownik {
    protected String nazwaZespolu;
    protected int liczbaZespolu;
    public Manager(String name, String lastName, int age, String gender, int phoneNumber, String email, int id, KontoBankowe kontoBankowe, String stanowisko, String nazwaZespolu, int liczbaZespolu)
    {
        super(name, lastName, age, gender, phoneNumber, email, id, kontoBankowe, stanowisko);
        this.nazwaZespolu = nazwaZespolu;
        this.liczbaZespolu = liczbaZespolu;
    }

    public void drukuj() {
        super.drukuj();
        System.out.println("Nazwa zespołu: " + nazwaZespolu);
        System.out.println("Liczba zespołu: " + liczbaZespolu);
    }
}
