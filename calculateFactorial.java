public class calculateFactorial {{}
    public static int calculateFactorial(int n){
        int result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5)); //120
    }
}
