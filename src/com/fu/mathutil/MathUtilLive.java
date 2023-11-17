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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);  //hàm tính đi coi là mấy? 
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        //Kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì?
        //Expected value: 5! = 120
        //mày/ hàm ai đó viết khi chạy thực tế là mấy = actual, giả sử 120
        //if extected == actual. hàm ngon trong tinh huống này.
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY -- CODE LÊN SERVER 7H22PM 17/NOV/2023
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
    }
    
}
