package org.example;
import java.sql.SQLException;
import java.util.List;
public interface ProductDAO {

            void insertProduct(Product product) throws SQLException;

            void updateProduct(Product product);
            void deleteProduct(int Pid);

//            finding the particular product based on id
            Product getProductById(int pid);

//            select all records
        List<Product> getProducts();


}
