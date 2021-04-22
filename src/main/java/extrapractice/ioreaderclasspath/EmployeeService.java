package extrapractice.ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeService {

    public static void main(String[] args) {
        try(BufferedReader reader =new BufferedReader(
                new InputStreamReader(EmployeeService.class.getResourceAsStream("/extrapractice/ioreaderclasspath/employees.txt")))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file, ioe");
        }
    }
}
