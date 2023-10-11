import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Değişkenler
        String userName, password, select, newPassword;
        //Kullanıcıdan Veri Girişi
        //Kullanıcıdan Kullanıcı Adı Verisisin Alınması
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz : ");
        Scanner veri = new Scanner(System.in);
        userName = veri.nextLine();
        //Kullanıcı Adı Doğru
        if (userName.equals("patika")) {

            //Kullanıcıdan Şifre Verisinin Alınması
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            password = veri.nextLine();

            //Şifre Doğru
            if (password.equals("java123")) {
                System.out.println("Başarıyla Giriş Yapılmıştır.");
            }

            //Şifre Yanlış
            else {
                System.out.print("Girdiğini Şifre Yanlış, Şifrenizi Sıfırlamak İster misiniz? (E/H)");
                select = veri.nextLine();

                // Şifre Sıfırlama (E/H)
                // Şifre Sıfırlama Evet
                if (select.equals("e") || select.equals("E")) {

                    //Kullanıcının Yeni Şifre Girmesi
                    System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                    newPassword = veri.nextLine();

                    //Hatalı Girilen Şifre ile Aynı
                    if (!newPassword.equals(password)) {

                        // Unutulan Şifre ile Aynı mı?
                        if (newPassword.equals("java123")) {
                            System.out.println("Şifre Oluşturulamadı, Lütfen Tekrar Deneyiniz.");
                        }

                        // Hayır
                        else {
                            System.out.println("Şifre Oluşturuldu..");
                        }
                    } else {
                        // Hatalı Girilen Şifre İle Aynı
                        System.out.println("Şifre Oluşturulamadı, Lütfen Tekrar Deneyiniz.");
                    }
                }
                // Şifre Sıfırlama Hayır
                else {
                    System.out.println("Şifre Sıfırlama Reddedildi, Lütfen Giriş Yapmayı Tekrar Deneyiniz.");
                }
            }
        }
        //Kullanıcı Adı Yanlış
        else {
            System.out.println("Kullanıcı Adınız Yanlış, Lütfen Giriş Yapmayı Tekrar Deneyiniz..");
        }
    }
}
