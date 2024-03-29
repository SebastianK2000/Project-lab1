package Persons;

public class Project {

    public static void main(String[] args) {

        //pracownicy biurowi
        PracownikBiurowy p2 = new PracownikBiurowy("John", "Doe", 30, "male", 222222222, "jdoe@wp.pl", 2,  new KontoBankowe("PKO", "00 0000 0000 0000 0000"), "QA", "C123");
        p2.drukuj();

        // pracownicy fizyczni
        PracownikFizyczny pf1 = new PracownikFizyczny("Dorota", "Nowak", 45, "female", 111111111, "dnowak@wp.pl", 1, new KontoBankowe("ING Bank", "11 1234 1234 1234 1234 "),"Osoba sprzątająca", "Sprzątanie biura");
        pf1.drukuj();

        // manager
        Manager m1 = new Manager("David", "Smith", 35, "male", 333333333, "dsmith@wp.pl", 3, new KontoBankowe("Millenium", "22 2222 2222 2222 2222"), "Manager", "Testy automatyczne + manualne", 5);
        m1.drukuj();

        // CEO
        CEO c1 = new CEO("Anna", "Kowalska", 40, "female", 444444444, "akowalska@wp.pl", 4, new KontoBankowe("Alior Bank", "33 3333 3333 3333 3333"), "Dyrektor", "Quality Softwere");
        c1.drukuj();
    }

}
