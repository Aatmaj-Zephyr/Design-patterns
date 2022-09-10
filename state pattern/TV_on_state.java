public class TV_on_state extends state{
   
    void volume_up(){
        TV.state_volume_up();
    }
    
     void volume_down(){
        TV.state_volume_down();
    }
    
    void power_button(){
        this.TV.set_off_state();
    }
    
     void display_state(){
        System.out.println("The TV is on.");
    }
}
