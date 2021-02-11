package e016.moreExceptions;

public class Calculator {
    public static void main(String[] args) {

    }
        public static int power ( int n, int p ) throws Exception {
        int Res = 1;
            if (n < 0 || p < 0) {
                throw new RuntimeException("n and p should be non-negative");
            } else {
                for (int i = 0; i < p; i++) {
                    Res = Res * n;
                }
            }
            return Res;
        }
    }