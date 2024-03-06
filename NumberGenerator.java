import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int min = 1; // Minimum value of the random number
        int max = 100; // Maximum value of the random number
        System.out.println(generateRandomNumber(min, max));
    }

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
