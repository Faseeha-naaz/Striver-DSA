package OOP;

public class _17_PracTemp {
    public static void main(String[] args) {
        //problem 5: Temperature converter
        Temperature t = new Temperature();
        System.out.println("C -> F: "+t.convert(5));
        System.out.println("F -> C: "+t.convert(10, true));
    }
}
class Temperature{
    double convert(double celsius){
        //return fahrenheit
        return (celsius * 9 / 5) + 32;
    }
    double convert(double fahrenheit, boolean toCelsius){
        //return celsius
        if(toCelsius){
            return (fahrenheit - 32) * 5.0 / 9;
        }
        else{
            return fahrenheit;
        }
    }
}