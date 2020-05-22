package pt.po.edimilsonestevam.exercise;

class MyCode {

	//This link explains about FizzBuzz: https://youtu.be/QPZ0pIK_wsc

	public static void main(String[] args) {
		
		FizzBuzz user = new FizzBuzz();		
		for (int i = 1; i <= 100; i++) {
			user.PlayFizzBuzz(i);
		}
		
	}

	static class FizzBuzz {

		public void PlayFizzBuzz(int FizzBuzzNumber) {

			if (((FizzBuzzNumber % 5) == 0) && ((FizzBuzzNumber % 7) == 0)) {
				System.out.println("FizzBuzz");
			} 
			else if ((FizzBuzzNumber % 7) == 0) {
				System.out.println("Buzz");
			} 
			else if ((FizzBuzzNumber % 5) == 0) {
				System.out.println("Fizz");
			} 
			else {
				System.out.println(FizzBuzzNumber);
			}
			
		}
	}
}