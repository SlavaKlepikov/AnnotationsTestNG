//Configuration information for a TestNG class:
//
//@BeforeSuite: The annotated method will be run before all tests in this suite have run.
//@AfterSuite: The annotated method will be run after all tests in this suite have run.
//@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
//@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
//@BeforeGroups: The list of groups that this configuration method will run before. This method is guaranteed to run shortly before the first test method that belongs to any of these groups is invoked.
//@AfterGroups: The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
//@BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
//@AfterClass: The annotated method will be run after all the test methods in the current class have been run.
//@BeforeMethod: The annotated method will be run before each test method.
//@AfterMethod: The annotated method will be run after each test method.


import org.testng.annotations.*;

public class AnnotationsTestNG {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite will be run before all tests in this suite have run.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite will be run after all tests in this suite have run.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest will be run before any test method " +
                "belonging to the classes inside the <test> tag is run.");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("The list of groups that this configuration method will run before. " +
                "This method is guaranteed to run shortly before the first test method" +
                " that belongs to any of these groups is invoked.");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("The list of groups that this configuration method will run after. " +
                "This method is guaranteed to run shortly after the last test method " +
                "that belongs to any of these groups is invoked.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass will be run before the first test method in the current class is invoked.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass will be run after all the test methods in the current class have been run.");
    }

    @BeforeMethod
    public void beforMethod() {
        System.out.println("@BeforeMethod will be run before each test method.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod will be run after each test method.");
    }

    @Test
    public void testCase1() {
        System.out.println("@Test: testCase1");
    }

    @Test(priority=1)
    public void testCase2() {
        System.out.println("@Test: testCase2 (priority=1)");
    }

    @Test(priority=2)
    public void testCase3() {
        System.out.println("@Test: testCase3 (priority=2)");
    }

    @Test(enabled=false)
    public void testCase4() {
        System.out.println("@Test: testCase4 (enabled=false) Whether methods on this class/method are enabled.");
    }

    @Test(timeOut = 1000)
    public void testCase5() {
        System.out.println("@Test: testCase5 (timeOut = 1000) The maximum number of milliseconds this test should take.");
    }

    @Test(dependsOnMethods = {"testCase5"})
    public void testCase6() {
        System.out.println("@Test: testCase6 (dependsOnMethods = {\"testCase5\"}) The list of methods this method depends on.");
    }

    @Test (groups={"Acceptance"})
    public void testCase7() {
        System.out.println("@Test: testCase7 (groups={\"Acceptance\"})");
    }

    @Test (groups={"Acceptance"})
    public void testCase8() {
        System.out.println("@Test: testCase8 (groups={\"Acceptance\"})");
    }

    @Test (groups={"Integration"})
    public void testCase9() {
        System.out.println("@Test: testCase6 (groups={\"Integration\"})");
    }

}



