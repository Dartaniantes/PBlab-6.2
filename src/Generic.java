
import java.util.Scanner;

public class Generic<T extends Comparable<T>> {
    T[] t;
    int size;

    public Generic(T[] c) {
        t = c;
        size = t.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.print("Byte array : ");
        Byte[] b = RandomArrayGenerator.genByteArray(50);
        RandomArrayGenerator.sort(b);
        RandomArrayGenerator.show(b);
        System.out.println();
        System.out.print("Short array : ");
        Short[] s = RandomArrayGenerator.genShortArray(50);
        RandomArrayGenerator.show(s);
        System.out.println();
        System.out.print("Integer array : ");
        Integer[] i = RandomArrayGenerator.genIntegerArray(50);
        RandomArrayGenerator.show(i);
        System.out.println();
        System.out.print("Long array : ");
        Long[] l = RandomArrayGenerator.genLongArray(50);
        RandomArrayGenerator.show(l);
        System.out.println();

        Generic<Byte> byteArr = new Generic(b);
        Generic<Short> shortArr = new Generic(s);
        Generic<Integer> intArr = new Generic(i);
        Generic<Long> longArr = new Generic(l);
        while (input!= -1) {
            System.out.print("Choose number of array type : \n" +
                    "   1. Byte\n" +
                    "   2. Short\n" +
                    "   3. Integer\n" +
                    "   4. Long\n" +
                    "Enter it here (enter '-1' to quit the program) --> ");
            input = sc.nextInt();
            switch (input) {
                case 1:{
                    System.out.print("Enter value to find --> ");
                    input = sc.nextByte();
                    System.out.println("index = " + byteArr.uniformBinSearch((byte) input));
                } case 2:{
                    System.out.print("Enter value to find --> ");
                    input = sc.nextShort();
                    System.out.println("index = " + shortArr.uniformBinSearch((short) input));
                } case 3:{
                    System.out.print("Enter value to find --> ");
                    input = sc.nextInt();
                    System.out.println("index = " + intArr.uniformBinSearch(input));
                } case 4:{
                    System.out.print("Enter value to find --> ");
                    input = (int) sc.nextLong();
                    System.out.println("index = " + longArr.uniformBinSearch((long) input));
                }

            }
        }
    }

    private int uniformBinSearch(T key) {

        int h = size / 2, i = h;
        int j = 0;
        for (;h > 1;) {
            h /= 2;
            j++;
            System.out.println("Index = " + i + ", t[i] = " + t[i] + ", compare #" + j  + " : " + key.compareTo(t[i]));
            if(key.compareTo(t[i-1]) == 0)
                return i;
            else if (key.compareTo(t[i-1]) < 0){
                i -= h;
            }
            else if (key.compareTo(t[i-1]) > 0){
                 i += h;
            }
        }
        return -1;
    }

}
