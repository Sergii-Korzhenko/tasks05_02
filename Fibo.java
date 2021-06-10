package tasks05_02;

public class Fibo {

        public static void main(String[] args) {
            int max = 55;
            int[] fibo = new int[100];
            for (int i = 0; i < 100; i++) {
                if (i == 0) {
                    fibo[0] = 0;
                    System.out.println(fibo[0]);
                }
                if (i == 1) {
                    fibo[1] = 1;
                    System.out.println(fibo[1]);
                }
                if (i == 2) {
                    fibo[2] = 1;
                }
                if (i > 1) {
                    fibo[i] = fibo[i - 1] + fibo[i - 2];
                    System.out.println(fibo[i]);
                }
                if (fibo[i] == max) {
                    System.out.println("Последнее число Фибоначчи в диапазоне 1-55: " + fibo[i]);
                    break;
                }
            }
        }
    }




