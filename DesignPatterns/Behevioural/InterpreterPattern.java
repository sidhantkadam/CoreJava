package DesignPatterns.Behevioural;

    /*
    design pattern that defines a way to interpret and evaluate language grammar or expressions.
    It provides a mechanism to evaluate sentences in a language by representing their grammar
    as a set of classes. Each class represents a rule or expression in the grammar, and the
    pattern allows these classes to be composed hierarchically to interpret complex expressions.
    */

class Context {

}

interface Expression {
    int interpret(Context context);
}

class NumberExpression implements Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}

class AdditionExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}

class MultiplicationExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}

class Interpreter {
    Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        Expression expressionTree = buildExpressionTree(expression);
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        //Logic to parse expression and create expression tree
        //For simplicity, assume the expression is already parsed
        //and represented as an expression tree
        return new AdditionExpression(
                new NumberExpression(2),
                new MultiplicationExpression(
                        new NumberExpression(3),
                        new NumberExpression(4)
                ));
    }
}

public class InterpreterPattern {
    public static void main(String[] args) {
        String expression = "2 + 3 * 4";

        Context context = new Context();
        Interpreter interpreter = new Interpreter(context);
        int result = interpreter.interpret(expression);

        System.out.println("Result: " + result);
    }
}