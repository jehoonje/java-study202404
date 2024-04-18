package day08.final_.practice;

import static day08.final_.practice.WeatherConstants.MAX_TEMPERATURE_ALERT;
import static day08.final_.practice.WeatherConstants.MIN_TEMPERATURE_ALERT;

public class WeatherAnalyzer {



    public static boolean checkTemperatureAlert(double temperature) {
        return temperature > WeatherConstants.MAX_TEMPERATURE_ALERT
                || temperature < MIN_TEMPERATURE_ALERT;

    }
    public static boolean checkPrecipitationAlert(double precipitation) {
        return precipitation > WeatherConstants.PRECIPITATION_ALERT;
    }
}
