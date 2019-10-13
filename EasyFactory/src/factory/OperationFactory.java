package factory;

import operation.*;

public class OperationFactory {
    public static Operation createOperation(String oper){
         Operation operation = null;
        switch (oper){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + oper);
        }
        return operation;
    }
}
