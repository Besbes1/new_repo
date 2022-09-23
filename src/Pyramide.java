import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        StringBuilder out;

        for(int pyramide = 1 ; pyramide <= input ; pyramide ++){
            System.out.println("pyramide " + pyramide);
            for(int row = 1 ; row <= pyramide; row++) {
                out = new StringBuilder();
                int temp = ((pyramide * 2 - 1) - (2 * row - 1)) / 2;
                for (int dot = 1; dot <= temp; dot++) {
                    out.append(".");
                }
                for (int tag = 1; tag <= (2 * row - 1); tag++) {
                    out.append("#");
                }
                for (int dot = 1; dot <= temp; dot++) {
                    out.append(".");
                }
                out.append("\n");
                System.out.println(out);
            }
            System.out.println();
        }
    }
}
