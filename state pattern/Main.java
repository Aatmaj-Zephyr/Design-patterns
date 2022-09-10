/******************************************************************************
state pattern with tv.

states - tv is on, tv is off.

volume up and down will function only when the TV is in on mode.

power button will toggle on and off states.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//instances of states that can be used across many instances of tvs 
		 TV_off_state my_TV_off_state = new TV_off_state(); //instance of TV_off_state to be inserted in the tv.
		 TV_on_state my_TV_on_state = new TV_on_state(); //instance of TV_on_state to be inserted in the tv.

		tv my_TV = new tv(my_TV_off_state,my_TV_on_state);
		
		
		my_TV.power_button();
		my_TV.volume_up();
		my_TV.power_button();
		my_TV.volume_up();

		
	}
}
