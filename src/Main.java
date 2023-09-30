public class Main {
    public static void main(String[] args) {

        int amount = 15895;
        boolean woman = true;

        int ratio;
        if (woman) {
            ratio = 20;
        } else {
            ratio  = 0;
        }
        int bonus = amount / ratio;
        System.out.println("Бонус за полёт: " + bonus);
    }

}
    