import org.testng.annotations.Test;

public class TestNG_Groups {
    @Test(groups = {"Group A"})
    public void test1(){
        System.out.println("Test1");
    }
    @Test(groups = {"Group B"})
    public void test2(){
        System.out.println("Test2");
    }
    @Test(groups = {"Group A","Group B"})
    public void test3(){
        System.out.println("Test3");
    }
    @Test(groups = {"Group C"})
    public void test4(){
        System.out.println("Test4");
    }
}
