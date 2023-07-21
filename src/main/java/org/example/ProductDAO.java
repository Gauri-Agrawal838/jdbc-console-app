package org.example;
import java.sql.SQLException;
import java.util.List;
public interface ProductDAO {

            void insertProduct(Product product) throws SQLException;

            void updateProduct(Product product) throws SQLException;
            void deleteProduct(int Pid) throws SQLException;

//            finding the particular product based on id
            Product getProductById(int pid) throws SQLException;

//            select all records
        List<Product> getProducts() throws SQLException;


}
