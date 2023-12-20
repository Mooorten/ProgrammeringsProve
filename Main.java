import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Servicemedarbejder SM1 = new Servicemedarbejder(1, "Mohamed", "Salah","Vej1", "24-12-2023", "A1", "Elektriker", 120.10);
        AdministrativMedarbejder AM1 = new AdministrativMedarbejder(1, "Luis", "Diaz", "Vej2", "24-12-2023", "A2", "Sekretær", 130.50, 40.5);
        Leder LE1 = new Leder(1, "Darwin", "Nunez", "Vej3", "24-12-2023", "A3", 1, 12345.67);

        ArrayList <Ansat> a = new ArrayList<>();
        a.add(SM1);
        a.add(AM1);
        a.add(LE1);

        udskrivAnsatte(a);
    }
    public static void udskrivAnsatte(ArrayList <Ansat> a){
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
