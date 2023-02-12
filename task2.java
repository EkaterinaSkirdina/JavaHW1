// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.
// Пример: 1 2 1 2 -1 1 3 1 3 -1 0
// 2 -1 переход - 2 в сумму
// 3 -1 переход 3 в сумму
// суммарно выведет 5

package SeminarsHW.HW1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int summa = 0;
        if (num1 != 0) {
            int num2 = scanner.nextInt();            
            while (num2 != 0) {
                if (num1 > 0 && num2 < 0) {
                    summa += num1;
                }
                num1 = num2;
                num2 = scanner.nextInt();
            }
        }
        System.out.println(summa);
    }
}
