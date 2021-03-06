public class Calculate {
    public static int minNumOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] newArrayOfMinValue(int[] array) {
        int size = sizeofArray(array);
        int[] mas = new int[size];
        for (int i = 0, j = 0; i < size; j++) {
            if (array[j] != minNumOfArray(array)) {
                mas[i] = array[j];
                i++;
            }
        }
        return mas;
    }

    private static int sizeofArray(int[] array) {
        int count = 0;
        int min = minNumOfArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                count++;
            }
        }
        return count;
    }
}
