public abstract class state{
    tv TV;
    void set_tv(tv TV){
        this.TV=TV;
    }
     abstract void volume_up();
    
     abstract void volume_down();
    abstract void power_button(); //switch on or off the TV.
    abstract void display_state(); //debugging the state of the tv.
}
