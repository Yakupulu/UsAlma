import java.util.Scanner;

public class Uslu {
    public static void main(String[] args) {
        int a, b, i = 1, result = 1;
        boolean isTrue = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ussu alinacak sayiyi giriniz:");
        a = inp.nextInt();
        System.out.print("Us olacak sayiyi giriniz:");
        b = inp.nextInt();

        if (a >= 1 && b > 0) {
            while (i <= b) {
                result *= a;
                i++;
            }
        } else {
            isTrue = true;
        }

        if (isTrue == true) {
            System.out.println("Hatali giris yaptiniz.");
        } else {
            System.out.println("Sonuc:"+result);
        }
    }
}

