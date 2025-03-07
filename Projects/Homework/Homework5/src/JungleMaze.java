import java.util.Arrays;

/**
 * 
 * * * J U N G L E  E S C A P E  A L G O R I T H M * * *
 * 
 * if destination is reached 
 * 	print the solution matrix 
 * else 
 * 	a. Mark current cell in the solution matrix 
 * 	b. Move forward horizontaly and recursively check if this leads to a solution 
 * 	c. If there is no solution, move down and recursively check if this leads to a solution 
 * 	d. If none of the above solution work, unmark the cell and return False
 * 
 */

public class JungleMaze {

	/**
	 * Utility to check if the current cell position (x,y) is in the maze
	 */

	boolean isSafe(int maze[][], int x, int y, int sol[][]) {
		// Get maze dimensions
		int X = maze[1].length;
		int Y = maze.length;

		return x >= 0 && x < X && y >= 0 && y < Y && maze[x][y] == 1;
	}

	/**
	 * (x,y) is the current cell position
	 */
	
	boolean solveMaze(int maze[][], int x, int y, int[][] sol) {

		// Get maze size
		int X = maze[1].length;
		int Y = maze.length;

		// check if (x,y) is goal
		if (x == X - 1 && y == Y - 1) {
			sol[x][y] = 1;
			return true;
		}

		// Check if we're inside the maze
		if (isSafe(maze, x, y, sol)) {

			// Mark the current cell in solution (BACKTRACK)
			sol[x][y] = 1;
			// Move right 
			// if recursive call
			//	return true;
			if (solveMaze(maze, x + 1, y, sol))
				return true;

			// Move down
			// if recursive call
			//	return true;
			if (solveMaze(maze, x, y + 1, sol))
				return true;

			// Remove current cell from solution
			// do something to the sol
			// If the 2 moves above failed
			// return false;
			if (sol[x][y] == 1)
				sol[x][y] = 0;

		}
		// else
		return false;
	}

	public static void main(String[] args) {

		// Initiate the maze
		int maze[][] = { 
			{ 1, 0, 0, 0 },
			{ 1, 1, 1, 1 }, 
			{ 0, 0, 0, 1 }, 
			{ 1, 1, 1, 1,} 
		};

		// Initiate the solution matrix
		int sol[][] = { 
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0 } 
		};

		JungleMaze mazeTester = new JungleMaze();

		// Given a maze NxM,
		if (mazeTester.solveMaze(maze, 0, 0, sol)) {
			// print the solution matrix here
			System.out.println(Arrays.deepToString(sol));
		}

		else
			
			System.out.println("Oh No! You're trapped in the jungle");
	}
}
