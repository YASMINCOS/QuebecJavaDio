import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        leitor.close();

        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; ) {
            for (int j = 0; j < t; j++) {
                if(i < numbers.length) {
                numbers[i] = j;
                System.out.println("N[" + i + "] = " + j);
                i++;
                }
            }
        }
    }
}