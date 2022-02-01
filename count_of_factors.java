package Pratice_Jan_29;

public class count_of_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		int count_of_factors = 0;
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count_of_factors = count_of_factors +1;
			}
		}
		
		System.out.println(count_of_factors);


	}

}
