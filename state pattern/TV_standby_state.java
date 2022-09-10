public class TV_standby_state extends state{
   // press anby button to make it active.
   // press power button to turn it off.
    void volume_up(){
        this.TV.set_on_state();
    }
    
     void volume_down(){
        this.TV.set_on_state();
    }
    
    void power_button(){
        this.TV.set_off_state();
    }
    
     void display_state(){
        System.out.println("The TV is idle.");
    }
}
