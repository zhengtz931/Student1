package entity;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Student {
      private static String Username;
      private  static String Password;
	public static String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public static String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
      
}
