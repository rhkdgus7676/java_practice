import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class okJavaInput {

	public static void main(String[] args) {
		
		String id = args[0]; //JOptionPane.showInputDialog("enter a id")
		String bright = args[1]; //JOptionPane.showInputDialog("set brightness")
		
		//elevator
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//security
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//light
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
