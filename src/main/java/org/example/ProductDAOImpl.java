package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDAOImpl implements ProductDAO{

    Connection connection;

    public ProductDAOImpl() {
        connection = ConnectionProduct.getConnection();
    }

    @Override
    public void insertProduct(Product product) throws SQLException {
        String qu = "insert into Product(pname,pdesc) values (?,?)";
		PreparedStatement ps = connection.prepareStatement(qu);
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int Pid) {

    }

    @Override
    public Product getProductById(int pid) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
