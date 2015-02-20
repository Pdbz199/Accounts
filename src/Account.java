import java.util.ArrayList;

public class Account {
	String Email;
	String Username;
	String Password;
	ArrayList<String> Information;
	
	public Account(String email, String username, String password) {
		Email = email;
		Username = username;
		Password = password;
		Information = new ArrayList<String>();
	}
	
	public String getEmail(String username, String password) {
		if (username.equals(Username) && password.equals(Username)) {
			return Email;
		}
		return "Error";
	}
	
	public String getUsername(String email, String password) {
		if (password.equals(Password) && email.toLowerCase().equals(Email.toLowerCase())) {
			return Username;
		}
		return "Error";
	}
	
	public String getPassword(String email, String username) {
		if (username.equals(Username) && email.toLowerCase().equals(Email.toLowerCase())) {
			return Password;
		}
		return "Error";
	}
	
	public ArrayList<String> getInfo(String username, String password) {
		if (username.equals(Username) && password.equals(Password)) {
			return Information;
		}
		return null;
	}
}
