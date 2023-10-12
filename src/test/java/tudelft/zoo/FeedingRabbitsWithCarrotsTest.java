package tudelft.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FeedingRabbitsWithCarrotsTest {
    @ParameterizedTest(name = "rabbits={0}, totalCarrotsKilograms={1}, result={2}")
    @CsvSource({"10,200,10", "20,200,5", "100,20000,100", "0,0,0", "0,100,0", "5000,0,0"})
    public void totalDays(int rabbits, int totalCarrotsKilograms, int expectedResult ){
        FeedingRabbitsWitchCarrots feedingRabbits = new FeedingRabbitsWitchCarrots();

        double result = feedingRabbits.calculateDaysFeedingRabbitsWithCarrots(rabbits, totalCarrotsKilograms);

        Assertions.assertEquals(expectedResult, result);

    }
}
