import java.util.Scanner;

public class Interest_Calculator {
    public static void main(String[] args) {
        double interestRate = 0;
        double principalAmount = 0;
        int yearsInvested = 0;
        double currentAmount =0;
        int compoundPeriod =0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("How much would you like to invest: ");
        principalAmount = scanner.nextDouble();
        System.out.println();
        System.out.printf("How many years will the money be invested for?");
        yearsInvested = scanner.nextInt();
        System.out.println();
        System.out.printf("What is the annual interest rate %% growth? ");
        interestRate = scanner.nextDouble();
        System.out.println("What is the compound period?\n"
                +"1)Quarterly\n"+"2)Monthly\n"+"3)Daily");
        System.out.printf("Enter here: ");
        int input = scanner.nextInt();
        if(input == 1){
            compoundPeriod =4;
        }else if(input == 2){
            compoundPeriod = 12;
        }else if(input ==3){
            compoundPeriod = 365;
        }else{
            compoundPeriod = 4;
        }
        System.out.println();
        scanner.nextLine();
        currentAmount = principalAmount;
        for(int i =1; i<= yearsInvested; i++){

            System.out.printf("Began with $%.2f\n", currentAmount);
            double startingAmount = currentAmount;

            for(int j = 1; j<=compoundPeriod; j++){
                currentAmount+= currentAmount*(interestRate/(100*compoundPeriod));
            }

            System.out.printf("Earned $%.2f\n", currentAmount-startingAmount);
            System.out.printf("Ended with $%.2f\n", currentAmount);
            System.out.println();

        }

    }

}
