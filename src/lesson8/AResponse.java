package lesson8;

public class AResponse {

    private String name;
    private String numberPhone;
    private int resultCode; // 200 - успех, остальное ошибка

    public AResponse(String name, String numberPhone, int resultCode) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.resultCode = resultCode;
    }

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getResultCode() {
        return resultCode;
    }

    @Override
    public String toString() {
        return "AResponse{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", resultCode=" + resultCode +
                '}';
    }
}
