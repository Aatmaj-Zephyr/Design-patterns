import java.util.*;
public class WeighingMachine implements Subject{
    ArrayList<Observer> MyObservers;
    WeighingMachine(){
    MyObservers=new ArrayList();
    }
    double Weight;
    public double getWeight(){
        return Weight;
    }
    public void setWeight(double myWeight){
        Weight=myWeight;
        Update();
    }
    public void AddObserver( Observer observer ){
      
        MyObservers.add(observer);
    }
    public void RemoveObserver( Observer observer){
        MyObservers.remove(observer);
    }
    private void Update(){
 
  for (Observer i : MyObservers){
      
            i.update();
        }
    }
    
}
