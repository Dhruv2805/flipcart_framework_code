package Excel_revision;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read_excel_Data_revision 
{		//workbook-->sheet-->row-->column-->cell(our data)
	public static void main(String[] args) throws BiffException, IOException
	{
		File f=new File("C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\9-05-2020_pending\\Excel_read_revision.xls");
		Workbook wk=Workbook.getWorkbook(f);		// workbook object
		Sheet ws =wk.getSheet(0);					//sheet object..with index 0
		int r=ws.getRows();							//row object
		int c=ws.getColumns();						//column object
		
		System.out.println("total row count "+r);
		System.out.println("total column count "+c);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(2, 2);
				System.out.println(c1.getContents());
			}
		}
		
	}
}
