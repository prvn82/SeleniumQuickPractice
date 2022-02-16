package com.selenium.in.DS;

public class stackImplemnationTest {

    public static void main(String[] args) {

        stackImplemnation stack  = new stackImplemnation(4);
        stack.pope();
        stack.push(10);
        stack.push(162);
        stack.push(234);
        stack.push(2332);
        //stack.push(1333);
        System.out.println(stack.peek());
         stack.pope();
        System.out.println(stack.peek());
        stack.pope();
        stack.pope();

        System.out.println(stack.peek());
    }
}
