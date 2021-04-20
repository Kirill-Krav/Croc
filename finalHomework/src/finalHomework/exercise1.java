package finalHomework;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;



public class exercise1 {
    public static void main(String[] args){

        String path1 = "products.json";
        ObjectMapper mapper1 = new ObjectMapper();
        List<Products> products = new ArrayList<>();
        try {
            products = Arrays.asList(mapper1.readValue(new File(path1), Products[].class));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String path2 = "Sales.json";
        ObjectMapper mapper2 = new ObjectMapper();
        List<Sales> sales = new ArrayList<>();
        try {
            sales = Arrays.asList(mapper2.readValue(new File(path2), Sales[].class));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Map<Integer, Integer> mapSales = new HashMap<>();
        Map<Integer, String> mapProducts = new HashMap<>();

        for(int i = 0; i < products.size(); i++){
            mapProducts.put(products.get(i).getId(), products.get(i).getName());
        }

        for(int i = 0; i < sales.size(); i++) {
            Integer count = mapSales.get(sales.get(i).getIdProduct());
            if(count == null) {
                count = sales.get(i).getSum();
            } else{
                count += sales.get(i).getSum();
            }
            mapSales.put(sales.get(i).getIdProduct(), count);
        }

        Map<Integer, String> top = new HashMap<>();

        for(int key : mapSales.keySet()){
            top.put(mapSales.get(key) * -1, mapProducts.get(key));
        }

        List<sumOfProduct> topJson = new ArrayList<>();

        int count = 0;
        for(int key : top.keySet()){
            if(count == 5)
                break;
            topJson.add(new sumOfProduct(key * -1, top.get(key)));
            count++;
        }

        for(int i = 0; i < topJson.size() / 2; i++) {
            sumOfProduct t = topJson.get(i);
            topJson.set(i, topJson.get(topJson.size() - i - 1));
            topJson.set(topJson.size() - i - 1, t);
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("exercise1.json"), topJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
