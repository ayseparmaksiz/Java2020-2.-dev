public class Main {

    public static void main(String[] args) {

         String message = "The weather is very nice today";
        // String newMessage= message.substring(0,2);
       //  System.out.println(newMessage);
         String newMessage = giveCity();
         System.out.println(newMessage);
         int number = add2(14, 7);
         System.out.println(number);
         int addition= add3(2,3,4,5,6,7,9);
         System.out.println(addition);


    }

    public static void add() {
        System.out.println("added");

    }
    public static int add3(int... numbers){
      int addition=0;
      for(int number: numbers){
          addition+=number;
      }
      return addition;
    }

    public static void delete() {
        System.out.println("deleted");

    }

    public static void update() {
        System.out.println("updated");

    }

    public static int add2(int number1, int number2) {
        return number1 + number2;
    }

    public static String giveCity() {
        return "Ankara";
    }
}
