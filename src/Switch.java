import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int state = 0;
        if(state == 0) {
            System.out.println("descarcata");
        } else if (state == 1) {
            System.out.println("incarcata partial");
        } else if (state == 2) {
            System.out.println("incarcata complet");
        } else {
            System.out.println("eroare");
        }

        switch(state) {
            case 0:
                System.out.println("descarcata");
                break;
            case 1:
                System.out.println("incarcata partial");
                break;
            case 2:
                System.out.println("incarcata complet");
                break;
                default:
                    System.out.println("eroare");
        }

        int ora;
        System.out.print("Introdu ora: ");
        Scanner reader = new Scanner(System.in);
        ora = reader.nextInt();

        String mesaj;
        if (ora < 12) {
            mesaj = "Neata!";
        } else {
            mesaj = "Salut!";
        }
        mesaj = (ora < 12) ? "Neata!" : "Salut";
        System.out.println(mesaj);

    }
}
