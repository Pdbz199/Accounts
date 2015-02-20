import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AccountReader {
	public static void main(String[] args) {
		BufferedReader br = null;
	
		try {
			String sCurrentLine;
		
			br = new BufferedReader(new FileReader("accounts.txt"));
		
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}