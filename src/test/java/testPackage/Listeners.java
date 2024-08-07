package testPackage;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

   @Override
    public void onTestSuccess(ITestResult result) {

       System.out.println("test success");

    }
@Override
    public void onTestFailure(ITestResult result) {

    System.out.println("test failure " + result.getName());
    System.out.println("test failure " + result.getName());
    System.out.println("test failure " + result.getName());

    }



}
