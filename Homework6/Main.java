package Homework6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        String input = in.nextLine(), p1 = ".", p2 = "..";
        String[] array = input.split("/");
        for(String i : array) {
            if (i.equals(p2)) {
                if (deque.size() == 0)
                    deque.addLast(p2);
                else {
                    deque.removeLast();
                }
            } else if (!i.equals(p1)) {
                deque.addLast(i);
            }
        }
        int n = deque.size();
        for(int i = 0; i < n; i++){
            System.out.printf("%s", deque.peekFirst());
            if(i != n - 1){
                System.out.print("/");
            }
            deque.removeFirst();
        }
        System.out.println();
    }
}
