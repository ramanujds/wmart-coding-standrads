package com.wmart.app;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "ranks.xlsx";

        try(FileInputStream fis = new FileInputStream(fileName);
            Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            sheet.forEach(
                    row -> {
                        row.forEach(
                                cell -> {
                                    switch (cell.getCellType()) {
                                        case STRING -> System.out.printf("%20s",cell.getStringCellValue());
                                        case NUMERIC -> System.out.printf("%20.1f",cell.getNumericCellValue());

                                    }

                                }

                        );
                        System.out.println();
                    }

            );


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}