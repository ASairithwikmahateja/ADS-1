import java.util.Scanner;
import java.util.Arrays;

class Node {
    Node next;
    LinkedList data;

    Node(LinkedList value) {
        data = value;
    }
}

class LinkedList {
    Node start;
    int size;

    LinkedList() {
        size = 0;
    }

    void insert(LinkedList value) {
        Node obj = new Node(value);
        if (size == 0) {
            start = obj;
            size++;
            return;
        }
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp.next = obj;
    }

    void delete(LinkedList value) {
        if (start.data.equals(value)) {
            start = start.next;
            return;
        }
        Node temp = start;
        Node prev = null;
        while (temp != null) {
            if (temp.data == value) {
                prev.next = temp.next;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    int size() {
        return size;
    }

    LinkedList getNodedata(int size) {
        Node tmp = start;
        if (size == 0) {
            return tmp.data;
        } else {
        for (int i = 1; i <= size; i++) {
            tmp = tmp.next;
        } return tmp.data;
        }   
    }   
}

class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        LinkedList l = new LinkedList();
        String[] str = number.split("");
        Long[] arr = new Long[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Long.parseLong(str[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            l.insert(arr[i]);
        }
        return l;
    }

    public static String digitsToNumber(LinkedList list) {
        String s = "";
        for (int i = 0; i <= list.size(); i++) {
            s += list.getNodedata(i);
        }
        return s;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        // LinkedList result = new LinkedList();
        // for (int i = 0; i < list1; i++) {
        //     list1.delete();
        // }
        return null;
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
 
}
