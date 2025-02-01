public class operations {

    public static Boolean isEqual(bigNumber first, bigNumber second) {
        if (first.getLength() > second.getLength()) {
            return false;
        } else if (first.getLength() < second.getLength()) {
            return false;
        } else {
            boolean result = true;
            node node1 = first.getFirstNode();
            node node2 = second.getFirstNode();
            while (true) {
                if (node1.getData() > node2.getData()) {
                    return false;
                } else if (node1.getData() < node2.getData()) {
                    return false;
                } else if (node1.getNext() == null || node2.getNext() == null) {
                    break;
                } else {
                    node1 = node1.getNext();
                    node2 = node2.getNext();
                }
            }
            return result;
        }
    }

//    public static bigNumber addOne(bigNumber number) {
//        node node = new node(1);
//        bigNumber one = new bigNumber(node);
//        number = add(number, one);
//        return number;
//    }

    public static Boolean isGreater(bigNumber first, bigNumber second) {
        if (first.getLength() > second.getLength()) {
            return true;
        } else if (first.getLength() < second.getLength()) {
            return false;
        } else {
            boolean result = false;
            node node1 = first.getFirstNode();
            node node2 = second.getFirstNode();
            while (true) {
                if (node1.getData() > node2.getData()) {
                    return true;
                } else if (node1.getData() < node2.getData()) {
                    return false;
                } else if (node1.getNext() == null || node2.getNext() == null) {
                    break;
                } else {
                    node1 = node1.getNext();
                    node2 = node2.getNext();
                }
            }
            return result;
        }
    }

    public static bigNumber add1(bigNumber first, bigNumber second, boolean sign) {
        int over = 0;
        node firstNumber = first.getLastNode();
        node secondNumber = second.getLastNode();
        int value = firstNumber.getData() + secondNumber.getData() + over;
        over = value / 10;
        value = value % 10;
        node sumLastNode = new node(value);
        node tempNode = sumLastNode;
        while (true) {
            if (firstNumber != null) {
                firstNumber = firstNumber.getPrev();
            }
            if (secondNumber != null) {
                secondNumber = secondNumber.getPrev();
            }
            if (firstNumber != null & secondNumber != null) {
                value = firstNumber.getData() + secondNumber.getData() + over;
            } else if (firstNumber == null & secondNumber != null) {
                value = secondNumber.getData() + over;
            } else if (firstNumber != null & secondNumber == null) {
                value = firstNumber.getData() + over;
            } else {
                if (over == 1) {
                    node newNode = new node(over);
                    tempNode.setPrev(newNode);
                    newNode.setNext(tempNode);
                }
                break;
            }
            over = value / 10;
            value = value % 10;
            node newNode = new node(value);
            tempNode.setPrev(newNode);
            newNode.setNext(tempNode);
            tempNode = null;
            tempNode = newNode;
        }
        bigNumber number = new bigNumber(sumLastNode);
        number.setSign(sign);

        return number;
    }

//    public static bigNumber multiply(bigNumber first, bigNumber second) {
//        node zero = new node(0);
//        bigNumber counter = new bigNumber(zero);
//        Boolean check = isGreater(first, second);
//
//        node zero1 = new node(0);
//        bigNumber result = new bigNumber(zero1);
//        ;
//        if (check) {
//
//            while (true) {
//                if (isEqual(counter, second) || isEqual(counter, first)) {
//                    break;
//                }
//                result = add1(result, first);
//                counter = addOne(counter);
//            }
//        } else {
//            while (true) {
//                if (isEqual(counter, second) || isEqual(counter, first)) {
//                    break;
//                }
//                result = add(result, second);
//                counter = addOne(counter);
//            }
//        }
//        return result;
//    }

    public static bigNumber subtract(bigNumber first, bigNumber second){
        bigNumber result = null;
        if(first.getSign() == false & second.getSign() == false){
            if((isGreater(first,second)) || (isEqual(first,second))){
                result = subtract1(first,second,false);
            }
            else {
                result = subtract1(second,first,true);
            }
        } else if (first.getSign() == false & second.getSign() == true) {
            result = add1(first,second,false);
        } else if (first.getSign() == true & second.getSign() == false) {
            result = add1(first,second,true);
        } else {
            //second - first
            if((isGreater(second,first)) || (isEqual(second,first))){
                result = subtract1(second,first,false);
            }
            else {
                result = subtract1(first,second,true);
            }

        }

        return result;
    }

    public static bigNumber subtract1(bigNumber first, bigNumber second, boolean sign) {
        // I consider that always first is bigger than
        boolean borrow = false;
        node firstNumber = first.getLastNode();
        node secondNumber = second.getLastNode();
        int D1 = firstNumber.getData();
        int D2 = secondNumber.getData();
        int value = 0;
        if (D1 >= D2) {
            value = D1 - D2;
        } else {
            value = (10 + D1) - D2;
            borrow = true;
        }
        node subtractLastNode = new node(value);
        node tempNode = subtractLastNode;
        while (true) {
            if (firstNumber != null) {
                firstNumber = firstNumber.getPrev();
            }
            if (secondNumber != null) {
                secondNumber = secondNumber.getPrev();
            }
            if (firstNumber == null) {
                break;
            }
            else {
                D1 = firstNumber.getData();
            }
            if (secondNumber == null){
                D2 = 0 ;
            }
            else {
                D2 = secondNumber.getData();
            }


            if (borrow) {
                if (D1 != 0) {
                    borrow = false;
                    D1--;
                } else {
                    D1 = 9;
                }
            }

            if (D1 >= D2) {
                value = D1 - D2;
            } else {
                value = (10 + D1) - D2;
                borrow = true;
            }
            node newNode = new node(value);
            tempNode.setPrev(newNode);
            newNode.setNext(tempNode);
            tempNode = null;
            tempNode = newNode;

        }
        bigNumber number = new bigNumber(subtractLastNode);
        number.setSign(sign);

        return number;
    }
}
