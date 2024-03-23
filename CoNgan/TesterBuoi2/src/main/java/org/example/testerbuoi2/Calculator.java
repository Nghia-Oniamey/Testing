package org.example.testerbuoi2;

import java.util.List;

public class Calculator {

    public Double averageCalculator (List<Integer> numbers) {
        if (numbers.isEmpty()){
            throw new ArithmeticException("Danh sách số không được rỗng.");
        }
        Double tong = 0D;
        Double dem = 0D;
        for (Integer number : numbers) {
            tong += number;
            dem++;
        }
        Double trungBinh = tong/dem;
        return trungBinh;
    }

}
