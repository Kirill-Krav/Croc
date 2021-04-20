package finalHomework;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class exercise2 {

    public static void main(String[] args) {
        String path = "Sales.json";
        ObjectMapper mapperIn = new ObjectMapper();
        List<Sales> sales = new ArrayList<>();
        try {
            sales = Arrays.asList(mapperIn.readValue(new File(path), Sales[].class));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Set<LocalDate> days = new HashSet<>();

        double sumOfSales = 0;

        for(int i = 0; i < sales.size(); i++) {
            days.add(sales.get(i).getDate());
            sumOfSales += sales.get(i).getSum();
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("exercise2.json"), sumOfSales / days.size());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
