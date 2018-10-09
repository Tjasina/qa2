import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasics {
    Integer sumToCheck;

    @Test
    public void firsTest() {

        Integer a = 85;
        Integer b = 15;
        sumToCheck = 100;

        Integer c = 45;
        Integer d = 55;


        Integer sum2 = c + d;


        Assertions.assertEquals(sumToCheck, sum2, "Sum2 is not correct");
    }

    private void sumAndCheck(Integer a, Integer b) {
        Integer sum = a + b;
        Assertions.assertEquals(sumToCheck, sum, "Numbers not equal");
    }

}
