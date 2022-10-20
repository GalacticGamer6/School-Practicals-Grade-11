
package Date_Time;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentManager {
    
    private  Student [] Students = new Student[10]; 
    private  int count = 0;
    
    
    public StudentManager(){
        
        try {
            
            Scanner sc = new Scanner(new File("data//students.txt"));
            
            while(sc.hasNext()){
                
                String line = sc.nextLine();
                Scanner line_sc = new Scanner(line).useDelimiter("#");
                
                String name = line_sc.next();
                String surname = line_sc.next();
                String date = line_sc.next();
                
                DateTimeFormatter input_formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate converted_date = LocalDate.parse(date, input_formatter);
                
                Students[count] = new Student(name,surname,converted_date);
                count++;
                
                line_sc.close();
            }
            
            sc.close();
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        
    }
        
        public String toString(){
            
            String output = "";
            
            for(int i = 0; i < count; i++){
                
                Student s = Students[i];
                output += s.toString() + "\n" ;
                
            }
            
            return output;
        }
        
    }
    

