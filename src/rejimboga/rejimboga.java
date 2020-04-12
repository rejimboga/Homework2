package rejimboga;

import java.util.Scanner;

public class rejimboga {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Считывает:");
        for (; ;) {
            int s = scanner.nextInt();

            if (9999 < s && 100000 > s) {
                System.out.println(s/10000);
                System.out.println((s%10000)/1000);
                System.out.println(((s%10000)%1000)/100);
                System.out.println((((s%10000)%1000)%100)/10);
                System.out.println((((s%10000)%1000)%100)%10);
                break;

            } else System.out.println("Выводится:");
        }
    }
}
