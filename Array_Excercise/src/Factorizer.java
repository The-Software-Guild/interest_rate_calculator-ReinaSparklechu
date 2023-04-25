import java.util.Scanner;

public class Factorizer {


	//comment
	public int[] factors(int number){
		int[] factors = new int[number];
		int factorsFound = 0;
		for(int i =1 ;i<= number; i++){
			if(number%i==0){
				factors[factorsFound] = i;
				factorsFound++;
			}
		}
		return factors;
	}
	public int sum(int[] numbers){
		int sum = 0;
		for(int x : numbers){
			sum+=x;
		}
		return sum;
	}
	public boolean isPrime(int number){
		if(number<=1){
			return false;
		}
		for(int i =2; i<=number/2;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Factorizer factorizer = new Factorizer();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		System.out.println(number);
		scanner.nextLine();
		int[] factors = factorizer.factors(number);
		System.out.print("Factors: [ ");
		for(int x: factors){
			if(x ==0) break;
			System.out.print(x+ " ");
		}
		System.out.print("]\n");
		int sum = factorizer.sum(factors);
		System.out.printf("Sum of all factors : %d\n" , sum);
		if (sum-number == number){
			System.out.printf("%d is a perfect number\n", number);
		}else{
			System.out.printf("%d is not a perfect number\n", number);
		}
		if(factorizer.isPrime(number)){
			System.out.printf("%d is a prime number\n", number);
		}else{
			System.out.printf("%d is not a prime number\n", number);
		}
	}

}
