/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		/* To create nested list. 
		[1,2,3,[2,3]]
		*/
		
		Tree OuterTree = new Tree();
		
		//add nodes to the tree with values
		OuterTree.add(new node(1));
		OuterTree.add(new node(2));
		OuterTree.add(new node(3));
		
		//print function. 
		/*
		Note this print function can be recursively implemented in the TreeElement class for printing out all instances.
		*/
		for (TreeElement i : OuterTree.ElementList){
		    System.out.print(i.getvalue());
		}
		System.out.println();
		
		Tree InnerTree= new Tree();
		
		node three=new node(3);
		try{
		three.add(new node(2));
		    
		}
		catch (UnsupportedOperationException ex){
		    System.out.println("Error catch successfull");
		}
		//must throw java.lang.UnsupportedOperationException
        	
        	//testing remove
		InnerTree.add(three);
		InnerTree.remove(three);
		InnerTree.add(new node(2));
		InnerTree.add(new node(3));
		
		InnerTree.print();
		System.out.println();


		OuterTree.add(InnerTree);
		OuterTree.print();

		
		
	}
}
