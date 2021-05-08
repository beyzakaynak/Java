package eTicaretSimulation;

import eTicaretSimulation.business.abstracts.UserService;
import eTicaretSimulation.business.concretes.UserManager;
import eTicaretSimulation.dataAccess.concretes.HibernateUserDao;
import eTicaretSimulation.entities.concretes.User;

import java.util.*;


public class Main {


    public static void main(String[] args) {


        int secim = girisEkran();

        if (secim == 1) {
            islemYap(1);
        } else if (secim == 2) {
            islemYap(2);

        } else if (secim == 3) {
            islemYap(3);

        } else if (secim == 4) {
            islemYap(4);
        }


    }


    public static Integer girisEkran() {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sisteme Hoşgeldiniz.");
        System.out.println("Kayıt için 1,");
        System.out.println("Giriş için 2,");
        System.out.println("Gmail ile giriş için 3,");
        System.out.println("Çıkış için 4'ü tuşlayınız.");
        int secim = giris.nextInt();
        return secim;
    }

    public static void islemYap(int islem) {
        User user = new User();
        UserService userService = new UserManager(new HibernateUserDao());
        if (islem == 1) {
            Scanner girdi = new Scanner(System.in);
            System.out.print("Adınız: ");
            String ad = girdi.next();
            System.out.print("Soyadınız: ");
            String soyad = girdi.next();
            System.out.print("E-Postanız: ");
            String ePosta = girdi.next();
            System.out.print("Parolanız (en az 6 karakterden oluşmalıdır) : ");
            String parola = girdi.next();
            if (parola.length() >= 6) {
                user.setPassword(parola);
                user.setFirstName(ad);
                user.setLastName(soyad);
                user.setePosta(ePosta);
                userService.add(user);
                System.out.println("Kaydınız doğrulanıyor. Doğrulama e-postanız gönderilmiştir.");
                int secim = girisEkran();
                islemYap(secim);

            } else {
                System.out.println("Parola koşullarını sağlamıyorsunuz.");
                int secim = girisEkran();
                islemYap(secim);

            }

        } else if (islem == 2) {
            User user1 = new User(1, "beyza", "kaynak", "beyzakaynak98@gmail.com", "123456");
            Scanner giris = new Scanner(System.in);
            System.out.print("E-Postanız: ");
            String ePosta = giris.next();
            System.out.print("Parolanız: ");
            String parola = giris.next();
            if (user1.getPassword().equals(parola) && user1.getePosta().equals(ePosta)) {
                System.out.println("Giriş yaptınız");
            } else {
                System.out.println("Bilgiler uyuşmuyor.");
                int secim = girisEkran();
                islemYap(secim);  //recursive method
            }


        } else if (islem == 3) {
            Scanner giris = new Scanner(System.in);
            System.out.print("E-Postanız: ");
            String ePosta = giris.next();
            System.out.print("Parolanız: ");
            String parola = giris.next();
            System.out.println("Google ile girdiniz");
            int secim = girisEkran();
            islemYap(secim);

        } else if (islem == 4) {
            System.out.println("Hoşçakalın");
        }


    }
}