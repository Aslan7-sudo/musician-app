package com.jnet.globalclasses;
/**
 * Contains methods to Create&Copy the folders and documents and to read test data from Excel sheet.
 *
 * @createddate 02-15-2020
 * @authors Revanth Kumar K, Yashwanth K
 */

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelClass {
    static String date;
    static String testCaseExcellPath;
    static String testDataExcellPath;

    //Creates a new Test Case Base and Execution Documents folders if they doesn't exists in Project folder
    public static void createTestCaseFolders() {
        File f1 = new File("");
        File f = new File(f1.getAbsolutePath() + "\\TestCaseBaseDocuments");
        if (!(f.exists())) {
            f.mkdir();
        }

        File f2 = new File(f1.getAbsolutePath() + "\\TestCaseExecutionDocuments");
        if (!(f2.exists())) {
            f2.mkdir();
        }
    }

    //Method used to create a folder with Date and Time in the TestCase Execution Documents folder
    public static void createFolder() {
        File dr = new File("");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        date = sdf.format(new Date());
        File f = new File(dr.getAbsolutePath() + "\\" + "TestCaseExecutionDocuments" + "\\" + date);
        f.mkdir();

    }

    //Method used to copy the Test Case document from TestCase Base Documents to the TestCase Execution Documents folder
    public static void copyTestCaseDocument() {

        File dr = new File("");
        File Source = new File(dr.getAbsolutePath() + "\\TestCaseBaseDocuments\\" + "TestCaseDocument.xlsx");
        //     testCaseExcellPath = dr.getAbsolutePath() + "\\TestCaseExecutionDocuments\\" + date + "\\" + "TestCaseDocument.xlsx";
        testCaseExcellPath = dr.getAbsolutePath() + "\\TestCaseExecutionDocuments\\" + "TestCaseDocument.xlsx";
        File dest = new File(testCaseExcellPath);
        try {
            FileUtils.copyFile(Source, dest);
        } catch (IOException i) {
            System.out.println("Unable to Copy the Excel document");
            i.printStackTrace();
        }
    }

    //Method used to store the Test Status
    public static void testDataStoring(String testDataExcel, String SheetName, int RowNumber, int CellNumber, String CellValue) {
        File file = new File("");
        testDataExcellPath = file.getAbsolutePath() + "\\Resources\\" + testDataExcel + ".xlsx";
        try {
            InputStream inp = new FileInputStream(testDataExcellPath);
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheet(SheetName);
            Row row = sheet.getRow(RowNumber);
            Cell cell = row.getCell(CellNumber);
            cell.setCellValue(CellValue);
            FileOutputStream fileOut = new FileOutputStream(testDataExcellPath);
            wb.write(fileOut);
            fileOut.close();
            inp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method used to store the Test Status
    public static void testStatusStoring(String sheetname, int rownumber, String Colname) {

        try {
            InputStream inp = new FileInputStream(testCaseExcellPath);
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheet(sheetname);
            Row row = sheet.getRow(rownumber);
            int num = row.getLastCellNum();
            Cell cell = row.createCell(num++);
            cell.setCellValue(Colname);
            FileOutputStream fileOut = new FileOutputStream(testCaseExcellPath);
            wb.write(fileOut);
            fileOut.close();
            inp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Method used to store the Test Actual Results
    public static void testActualResultsStoring(String sheetname, int rownumber, String ActualResults) {
        try {
            InputStream inp = new FileInputStream(testCaseExcellPath);
            Workbook wb = WorkbookFactory.create(inp);
            Sheet sheet = wb.getSheet(sheetname);
            Row row = sheet.getRow(rownumber);
            int num = row.getLastCellNum();
            Cell cell = row.createCell(num++);
            cell.setCellValue(ActualResults);
            FileOutputStream fileOut = new FileOutputStream(testCaseExcellPath);
            wb.write(fileOut);
            fileOut.close();
            inp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Method used to get Data from Excel
    public static List<Map<String, String>> readDataFromExcelWithMultipleRows(String testDataExcelName, String testDatasheetName) {
        File dr = new File("");

      //  final String location = dr.getAbsolutePath() + "\\" + "Resources" + "\\" + testDatasheetName + ".xlsx";
        final String location = dr.getAbsolutePath() + "\\" + "Resources" + "\\" + testDataExcelName + ".xlsx";

        try {
            String Kkey;
            String Vvalue;
            //Map<String, String> innermap = new LinkedHashMap<>();
            List<Map<String, String>> outerlist = new ArrayList<>();
            XSSFWorkbook WObj = new XSSFWorkbook(new File(location));
            XSSFSheet sheet = WObj.getSheet(testDatasheetName);
            Row startHeaderRow = sheet.getRow(0);
            int numberofrows = sheet.getLastRowNum();
            int numberofcolumns = startHeaderRow.getLastCellNum();
            for (int iRowCounter = 1; iRowCounter <= numberofrows; iRowCounter++) {
                Map<String, String> innermap = new LinkedHashMap<>();
                for (int iColumnCounter = 0; iColumnCounter < numberofcolumns; iColumnCounter++) {
                    Row currentrow = sheet.getRow(iRowCounter);
                    Kkey = startHeaderRow.getCell(iColumnCounter).getStringCellValue();
                    try {
                        Vvalue = currentrow.getCell(iColumnCounter).getStringCellValue();
                    } catch (Exception e) {
                        Vvalue = String.valueOf((currentrow.getCell(iColumnCounter).getNumericCellValue()));
                    }
                    innermap.put(Kkey, Vvalue);
                }
                outerlist.add(innermap);
                System.out.println(innermap);
            }


            return outerlist;
        } catch (Exception e) {
            return null;
        }

    }

    public static Map<String, String> readDataFromExcel(String testDataExcelName, String testDatasheetName) {
        File dr = new File("");

        final String location = dr.getAbsolutePath() + "\\" + "Resources" + "\\" + testDataExcelName + ".xlsx";

        try {
            String Kkey;
            String Vvalue;
            Map<String, String> innermap = new LinkedHashMap<>();
            // List<Map<String, String>> outerlist = new ArrayList<>();
            XSSFWorkbook WObj = new XSSFWorkbook(new File(location));

            XSSFSheet sheet = WObj.getSheet(testDatasheetName);
            Row startHeaderRow = sheet.getRow(0);
            int numberofrows = sheet.getLastRowNum();
            int numberofcolumns = startHeaderRow.getLastCellNum();
            for (int iRowCounter = 1; iRowCounter <= numberofrows; iRowCounter++) {
                for (int iColumnCounter = 0; iColumnCounter < numberofcolumns; iColumnCounter++) {
                    Row currentrow = sheet.getRow(iRowCounter);
                    Kkey = startHeaderRow.getCell(iColumnCounter).getStringCellValue();
                    try {
                        Vvalue = currentrow.getCell(iColumnCounter).getStringCellValue();
                    } catch (Exception e) {
                        Vvalue = String.valueOf((currentrow.getCell(iColumnCounter).getNumericCellValue()));
                    }
                    innermap.put(Kkey, Vvalue);
                }
            }
            System.out.println(innermap);
            return innermap;
        } catch (Exception e) {
            return null;
        }

    }

    public static String getColumnCount(String testDataExcelName, String testDatasheetName) throws IOException, InvalidFormatException {
        File dr = new File("");

        final String location = dr.getAbsolutePath() + "\\" + "Resources" + "\\" + testDataExcelName + ".xlsx";




            XSSFWorkbook WObj = new XSSFWorkbook(new File(location));

            XSSFSheet sheet = WObj.getSheet(testDatasheetName);

            XSSFRow row = sheet.getRow(0);

            String colNum = Integer.toString(row.getLastCellNum());
            return colNum;


    }
}


