package Task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private ArrayList<Product> products = new ArrayList<Product>();
    Product product;
    public void addProduct(String productName, int quantity, double count)
    {
        product = new Product(productName,quantity,count);
        products.add(product);
    }
    public void makeOrder()
    {
        System.out.println("Name:  Quantity:  Count:  ");
        for(Product p : products){
            System.out.println(p.toString());
        }
        System.out.println(" Total sum: " + totalSum());
    }
    private double totalSum ()
    {
        double Sum = 0;
        for(Product p : products){
            Sum += (p.Count * p.Quantity);
        }
        return Sum;
    }
  protected class  Product
    {
        private double Count;
        private String productName;
        private int Quantity;
        Product(String productName, int quantity, double count)
        {
            this.productName = productName;
            this.Quantity = quantity;
            this.Count = count;
        }
        @Override
        public String toString ()
        {
            return this.productName + " : " + this.Quantity  + " : " +  this.Count + ";";
        }
    }
}
