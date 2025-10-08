package Java9AndBeyond;

import java.math.BigDecimal;
import java.math.BigInteger;

record Product(String productName, BigDecimal cost, String type) {

    Product {
        if (productName.isBlank() && productName != null) {
            throw new IllegalArgumentException("Product name is not empty or null !");
        }

        if (cost.compareTo(new BigDecimal(BigInteger.ZERO)) <= 0) {
            throw new IllegalArgumentException("Cost should be greater than zero !");
        }
    }
}

public class RecordClasses {
    public static void main(String[] args) {
        Product product = new Product("TV", new BigDecimal("-7373.90"), "ELECTRONICS");

        System.out.println("Product : " + product);
    }
}
