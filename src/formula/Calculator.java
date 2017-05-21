package formula;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculator {
    public double Calc(String formula) throws javax.script.ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object engineOut = engine.eval(formula);
        double result = Double.valueOf(engineOut.toString());
        return result;
    }
}