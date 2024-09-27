import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);

        int n1,n2,select;

        System.out.print("Birinci sayıyı giriniz=");
        n1= imput.nextInt();
        System.out.print("İkinci sayıyı giriniz=");
        n2=imput.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz=");
        select=imput.nextInt();

        switch (select){
            case 1:
                System.out.print("TOPLAM="+(n1+n2));
                break;
            case 2:
                System.out.print("ÇIKARTMA="+(n1-n2));
                break;
            case 3:
                System.out.print("ÇARPMA="+(n1*n2));
                break;
            case 4:
                if (n2!=0){
                System.out.print("BÖLME="+(n1/n2));
                } else {
                    System.out.print("Bir sayı sıfıra bölünmez.");
                }
                break;
            default:
                System.out.print("HATALI SEÇİM YAPTINIZ.TEKRAR DENEYİNİZ !");

        }


    }
}
