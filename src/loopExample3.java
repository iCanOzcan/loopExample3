import java.util.Scanner;
public class loopExample3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();
        for(int i=1, j=1; i<=n||j<=n; i*=4, j*=5){
            System.out.println(i + "," + j);
        }
    }
}