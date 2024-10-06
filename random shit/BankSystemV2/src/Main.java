import java.util.*;
import java.util.ArrayList;
class Main{
    static UI ui;
    public static void main(String[] args) {
        ui = new UI();
        Bank bank = new Bank("My Bank");
        bank.userDialog();
    }
}
