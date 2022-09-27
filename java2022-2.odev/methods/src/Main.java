public class Main {

    public static void main(String[] args) {
        numberFind();
        numberFind();
        numberFind();
        numberFind();

    }

    public static void numberFind() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int search = 6;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == search) {
                isThere = true;
                break;
            }
        }
        String message="";
        if (isThere) {
            giveMessage("number is there:" + search);
        } else {
            giveMessage("number isn't there:" + search);
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }
}
