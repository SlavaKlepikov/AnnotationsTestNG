import org.testng.annotations.Test;

public class NewClassAnnotationsTestNG {

    @Test
    public void testCase1() {
        System.out.println("@Test: testCase1 NewClass");
    }

    @Test
    public void testCase2() {
        System.out.println("@Test: testCase2 NewClass");
    }

    @Test (groups={"Integration"})
    public void testCas3() {
        System.out.println("@Test: testCase3 NewClass (groups={\"Integration\"})");
    }
}
