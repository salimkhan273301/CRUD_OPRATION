package ccm.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.revature.model.Mobile;

public class DaoLayer {
	
	Scanner sc=new Scanner(System.in);

public void saveMobile() throws SQLException, ClassNotFoundException {
	
	
	Connection con=JdbcConn.getConnection();//getting our connection object
	PreparedStatement pst=con.prepareStatement("insert into mobile(model,company,cost,madein) values(?,?,?,?)");
	System.out.println("Please Enter the Model No:");
	pst.setString(1, sc.nextLine());
	System.out.println("Please Enter the Company:");
	pst.setString(2, sc.nextLine());
	System.out.println("Please Enter the Cost of Mobile:");
	pst.setString(3, sc.nextLine());
	pst.setString(4, "India");
	int inserted=pst.executeUpdate();
	if(inserted>0) {
		System.out.println("Record is Added");
	}
	
}

public void getAll() throws ClassNotFoundException, SQLException

{
	Connection con=JdbcConn.getConnection();//getting our connection object
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from mobile");
	while(rs.next())
	{
		System.out.println("Model = "+rs.getString(1)+"  Company = "+rs.getString(2)+"  Cost = "+rs.getString(3)+"  Made IN= "+rs.getString(4));
	}
	
	

	
}

public void remove(int id) throws ClassNotFoundException, SQLException {
	int deleted;
	Connection con=JdbcConn.getConnection();//getting our connection object
	Statement s=con.createStatement();
	 deleted=s.executeUpdate(" delete from mobile where model="+id);
	 if(deleted>0) {
		 System.out.println("Record Deleted...........");
	 }
	 
	
		 
	 }
public void getmobilebyModel(int id) throws ClassNotFoundException, SQLException {
	 
 	Connection con=JdbcConn.getConnection();//getting our connection object
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from mobile where model="+id);
	while(rs.next())
	{
		System.out.println("Model = "+rs.getString(1)+"  Company = "+rs.getString(2)+"  Cost = "+rs.getString(3)+"  Made IN= "+rs.getString(4));
	}
	
	
}

public void updateMobile() throws ClassNotFoundException, SQLException {
	
	Connection con=JdbcConn.getConnection();//getting our connection object
	PreparedStatement pst=con.prepareStatement("update mobile set company=?, cost=?,madein=?  where model=?");
	
	
	System.out.println("Please Enter the Company:");
	pst.setString(1, sc.nextLine());
	System.out.println("Please Enter the Cost of Mobile:");
	pst.setString(2, sc.nextLine());
	//pst.setString(4, "Bangladesh");
	System.out.println("Please Enter contry where Mobile made:");
	pst.setString(3, sc.nextLine());
	System.out.println("Please Enter the Model No:");
	pst.setString(4, sc.nextLine());
	int inserted=pst.executeUpdate();
	if(inserted>0) {
		System.out.println("Record is Updated.....");
	}
	
	
	
	
}

}
