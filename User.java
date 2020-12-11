//Alex und  Sophie
package ElkenrothCMS_Project;

public class User extends Person{
	
	private int User_ID;
	private String User_Name;
	private String Password;
	private static String Status ="User";
	
	public User(int UID, String UName, String UPass) {
		this.User_ID=UID;
		this.User_Name=UName;
		this.Password=UPass;
		
	}
	
	public String getStatus() {
		return this.Status;
	}
	
	public int getUser_Id() {
		return this.User_ID;
	}
	public void setUser_Id(int UID) {
		this.User_ID=UID;
	}
	public String getUser_Name() {
		return this.User_Name;
		
	}
	public void setUser_Name(String UName) {
		this.User_Name=UName;
	}
	
	public String getPassword() {
		return this.Password;
	}
	
	public void setPassword(String pass) {
		this.Password= pass;
	}
	public void setRole(String Role) {
		
	}
	
	
	public void addBlog() {
		
	}
	public void editBlog(int BlogId) {
		
	}
	public void deleteBlog(int BlogId) {
		
	}
	

}
