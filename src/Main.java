import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        int n= input.nextInt();
        for (int i=n;i>0;i--){
            for (int x=1;x<n-i;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=(2*i)-1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
