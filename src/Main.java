import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Ters üçgendeki kat sayısını giriniz.");
        n=input.nextInt();

        for(int i=n; i>=1; i--){
            for (int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
