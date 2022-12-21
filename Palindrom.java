package Metotlar;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("******************");
            System.out.println("Verilen sayıyı geçici sayıya eşitliyoruz. Temp : " + temp);

            // 1'ler basamağındaki rakamı bulmak için sayıyı 10'a bölüp kalanını alıyoruz ve lastNumber
            // değerimize atıyoruz.

            lastNumber = temp % 10;
            System.out.println("Son basamak " + lastNumber);

            // Ters çevirme işlemi geçici sayıyı her böldüğümüzde ve lastNumber e eklemek isrediğimizde
            // lastNumberi 10 ile çarpıp 1'ler basamağındaki rakamı 10'lar basamağına aktarıyoruz ve
            // değeri reverseNumbere atıyoruz.

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı : " + reverseNumber);

            // Hr işlemden sonra geçici sayımızı 10'a bölüm basamaklarını tek tek azaltıyoruz ve
            // Tempin yeni değerine atıyoruz.

            temp /= 10;
            System.out.println("Yeni temp : " + temp);

            // Döngü geçici sayınn bölünecek basamağı kalmayana kadar devam ediyor.
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(1881));
    }
}
