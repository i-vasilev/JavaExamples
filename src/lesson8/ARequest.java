package lesson8;

public class ARequest {

    private String name;
    private long numberPhone;
    private String address;

    public ARequest(String name, long numberPhone, String address) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ARequest{" +
                "name='" + name + '\'' +
                ", numberPhone=" + numberPhone +
                ", address='" + address + '\'' +
                '}';
    }
}
