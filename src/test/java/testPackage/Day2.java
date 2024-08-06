package testPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {

    @Test(dataProvider = "getData")
    public void Test1(String planType, String optionType){

        System.out.println("Test1");
        System.out.println(planType);
        System.out.println(optionType);

    }
    @Test(groups = {"Smoke"})
    public void Test2(){

        System.out.println("Test2");
        Assert.assertTrue(false);

    }
    @Test(enabled = false)
    public void Test3(){

        System.out.println("Test3");

    }

    @BeforeTest
    public void TestBefore(){

        System.out.println("Before");

    }

    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[3][2];
        data[0][0] = "plan1";
        data[0][1] = "option1";
        data[1][0] = "plan2";
        data[1][1] = "option2";
        data[2][0] = "plan3";
        data[2][1] = "option3";

        return data;

    }

}
