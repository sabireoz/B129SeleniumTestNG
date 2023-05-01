package techproed.tests.day25_ExcelUtils;

import org.testng.annotations.Test;
import techproed.utilities.ExcelUtils;

public class C01_ExcelTest1 {

    @Test
    public void excelTest1(String String) {
    // public class C01_ExcelTest1 {
           // @Test
           // public void excelTest1() {
                String path = "src/test/java/resources/mysmoketestdata.xlsx";
                String sayfa = "customer_info";
                ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
                System.out.println(excelUtils.getCellData(1, 0));
                String email=excelUtils.getCellData(1,0);
                String =excelUtils.getCellData(1,0);


            }
    }

