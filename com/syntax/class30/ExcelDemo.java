package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        //location of file on the computer
        String path = "C:\\Users\\gevor\\OneDrive\\Desktop\\TestJAva.xlsx";
        // navigate to this file
        FileInputStream fileInputStream = new FileInputStream(path);
        // class that understands how Excel files work
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        //sheet have rows and cells(columns) We need to specify the row number and cell number as well
        //row and columns they also start from index zero
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);
        fileInputStream.close();
    }
}
