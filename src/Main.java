import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, pi = 3.14, topAlan, cevre, aci, dilimAlan;
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = sc.nextDouble();
        System.out.print("Dairenin açısını giriniz : ");
        aci = sc.nextDouble();
        topAlan = pi*r*r;
        cevre = 2*pi*r;
        dilimAlan = (pi*r*r*aci)/360;

        System.out.println("-----------------------------------");
        System.out.println("Dairenin Alanı        : "+topAlan);
        System.out.println("Dairenin Çevresi      : "+cevre);
        System.out.println("Daire Diliminin Alanı : "+dilimAlan);

    }
}