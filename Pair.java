//class to create a tuple for the bfs-algorithm 
public class Pair<T1, T2> {
	public final int[] x; //the first in the tuple is an array of ints/current configuration of the puzzle
	public final T2 y; //the second part of the tuple
	
	//initialize the tuple
	public Pair(int[] currentState , T2 y)
	{
		this.x = currentState;
		this.y = y;
	}
}
