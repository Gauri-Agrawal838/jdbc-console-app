package org.example;

public class ProductDAO_Methods {
    public static ProductDAO pd = null;

    public static  ProductDAO getProductDAOMethods(){
        if(pd==null)
        {
            pd = new ProductDAOImpl();
        }
        return pd;
    }
}
