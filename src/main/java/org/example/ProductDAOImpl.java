package org.example;

import java.sql.*;
import java.util.ArrayList;
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
    public void updateProduct(Product product) throws SQLException {
        String qu = "UPDATE product set pname = ?, pemail = ? , pdesc = ? where pid = ?";
        PreparedStatement ps = connection.prepareStatement(qu);
        ps.setString(1,product.getPname());
        ps.setString(2,product.getPdesc());
        ps.setString(3,product.getPemail());
        ps.setInt(4,product.getPid());
        int res = ps.executeUpdate();
        if(res>0)
            System.out.println("Product updated Successfully");
        else
            System.out.println("Error occurred");
    }

    @Override
    public void deleteProduct(int Pid) throws SQLException {
        String qu = "DELETE from product where pid = ?";
        PreparedStatement ps = connection.prepareStatement(qu);
        ps.setInt(1,Pid);
        int res = ps.executeUpdate();
        if(res>0)
            System.out.println("Product deleted Successfully");
        else
            System.out.println("Error occurred");
    }

    @Override
    public Product getProductById(int pid) throws SQLException {
        String qu = "Select * from product where pid = "+ pid;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(qu);
        rs.next();
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String email = rs.getString(3);
        Product product = new Product(id, name, email);
        return product;
    }

    @Override
    public List<Product> getProducts() throws SQLException {
        List<Product> productList = new ArrayList<>();
        String qu = "Select * from product";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(qu);
        while(rs.next())
        {
            int pid = rs.getInt(1);
            String pname = rs.getString(2);
            String pemail = rs.getString(3);
            Product product = new Product(pid, pname, pemail);
            productList.add(product);
        }
        return productList;
    }
}
