package com.syntax.class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReadingAndStoring {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\gevor\\OneDrive\\Desktop\\TestJAva.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        //how many rows contain the data in a sheet
        int noOfRows=sheet.getPhysicalNumberOfRows();
        // we will store the data of cells in the map and will store those maps in a list
        List<Map<String,String>> excelData=new ArrayList<>();
        //this map will hold the data for rows
        HashMap<String,String> rowData;
        //Contains all the keys that we will use in a map
        Row headerRow=sheet.getRow(0);// we have already starting from 0 header that is why we start from 1
        for (int i = 1; i < noOfRows; i++) {
            Row row=sheet.getRow(i);
            rowData=new HashMap<>();
            //how many cells contain the data in a row
            int noOfCells=row.getPhysicalNumberOfCells();
            /*
            below loop prints all the data from cells in a single line
             */
            for (int j = 0; j < noOfCells; j++) {
                String value = headerRow.getCell(j).toString();
                String key = row.getCell(j).toString();
                rowData.put(key,value);
            }
            excelData.add(rowData);// adding row inside the ArrayList
        }
        System.out.println(excelData);
        fileInputStream.close();
    }
}
