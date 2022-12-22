package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseclass.baseclass;



public class TestUtil extends baseclass {
	static Xls_Reader r2= new Xls_Reader("C:\\Users\\Visha\\OneDrive\\Documents\\testdata1.xlsx");
	

	
public static ArrayList<Object[]> getDataFromExcel(){
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
	
		
		int rownum=r2.getRowCount("fbdata");
		for(int i=2;i<=rownum;i++)
		{
			
        	String fname = r2.getCellData("fbdata", 0, i);
        	String sname = r2.getCellData("fbdata", 1, i);
        	String mbl = r2.getCellData("fbdata", 2, i);
        	Object ob[]= {fname,sname,mbl};
        	myData.add(ob);
        	
		}
		return myData;
	}
public static ArrayList<Object[]> getDataFromExcel1(){
	ArrayList<Object[]> myData1 = new ArrayList<Object[]>();
	
		
		int rownum=r2.getRowCount("gmail");
		for(int i=2;i<=rownum;i++)
		{
			
        	String fname = r2.getCellData("gmail", 0, i);
        	
        	Object ob[]= {fname};
        	myData1.add(ob);
        	
		}
		return myData1;
	}
public static ArrayList<Object[]> getDataFromExcel2(){
	ArrayList<Object[]> myData2 = new ArrayList<Object[]>();
	
		
		int rownum=r2.getRowCount("gmail");
		for(int i=2;i<=rownum;i++)
		{
			
        	
        	String sname = r2.getCellData("gmail", 1, i);
        	Object ob[]= {sname};
        	myData2.add(ob);
        	
		}
		return myData2;

	}
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}
}
