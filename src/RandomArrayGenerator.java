import java.util.Comparator;

public class RandomArrayGenerator {

    public static <T extends Comparator<T>> void sort(T[] arr) {
        T temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compare(arr[i], arr[i + 1]) > 0) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
            }
        }
    }

    public static <T> void show(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length-1)
                System.out.print(arr[i] + ", ");
            else
                System.out.println(arr[i]);
        }
    }

    public static Integer[] genIntegerArray(int size) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random()*100);
        return arr;
    }

    public static Short[] genShortArray(int size) {
        Short[] arr = new Short[size];
        for (int i = 0; i < size; i++)
            arr[i] = (short)(Math.random()*100);
        return arr;
    }

    public static Byte[] genByteArray(int size) {
        Byte[] arr = new Byte[size];
        for (int i = 0; i < size; i++)
            arr[i] = (byte)(Math.random()*100);
        return arr;
    }

    public static Long[] genLongArray(int size) {
        Long[] arr = new Long[size];
        for (int i = 0; i < size; i++)
            arr[i] = (long)(Math.random()*100);
        return arr;
    }
}
