package org.parctial;

public class Details implements ClientDetail {

	@Override
	public
	void password() {
System.out.println("employee pass is 0125");		
	}

	@Override
	public
	void userid() {
System.out.println("user id is raja6565");		
	}
	@Override
	public void login() {
System.out.println("hit login button");		
	}
public static void main(String[] args) {
	Details a=new Details();
	a.password();
	a.userid();
	a.login();
}


}
