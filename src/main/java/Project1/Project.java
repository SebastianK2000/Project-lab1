package Project1;

public class Project {

    public static void main(String[] args) {
        System.out.println("Wykład 1");
        Pracownik p1 = new Pracownik("Sebastian", "Kościółek", 2, new KontoBankowe("ING", "123456789"));
        p1.drukuj();
        PracownikBiurowy p2 = new PracownikBiurowy("John", "Doe", 5 , new KontoBankowe("PKO", "00 0000 0000 0000 0000"), "C123");
        p2.drukuj();
    }

}
