package Homework6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Deque<StringBuffer> deque = new ArrayDeque<>();
        String input = in.nextLine();
        StringBuffer s = new StringBuffer(""), p1 = new StringBuffer("."), p2 = new StringBuffer("..");
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == '/'){
                if(s.toString().equals(p2.toString())){
                    if(deque.size() == 0)
                        deque.addLast(p2);
                    else{
                        deque.removeLast();
                    }
                }
                else if(!s.toString().equals(p1.toString())){
                    deque.addLast(s);
                }
                s = new StringBuffer("");
            }
            else
                s.append(c);
        }
        if(s.toString().equals(p2.toString())){
            if(deque.size() == 0) {
                deque.addLast(p2);
            }
            else{
                deque.removeLast();
            }
        }
        else if(!s.toString().equals(p1.toString())){
            deque.addLast(s);
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
