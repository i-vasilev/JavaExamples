package lesson6.generics;

public class TwoGen <T, U> {
    private T myVarT;
    private U myVarU;

    public void setMyVarT(T myVarT) {
        this.myVarT = myVarT;
    }

    public void setMyVarU(U myVarU) {
        this.myVarU = myVarU;
    }

    public T getMyVarT() {
        return myVarT;
    }

    public U getMyVarU() {
        return myVarU;
    }
}
