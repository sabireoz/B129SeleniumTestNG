package techproed.tests.day22_Annotation;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day23_Driver_ConfigReader_Test {


    @Test
    public void driverTest(){
//https://techproeducation.com/ sayfasina gidiniz.
        Driver.getDriver().get("https://techproeducation.com/");

        //Tit
    }
}
