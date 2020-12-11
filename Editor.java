//Alex und  Sophie
package ElkenrothCMS_Project;

public class Editor extends User {
	
	private static String Status= "Editor";
	
	
	
	public Editor(int UID, String UName, String UPass) {
		super(UID, UName, UPass);
		
	}
	


	public void addUser(String username,int userID, String password) {
		
	}
	
	
	public void deleteUser(int userID) {
		
		
	}
	
	
	public boolean checkBlog(int BlogID) {
		return false;
	}
	
	public void denial_comment(int BlogID, int UserID) {
		
	}
	

}
