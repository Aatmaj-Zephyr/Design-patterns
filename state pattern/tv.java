public class tv{
    private state current_state;
    private state my_TV_off_state; //instance of TV_off_state which the class uses.
     private state my_TV_on_state; //instance of TV_on_state which the class uses.
     private state my_TV_standby_state; //instance of TV_on_state which the class uses.
     private final int MAX = 5;
    private int volume;
    tv(TV_off_state new_TV_off_state, TV_on_state new_TV_on_state, TV_standby_state new_standby_state){
        this.my_TV_off_state = new_TV_off_state;
        this.my_TV_off_state.set_tv(this);
        
        this.my_TV_on_state = new_TV_on_state;
         this.my_TV_on_state.set_tv(this);
         
         this.my_TV_standby_state = new_standby_state;
         this.my_TV_standby_state.set_tv(this);
         
         
        this.current_state = new_TV_off_state; //tv is on initially
    }
   
    
    public void volume_up(){
        current_state.volume_up();
        	display_state();

    }
    
     
    public void volume_down(){
        current_state.volume_down();
        
	display_state();
    }
    
     
    public void power_button(){
        current_state.power_button();
        	display_state();

    }
    
    
    //methods to set the state.
    public void set_on_state(){
        this.current_state= this.my_TV_on_state;
    }
    
     public void set_off_state(){
        this.current_state= this.my_TV_off_state;
    }
    
    public void set_standby_state(){
        this.current_state= this.my_TV_standby_state;
    }
   public void display_state(){ //debugging the current_state
       this.current_state.display_state();
       System.out.println("volume is "+volume);
   }
    
    
    
    
    // methods to be used only by the states.
     void state_switch_off(){
         
        this.current_state = my_TV_off_state;
    }
    
    void state_switch_on(){
        this.current_state = my_TV_on_state;
    }
    public void state_volume_up(){// to be used ony by the states.
    if(volume == this.MAX){
        System.out.println("Volume is MAX");
    }
    else{
     this.volume=this.volume+1; 
    }
    }
    
     public void state_volume_down(){// to be used ony by the states.
     
     if(volume == 0){
        System.out.println("Volume is minimum");
    }
    else{
     this.volume=this.volume-1; 
    }
    }
    
    public int get_volume(){
        return volume;
    }
}
