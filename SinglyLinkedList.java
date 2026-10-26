public class SinglyLinkedList {
    public static void main(String[] args) {
        Node n = new Node(10);
        System.out.println(n.data);
       // System.out.println(Node.age);
        System.out.println(n.next);

        System.out.println(n.data);

        Node n2 = new Node(15);
        n.next = n2;
        System.out.println(n2.data);
    }
    
}
class Node{
    //static int age;
    int data;
    Node next;
    public Node(int d){

    }
}
