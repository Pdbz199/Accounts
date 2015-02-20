import java.io.PrintWriter;

public class FileWriter {
	public static void main(String[] args) {
		try {
			java.io.PrintWriter writer = new PrintWriter("accounts.txt", "UTF-8");
			writer.println("Username: ");
			writer.println("Password: ");
			writer.close();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
