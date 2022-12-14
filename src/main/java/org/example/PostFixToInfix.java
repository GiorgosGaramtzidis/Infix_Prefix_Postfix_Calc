package org.example;

import java.util.Stack;

public class PostFixToInfix {
    public String convert(String expression){

        Stack<String> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            if(c=='*'||c=='/'||c=='^'||c=='+'||c=='-' ){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "("+s2+c+s1+")";
                stack.push(temp);
            }else{
                stack.push(c+"");
            }
        }
        if(stack.isEmpty()){
            return "true";
        }
        else {
            String result = stack.pop();
            return result;
        }
    }
}
