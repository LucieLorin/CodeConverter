

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CodeApp {
    public static void main (String args[]) throws IOException {


String csvFilePath="C:\\Users\\lucie\\OneDrive\\Plocha\\num2.csv";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            CSVParser records = CSVParser.parse(reader, CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
            Map<String, CodeConverter> codeMap = new HashMap<String, CodeConverter>();
            for (CSVRecord record : records) {
             CodeConverter codeConverter = new CodeConverter();
             codeConverter.setCode2(record.get(0));
             codeConverter.setCode3(record.get(1));

             codeMap.put(record.get(0), codeConverter);
             System.out.println(codeMap);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
