package TestUnit;
/**
 *
 * @author Fernando Gutierrez Arevalo
 */

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Petish
 */
public class ExcelUtils {
    
    //defino atributos
    static XSSFWorkbook workbook;           //en caso de que sea formato .xls  se utiliza HSSFWorkbook y  HSSFSheet 
    static XSSFSheet sheet ;        

    //Constructor de ExcelUtils para leer archivo de Excel    
    public ExcelUtils(String excelPath, String sheetName)
    { 
        try {
            workbook = new XSSFWorkbook(excelPath);     
            sheet = workbook.getSheet(sheetName); 
            
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();        
        }
    }
    
   
    public static String getCellData(int rowNum, int colNum) throws IOException {  //porque el método arroja una excepción, tambien en el método principal debe ser declarada dicha excepción arrojada
        //DataFormatter formatter, recibe cualquier tipo de dato String/entero/doble y lo guarda
            DataFormatter formatter = new DataFormatter();
            String value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));  
            System.out.println(value);
            return value;
    }
    
    public static void getRowCount(){
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of Rows: "+rowCount); 

    }
}
