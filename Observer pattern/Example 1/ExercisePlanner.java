public class ExercisePlanner implements Observer{
    //Tells the number of hours of exercise needed
    Double ExerciseHours;
    Double Weight;
    WeighingMachine MyWeighingMachine;
    ExercisePlanner(WeighingMachine TheWeighingMachine){
        MyWeighingMachine=TheWeighingMachine;
        MyWeighingMachine.AddObserver(this);
    }
    public void update(){
       Weight= MyWeighingMachine.getWeight();
       SetExerciseHours();
       System.out.println("You need "+ExerciseHours+" hours of exercise this week");
    }
    public void SetExerciseHours(){
        ExerciseHours=Math.ceil(Weight/7);
    }
}
