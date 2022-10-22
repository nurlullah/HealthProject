package utilities;

import pojos.Registration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWriterForData {

    public static void saveData(Registration registrant) {

        try {
            //Bu verilen adreste benim için txt dosyası oluşturuyor
            FileWriter fileWriter=new FileWriter("src/test/resources/testdata/PatientData.feature", true);//true dersek önceki datayı silmez, false dersek siler
            //Data yazdırabiliriz verilen dosya adresinde
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            bufferedWriter.append(registrant.toString()+"\n");

            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<String> getData() {

        List<String> list=new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("src/test/resources/testdata/PatientData2.feature");

            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line =bufferedReader.readLine();
            while (line!= null){
                list.add(line);
                line= bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

return list;
    }

    public static void main(String[] args) {
        System.out.println(getData());
    }
}
