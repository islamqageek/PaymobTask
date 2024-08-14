package tests;

import org.testng.annotations.Test;
import pages.AddToCompareListPage;

public class CompareProducts extends TestBase{
    @Test
    public void add2Compare()  {

        AddToCompareListPage comp = new AddToCompareListPage(driver);
        comp.addToCompare();
    }
}
