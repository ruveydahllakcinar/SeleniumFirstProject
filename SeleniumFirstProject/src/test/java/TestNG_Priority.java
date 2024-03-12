import org.testng.annotations.Test;

public class TestNG_Priority {
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }
    @Test(priority = 3)
    public void test4(){
        System.out.println("Test4");
    }
}