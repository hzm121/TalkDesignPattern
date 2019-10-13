package demo;

import factory.OperationFactory;
import operation.AddOperation;
import operation.DivOperation;
import operation.Operation;

public class EasyFactoryDemo {
    public static void main(String[] args) {
        DivOperation divOperation = (DivOperation)OperationFactory.createOperation("/");
        AddOperation addOperation = (AddOperation)OperationFactory.createOperation("+");
        divOperation.setNumberA(10);
        divOperation.setNumberB(5);
        addOperation.setNumberA(10);
        addOperation.setNumberB(5);
        double divresult = divOperation.getResult();
        double addresult = addOperation.getResult();

        System.out.println(divresult+"-----div");
        System.out.println(addresult+"-----add");
    }
}
