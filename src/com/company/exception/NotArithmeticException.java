package com.company.exception;

public class NotArithmeticException extends Exception{
    public NotArithmeticException(){
        super("Введений символ не є одним з доступних (*, /, +, -)!!!!!!!");
    }
}
