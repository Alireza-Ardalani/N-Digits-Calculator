public class node {
    node next = null;
    node prev = null;
    int data;

    public node(int inputData) {
        this.data = inputData;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public void setPrev(node prev) {
        this.prev = prev;
    }

    public node getPrev() {
        return prev;
    }

    public node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
}
