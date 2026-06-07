import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Transaction> transactions;

    public ExpenseManager() {
        transactions = new ArrayList<>();

    }


    //Add Transaction
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        System.out.println("Transaction added successfully");
    }

    //View all transactions
    public void viewTransactions(){
        if (transactions.isEmpty()){
            System.out.println("No transactions found");
            return;
        }
        for (Transaction t: transactions){
            System.out.println("---------------------------------");
            System.out.println("ID: " + t.getId());
            System.out.println("Type: " + t.getType());
            System.out.println("Amount: " + t.getAmount());
            System.out.println("Category: " + t.getCategory());
            System.out.println("Description: " + t.getDescription());
            System.out.println("Date: " + t.getDate());
        }
    }

    //Search by category
    public void searchByCategory(String category){
        boolean found = false;

        for (Transaction t: transactions){
            if (t.getCategory().equalsIgnoreCase(category)){
                System.out.println("---------------------------------");
                System.out.println("ID: " + t.getId());
                System.out.println("Type: " + t.getType());
                System.out.println("Amount: " + t.getAmount());
                System.out.println("Category: " + t.getCategory());
                System.out.println("Description: " + t.getDescription());
                System.out.println("Date: " + t.getDate());
                found = true;
            }

        }
        if (!found) {
            System.out.println("No transaction found");
        }
    }

    //Delete transaction

    public boolean deleteTransaction(int id){
        for (int i=0; i<transactions.size(); i++){
            if (transactions.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }

    //Monthly Summary
    public void showSummary(){
        double income = 0;
        double expense = 0;

        for (Transaction t: transactions){
            if (t.getType().equalsIgnoreCase("Income")){
                income += t.getAmount();
            }else{
                expense+=t.getAmount();
            }
        }
        System.out.println("\n----------Summary----------");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expense: " + expense);
        System.out.println("Balance: " + (income-expense));
    }

    //Getter (needed for file handling)
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }

  /*  public void display() {
        System.out.println("-----------------------------");
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Date: " + date);
    }*/

    public void loadTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

}