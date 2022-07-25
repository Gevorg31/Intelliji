package com.syntax.class30;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo3 {
    //How to create Excel file using apache poi and Java
    public static void main(String[] args) throws IOException {
        //location of file on the computer

        //path of the file
        String path = "C:\\Users\\gevor\\OneDrive\\Desktop\\DemoFile.xlsx";
        //special class that knows hot to handle excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Oleg");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Katarina");
        //navigate to the location
        FileOutputStream fileInputStream = new FileOutputStream(path);
        xssfWorkbook.write(fileInputStream);
        fileInputStream.close();

    }
}
