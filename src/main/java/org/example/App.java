package org.example;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        Product p = new Product();
        p.setPname("BCD");
        p.setPdesc("xyz");
        p.setPemail("gauri@gmail.com");
        ProductDAOImpl pdi = new ProductDAOImpl();
        pdi.insertProduct(p);

    }
}
