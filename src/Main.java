import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int islem;
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\nYapılacak işlemi seçiniz: ");
        islem = input.nextInt();



        switch (islem) {
            case 1:
                System.out.println("Cevap: " + (n1 + n2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 2:
                System.out.println("Cevap: " + (n1 - n2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 3:
                System.out.println("Cevap: " + (n1 * n2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Cevap: " + (n1 / n2));
                    System.out.println("İşlem Tamamlandı !");
                }else{
                    System.out.println("Hata: Bir sayı sıfıra bölünemez!\nİşlem Başarısız...");

                }
                break;
            default:
                System.out.println("Hata: Lütfen belirtilen seçenekleri kullanın!");

                break;


        }




    }
}