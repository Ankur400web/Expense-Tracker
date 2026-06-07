import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        //Load Previous Transactions
        FileHandler.loadTransactions(manager);
        int choice;

        do{
            System.out.println("===========Expense Tracker===========");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transactions");
            System.out.println("3. Search By Category");
            System.out.println("4. Delete Transaction");
            System.out.println("5. Show Summary");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Type (Income/Expense): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Amount");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    String date = LocalDate.now().toString();
                    Transaction transaction = new Transaction(id, type, amount, category, description, date);

                    manager.addTransaction(transaction);

                    //Save after every addition
                    FileHandler.saveTransactions(manager.getTransactions());
                    break;

                case 2:
                    manager.viewTransactions();
                    break;

                case 3:
                    System.out.print("Enter category: ");
                    String searchCategory = sc.nextLine();
                    manager.searchByCategory(searchCategory);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteID = sc.nextInt();

                    if (manager.deleteTransaction(deleteID)){
                        System.out.println("Transaction deleted successfully");
                        FileHandler.saveTransactions(manager.getTransactions());
                    }else {
                        System.out.println("Transaction not found");
                    }
                    break;

                case 5:
                    manager.showSummary();
                    break;

                case 6:
                    FileHandler.saveTransactions(manager.getTransactions());
                    System.out.println("Thank you for using Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice!=6);
            sc.close();
    }
}