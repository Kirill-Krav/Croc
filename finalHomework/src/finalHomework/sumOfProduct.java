package finalHomework;

import java.util.Objects;

public class sumOfProduct {

    private int sum;
    private String product;

    sumOfProduct(int sum, String product){
        this.sum = sum;
        this.product = product;
    }

    public int getSum() {
        return sum;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        sumOfProduct that = (sumOfProduct) o;
        return sum == that.sum && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, product);
    }
}
