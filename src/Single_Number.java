import java.util.Scanner;

public class Single_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int iterator = 0; iterator < size; iterator++) {
            array[iterator] = scanner.nextInt();
        }

        System.out.println(single_number(array, size));
    }

    static int single_number(int[] array, int size) {
        int result=0;
        for(int i=0;i<size;i++){
            result=result^array[i];
        }
        return result;
    }
}
