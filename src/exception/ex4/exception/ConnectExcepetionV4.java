package exception.ex4.exception;

public class ConnectExcepetionV4 extends NetworkClientExceptionV4{

    private final String address;

    public ConnectExcepetionV4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
