import java.util.ArrayList;
public class Bank {
        private String name;
        private ArrayList<Customer> customers;
        private ArrayList<String> listOfActions;
        private Customer currentCustomer;

        public Bank(String name){
            this.name = name;
            customers = new ArrayList<>();
            listOfActions = new ArrayList<>();

            listOfActions.add("Opret Kunde");
            listOfActions.add("Se kontooversigt");
            listOfActions.add("Se kontoposteringer");
            listOfActions.add("Indsæt/hæv penge");
            listOfActions.add("Opret ny konto");
            listOfActions.add("Vælg eksisterende kunde");
            listOfActions.add("Afslut");
    }
    private void createCustomer(String name){
            Customer customer = new Customer(name);
            currentCustomer = customer;
            customers.add(customer);
    }
    public void userDialog(){
            ui.displayMsg("Welcome to " + name);
            int action = 0;
            while (action != 7){
                action = ui.promptChoice("Choose an action:", listOfActions);
                switch (action){
                    case 1:
                        String customerName = ui.promptText("Enter customer name:");
                        createCustomer(customerName);
                        break;
                    case 2:
                        ui.displayMsg(customers.toString());
                        break;
                }
            }
    }
}
