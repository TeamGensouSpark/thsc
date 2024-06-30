package io.github.teamgensouspark.thsc.components;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

import java.util.HashMap;


@SuppressWarnings("unused")
public class TickedExpression {
    private final Expression expression;

    public TickedExpression(String expression) {
        this.expression = AviatorEvaluator.compile(expression);
    }


    public Number execute(HashMap<String, Object> env) {
        return (Number) expression.execute(env);
    }
}