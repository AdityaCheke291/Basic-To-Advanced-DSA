package Java.X_Evaluation.Unit_I.A_Evalutaion;

import java.util.Scanner;

public class D_FindSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int KA = K*A;
        int KB = K*B;
        int KC = K*C;
        int sum = KA + KB+ KC;
        System.out.println(sum);
    }
}
