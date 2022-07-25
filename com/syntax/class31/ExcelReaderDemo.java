package com.syntax.class31;



import units.Constants;
import units.ExelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> excelData = ExelReader.read(Constants.ExcelFilePath);
        /*Map<String ,String> firstRow=excelData.get(1);
        System.out.println(firstRow.get("LastName"));
        System.out.println(firstRow.get("Age"));*/
        for (Map<String,String> row:excelData
        ) {
            for (Map.Entry<String,String> entry: row.entrySet()
            ) {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("***************");
        }
    }
}
