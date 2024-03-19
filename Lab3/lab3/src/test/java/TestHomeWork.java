import org.example.lab3.MathUtils;
import org.example.lab3.NullReferenceException;
import org.example.lab3.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    public void testDivision(){
        MathUtils mathUtils = new MathUtils();

//        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.division(0, 0));
        // trả ra ngoại lệ

        Assertions.assertThrows(NullReferenceException.class, () -> mathUtils.division(0, 0));
        // trả ra sai ngoại lệ
//        Expected :class org.example.lab3.NullReferenceException
//        Actual   :class java.lang.ArithmeticException

//        Assertions.assertEquals(1, mathUtils.division(1, 1));
        // thành công

//        Assertions.assertEquals(2, mathUtils.division(3, 2));
        // thất bại
//        Expected :2
//        Actual   :1
    }

    @Test
    public void effectiveness(){
        MathUtils mathUtils = new MathUtils();

//        Assertions.assertEquals(4, mathUtils.effectiveness(2, 4, 5, 1));
//        Expected :4
//        Actual   :-8
//         thất bại
//        Assertions.assertEquals(-8, mathUtils.effectiveness(2, 4, 5, 1));
//         thành công
//        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.effectiveness());
        // trả ra ngoại lệ null properties
        Assertions.assertThrows(NullReferenceException.class, () -> mathUtils.effectiveness());
//        Expected :class org.example.lab3.NullReferenceException
//        Actual   :class java.lang.ArithmeticException
    }

    @Test
    public void testGetElementAtIndex(){
        MathUtils mathUtils = new MathUtils();

//        Assertions.assertEquals(2, mathUtils.getElementAtIndex(2));
//        Expected :2
//        Actual   :4
//         thất bại
//        Assertions.assertEquals(4, mathUtils.getElementAtIndex(2));
//         thành công
//        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> mathUtils.getElementAtIndex(6));
        // trả ra ngoại lệ ngoài giới hạn
        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.getElementAtIndex(6));
//        Expected :class java.lang.ArithmeticException
//        Actual   :class java.lang.IndexOutOfBoundsException
    }

    @Test
    public void testGetUserByUserNameAndPassword(){
        MathUtils mathUtils = new MathUtils();

        List<User> list = new ArrayList<>();
        list.add(new User("Nghĩa", "123"));
        list.add(new User("Thu", "234"));
        list.add(new User("Bảo", "1234"));

        User user = list.get(1);
//        Assertions.assertEquals(user, mathUtils.getUserByAccountAndPassword(list, "Thu", "234"));
        // thành công
//        Assertions.assertEquals(user, mathUtils.getUserByAccountAndPassword(list, "Bảo", "1234"));
        // thất bại
//        Expected :User{userName='Thu', pass='234'}
//        Actual   :User{userName='Bảo', pass='1234'}
        List<User> listEmpty = new ArrayList<>();
//        Assertions.assertThrows(NullPointerException.class, () -> mathUtils.getUserByAccountAndPassword(listEmpty, "Nghiax", "addf"));
        // trả ngoại lệ NullPointerException (list trống)
        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.getUserByAccountAndPassword(listEmpty, "Nghiax", "addf"));
//        Expected :class java.lang.ArithmeticException
//        Actual   :class java.lang.NullPointerException
    }

}
