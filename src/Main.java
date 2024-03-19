import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListContainer container = new LinkedListContainer();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Get element at index");
            System.out.println("4. Display container");
            System.out.println("5. Check if container is empty");
            System.out.println("6. Clear container");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int elementToAdd = scanner.nextInt();
                    container.add(elementToAdd);
                    System.out.println("Element added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the index of element to remove: ");
                    int indexToRemove = scanner.nextInt();
                    container.remove(indexToRemove);
                    System.out.println("Element removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of element to get: ");
                    int indexToGet = scanner.nextInt();
                    System.out.println("Element at index " + indexToGet + ": " + container.get(indexToGet));
                    break;
                case 4:
                    System.out.println("Container elements: " + container);
                    break;
                case 5:
                    System.out.println("Is container empty? " + container.isEmpty());
                    break;
                case 6:
                    container.clear();
                    System.out.println("Container cleared successfully.");
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from the menu.");
            }
        }
        scanner.close();
    }
}
