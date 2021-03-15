package BasicSeleniumTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile {

    public static void main (String []args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("C://Users//chinmay.c.mohanty//Documents//TestData//DataSheetOne.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();



    }
}
