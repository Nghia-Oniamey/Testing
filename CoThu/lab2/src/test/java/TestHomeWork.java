import org.example.lab2.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHomeWork {

    @Test
    public void testTotal(){
        MathUtils mathUtils = new MathUtils();
//        Assertions.assertEquals(3, mathUtils.total(1, 3));
//        Expected :3
//        Actual   :4
//         thất bại
        Assertions.assertEquals(3, mathUtils.total(1, 2));
//        thành công
    }

    @Test
    public void effectiveness(){
        MathUtils mathUtils = new MathUtils();

//        Assertions.assertEquals(4, mathUtils.effectiveness(2, 4, 5, 1));
//        Expected :4
//        Actual   :-8
//         thất bại
//        Assertions.assertEquals(-8, mathUtils.effectiveness(2, 4, 5, 1));
        // thành công
//        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.effectiveness());

    }
}
