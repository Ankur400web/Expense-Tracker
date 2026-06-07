import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    public static void saveTransactions(ArrayList<Transaction> transactions){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.txt"))){
            for (Transaction t: transactions){
                writer.write(t.toString());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error saving transactions");
        }
    }

    public static void loadTransactions(ExpenseManager manager){
        File file  = new File("transactions.txt");
        if (!file.exists()){
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line=reader.readLine())!=null){
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String type = data[1];
                double amount = Double.parseDouble(data[2]);
                String category  = data[3];
                String description  = data[4];
                String date = data[5];

                Transaction transaction = new Transaction(id, type, amount, category, description, date);
                manager.loadTransaction(transaction);
            }
        }catch (IOException e){
            System.out.println("Failed loading transactions");
        }
    }
}