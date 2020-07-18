package com.mphasis.training;

import java.util.Scanner;

import com.mphasis.training.daos.ProductDao;
import com.mphasis.training.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Product App" );
        
        Scanner sc=new Scanner(System.in);
        ProductDao pdao=new ProductDao();
        
        
        System.out.println("1.Add Product \n 2.Update Product \n 3.Delete Product"
        		+ "\n 4.Retrieve Product \n5.Retrieve By Cost \n6.Get All");
        
        
        
        switch(sc.nextInt())
        {
        
        	
             
             case 1:System.out.println("Add Product");
                   Product p1=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
             		  pdao.insertProduct(p1);
             		  break;
             case 2:System.out.println("Update Product");
             		  Product p2=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt());
             		  pdao.updateProduct(p2);
             		  break;
             case 3:System.out.println("Delete Product");
             		  pdao.deleteProduct(sc.nextInt());
             
             		  break;
             		  
             case 4:System.out.println("Retrive Product");
             		Product p3=pdao.retriveProductById(sc.nextInt());
             		System.out.println(p3);
             		break;
             case 5:System.out.println("Retrive By Cost");
                    pdao.retriveByCost(sc.nextDouble()).forEach(p->System.out.println(p));
                    break;
                    
             case 6:System.out.println("List of Products");	
    		  pdao.retriveAll().forEach(p->System.out.println(p));
    		  break;
    		  
    		  default:System.out.println("Invalid choice");
        	
        	
        }
        
        
        
        
    }
}
