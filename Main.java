package Homework4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                Matcher m = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS).matcher(line);
                while(m.find()){
                    sum++;
                }
            }
            System.out.println(sum);
        }
        catch (IOException e){
            System.out.println("Не удается прочитать файл");
        }
    }
}
