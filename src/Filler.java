import java.util.Random;

public class Filler {

    public static final int MAX_VALUE = 200;
    public static final int MIN_VALUE = -100;

    public static void fillInArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_VALUE) + MIN_VALUE;
        }
    }
}
