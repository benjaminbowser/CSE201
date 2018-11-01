

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.Scanner;

public class NewUser {

	private String userName;
	private String passWord;
	private Scanner scan;

	/**
	 * This constructs a new user object
	 * 
	 * @param userName
	 * @param passWord
	 */
	public NewUser() {


	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;

	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		
	}

	/**
	 * TODO STUB
	 * 
	 * @param userName
	 * @returns a boolean if userName is taken.
	 */
	public boolean userNameTaken(String userName) {

		File file = new File("LoginInfo.txt");
		Scanner in = null;

		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (in.hasNextLine()) {
			String userNameNew = in.next();
			in.nextLine();
			if (userNameNew.equals(userName)) {
				return true;
			}
		}

		return false;

	}

	public void addUser() {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			

			fw = new FileWriter("LoginInfo.txt");
			bw = new BufferedWriter(fw);
			bw.write(userName);
			bw.newLine();
			bw.write(passWord);
			bw.newLine();

			System.out.println("Print Successful");

		} catch (IOException e) {
			System.out.println(e);
		} finally {

			{

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}
			}

		}
	}
}