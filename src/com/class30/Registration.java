package com.class30;

public class Registration {
	
	private String email;
	private String userName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail (String email) {
		if(email.contains("gmail")) {
			this.email=email;
		}else {
			System.out.println("Please provide only gmail");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty()) {
			if (userName.length()>6) {
	
			this.userName=userName;
		}else {
			System.out.println("Username should be more that 6 characaters");
		}
		}else {
			System.out.println("Username cannot be empty");
		}
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword (String password) {
		if (!password.isEmpty()) {
			if (password.length()>6){				
				if (!password.contains(userName)) {
					this.password=password;
				}else {
					System.out.println("Password can not containt username");
				}				
			}else {
				System.out.println("Password should be more than 6 characters");
				}		
		}else {
			System.out.println("Password can not be empty");
		}
		
	}
	public static void main(String[] args) {
		
		Registration obj=new Registration();
		obj.setEmail("lolam79@gmail.com");
		obj.setUserName("Lola001");
		obj.setPassword("Frederick123");
		System.out.println(obj.getEmail());
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
	}
}
