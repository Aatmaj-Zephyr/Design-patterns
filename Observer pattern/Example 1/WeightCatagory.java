public class WeightCatagory implements Observer{
    //Tells if under weight, over weight or average weight catagory
    String Catagory;
    Double Weight;
    WeighingMachine MyWeighingMachine;
    WeightCatagory(WeighingMachine TheWeighingMachine){
        MyWeighingMachine=TheWeighingMachine;
        MyWeighingMachine.AddObserver(this);
    }
    public void update(){
       Weight= MyWeighingMachine.getWeight();
       SetCatagory();
       System.out.println("Your weight Catagory is-"+Catagory);
    }
    public void SetCatagory(){
        if(45.0<=Weight&&Weight<=75.0){
            Catagory="Average";
        }
        else if(Weight<45.0){
            Catagory="Underweight";
        }
        else{
            Catagory="Overweight";
        }
    }
}
