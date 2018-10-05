//Kayla Hollinger 10/5/18

class ProgramingExercise511 {
	public static void main(String[] args) {
		//list variable
		int i = 100;
		//create loop
		while (i < 201) {
			//state increment
			i++;
			//state division conditions
			if ((i % 5 == 0) ^ (i % 6 == 0))
			//print results
				System.out.println(i);	
		}	
	}
}
