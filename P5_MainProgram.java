import java.util.ArrayList;

public class P5_MainProgram {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        ArrayList<Double> values = processor.readAndValidateValues();
        double average = processor.getAverage(values);
        processor.writeToFile(average);
    }
}
