/**
	@author pradipshinde013
	@date 16 FEB 2024
*/
public class HelloProgram {
	
	public void hello(){
		System.out.println("Hello Pradip Shinde");
		System.out.println("Welcome to java 17");
	}
	
	public void helloJenkins(){
		System.out.println("Hello Pradip Shinde - JENKINS");
		System.out.println("Welcome to java 17 - JENKINS BUILD SUCCESSFUL");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the main");
		HelloProgram hp = new HelloProgram();
		hp.hello();
		hp.helloJenkins();
	}
}
