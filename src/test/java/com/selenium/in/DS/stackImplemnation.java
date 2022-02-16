package com.selenium.in.DS;

import java.util.Stack;

public class stackImplemnation {

    private int size;
    private int[] arr;
    private int toppointer=-1;

    stackImplemnation(int size){
        this.size=size;
        this.arr=new int[size];
        this.toppointer=-1;
    }

    public void push(int number){
        if(!isFull()){
            try {
                this.toppointer++;
                arr[this.toppointer] = number;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Stack is full. Can not add "+number);
            }

        }
        else{
            System.out.println("Stack is full.");
        }
    }

    public void pope(){
        if(!isEmpty()){
            System.out.println(arr[this.toppointer]);
            this.toppointer--;
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    public int peek(){
        if(!isEmpty()){
            return arr[this.toppointer];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    private boolean isEmpty(){
        return (this.toppointer==-1);
    }

    private boolean isFull(){
        return (this.toppointer==size);
    }
}
