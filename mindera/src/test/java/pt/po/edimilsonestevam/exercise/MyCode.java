package pt.po.edimilsonestevam.exercise;

class MyCode {

	public static void main(String[] args) {
		FizzBuzz user = new FizzBuzz();
		for (int i = 1; i <= 100; i++) {
			user.PlayFizzBuzz(i);
		}
	}

	static class FizzBuzz {

		public void PlayFizzBuzz(int numeroFizzBuzz) {

			if (((numeroFizzBuzz % 5) == 0) && ((numeroFizzBuzz % 7) == 0)) {
				System.out.println("FizzBuzz");
			} else if ((numeroFizzBuzz % 7) == 0) {
				System.out.println("Buzz");
			} else if ((numeroFizzBuzz % 5) == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(numeroFizzBuzz);
			}
		}
	}
}