import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int[] array = new int[size];
        Filler.fillInArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Integer.toString(Calculate.minNumOfArray(array)));
        System.out.println(Arrays.toString(Calculate.newArrayOfMinValue(array)));
    }
}
