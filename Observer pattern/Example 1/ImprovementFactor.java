public class ImprovementFactor implements Observer {
  // Tells if the user has increased, decreased or maintained the weight
  Double Weight;
  Double PastWeight;
  WeighingMachine MyWeighingMachine;

  ImprovementFactor(WeighingMachine TheWeighingMachine) {
    MyWeighingMachine = TheWeighingMachine;
    MyWeighingMachine.AddObserver(this);
    Weight = 60.0;
    PastWeight = 60.0;
  }

  public void update() {
    PastWeight = Weight;
    Weight = MyWeighingMachine.getWeight();
    check();
  }

  private void check() {
    if ((PastWeight > Weight)) {
      System.out.println("You have become thin!");
    } else if ((PastWeight < Weight)) {
      System.out.println("You have grown fat!");
    } else {
      System.out.println("You have maintained your weight!");
    }
  }
}
