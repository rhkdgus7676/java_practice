import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class okJava {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		//elevator
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//security
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//light
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
	}

}
