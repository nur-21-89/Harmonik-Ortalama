package IkinciHafta;
import java.util.Scanner;
public class HarmonikOrtalama {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        double result = 0.0;

        System.out.print("Eleman Sayısını Giriniz:");
        double n = input.nextDouble();

        double[] dizi = new double[(int)n];
        for (int i = 0; i< dizi.length; i++){
            System.out.print((i+1)+".Elemanı Giriniz:");
            dizi [i] = input.nextDouble();
            result += n/(1/dizi[i]);
            }
        System.out.print("Dizinizin Harmonik Ortalaması:"+result);
        }

        }


