package exercises.technology.main;

public class Program {
    public static void main(String[] args){
        SmartPhone mySmartphone = new SmartPhone("Apple","Gold", 2022, true);
        mySmartphone.makePhoneCall("2843949241");
        int result = mySmartphone.processTwoPlusTwo();
        System.out.println("The result is: " + result);
        Laptop myLaptop = new Laptop("Dell","Black",2023,true);
        myLaptop.openTheScreen();
        int results = myLaptop.processTwoPlusTwo();
        System.out.println("Laptop Result is: " + results);
    }
}
