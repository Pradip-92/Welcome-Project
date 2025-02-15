/**
	@author pradipshinde013
	@date 16 FEB 2024
*/
public class HelloProgram {
	
	public void hello(){
		System.out.println("Hello Pradip Shinde");
		System.out.println("Welcome to java 17");
	}
	
	public void helloGit(){
		System.out.println("Hello Pradip Shinde - GIT Saved");
		System.out.println("HelloProgram - Saved Successfully On Git");
	}
	
	public void helloJenkins(){
		System.out.println("Hello Pradip Shinde - JENKINS");
		System.out.println("HelloProgram Java 17 - JENKINS BUILD SUCCESSFUL");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the main");
		HelloProgram hp = new HelloProgram();
		hp.hello();
		hp.helloGit();
		hp.helloJenkins();
	}
}
