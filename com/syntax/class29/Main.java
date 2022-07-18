package com.syntax.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\gevor\\OneDrive\\Desktop\\poi-bin-5.2.2-20220312.zip\\test.xlsx";
        FileInputStream fileInputStream =new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        System.out.println(row.getCell(0));
    }
}
