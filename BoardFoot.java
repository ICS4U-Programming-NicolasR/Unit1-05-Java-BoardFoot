import java.util.Scanner;
/**
* Calculates the length of a board foot.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-03-02
*/

public final class BoardFoot {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the LengthCalc method.
     *
     * @param height //height
     * @param width //width
     * @return LENGTH
     *
     */
    public static double lengthCalc(final double height, final double width) {
        final double BRDFT = 144;
        final double LENGTH = BRDFT / (height * width);
        return LENGTH;
    }

    /**
     * This is the LengthCalc method.
     *
     * @param args //unused
     *
     */

    public static void main(final String[] args) {
        // Created a scanner object
        final Scanner INPUT_SCAN = new Scanner(System.in);
        System.out.println("What is the height(in)?");
        final String HEIGHT_STR = inputScan.nextLine();
        System.out.println("What is the width(in)?");
        final String WIDTH_STR = inputScan.nextLine();
        try {
            final double HEIGHT_DUB = Double.parseDouble(HEIGHT_STR);
            final double WIDTH_DUB = Double.parseDouble(WIDTH_STR);
            final double LENGTH_CALC = lengthCalc(HEIGHT_DUB, WIDTH_DUB);
            System.out.println("Your lenth is " + LENGTH_CALC);
        } catch (NumberFormatException error) {
            System.out.println("You have entered a string "
                    + "You must enter a real number\n"
                    + error);
        }
        inputScan.close();
    }
}
