package InterestExercise1;

public class InterestExercises1 {
    public static void main(String[] args) {
        int[] array1 = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] array2 = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int count = 0;
        if (array1.length == array2.length) {
            System.out.println("Array equal");
        } else {
            System.out.println("Arrays are not equal");
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            int square = array1[i] * array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (square == array2[j]) {
                    count++;
                    array2[j] = -1;
                    break;
                }
            }
        }
        if (count == array1.length) {
            System.out.println("У всех элементов из первого массива, есть квадраты во втором");
        } else {
            System.out.println("Не у всех чисел из первого массива есть квадраты во втором");
        }
    }
}
