
import a.c.h.C;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CodeApp {
    public static void main(String[] args) throws IOException {

// soubory CSV

        String csvFilePath = "C:\\Users\\lucie\\OneDrive\\Plocha\\num1.csv";
        String csvFilePath2 = "C:\\Users\\lucie\\OneDrive\\Plocha\\num3.csv";


        try {
            // přečtení souborů
            BufferedReader readerOfFileNum1 = new BufferedReader(new FileReader(csvFilePath));
            BufferedReader readerOfFileNum3 = new BufferedReader(new FileReader(csvFilePath2));

            //převedení na použitelný kód
            CSVParser threeDigitCode = CSVParser.parse(readerOfFileNum3, CSVFormat.EXCEL);
            CSVParser twoDigitCode = CSVParser.parse(readerOfFileNum1, CSVFormat.EXCEL);


            //vytvoření hashmap
            Map<String, CodeConverter> codeMap = new HashMap<>();

            //vložení do KEY
            for (CSVRecord record: twoDigitCode
                 ) {CodeConverter codeConverter = new CodeConverter();
                codeConverter.setTwoDigitCode(record.get(0));
                codeMap.put(record.get(0), codeConverter);

            }
            //vložení do VALUE
            for (CSVRecord record: threeDigitCode
            ) {CodeConverter codeConverter = new CodeConverter();
                codeConverter.setThreeDigitCode(record.get(0));
                codeMap.put(record.get(0), codeConverter);

            }
            // testovací output

            System.out.println(codeMap);

            Collection collection = codeMap.values();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext() != false) {
                CodeConverter codeConverter = (CodeConverter) iterator.next();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
