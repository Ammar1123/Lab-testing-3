public class ATM {
    public float accountBalance = 0;
    public boolean authentic = false;
    public boolean valid_card = true;
    public boolean password_valid = true;

    public String enterCard() {
        if (valid_card) {
            return "Valid card";
        } else {
            return "Card not valid";
        }
    }

    public String enterPassword() {
        if (valid_card) {
            System.out.println("Enter Password");
            if (password_valid) {
                authentic = true;
                return "login Successful";
            } else {
                return "Wrong password";
            }
        } else {
            return "Please Enter card first";
        }
    }

    public String deposit(float money) {
        if (authentic) {
            if (money >= 50 && money <= 50000) {
                accountBalance += money;
                return "Deposit Successful";
            } else {
                return "Enter a valid amount";
            }
        } else {
            return "Not allowed";
        }
    }

    public String withdraw(float amount) {
        if (authentic) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                return "Withdraw Successfull";
            } else {
                return "Not enough balance";
            }
        } else {
            return "Not allowed";
        }
    }

    public String removeCard() {
        if (valid_card) {
            return "Card removed";
        } else {
            return "Not allowed";
        }
    }
}