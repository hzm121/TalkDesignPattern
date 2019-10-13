package operation;

public class MulOperation extends Operation {
    @Override
    public double getResult(){
        return getNumberA()*getNumberB();
    }
}
