// Учитывая входную строку s, измените порядок слов в обратном порядке.
// Слово определяется как последовательность символов, не содержащих пробелов.
// Слова в s будут разделены по крайней мере одним пробелом.
// Возвращает строку слов в обратном порядке, объединенную одним пробелом.

package SeminarsHW.HW1;

import java.util.Scanner;

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String s = scanner.nextLine();        
//         StringBuilder newStr = new StringBuilder();        
//         String[] words = s.split(" ");
//         System.out.println(words);
//         for (int i = words.length - 1; i >= 0; i--) {
//             newStr.append(words[i] + " ");
//         }
//         System.out.println(newStr);
//     }
// }

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder newStr = new StringBuilder();
        String[] words = s.trim().split(" +");
        System.out.println(words);
        for (int i = words.length - 1; i >= 0; i--) {
            if (i > 0) {
                newStr.append(words[i] + " ");
            }
            if (i == 0) {
                newStr.append(words[i]);
            }
        }
        System.out.println(newStr);
    }
}
