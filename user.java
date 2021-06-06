package GoFo;


import java.util.Scanner;
public class user {
	Scanner scan = new Scanner(System.in);
	String name,ID,password,Email,phone,location; 
	
	
	public void login()
	{
		 System.out.println("Enter your name, ID, password, Email, phone number, your location");
		  name = scan.nextLine();
		  ID = scan.nextLine();
		  password = scan.nextLine();
		  Email = scan.nextLine();
		  phone = scan.nextLine();
		  location = scan.nextLine();
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public void SetID(String ID)
	{
		this.ID=ID;
	}
	public void Setpassword(String password)
	{
		this.password=password;
	}	
	public void SetEmail(String Email)
	{
		this.Email=Email;
	}
	public void Setphone(String phone)
	{
		this.phone=phone;
	}
	public void SetLoc(String Location)
	{
		this.location=Location;
	}
	public String GetName()
	{
		return name;
	}
	public String GetID()
	{
		return ID;
	}
	public String Getpassword()
	{
		return password;
	}	
	public String GetEmail()
	{
		return Email;
	}
	public String GetPhone()
	{
		return phone;
	}
	public String GetLoc()
	{
		return location;
	}
	
}
