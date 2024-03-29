package Persons;

public class CEO extends Pracownik {
    protected String companyName;

    public CEO(String name, String lastName, int age, String gender, int phoneNumber, String email, int id, KontoBankowe kontoBankowe, String stanowisko, String companyName)
    {
        super(name, lastName, age, gender, phoneNumber, email, id, kontoBankowe, stanowisko);
        this.companyName = companyName;
    }

    public void drukuj() {
        super.drukuj();
        System.out.println("Nazwa firmy: " + companyName);
    }

}
