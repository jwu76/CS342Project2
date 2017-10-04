/*
 *  this class attempts to perform the b-f-s algorithm
 * 
 */

import java.util.*;
import javax.swing.*;
public class bfs_algorithm {
PriorityQueue<Pair> movesQueue; //create an empty queue
Stack <Pair> movesStack; //create an empty stack
private int[] currentState; //current configuration of the puzzle

	public void bfs(int[] current, int[] solved)
	{
		movesQueue = new PriorityQueue<Pair>(); //initialize the queue
		movesStack = new Stack(); //initialize the stack
		Pair<int[], Integer> tuple = new Pair<int[], Integer>(currentState, null); //creating the tuple (p, null)
		movesQueue.add(tuple); //add tuple to queue
		movesStack.add(tuple); //add tuple to queue
		
		//check to see if queue is empty
		//if not then puzzle might be solvable
		while(!movesQueue.isEmpty())
		{
			if(movesQueue.peek().equals(current))
				movesQueue.remove();
			for(int index = 0; index < current.length; ++index)
			{
				if(current[index] != solved[index])
				{
					
				}
				
				//break out of the function since puzzle is solved
				else
				{
					System.out.println("The puzzle has now been solved");
					break;
				}
			}
		}
		
		//puzzle is not solvable 
		if(movesQueue.isEmpty())
		{
			System.out.println("There is no solutions.");
		}
	}
}