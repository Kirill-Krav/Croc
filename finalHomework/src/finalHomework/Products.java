package finalHomework;

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

public class Products {

    private int id;
    private String name;

    @JsonCreator
    public Products(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return id == products.id && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
