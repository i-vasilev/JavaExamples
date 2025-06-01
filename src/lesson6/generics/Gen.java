package lesson6.generics;

public class Gen<T> {
    private T myVar;

    public void setMyVar(T myVar) {
        this.myVar = myVar;
    }

    public T getMyVar() {
        return myVar;
    }

    public void printGenericType() {
        System.out.println(myVar.getClass());
    }
}
