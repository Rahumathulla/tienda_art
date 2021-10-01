/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essar.utils;

/**
 *
 * @author rahumathulla
 */
import java.io.*;
import java.sql.*; 
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 
public class ExcelExporter {
 
    ConnectionManager cm = new ConnectionManager();
    
     
    public void exportToExcel(String query, String excelFilePath) {
        Connection con = cm.getConnection();
        Statement statement = null;
 
        try {
            
            statement = con.createStatement(); 
            ResultSet result = statement.executeQuery(query);
 
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("PurchaseReport");
 
            writeHeaderLine(sheet);
 
            writeDataLines(result, workbook, sheet);
 
            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
 
            statement.close();
 
        } catch (SQLException e) {
            System.out.println("Datababse error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }
 
    private void writeHeaderLine(XSSFSheet sheet) {
 
        Row headerRow = sheet.createRow(0);
 
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("GSTIN of Supplier");
 
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("Supplier Name");
 
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("Invoice Number");
 
        headerCell = headerRow.createCell(3);
        headerCell.setCellValue("Invoice Date");
 
        headerCell = headerRow.createCell(4);
        headerCell.setCellValue("Invoice Value");
        
        headerCell = headerRow.createCell(5);
        headerCell.setCellValue("Place of Supply");
 
        headerCell = headerRow.createCell(6);
        headerCell.setCellValue("Reverse Charge");
 
        headerCell = headerRow.createCell(7);
        headerCell.setCellValue("Invoice Type");
 
        headerCell = headerRow.createCell(8);
        headerCell.setCellValue("E-Comm");
        
        headerCell = headerRow.createCell(9);
        headerCell.setCellValue("Rate");
 
        headerCell = headerRow.createCell(10);
        headerCell.setCellValue("Taxable Value");
 
        headerCell = headerRow.createCell(11);
        headerCell.setCellValue("Cess Amount");

    }
 
    private void writeDataLines(ResultSet result, XSSFWorkbook workbook,
            XSSFSheet sheet) throws SQLException {
        int rowCount = 1;
 
        while (result.next()) {
            String gstin = result.getString("gstin");
            String supplierName = result.getString("supplier_name");
            String invoiceNumber = result.getString("invoice_number");
            Date invoiceDate = result.getDate("invoice_date");
            SimpleDateFormat dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
            double invoiceValue = result.getDouble("invoice_value");
            String placeOfSupply = result.getString("place_of_supply");
            String reverseCharge = result.getString("reverse_charge");
            String invoiceType = result.getString("invoice_type");
            String eComm = result.getString("e_comm");
            double rate = result.getDouble("rate");
            double taxableValue = result.getDouble("taxable_value");
            double cess = result.getDouble("cess_amount");
            
            //float rating = result.getFloat("purchase_price");
            //Timestamp timestamp = result.getTimestamp("upda");
            //String category = result.getString("category");
            //String comment = result.getString("supplier");
 
            Row row = sheet.createRow(rowCount++);
 
            int columnCount = 0;
            Cell cell = row.createCell(columnCount++);
            cell.setCellValue(gstin);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(supplierName);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(invoiceNumber);
            
            cell = row.createCell(columnCount++);
            cell.setCellValue(dateFormat.format(invoiceDate));
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(invoiceValue);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(placeOfSupply);
            
            cell = row.createCell(columnCount++);
            cell.setCellValue(reverseCharge);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(invoiceType);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(eComm);
            
            cell = row.createCell(columnCount++);
            cell.setCellValue(rate);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(taxableValue);
 
            cell = row.createCell(columnCount++);
            cell.setCellValue(cess);
            /*CellStyle cellStyle = workbook.createCellStyle();
            CreationHelper creationHelper = workbook.getCreationHelper();
            cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
            cell.setCellStyle(cellStyle);*/
 
            //cell.setCellValue(timestamp);
 
            /*cell = row.createCell(columnCount++);
            cell.setCellValue(rating);
 
            cell = row.createCell(columnCount);
            cell.setCellValue(comment);*/
 
        }
    }
 
}
