import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        int sayi;
        Scanner oku = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı girin : ");
        sayi = oku.nextInt();
        Faktoriyel(sayi);
    }
    static void Faktoriyel(int sayi) {
        int faktoriyel = 1;
        for(int i = 2; i <= sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(sayi + "!= " + faktoriyel+ "\n"+sayi + " sayısının faktöriyeli = " + faktoriyel);
    }
}
