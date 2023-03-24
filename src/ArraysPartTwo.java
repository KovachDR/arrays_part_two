import java.util.Random;

public class ArraysPartTwo {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray(){
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int sumArray = 0;
        for (int i = 0; i < arr.length; i++) {
        sumArray = sumArray + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumArray + " рублей");
    }
    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();
        int minCost = 200001;
        int maxCost = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (minCost > arr[i]){
                minCost = arr[i];
            }
            if (maxCost < arr[i]){
                maxCost = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost
                + " рублей. Максимальная сумма трат за ден составила " + maxCost + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int period = 30;
        double averageValue = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        averageValue = sum / period;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }
    public static void task4() {
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
