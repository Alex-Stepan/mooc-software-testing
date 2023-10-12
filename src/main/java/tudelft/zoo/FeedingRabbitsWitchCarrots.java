package tudelft.zoo;

public class FeedingRabbitsWitchCarrots {

    public double calculateDaysFeedingRabbitsWithCarrots(int rabbitsQuantity, int totalCarrotsKilograms){

        //declaring
        int amountCarrotsPerDayForOneRabbit = 2;
        int daysFeedingRabbits ;

        //conditions
        if(rabbitsQuantity <= 0 || totalCarrotsKilograms <= 0){
            System.out.println("Incorrect carrots or rabbits amount");
            daysFeedingRabbits = 0;

        }else{
            daysFeedingRabbits = totalCarrotsKilograms / rabbitsQuantity / amountCarrotsPerDayForOneRabbit;

        }

        //return statement
        return daysFeedingRabbits;

    }
}
