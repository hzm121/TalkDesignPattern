package operation;

public class AddOperation extends Operation {
    @Override
    public double getResult(){
        double result = getNumberA()+getNumberB();
        return result;
    }
}
