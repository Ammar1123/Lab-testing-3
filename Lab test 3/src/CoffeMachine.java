public class CoffeMachine {

    public boolean power = false;
    public boolean light = false;
    public boolean busyState = false;
    public float money;
    private final float price = 12;
    public int coffeeAmount;
    public String IncrementMoney(float money) {
        if (power) {
            this.money = money;
            return "money incremented Successfully";
        } else {
            return "Please turn on the machine";
        }
    }
    public String openMachine() {
        if (!power) {
            power = true;
            light = true;
            return "Power on and Lights on";
        } else {
            return "Error!";
        }
    }
    public String closeMachine() {
        if (power) {
            light = false;
            power = false;
            return "Lights off and Power off ";
        } else {
            return "Error!";
        }
    }
    public String makeCoffee(int coffeeAmount) {
        if (power) {
            int i = 0;
            if (money >= price) {
                while (money >= price && coffeeAmount > 0) {
                    money -= price;
                    busyState = true;
                    coffeeAmount--;
                    i++;
                }
            }
            else{
                return "Insufficient balance";
            }
            busyState = false;
            return i + "Coffee done Successfully";
        } else {
            return "Please turn on the machine";
        }
    }
}

