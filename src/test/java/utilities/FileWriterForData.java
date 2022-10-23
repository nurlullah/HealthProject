package utilities;

import pojos.Patient;
import pojos.Registration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWriterForData {

    public static void saveUIRegistrantData(Registration registrant) {

        try {
            //Bu verilen adreste benim için txt dosyası oluşturuyor
            FileWriter fileWriter=new FileWriter("src/test/resources/testdata/PatientData.feature", false);//true dersek önceki datayı silmez iki kez yazmış olur, false dersek siler

            //Data yazdırabiliriz verilen dosya adresinde
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.append(registrant.toString()+"\n");
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveUIAdminPatientData(Patient patient) {

        try {
            FileWriter fileWriter=new FileWriter(ConfigReader.getProperty("adminPatientData"), true);//true dersek önceki datayı silmez, false dersek siler
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.append(patient.toString()+"\n");
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<String> getData(String resource) {

        List<String> list=new ArrayList<>();

        try {

            FileReader fileReader = new FileReader(ConfigReader.getProperty(resource));

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

        System.out.println(getData("registrantData"));
        System.out.println(getData("adminPatientData"));
    }
}
