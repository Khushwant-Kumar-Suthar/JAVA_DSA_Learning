package JAVA_DSA_Learning.oopsConcept;

class Getter_Setter {
    private String userName;
    private int pin;
    private String city;

    Getter_Setter(String userName, int pin, String city) {
        this.userName = userName;
        this.pin = pin;
        this.city = city;
    }

    public String getUserName() {
        return userName;
    }

    public int getPin() {
        return pin;
    }

    public String getCity() {
        return city;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String display() {
        return "User: " + userName + "\nPin: " + pin + "\nCity: " + city;
    }

}

public class AccessGet_Set {
    public static void main(String[] args) {
        Getter_Setter ob = new Getter_Setter("Khushwant", 1234, "Jaipur");
        System.out.println(ob.display());
        ob.setCity("Surat");
        ob.setPin(7890);
        ob.setUserName("Amrit");
        System.out.println(ob.display());


    }
}
