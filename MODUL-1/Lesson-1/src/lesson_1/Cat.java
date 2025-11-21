package lesson_1;

import java.util.Scanner;

public class Cat {

    public static void main(String[] args) {
2
        Scanner Sc = new Scanner(System.in);

////       TASK-1

//        System.out.println("Ededi daxil edin:");
//        int a = Sc.nextInt();
//
//        if (a < 0) {
//            System.out.println("Eded menfidir");
//        } else if (a > 0) {
//            System.out.println("Eded musbetdir");
//        } else {
//            System.out.println("Eded sifira beraberdir");
//        }

////      TASK-2

//        System.out.println("1-7 arasinda eded daxil edin:");
//        int a = Sc.nextInt();
//
//        if (a == 1) {
//            System.out.println("Bazar ertesi");
//        } else if (a == 2) {
//            System.out.println("Çərşənbə axşamı");
//        } else if (a == 3) {
//            System.out.println("Çərşənbə");
//        } else if (a == 4) {
//            System.out.println("Cümə axşamı");
//        } else if (a == 5) {
//            System.out.println("Cümə");
//        } else if (a == 6) {
//            System.out.println("Şənbə");
//        } else if (a == 7) {
//            System.out.println("Bazar");
//        } else {
//            System.out.println("Yanlish ededi daxil etdinz");
//        }

////        TASK-3

//        System.out.println(" Eded daxil edin:");
//        int a = Sc.nextInt();
//        for (int i = 1; i <= a; i++)
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }

////        TASK - 4

//        Bütün tapşırığı yazmamağımın səbəbi prinsipialdır.

//        Mən dərsdə keçilən mövzular ilə tələb olunan tapşırıq arasındakı
//        bəzi hissələrin araşdırma yolu ilə öyrənilməli və istifadə edilməli olduğunu müəyyən etdim.
//        Hər hansı bir süni intellekt vasitəsilə tapşırığı yazmaq istəmədiyim üçün bu tapşırığı özüm tamamlamadım.
//
////      TASK-5
//
//        System.out.println("Yashinizi daxil edin");
//        int y = Sc.nextInt();
//        System.out.println("Cinsinizi daxil edin M/F");
//        char c = Sc.next().charAt(0);
//        if (y < 18) {
//            System.out.println("Giriş qadağandır.");
//        } else {
//            if (c == 'k' || c == 'K') {
//                System.out.println("Kişi üçün giriş icazə verildi.");
//            } else if (c == 'Q' || c == 'q') {
//                System.out.println("Qadın üçün giriş icazə verildi.");
//            } else {
//                System.out.println("Yanlış cins daxil edilib.");
//            }
////        TASK - 6

////        Bütün tapşırığı yazmamağımın səbəbi prinsipialdır.
////        Mən dərsdə keçilən mövzular ilə tələb olunan tapşırıq arasındakı
////        bəzi hissələrin araşdırma yolu ilə öyrənilməli və istifadə edilməli olduğunu müəyyən etdim.
////        Hər hansı bir süni intellekt vasitəsilə tapşırığı yazmaq istəmədiyim üçün bu tapşırığı özüm tamamlamadım.
////
////       TASK-7
//        System.out.println("Bir eded daxil edin");
//        int n = Sc.nextInt();
//
//        if (n<0) {
//            System.out.println("Mənfi ədədlər üçün faktorial mövcud deyil");
//        } else  {
//            long f = 1;
//            for ( int i=1; i<= n ; i++) {
//                f=f*i;
//            }
//            System.out.println(n + "! = " + f);
//        }

////        TASK-8

        System.out.print("Bir ədəd daxil edin: ");
        int number = Sc.nextInt();
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == number) {
            System.out.println(number + " bir güclü ədəddir.");
        } else {
            System.out.println(number + " güclü ədəd deyil.");
        }
    }
}