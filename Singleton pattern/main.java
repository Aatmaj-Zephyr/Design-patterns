/******************************************************************************
testing the singleton instance 
1) == 
2) .equals() method
3) hashvalue

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
singleton mysingleton = singleton.getinstance();
singleton mysingleton_2 = singleton.getinstance();
boolean test = mysingleton == mysingleton_2; //testing if two are same or not
	    System.out.println(test);
	    boolean test2 = mysingleton.equals(mysingleton_2); //testing if two are same or not
	    System.out.println(test2);
	    
	    //hashvalue must be equal.
	    System.out.println(mysingleton.hashCode());
	    System.out.println(mysingleton_2.hashCode());
	    
	}
}
