package com.excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args)throws IOException,InvalidFormatException {



		File file=new File("/home/rajeev/tmp/Demo.xltx");
		if(!file.exists()){
			System.out.println("File not found ");
			return ;
		}
      System.out.println("running");
		XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(file));

		XSSFSheet sheet= workbook.getSheetAt(0);
		JOptionPane.showMessageDialog(null, "This sheet has "+sheet.getLastRowNum()+" rows only !!");

		Iterator<Row>	 iterator=    sheet.iterator();

       //iterating over row..
		int rowCount=0;
		while (iterator.hasNext()) {
			Row row =iterator.next();
			 //iterating over cell for current row..
			Iterator<Cell>  cellIterator= row.cellIterator();
			int cellCount=0;
			while (cellIterator.hasNext()) {

				Cell cell = (Cell) cellIterator.next();
				//checking cell type
				 switch (cell.getCellType()) {
				case STRING:
					System.out.println("row - column("+rowCount+"-"+cellCount+") has(String) :"+cell.getStringCellValue());
					break;
				case NUMERIC :
					System.out.println("row - column("+rowCount+"-"+cellCount+") has(Numeric) :"+cell.getNumericCellValue());
					break;
				default:
					System.out.println("row - column("+rowCount+"-"+cellCount+") has(UnknowType) :"+cell.getStringCellValue());
				}
				cellCount++;
			}
			rowCount++;
		}



	}


}
