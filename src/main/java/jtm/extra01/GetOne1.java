package jtm.extra01;

public class GetOne1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 6;
		int num=0;
		int iterationCount = 0;
		

		while (number > 1) {

			System.out.println("unchanged number" + number);

			if (number % 2 == 0) {

					number = number/2;

				} else {

					number = (number * 3) + 1;

				}
				System.out.println("changed number" + number);
				
				iterationCount++;
			System.out.println(iterationCount);
				
			}
	
			
			
			//return iterationCount;

		
			

	
}
}
