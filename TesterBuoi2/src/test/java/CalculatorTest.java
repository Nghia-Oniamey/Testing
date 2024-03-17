import org.example.testerbuoi2.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testException(){
        Calculator calculator = new Calculator(); // khởi tạo Class Calculator
        List<Integer> listEmpty = new ArrayList<>(); // Khởi tạo 1 inteface = 1 Class
        Assertions.assertThrows(ArithmeticException.class,() -> calculator.averageCalculator(listEmpty));
    }

    @Test
    public void testListHaveValue(){
        Calculator calculator = new Calculator(); // khởi tạo Class Calculator
        List<Integer> listNotEmpty = new ArrayList<>(); // Khởi tạo 1 inteface = 1 Class
        listNotEmpty = List.of(3, 3, 4); // gán kiểu dữ niệu cho danh sách list
        Assertions.assertEquals(10D/3D,calculator.averageCalculator(listNotEmpty));
    }


}
