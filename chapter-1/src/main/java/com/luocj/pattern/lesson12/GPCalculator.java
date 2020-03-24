package com.luocj.pattern.lesson12;

import java.util.Stack;

public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack1 = new Stack<>();
    private Stack<IArithmeticInterpreter> stack2 = new Stack<>();

    private Stack<IArithmeticInterpreter> current = stack1;


    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        IArithmeticInterpreter leftExpr, rightExpr;
        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if (OperatorUtil.isLeftBrackets(operator)) {
                this.current = stack2;
            } else if (OperatorUtil.isRightBrackets(operator)) {
                this.current = stack1;
            } else if (OperatorUtil.isOperator(operator)) {
                leftExpr = this.current.pop();
                rightExpr = new NumInterpreter(Integer.valueOf(elements[++i]));
                System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.current.push(OperatorUtil.getInterpreter(leftExpr, rightExpr, operator));
                System.out.println("应用运算符: " + operator);
            } else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                this.current.push(numInterpreter);
                System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    public int calculate() {
        return this.current.pop().interpret();
    }
}