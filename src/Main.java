import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Party party = new Party();
        boolean enter = true;

        while (enter) {
            System.out.println("MENU : \n" +
                    "1 - dodaj\n" +
                    "2 = wyświetl\n" +
                    "3- zamówienie\n" +
                    "4 - findByNumber\n" +
                    "5 - exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    party.addNewGuest();
                    break;
                case 2:
                    party.showGuestList();
                    break;
                case 3:
                    party.showMenu();
                    break;
                case 4:
                    party.findByPhoneNumber();
                    break;
                case 5:
                    enter = false;
                    System.out.println("exit");
                    break;
            }


        }
    }

}
