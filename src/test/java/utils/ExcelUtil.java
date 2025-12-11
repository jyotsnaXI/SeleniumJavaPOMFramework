package utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {

    private static Workbook workbook;
    private static Sheet sheet;

    // Load the Excel file
    public static void loadExcelFile(String excelFilePath, String sheetName) throws IOException {
        try (FileInputStream fis = new FileInputStream(new File(excelFilePath))) {
            if (excelFilePath.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fis);  // For .xlsx files
            } else if (excelFilePath.endsWith(".xls")) {
                workbook = new HSSFWorkbook(fis);  // For .xls files
            } else {
                throw new IOException("Invalid Excel file format. Please provide a .xlsx or .xls file.");
            }

            sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IOException("Sheet with name '" + sheetName + "' not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Error loading the Excel file: " + e.getMessage());
        }
    }
    // Get row count in the sheet
    public static int getRowCount() {
        if (sheet != null) {
            return sheet.getPhysicalNumberOfRows();
        }
        return 0;
    }

    // Get cell value from a specific row and column
    public static String getCellValue(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        if (row != null) {
            Cell cell = row.getCell(colNum);
            if (cell != null) {
                // Check the cell type and handle accordingly
                switch (cell.getCellType()) {
                    case STRING:
                        return cell.getStringCellValue();
                    case NUMERIC:
                        // Check if the numeric value is an integer or a double
                        if (DateUtil.isCellDateFormatted(cell)) {
                            // Handle date values if needed
                            return cell.getDateCellValue().toString();
                        } else {
                            // Use BigDecimal to avoid scientific notation
                            BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                            return bd.toPlainString();
                        }
                    case BOOLEAN:
                        return String.valueOf(cell.getBooleanCellValue());
                    case FORMULA:
                        // Evaluate the formula and return the result as a string
                        FormulaEvaluator evaluator = cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator();
                        return evaluator.evaluate(cell).formatAsString();
                    default:
                        return cell.toString();
            }
        }
        }
        return "";
    }

    // Get all the test data from a specific sheet
    public static List<String[]> getTestData() {
        List<String[]> data = new ArrayList<>();
        int rowCount = getRowCount();
        for (int i = 1; i < rowCount; i++) { // Starting from 1 to skip the header row
            Row row = sheet.getRow(i);
            if (row != null) {
                String[] rowData = new String[row.getPhysicalNumberOfCells()];
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        // Handle numeric cell values to avoid scientific notation
                        if (cell.getCellType() == CellType.NUMERIC && !DateUtil.isCellDateFormatted(cell)) {
                            BigDecimal bd = new BigDecimal(cell.getNumericCellValue());
                            rowData[j] = bd.toPlainString();
                        } else {
                            rowData[j] = cell.toString();
                        }
                    } else {
                        rowData[j] = "";
                    }
                }
            data.add(rowData);
        }
        }
        return data;

    }

    // Close the workbook
    public static void closeWorkbook() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }
}