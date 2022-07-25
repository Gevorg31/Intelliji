package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
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

        //number of rows that contain the data
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        for (int i=0; i<numberOfRows; i++) {
            Row row = sheet.getRow(i);
            int numOfCells = row.getPhysicalNumberOfCells();
            for (int j=0; j<numOfCells; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }
        fileInputStream.close();
    }
}