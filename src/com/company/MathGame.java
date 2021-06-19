package com.company;

import com.company.exception.DivisionByZeroException;
import com.company.exception.NotArithmeticException;

import java.util.Random;
import java.util.Scanner;

public class MathGame {
    private Scanner scanner = new Scanner(System.in);
    private int a;
    private int b;
    private char c;

    public MathGame(int a, int b, char c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void play() throws Exception {
        int answerUser = 0;
        int answer = 1;
        if (c == '+') {
            answer = a + b;
            System.out.print(a + " + " + b + " = ");
            answerUser = scanner.nextInt();
        } else if (c == '-') {
            answer = a - b;
            System.out.print(a + " - " + b + " = ");
            answerUser = scanner.nextInt();
        } else if (c == '*') {
            answer = a * b;
            System.out.print(a + " * " + b + " = ");
            answerUser = scanner.nextInt();
        } else if (c == '/') {
            if (b == 0) {
                throw new DivisionByZeroException();
            }
            answer = a / b;
            System.out.print(a + " / " + b + " = ");
            answerUser = scanner.nextInt();
        } else {
            throw new NotArithmeticException();
        }
        if (answerUser != answer) {
            System.out.println("Відповідь невірна");
        } else {
            System.out.println("Відповідь вірна");
        }
    }
}
