
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
            CSVParser threeDigitCode = CSVParser.parse(readerOfFileNum1, CSVFormat.EXCEL);
            CSVParser twoDigitCode = CSVParser.parse(readerOfFileNum3, CSVFormat.EXCEL);

            //převedení CVSParser na String
            String convertedTwoDigitCode = twoDigitCode.toString();
            String convertedThreeDigitCode = threeDigitCode.toString();

            //vytvoření hashmap
            Map<String, String> codeMap = new HashMap<>();

            //vložení do KEY
            //vložení do VALUE

            // testovací output
            System.out.println(twoDigitCode);
            System.out.println(("Your code is: ") + codeMap.get("TK"));


//            Collection collection = codeMap.values();
//            Iterator iterator = collection.iterator();
//            while (iterator.hasNext() != false) {
//                CodeConverter codeConverter = (CodeConverter) iterator.next();
//
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
