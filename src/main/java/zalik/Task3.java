package zalik;

public class Task3 {

    public static void main(String[] args) {

        int r = 1; //верхня частинка ромба
        int spaces = 5;

        while (r <= 6) {
            int sp = 0;
            while (sp < spaces) {
                System.out.print(" ");
                sp++;
            }

            if (r == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int inner = 0;
                while (inner < (r - 1) * 2 - 1) {
                    System.out.print(" ");
                    inner++;
                }
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            r++;
        }

        r = 5;   //нижня частинка ромба
        spaces = 1;

        while (r >= 1) {
            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            if (r == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int inner = 0;
                while (inner < (r - 1) * 2 - 1) {
                    System.out.print(" ");
                    inner++;
                }
                System.out.print("*");
            }

            System.out.println();
            spaces++;
            r--;
        }
    }
}