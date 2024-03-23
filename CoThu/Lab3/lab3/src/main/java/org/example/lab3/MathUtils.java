package org.example.lab3;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    public int total (int a, int b){
        return a + b;
    }

    public int division (int a, int b){

        if (b == 0) {
            throw new ArithmeticException("B need number > 0.");
        }
        return a / b;
    }

    public int effectiveness(int... a){
        if (a.length == 0) {
            throw new ArithmeticException("Need properties.");
        }

        int result = a[0];

        for (int i = 1; i < a.length; i++) {
            result += a[i];
        }

        return result / a.length;
    }

    public Long getElementAtIndex(int index) {
        List<Long> list = new ArrayList<>();

        list.add(2L); // Thêm phần tử 2 vào danh sách
        list.add(3L);
        list.add(4L);
        list.add(5L);

        if (index >= 0 && index < list.size()) {
            return list.get(index); // Trả về phần tử tại chỉ mục index
        } else {
            // Xử lý nếu chỉ mục không hợp lệ
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public User getUserByAccountAndPassword(List<User> userList, String userName, String password) {
        if (userList.isEmpty() || userList.size() == 0) {
            throw new NullPointerException("User list is null");
        }

        for (User user : userList) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                if (user.getPass().equals(password)) {
                    return user;
                } else {
                    throw new IllegalArgumentException("Invalid password");
                }
            }
        }

        return null; // Trả về null nếu không tìm thấy người dùng với tên người dùng cụ thể và mật khẩu đã cung cấp
    }

}
