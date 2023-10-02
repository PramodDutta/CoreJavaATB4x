package oct.oct1.AL.P001;

import java.util.Stack;

public class Stack001 {
    public static void main(String[] args) {
        Stack books = new Stack();
        books.push("Java");
        books.push("Python");
        books.push("C++");
        books.remove(1);

        // | C++, PYthon, Java| //

        System.out.println(books.size());
        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books.push("C"));
        System.out.println(books);
    }
}
