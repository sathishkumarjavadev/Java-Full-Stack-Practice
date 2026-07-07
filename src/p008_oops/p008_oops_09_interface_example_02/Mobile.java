package p008_oops.p008_oops_09_interface_example_02;
//note : interface need to be declared first or 
//in the separate folder is also a fine 

interface Camera {
	void takephoto();
}
interface MusicPlayer {
	void playmusic();
}

public class Mobile implements Camera, MusicPlayer{
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.takephoto();
		m.playmusic();
	}
		
public void takephoto() {
	System.out.println("photo taken");
}
public void playmusic() {
	System.out.println("Music playing");
}

}

//simply to understand 
//1. interface is also a class
//2. declaring the function inside a interface
//3. defining the function somewhere 
//4. implements the interface in the main class
//5. accessing them by creating the object from the main class

//// to understand this program easily , just think about the logic 
//1. interface is also a class (Interface is a special type in Java that defines a contract. It is not a normal class.)
//2. we are declaring and calling the function inside the interface
//3. we are defining the function in somewhere, 
//4. inheriting the class with the interface and accessing them 


//Class = Implementation
//Interface = Contract
//implements = Agreement to follow the contract


//THINGS TO REMEMBER 
//Method Declaration
//void takePhoto();
//
//Method Definition 
//void takePhoto() { ... }
//
//Object creation 
//Mobile m = new Mobile();
//
//calling the function using the object
//m.takePhoto();
//m.playMusic();