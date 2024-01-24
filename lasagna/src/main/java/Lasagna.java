public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }
  
    public int remainingMinutesInOven(int actual_minutes) {
        return expectedMinutesInOven()-actual_minutes;
    }
  
    public int preparationTimeInMinutes(int number_layers) {
        return number_layers*2;
    }

    public int totalTimeInMinutes(int number_layers, int actual_minutes) {
        return preparationTimeInMinutes(number_layers)+actual_minutes;
    }
}
