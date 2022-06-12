package com.revature.JdbcCrudOpration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Mobile;
import com.revature.service.MobileService;
import com.revature.service.MobileServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   	 MobileService ssi=new MobileServiceImpl();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     boolean go=true;
     while(go)
     {
     	
     	System.out.println( "***************-----======Opration=========-----******************" );
     	System.out.println("select 1 for add new Mobile");
     	System.out.println("select 2 for view Mobile");
     	System.out.println("select 3 for delete  Mobile");
     	System.out.println("select 4 for update Mobile");
     	System.out.println("select 5 for get Mobile");
     	System.out.println("select 6 for Exit");
     	
     	
	        	try {
	        		int input=Integer.parseInt(br.readLine());
	        		switch (input) {
					case 1:
						
					ssi.MobileForm();
						
						break;
						
					case 2:
						
						
						
						ssi.listShow();
					
						
						break;
						
					case 3:
						
						System.out.println("Please Enter the model :");
						int id=Integer.parseInt(br.readLine());
						ssi.removeMobile(id);
						break;
						
					case 4:
						System.out.println("you want to update the record :");
						//int id1=Integer.parseInt(br.readLine());
						ssi.updateInfo();
						
						break;
					case 5:
						System.out.println("Please Enter the model :");
						int id2=Integer.parseInt(br.readLine());
						ssi.getInfo(id2);
						
						break;

					case 6:
						go=false;
						System.out.println("You have successfully Exit:");
						break;
						
					}
	        		
	        	}
	        	catch(Exception e) {
	        		System.out.println("Invalid Input Try with other");
	        		System.out.println(e.getMessage());
	        		
	        	}
	        	
	        	
	        	
	        	
     }
 }
    
}
