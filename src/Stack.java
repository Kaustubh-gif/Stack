
    import java.util.Scanner;

    class ArrayOperations {
        private int[] array;
        private int top; // Keeps track of the last inserted element

        // Constructor to initialize the array
        public ArrayOperations(int size) {
            array = new int[size];
            top = -1; // Indicates the array is empty initially
        }

        // Method to check if the array is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Method to insert an element into the array
        public void insert(int element) {
            if (top == array.length - 1) {
                System.out.println("Array is full! Cannot insert more elements.");
            } else {
                array[++top] = element;
                System.out.println(element + " inserted.");
            }
        }

        // Method to remove the last element (pop method)
        public void pop() {
            if (isEmpty()) {
                System.out.println("Array is empty! Cannot pop.");
            } else {
                System.out.println("Popped element: " + array[top--]);
            }
        }

        // Method to display all elements in the array
        public void display() {
            if (isEmpty()) {
                System.out.println("Array is empty!");
            } else {
                System.out.print("Array elements: ");
                for (int i = 0; i <= top; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }

        // Main method to test the functionality
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create an array with a fixed size
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            ArrayOperations arrayOps = new ArrayOperations(size);

            // Menu-driven program
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Check if empty");
                System.out.println("2. Insert element");
                System.out.println("3. Pop element");
                System.out.println("4. Display elements");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Is array empty? " + arrayOps.isEmpty());
                        break;
                    case 2:
                        System.out.print("Enter element to insert: ");
                        int element = scanner.nextInt();
                        arrayOps.insert(element);
                        break;
                    case 3:
                        arrayOps.pop();
                        break;
                    case 4:
                        arrayOps.display();
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } while (choice != 5);

            scanner.close();
        }

    }


