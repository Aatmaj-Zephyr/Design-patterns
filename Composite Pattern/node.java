public class node implements TreeElement{
    
    public  Object value = new Integer(0); //polymorphism
    // Type of value to be stored in the tree. 
    // We can replace it with integer everywhere but then everywhere it will require to change the implementation.
   
    node(Object i){//constructor to set the value.
        setvalue(i);
    }
    public Object getvalue(){ //get value of the node. value is returned as an object.
        return this.value;

    }
    public void setvalue(Object i){ // set value of the node. object value is taken.
        this.value = i;
    }
    public void print(){
        System.out.print(this.value); //print out the value
    }
}
