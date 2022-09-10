public class TV_off_state extends state{
    
    void volume_up(){
        System.out.println("TV is off cannot increase volume.");
    }
    
     void volume_down(){
        System.out.println("TV is off cannot decrease volume.");
    }
    
    void power_button(){
        this.TV.set_on_state();
    }
    
    void display_state(){
        System.out.println("The TV is off.");
        
    }
}
