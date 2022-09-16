
public class ContandoNumerosPares {
    public static void main(String[] args) {
        int number = new java.util.Scanner(System.in).nextInt();
        System.out.println(numPar(number));
    }

    public static int numPar(int n) {
        int q = 0;
        for (int i = 1; i <= n; i++) {
            String sNum = String.valueOf(i);
            int s = 0;
            for (int j = 0; j < sNum.length(); j++) {
                s += Integer.parseInt(sNum.substring(j, j + 1));
            }
            if (s % 2 == 0) q++;
        }
        return q;
    }
}