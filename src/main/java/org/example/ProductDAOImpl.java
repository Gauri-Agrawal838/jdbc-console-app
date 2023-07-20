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
        String qu = "insert into productt(pname,pdesc,pemail) values (?,?,?)";
		PreparedStatement ps = connection.prepareStatement(qu);
        ps.setString(1, product.getPname());
        ps.setString(2, product.getPdesc());
        ps.setString(3, product.getPemail());
        int res = ps.executeUpdate();
        if(res>0)
            System.out.println("Product entered Successfully");
        else
            System.out.println("Error occurred");
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
