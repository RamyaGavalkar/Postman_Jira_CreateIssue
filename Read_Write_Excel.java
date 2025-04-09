package com.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// public class Read_Write_Excel {

//     public static void main(String[] args) throws IOException{
//         XSSFWorkbook workbook=new XSSFWorkbook();                                                       //creates the excel workbook
//         XSSFSheet sheet1=workbook.createSheet("Sheet1");

//         Row r0=sheet1.createRow(0);
//         Cell c0=r0.createCell(0);
//         c0.setCellValue("Trikaiser technology");
//         File f=new File("D:\Java_automation\demo\src\main\java\com\example\Excel1.xlsx");
//         FileOutputStream fos=new FileOutputStream(f);                                                   //to write data into the file
//         workbook.write(fos);
//         fos.close();
//         workbook.close();

//         System.out.println("File is written successfully");

//     }

// }

//----------------------------------------------------Reading data from Excel file--------------------------------------------------------------------------

public class Read_Write_Excel {

    public static void main(String[] args) throws EncryptedDocumentException, IOException {
        File f = new File("D:\\Java_automation\\demo\\src\\main\\java\\com\\example\\Excel1.xlsx");
        FileInputStream fis = new FileInputStream(f); // to read data from the file

        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet0 = wb.getSheetAt(0);

        // Row row0=sheet0.getRow(0);
        // Cell cell0=row0.getCell(0);
        // System.out.println(cell0);

        for (Row row : sheet0) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue()+" ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue()+" ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+" ");
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        }
        fis.close();

    }

}