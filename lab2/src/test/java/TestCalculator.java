import org.example.lab2.Calculator;
import org.example.lab2.LoginSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestCalculator {

    @Test
    public void testTotal(){
        Calculator cal = new Calculator();
//        Assertions.assertEquals(3, testTT.tinhTong(1, 3));
//        Expected :3
//        Actual   :4
        Assertions.assertEquals(3, cal.total(1, 2));
//        thành công
    }

    @Test void testEffectiveness(){
        Calculator cal = new Calculator();
//        Assertions.assertEquals(3, testTT.tinhTong(1, 3));
//        Expected :3
//        Actual   :4
        Assertions.assertEquals(-1, cal.effectiveness(1, 2));
//        thành công
//        Expected :-1
//        Actual   :-1
    }

    @Test void testCalculateVolume(){
        Calculator cal = new Calculator();
//        Assertions.assertEquals(3, testTT.tinhTong(1, 3));
//        Expected :3
//        Actual   :4
        Assertions.assertEquals(2, cal.calculateVolume(1, 2));
//        thành công
//        Expected :3
//        Actual   :-1
    }

    @Test void testFactorial(){
        Calculator cal = new Calculator();
//        Assertions.assertEquals(3, testTT.tinhTong(1, 3));
//        Expected :3
//        Actual   :4
        Assertions.assertEquals(6, cal.factorial(3));
//        thành công
//        Expected :3
//        Actual   :-1
    }

    @Test
    public void testLogin11(){
        HashMap<String, String> account = new HashMap<>();
        account.put("admin", "123"); // identity
        account.put("sa", "123456"); // sql
        account.put("root", "Nghiaxpes1"); // mysql
        // 1- 1 Kiểm tra tài khoản đúng và mật khẩu đúng
        String resuilt = LoginSystem.login(account, "admin", "123");
        Assertions.assertEquals("Login success", resuilt);
        //        thành công
    }

    @Test
    public void testLogin10(){
        HashMap<String, String> account = new HashMap<>();
        account.put("admin", "123"); // identity
        account.put("sa", "123456"); // sql
        account.put("root", "Nghiaxpes1"); // mysql
        // 1-0 Kiểm tra tài khoản đúng và mật khẩu sai
        String resuilt = LoginSystem.login(account, "admin", "321");
        Assertions.assertEquals("Login false", resuilt);
        //        thành công
    }

    @Test
    public void testLogin01(){
        HashMap<String, String> account = new HashMap<>();
        account.put("NGHIANTC", "1"); // identity x SUKIEN
        account.put("sa", "123456"); // sql
        account.put("root", "Nghiaxpes1"); // mysql
        // 0-1 Kiểm tra tài khoản sai và mật khẩu đúng
        String resuilt = LoginSystem.login(account, "admin123", "123");
        Assertions.assertEquals("Your accounts was not hoạt động", resuilt);
//        thành công nhưng nó phải không thành công Login false >>-.-)>> hãy bỏ chữ siêu -.-
//        Expected :Login siêu false
//        Actual   :Your accounts was not hoạt động
    }

    @Test
    public void testLogin00(){
        HashMap<String, String> account = new HashMap<>();
        account.put("admin", "123"); // identity
        account.put("sa", "123456"); // sql
        account.put("root", "Nghiaxpes1"); // mysql
        // 0-1 Kiểm tra tài khoản sai và mật khẩu sai
        String resuilt = LoginSystem.login(account, "admin123", "321");
        Assertions.assertEquals("Your accounts was not hoạt động", resuilt);
        //        thành công
    }

}
