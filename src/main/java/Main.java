/**
 * Hi!
 * This is Alireza Ardalani!
 **/
public class Main {

    public static void main(String[] inputArgs) {
        String a = "1010";
        String b = "90";

        if (true) {
            //check are they valid number or not!
        }
        a = leftZeroClearance(a);
        b = leftZeroClearance(b);
        bigNumber A = bigNumberCreator(a);
        bigNumber B = bigNumberCreator(b);

        System.out.println(operations.subtract(A, B));

    }

    private static String leftZeroClearance(String a) {
        int i = 0;
        while (true) {
            if (a.charAt(i) != '0') {
                break;
            }
            i++;
            if (i == a.length()) {
                System.out.println("problem! Number is Zero!");
                i--;
                break;
            }
        }
        return a.substring(i);
    }

    private static bigNumber bigNumberCreator(String input) {
        node temp = null;
        node lastNode = null;
        for (int i = 0; i < input.length(); i++) {
            node n = new node(Integer.parseInt(String.valueOf(input.charAt(i))));
            if (i != 0) {
                n.setPrev(temp);
                temp.setNext(n);
            }
            if (i == input.length() - 1) {
                lastNode = n;
            }
            temp = null;
            temp = n;
        }
        bigNumber bigNumber = new bigNumber(lastNode);
        return bigNumber;
    }
}