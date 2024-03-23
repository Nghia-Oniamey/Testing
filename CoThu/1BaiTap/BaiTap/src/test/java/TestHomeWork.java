import org.example.baitap.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestHomeWork {

    @Test
    public void testVolumeSuccess(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(6L, mathUtils.calculateVolume(1L, 2L, 3L));
    }

    @Test
    public void testVolumeFalse(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(1L, mathUtils.calculateVolume(1L, 2L, 3L));
    }

    @Test
    public void testCompassionSuccess(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(1L, mathUtils.Compassion(3L, 3L, 1L));
        // kết quả đúng thực tế
        // Expected :1
        // Actual   :1
    }

    @Test
    public void testCompassionFalseCal1(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(2L, mathUtils.Compassion(3L, 3L, 1L));
        // kết quả sai thực tế
        // Expected :2
        // Actual   :1
    }

    @Test
    public void testCompassionFalseCal2(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(2L, mathUtils.Compassion(3L, 0L, 1L));
        // ngoại lệ số học java.lang.ArithmeticException: / by zero
    }

    @Test
    public void testCompassionFalseCal3(){
        MathUtils mathUtils = new MathUtils();

        Assertions.assertEquals(2L, mathUtils.Compassion(3L, 0L, 1L));
        // ngoại lệ số học java.lang.ArithmeticException: / by zero
    }


}
