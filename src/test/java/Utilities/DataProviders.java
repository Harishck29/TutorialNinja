package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path=".\\testdata\\Opencart_LoginData.xlsx";
		
		ExcelUtility xlutil =new ExcelUtility(path);
		
		         int totalrows = xlutil.getRowCount("sheet1");
		         int totalcols = xlutil.getCellCount("sheet1", 1);
		         
		         String Logindata[][]  =new String[totalrows][totalcols];
		         
		         for(int i=1;i<=totalrows;i++) {
		        	 
		        	 for(int c=0;c<totalcols;c++) {
		        		 
		        		 
		        	Logindata[i-1][c]= xlutil.getCellData("sheet1", i, c);
		        	 }
		         }
		     
		         return Logindata; 
		         
			
				
		
	}
	
		
	
	
	
	
	
}
