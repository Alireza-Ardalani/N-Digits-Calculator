public class bigNumber {
    node lastNode = null;
    boolean sign = false;

    public bigNumber(node inputNode) {
        this.lastNode = inputNode;

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
