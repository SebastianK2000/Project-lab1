package Persons;

public class Osoba {

    protected String name;
    protected String lastName;
    protected int age;
    protected String gender;
    protected int phoneNumber;
    protected String email;
    public Osoba(String name, String lastName, int age, String gender, int phoneNumber, String email)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void drukuj()
    {
        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Płeć: " + gender);
        System.out.println("Numer telefonu: " + phoneNumber);
        System.out.println("Email: " + email);
    }

}
