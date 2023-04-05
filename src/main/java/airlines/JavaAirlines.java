package airlines;

import java.util.Scanner;

public class JavaAirlines {
    /*
    A sehrinden ucmak isteyen bir yolcu B sehrine 50 km  C sehrine 70km  D sehrine 900 km mesafededir.
    Bilet Tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasinda ise %10 indirim,
    65 yasindan kucukse %30 indirim
    bilet gidis donus alinirsa %20 indirim
    Uygulayan bir app create ediniz...              (Bir indirim diger indirime engel degil ezme yok)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Java Airlines'a hos geldiniz.  \n B , C , D rotasindan birini seciniz : ");
        String city = scan.next().toUpperCase();
        System.out.println("Ucusunuz icin \n tek yon --> 1 \n cift yon --> 2  \n giriniz : ");
        int flytype = scan.nextInt();
        System.out.println("Yasinizi giriniz : ");
        int age = scan.nextInt();
        double priceC = 0.10 * 700;
        double priceB = 0.10 * 500;
        double priceD = 0.10 * 900;

        if (city.equals("B") || city.equals("C") || city.equals("D")) {

            if (age > 65) {  //65 yas ustu kontrolu yas icin %30 indirim
                if (city.equals("B")) {  // Ucus rotasi kontrolu
                    if (flytype == 1) {  // ucus tek-cift yon kontrolu%20 indirim ekstra
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.7 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceB * 0.7 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.7 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceC * 0.7 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                }
                if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceD * 0.7 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");
                }


            } else if (age>=12 && age<24) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.9 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceB * 0.9 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.9 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceC * 0.9 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                }
                if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceD * 0.7 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceD * 0.7 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");
                }


            } else if (age < 12) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB * 0.5 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceB * 0.5 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC * 0.5 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceC * 0.5 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                }
                if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceD * 0.5 + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceD * 0.5 * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");
                }
            }else if (age>=24 && age<65) {
                if (city.equals("B")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceB + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceB * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                } else if (city.equals("C")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceC + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceC * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");

                }
                if (city.equals("D")) {
                    if (flytype == 1) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + priceD + " $");

                    } else if (flytype == 2) {
                        System.out.println("   *********     ");
                        System.out.println("Ucusunuz icin bilet odemeniz : " + (priceD * 0.8) * 2 + " $");

                    } else System.out.println("Hatali veri girdiniz");
                }
            } else System.out.println("Yasi dogru giriniz : ");

        }else System.out.println("Henuz o sehre ucus yok.");



    }


}