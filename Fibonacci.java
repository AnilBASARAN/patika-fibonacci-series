import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Fibonacci eleman sayısını giriniz: ");
        //İlk iki elemanı tanımla ve yazdır
            int number = input.nextInt();
            int x = 0, y = 1, z = 0;
        //İlk iki elemanı yazdır

            System.out.print(x + " " + y);

            for (int i = 2; i < number; i++) {
                //İlk iki elemanı toplayıp üçüncü elemanı buluyoruz
                z = x + y;
                System.out.print(" " + z);
                //İlk elemanı ikinci elemana eşitle , İkinci elemanı üçüncü elemana eşitle
                x = y;
                y = z;
                // n sefer tekrarla
            }

        }
    }

