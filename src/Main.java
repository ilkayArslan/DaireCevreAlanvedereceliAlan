import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double yariCap,PI = 3.14,cevre,alan,derece,dereceAlani;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Hesaplama için yarıçap giriniz : ");
        yariCap = input.nextInt();
        System.out.print("Lütfen Hesaplama için derece giriniz : ");
        derece = input.nextInt();
        cevre = Math.round(2*PI*yariCap);
        alan = Math.round(PI*yariCap*yariCap);
        dereceAlani = Math.round((PI*yariCap*yariCap*derece)/360);
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin Dereceli alanı : "+dereceAlani);

    }
}