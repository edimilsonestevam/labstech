package pt.po.edimilsonestevam.core;

import java.util.ArrayList;

public class Division {

	public void numbersDividedThree() {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);

		for (int cont = 0; cont < numbers.size(); cont++) {
			
			if (numbers.isEmpty()) {
				
				String errorResult = "Number is not divided by 3, try again!";
				System.out.println(errorResult + numbers.get(cont));
				
			} else {
				
				if (numbers.get(cont) % 3 == 0) {
					System.out.println(numbers.get(cont));
					
				}

			}
		}

	}
}