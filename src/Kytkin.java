
public class KytkinState {

	public static void main(String[] args) { 
		
		Kytkin kytkin1 = new Kytkin(); 
		
		kytkin1.turnON(); 
		
		if (kytkin1.state == true) {
			System.out.println("There is light!"); 
		} else {
			System.out.println("There is no light!"); 
		} 

	}

}



class Kytkin {
	public boolean state; 
	
	public void turnON() {
		state = true; 
	} 
	
	public void turnOFF() {
		state = false; 
	} 
} 