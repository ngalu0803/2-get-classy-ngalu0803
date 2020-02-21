
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
        public class PersonReader {
            public static void main(String args[]) throws IOException {
                // using getFile() function to get the file name and path using JfileChooser
                BufferedReader csvReader = new BufferedReader(new FileReader(getFile()));
                String row;
                // arraylist of objects
                ArrayList<Person> l = new ArrayList<Person>();

                System.out.println("ID\tFtrstname\t\tLastname\tTitle\t\tYOB\n");
                System.out.println("=============================================================");
                // Traversing thorugh the whole file
                while ((row = csvReader.readLine()) != null) {

                    // splitting data by ',' as the csv file is comma separated value
                    String[] data = row.split(",");
                    // initilazing the object P of type Person with csv data
                    Person p = new Person(data[0], data[1], data[2], data[3],Integer.parseInt( data[4])
                            // adding data to the arraylist
                            l.add(p);
                    // printing the data in the given format
                    System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", data[0], data[1], data[2], data[3], data[4]);
                }
                csvReader.close();
            }
            // JFileChooser implementation
            private static File getFile() {
                JFileChooser fc = new JFileChooser();
                File file = null;
                int returnVal = fc.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    file = fc.getSelectedFile();
                }
                return file;
            }
        }














    }
}
