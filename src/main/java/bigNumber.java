public class bigNumber {
    node lastNode = null;
    boolean sign = false;

    public bigNumber(String inputString) {
        if(inputString.charAt(0) == '-'){
            inputString = inputString.substring(1);
            sign = true;
        } else if (inputString.charAt(0) == '+') {
            inputString = inputString.substring(1);
            sign = false;
        }
        else {
            sign = false;
        }

        this.lastNode = bigNumberCreator(leftZeroClearance(inputString));

    }
    public bigNumber(node inputNode) {

        this.lastNode = inputNode;

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

    private static node bigNumberCreator(String input) {
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
        //bigNumber bigNumber = new bigNumber(lastNode);
        return lastNode;
    }


    public String toString() {
        String number = "";
        if (lastNode != null) {
            node node = lastNode;
            while (true) {
                number = node.getData() + number;
                if (node.getPrev() == null) {
                    break;
                }
                node = node.getPrev();
            }
        }
        if(this.sign){
            number = "-" + number;
        }
        return number;
    }

    public int getLength() {
        int length = 0;
        if (lastNode != null) {
            node node = lastNode;
            while (true) {
                length++;
                if (node.getPrev() == null) {
                    break;
                }
                node = node.getPrev();
            }
        }
        return length;
    }

    public node getFirstNode() {
        if (lastNode != null) {
            node node = lastNode;
            while (true) {
                if (node.getPrev() == null) {
                    break;
                }
                node = node.getPrev();
            }
            return node;
        }
        return null;
    }

    public node getLastNode() {
        return lastNode;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }
    public boolean getSign(){
        return this.sign;
    }
}
