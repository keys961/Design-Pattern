package org.yejt.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * Created by Yejt on 2017/8/29 0029.
 */
public class Interpreter
{
    private Expression expression;

    public Interpreter(String expr)
    {
        expr = expr.trim();
        expression = null;
        Stack<Expression> exprStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        Expression left = null;
        Expression right = null;
        int startPtr = 0;
        for(int i = 0; i < expr.length(); i++)
        {
            if(expr.charAt(i) == '+' || expr.charAt(i) == '-')
            {
                exprStack.push(new VarExpression(expr.substring(startPtr, i)));
                startPtr = i + 1;
                while(!operatorStack.isEmpty() && exprStack.size() >= 2)
                {
                    right = exprStack.pop();
                    left = exprStack.pop();
                    switch (operatorStack.pop())
                    {
                        case '+': exprStack.push(new AddExpression(left, right)); break;
                        case '-': exprStack.push(new MinusExpression(left, right)); break;
                        case '*': exprStack.push(new MultiplyExpression(left, right)); break;
                        case '/': exprStack.push(new DivideExpression(left, right)); break;
                    }
                }
                operatorStack.push(expr.charAt(i));
            }
            else if(expr.charAt(i) == '*' || expr.charAt(i) == '/')
            {
                exprStack.push(new VarExpression(expr.substring(startPtr, i)));
                startPtr = i + 1;
                if(operatorStack.peek() == '+' || operatorStack.peek() == '-')
                    operatorStack.push(expr.charAt(i));
                else
                {
                    right = exprStack.pop();
                    left = exprStack.pop();
                    switch (operatorStack.pop())
                    {
                        case '*': exprStack.push(new MultiplyExpression(left, right)); break;
                        case '/': exprStack.push(new DivideExpression(left, right)); break;
                    }
                    operatorStack.push(expr.charAt(i));
                }
            }
        }
        exprStack.push(new VarExpression(expr.substring(startPtr, expr.length())));
        while(!operatorStack.isEmpty())
        {
            right = exprStack.pop();
            left = exprStack.pop();
            switch (operatorStack.pop())
            {
                case '+': exprStack.push(new AddExpression(left, right)); break;
                case '-': exprStack.push(new MinusExpression(left, right)); break;
                case '*': exprStack.push(new MultiplyExpression(left, right)); break;
                case '/': exprStack.push(new DivideExpression(left, right)); break;
            }
        }
        expression = exprStack.pop();
    }

    public int run(Map<String, Integer> map)
    {
        return expression == null ? 0 : expression.interpret(map);
    }
}
