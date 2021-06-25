
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
        String csvFilePath2 = "C:\\Users\\lucie\\OneDrive\\Plocha\\num3.csv";
        String csvFilePath = "C:\\Users\\lucie\\OneDrive\\Plocha\\num1.csv";


        try {
            // přečtení souborů
            BufferedReader readerOfFileNum3 = new BufferedReader(new FileReader(csvFilePath2));
            BufferedReader readerOfFileNum1 = new BufferedReader(new FileReader(csvFilePath));


            //převedení na použitelný kód
            CSVParser threeDigitCode = CSVParser.parse(readerOfFileNum3, CSVFormat.EXCEL);
            CSVParser twoDigitCode = CSVParser.parse(readerOfFileNum1, CSVFormat.EXCEL);

            //vytvoření hashmap
            Map<String, CodeConverter> codeMap = new HashMap<>();

            //vložení do KEY - dvoumístný kód
            for (CSVRecord recordTwo: twoDigitCode
                 ) {CodeConverter codeConverterTwo = new CodeConverter();
                codeConverterTwo.setTwoDigitCode(recordTwo.get(0));
                codeMap.put(recordTwo.get(0), codeConverterTwo);
            }

            //vložení do VALUE - třímístný kód
            for (CSVRecord recordThree: threeDigitCode
            ) {CodeConverter codeConverterThree = new CodeConverter();
                codeConverterThree.setThreeDigitCode(recordThree.get(0));
                codeMap.put(recordThree.get(0), codeConverterThree);
            }

            // testovací output
            System.out.println(codeMap);

            // procházení hashmap
            Collection collection = codeMap.values();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext() != false) {
                CodeConverter codeConverter = (CodeConverter) iterator.next();

            }
        // exception
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
