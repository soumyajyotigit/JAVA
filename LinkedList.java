import java.util.*;
public class linkedList {
    Node head;



    class Node{
        String data;
        Node next;

        //constructor
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("this is empty");
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void printlist() {
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.addFirst("a");
        list.addFirst("is");
//        list.printlist();

        list.addLast("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printlist();
        list.deleteFirst();
        list.printlist();
        list.deleteLast();
        list.printlist();
    }
}
