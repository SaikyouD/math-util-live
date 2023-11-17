/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author dat
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG TẤP TIỆN ÍCH CHO NƠI KHÁC SÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ 
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY

//Hàm tính giai thừa từ 0 đến 20
public class MathUtil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        
        // xuống đến đây, n = 2..20 òi
        // chơi for hoặc đệ quy - recursion 
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
            //product = product * i;
        }   //nhân từ 2 đến 
        return product;
    }
    
}
