package lesson8;

import java.util.Objects;

public class Product {
    private final int id;
    private final String title;

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(title, product.title);
    }

    @Override
    public String toString() {
        return "(id=" + id + ", title=" + title + ")";
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id, title);
        return id;
    }
}
