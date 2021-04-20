package finalHomework;

import com.fasterxml.jackson.annotation.*;

import java.time.LocalDate;
import java.util.Objects;

public class Sales {

    private int idSale;
    private int idSeller;
    private int idProduct;
    private int sum;
    private LocalDate date;

    @JsonCreator
    public Sales(@JsonProperty("idSale") int idSale, @JsonProperty("idSeller") int idSeller, @JsonProperty("idProduct") int idProduct, @JsonProperty("sum") int sum, @JsonProperty("date") String date) {
        this.idSale = idSale;
        this.idSeller = idSeller;
        this.idProduct = idProduct;
        this.sum = sum;
        this.date = LocalDate.parse(date);
    }

    public int getIdProduct() {
        return idProduct;
    }

    public int getIdSale() {
        return idSale;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public int getSum() {
        return sum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sales sales = (Sales) o;
        return idSale == sales.idSale && idSeller == sales.idSeller && idProduct == sales.idProduct && sum == sales.sum && Objects.equals(date, sales.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSale, idSeller, idProduct, sum, date);
    }
}
