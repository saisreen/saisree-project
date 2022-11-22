package Live;

import com.music.Playable;

import music.string.Venna;
import music.wind.Saxophone;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Venna v = new Venna();  //create an instance of venna 
		v.play();  //call play method
		
		Saxophone s = new Saxophone();  //create an instance of Saxophone
		s.play();  //call play method 
		
		Playable playvena = new Venna();     //create an venna instance of type playable 
		playvena.play();  //call play
		
		Playable playsaxop = new Saxophone();  //create an Saxophone instance of type playable
		playsaxop.play();  //call play 

	}

}
