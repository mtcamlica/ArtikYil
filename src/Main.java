import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
                1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.

        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
                Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
         */

        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print( yil+" Yılı artık bir yıldır.");
            }else {
                System.out.print( yil+" Yılı artık bir yıl değildir.");
            }
        } else if (yil % 4 == 0) {
            System.out.print( yil+" Yılı artık bir yıldır.");
        }else {
            System.out.print( yil+" Yılı artık bir yıl değildir.");
        }

    }
}
