package exercises.technology.main;

public class Laptop extends Computer {

    private boolean isTouchScreen;

    public Laptop(String brand, String color, int year, boolean isTouchScreen) {
        super(brand, color, year);
        this.isTouchScreen = isTouchScreen;
    }


    public Laptop(String brand, String color, int year) {
        super(brand, color, year);
        this.isTouchScreen = false;
    }
    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        isTouchScreen = touchScreen;
    }

    public void openTheScreen(){
        this.isTouchScreen = true;
        System.out.println("The Laptop is touch screen!");
 }


    public boolean getTouchScreen() {
        return false;
    }
}
