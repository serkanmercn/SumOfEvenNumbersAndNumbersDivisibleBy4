import java.util.Scanner;

public class SumOfEvenNumbersAndNumbersDivisibleBy4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        System.out.print("Bu uygulama girdiniz sayıların çift sayı mı? 4'e \n"+
                "tam bölüne biliyor mu? Kontrolünü yapar ve tek sayı girdiğiniz an uygulama sonlanır. Girdiğiniz çift sayıları\n"+
                "toplar ve ekrana yazdırır.\n");

        do {
            System.out.print( "Lütfen Bir sayı giriniz: ");
            sayi=input.nextInt();
            if(sayi % 2== 0 || sayi % 4 == 0){
                toplam+=sayi;
                System.out.print("Çift sayı ve 4'e tam bölünebilen sayıların toplamı: "+ toplam+"\n") ;

            }else{
                System.out.println("Tek sayı girdiniz. ");
                break;
            }

        }while (sayi>0);
        System.out.println("Çift sayı ve 4'e tam bölünebilen sayılar Toplam: " + toplam + "\n");
        System.out.println("============by Mehmet Duran Kaya===============");
    }
}