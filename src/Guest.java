public class Guest {
    String name;
    String dish;
    int number;

    public String getName() {
        return name;
    }

    public String getDish() {
        return dish;
    }

    public Guest(String name, String dish ,int number) {
        this.name = name;
        this.dish = dish;
        this.number = number;
    }
     void guestInformation(){
         System.out.println("name : " + name);
         System.out.println("dish : " + dish);
         System.out.println("number : " + number);

     }
}
