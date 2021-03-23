package Homework4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args){
        if(args.length == 0){
            throw new IllegalArgumentException("Нет аргументов");
        }
        int sum = 0;
        Path path = Paths.get(args[0]);
        try{
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line : lines) {
                for (int i = 1; i < line.length(); i++) {
                    //кодировка 1040 - A, 1071 - Я, 1072 - a, 1103 - я
                    if (((line.charAt(i) < 1040 || line.charAt(i) > 1071) && (line.charAt(i) < 1072 || line.charAt(i) > 1103)) &&
                            line.charAt(i - 1) >= 1040 && line.charAt(i - 1) >= 1071 || line.charAt(i - 1) >= 1072 && line.charAt(i - 1) >= 1103) {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
