package com.company;

import com.company.exception.NotNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Введіть перше число: ");
            int a = Integer.parseInt(isNumber());
            System.out.print("Введіть друге число: ");
            int b = Integer.parseInt(isNumber());
            System.out.print("Введіть дію(+,-,*,/): ");
            String s = scanner.nextLine();
            char c = s.charAt(0);
            MathGame mathGame = new MathGame(a,b,c);
            mathGame.play();
        }
    }
    public static String isNumber() throws NotNumberException {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        for (int i = 0; i < temp.length(); i++) {
            if (!Character.isDigit(temp.charAt(i))){
                throw new NotNumberException();
            }
        }
        return temp;
    }
}
