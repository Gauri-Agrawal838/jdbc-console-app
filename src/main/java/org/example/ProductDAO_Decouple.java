package org.example;

public class ProductDAO_Decouple {
    public static ProductDAO pd = null;
    public static  ProductDAO getProductDAOImple(){
        if(pd==null)
        {
            pd = new ProductDAOImpl();
        }
        return pd;
    }
}
