package com.mycompany.st10515042question1_prog6112_exam;

public class Product implements IProduct{//start of class
    
    //Variables required:
    private double sales1;
    private int Sales;
    private double average;
    private int total;
    
    //constructor:
        public Product(double sales1, int Sales, double average, int total) {
        this.sales1 = sales1;
        this.Sales = Sales;
        this.average = average;
        this.total = total;
    }
    
    //Method that will calculate the total of products sold:
    @Override
    public int GetTotalProductsSold(){
        sales1 = Sales + Sales + Sales + Sales + Sales + Sales + Sales + Sales + Sales ;
        System.out.println("TOTAL PRODUCT SALES: " + sales1);
        return 0;
    }
    
    //Method that will display the average of the products:
    @Override
    public double  GetAverageProductSold(){
        average = sales1 / 8;
        System.out.println("AVERAGE PRODUCT SALES: " + average);
        return 0;
    }
    
    //Method that will display the most popular product:
    @Override
    public String GetMostPopularProduct(){
        
        //selection statement:
        if(total>=25){
            System.out.println("MOST POPULAR PRODUCT: " + total);
        }
        return null;
    }  
}//end of class
