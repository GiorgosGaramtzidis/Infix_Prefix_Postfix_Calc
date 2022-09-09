package org.example;

import java.util.Stack;

import static org.example.Precedence.precedence;


public class InfixToPostfix {

    static String infixToPostFix(String expression){

        String result = "";
        Stack<Character> stack = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (precedence(c) > 0) {
                    while (stack.isEmpty() == false && precedence(stack.peek()) >= precedence(c)) {
                        result += stack.pop();
                    }
                    stack.push(c);
                } else if (c == ')') {
                    char x = stack.pop();
                    while (x != '(') {
                        result += x;
                        x = stack.pop();
                    }
                } else if (c == '(') {
                    stack.push(c);
                } else {
                    result += c;
                }
            }
            for (int i = 0; i <= stack.size(); i++) {
                if(stack.isEmpty()){
                    return "true";
                }
                result += stack.pop();
            }
        return result;
    }
}
