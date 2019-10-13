package operation;

public class SubOperation extends Operation{
    @Override
    public double getResult(){
        return getNumberA()-getNumberB();
    }
}
