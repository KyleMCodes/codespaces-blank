import java.util.Scanner;


public class main {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner scanner = new Scanner(System.in);




      //Varibles
      String userName;
      double tankSize, fishSize;
      int amountOfFish;




      //aksing the user to enter their name and storing it in userName
       System.out.println("Hello! Welcome to the fish tank calulator! Where we help you take better care of your fishtank! What's your name? ");
       userName = scanner.nextLine();
       System.out.println("How big is your tank size(In gallons): ");
       tankSize = scanner.nextDouble();
       System.out.println("How many Fish do you have: ");
       amountOfFish = scanner.nextInt();
       System.out.println("How big are your fish(In inches and On average): ");
       fishSize = scanner.nextDouble();


       //Calling the function and then printing it
       int daysUntilNextChange = calculateDaysUntilChange(tankSize, fishSize, amountOfFish);
       System.out.println(userName + " You should change your tank water every " + daysUntilNextChange + " days for the ideal conditions for your fish.");


      
   }






   public static int calculateDaysUntilChange(double tankSize, double fishSize, int amountOfFish) {
       //a fully stocked tank needs change every 7 days as a baseline
       int baselineDays = 7;
      


       // alulotes total fish inches
       double totalFishInches = fishSize * amountOfFish;
       // Recommended fish inches for tank size (1 inch of fish per gallon)
       double recommendedInches = tankSize;


       //how many times you need to clean based on how stocked the tank is
       // If it is greater than 1 it requires more cleaning, if its 1 requares standard(7), and if it is less than one it would be less cleaning
       double stockingAmount = totalFishInches / recommendedInches;


       //this will adjust the number of days, inversely proportional to the stocking factor
       //takes the reccomending days and divides it by whether or not the tank is over stocked or not if it perfectly stocked it divides it by one hence getting
       //7 which is the baselinedyas
       //converts it into an int because we  want it to have every day not half a
       int adjustedDays = (int) ( baselineDays / stockingAmount);
       return adjustedDays;
   }




}



