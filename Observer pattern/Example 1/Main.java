import java.util.Scanner;  // Import the Scanner class
public class Main
{
	public static void main(String[] args) {
		WeighingMachine MyWeighingMachine=new WeighingMachine();
		Scanner ScanWeight = new Scanner(System.in);	
		WeightCatagory MyWeightCatagory=new WeightCatagory(MyWeighingMachine);
		ExercisePlanner MyExercisePlanner=new ExercisePlanner(MyWeighingMachine);
		ImprovementFactor MyImprovementFactor=new ImprovementFactor(MyWeighingMachine);
		while(true){
	    System.out.println("Please enter Weight");
		MyWeighingMachine.setWeight(Double.parseDouble(ScanWeight.nextLine()));
		
		}
	}
}
