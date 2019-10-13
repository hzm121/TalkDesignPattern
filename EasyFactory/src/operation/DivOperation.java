package operation;

public class DivOperation extends Operation {
    @Override
    public double getResult() {
        if (getNumberB() == 0)
            throw new ArithmeticException("除数不能为0");
        return getNumberA()/getNumberB();
    }
}
