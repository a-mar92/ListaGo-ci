import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Party {


    Scanner scanner = new Scanner(System.in);
    HashMap<Integer,Guest> findgByMobilePhone = new HashMap<>();

    ArrayList<Guest> guestList = new ArrayList<>();
    Set<String> menu = new HashSet<>();

    public Party() {

    }

    public void addNewGuest() {
        System.out.println("Give me a name");
        String name = scanner.nextLine();
        System.out.println("give me phone number");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Favorite dish");
        String dish = scanner.nextLine();
        Guest guest = new Guest(name, dish, number);
        guestList.add(guest);
        menu.add(dish);
        findgByMobilePhone.put(number,guest);
    }

    void showGuestList() {
        for (Guest guest : guestList) {
            guest.guestInformation();

        }}
        void showMenu () {
            for (String meal : menu
            ) {
                System.out.println(meal);

            }
        }

        void findByPhoneNumber(){
            System.out.println("Give me phone nuber");
            int number = Integer.valueOf(scanner.nextLine());
            findgByMobilePhone.get(number).guestInformation();



        }


    }



