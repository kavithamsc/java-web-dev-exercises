package exercises.technology.main;

public class SmartPhone extends Computer {
    private boolean isConnected5G;



    public SmartPhone(String brand, String color, int year, boolean isConnected5G) {
        super(brand, color,year);
        this.isConnected5G= isConnected5G;
    }

    public void setConnected5G(boolean connected5G) {
        isConnected5G = connected5G;
    }



    public void makePhoneCall(String number) {
        System.out.println("This is a : " +number);
    }

    public boolean isConnected5G() {
        return false;
    }

    public boolean getConnected5G() {
        return true;
    }
}
