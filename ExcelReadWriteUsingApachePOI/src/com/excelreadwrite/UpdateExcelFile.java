package com.excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateExcelFile {

	public static void main(String[] args) throws Exception {

		FileInputStream fsIP= new FileInputStream(new File("/home/rajeev/tmp/Demo.xltx")); //Read the spreadsheet that needs to be updated

		XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook

		XSSFSheet worksheet = wb.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
         JOptionPane.showMessageDialog(null, "This worksheet has "+ worksheet.getLastRowNum()+" rows to update");
		List<TestClassToWrite>  list=new ArrayList<TestClassToWrite>();

		TestClassToWrite testClassObject=new TestClassToWrite();
		testClassObject.setArrivalDate(new Date());
		testClassObject.setArrivalDay(1);
		
        
		TestClassToWrite testClassObject2=new TestClassToWrite();
		testClassObject2.setArrivalDate(new Date());
		testClassObject2.setArrivalDay(2);
        

		TestClassToWrite testClassObject3=new TestClassToWrite();
		testClassObject3.setArrivalDate(new Date());
		testClassObject3.setArrivalDay(2);
        
		
		list.add(testClassObject2);
        list.add(testClassObject);
        list.add(testClassObject3);
		fsIP.close(); //Close the InputStream

		new UpdateExcelFile().updateCellValue(list, worksheet);//calling..
		FileOutputStream output_file =new FileOutputStream(new File("/home/rajeev/tmp/Demo.xltx"));
		wb.write(output_file); //write changes
		output_file.close();  //close the stream 
		System.out.println("File written sucessfully !!");
	}


	public void updateCellValue(List<TestClassToWrite> list,XSSFSheet worksheet) {

		int startingRow=3;
		System.out.println("total object going to write is ::"+list.size());
		for (int i = 0; i <list.size() ; i++) {
        System.out.println("writing  at row no :"+startingRow);
			TestClassToWrite classToWrite=list.get(i);

                    worksheet.getRow(startingRow).getCell(0).setCellValue(classToWrite.getArrivalDate());
                    worksheet.getRow(startingRow).getCell(1).setCellValue(classToWrite.getArrivalDay());
                    startingRow++;
		}		  



	}

}
