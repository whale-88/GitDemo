package testPackage;

import org.junit.runners.Parameterized;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

    @AfterTest
    public void TestAfter(){

        System.out.println("After");

    }

    @Test(groups = {"Smoke"}, dependsOnMethods = {"Demo3"})
    public void Demo1(){
        System.out.println("hello1");
    }
    @Test(timeOut = 400)
    public void Demo2(){
        System.out.println("hello2");
    }
    @Test @Parameters({"URL"})
    public void Demo3(String url){
        System.out.println("hello3");
        System.out.println(url);
    }

//    public static void main (String[] args) {
//        System.out.println("hello");
//    }

}
