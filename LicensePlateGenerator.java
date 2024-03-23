public class LicensePlateGenerator {
    public static void main(String[] args) {
        // Generate two random uppercase letters between A and K
        char letter1 = (char) ('A' + (int) (Math.random() * 11));
        char letter2 = (char) ('A' + (int) (Math.random() * 11));

        // Generate a four-digit random number
        int randomNumber = (int) (Math.random() * 10000);

        System.out.println("Generated License Plate: " + letter1 + letter2 +"-"+ +randomNumber);
    }
}
