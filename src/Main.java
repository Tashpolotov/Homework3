public class Main {
    private static boolean[] array;
    private static double[] aza;


    public static void main(String[] args) {
        double[] one = {45.5, -86.2, 15.0, 21.7, -22.8, 18.5, -1.2, 7.0,
                8.7, -5.8, 11.5, -3.2, 65.0, 15.7, 7.8};
        double num = 0;
        int kol = 0;
        boolean otr = false;
        for (double hat : one) {
            if (hat < 0) {
                otr = true;
            } else {
                if (otr) {
                    kol++;
                    num += hat;
                }
            }
        }
        System.out.println("Среднее арифметическое=\t" + num / kol);

              }

            }















