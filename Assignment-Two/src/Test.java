import com.twowheeler.Hero;
import com.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero he = new Hero();
		System.out.println("The Speed of the hero is "+he.getSpeed());
		he.radio("Power on Off","Play Pause Next", "Volume Increase Decrease ");
	    
		Honda ho = new Honda();
		System.out.println("The Speed of the honda is "+ho.getSpeed());
		ho.cdplayer("Power On Off" , " Play Stop");
		
		

	}

}
