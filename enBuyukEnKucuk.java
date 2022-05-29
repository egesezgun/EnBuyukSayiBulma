
import java.util.Scanner;

public class enBuyukEnKucuk {

    public static void main(String[] args)
{
        Scanner input = new Scanner(System.in);
        int max=0 ;
        int min=0;
        for (int i=1;i<=4;i++){
        System.out.print(" sayı giriniz");
        int sayi=input.nextInt();
        if (i==1){
        min=sayi;
        max=sayi;
        }
        else{
        if(sayi>max)
        max=sayi;
        if (sayi<min)
        min=sayi;
        }
        }
        System.out.println("en büyük ="+max);
        System.out.println("en küçük ="+min);


        }
}
