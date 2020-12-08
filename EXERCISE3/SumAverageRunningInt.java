
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		printForLoops();
		printWhileDo();
		printDoWhile();
		
		}
		public static void printForLoops() {
			
			System.out.print("ForLoopsExercise");
			System.out.println();
			//define variables
			int sum = 0; //the accumulated sum, init to 0
			double average = 50.5; //average in double
			int lowerbound = 1;
			int upperbound = 100;
			
			//use a for-loop to sum from lowerbound to upperbound
			for (int number = lowerbound; number <= upperbound; ++number) {
				//the loop index variable number = 1, 2, 3,..., 99, 100
				sum += number; //same as "sum = sum + number"
			}
			
			//compute average in double. Beware that int/ int produces int!
			//print sum and average
			System.out.println("The sum of 1 to 100: " +sum);
			System.out.println("The average: " +average);
			System.out.println();
			
		}
		
		public static void printWhileDo() {
			
			System.out.print("WhileDoExercise");
			System.out.println();
			
			int sum = 0;
			double average = 50.5;
			int lowerbound = 1;
			int upperbound = 100;
			int number = lowerbound;
			
			while (number <= upperbound) {
				sum += number;
				++number;
			}
			
			System.out.println("The sum of 1 to 100: " +sum);
			System.out.println("The average: " +average);
			System.out.println();
			
		}
		
		public static void printDoWhile() {
			
			System.out.print("DoWhileExercise");
			System.out.println();
			
			int sum = 1;
			double average = 50.5;
			int lowerbound = 1;
			int upperbound = 100;
			int number = lowerbound;
			
			do {
				System.out.println("The sum of 1 to 100: " +sum);
				++number;
				sum += number;
				
			}while (number <= upperbound);
			System.out.println("The average: " +average);
			System.out.println();
		}

}
