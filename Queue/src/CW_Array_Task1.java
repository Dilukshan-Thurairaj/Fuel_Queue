//importing java package
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Creating class name CW_Array_Task1
public class CW_Array_Task1 {

    //Main method
    public static void main(String[] args) throws IOException { //Ignores IOException

        // initializing variable
        //Setting start value to "true"
        boolean start = true;
        int loop_count1 = 0;
        int loop_count2 = 0;
        int loop_count3 = 0;
        int length1 = 0;
        int length2 = 0;
        int length3 = 0;
        int empty_count = 0;
        int empty_count2 = 0;
        int empty_count3 = 0;
        //6600 litres Fuel stock
        int fuelstock=6600;

        //Three Array created for 3 queues with each 6 slots
        String[] queue_1 = new String[6];
        String[] queue_2 = new String[6];
        String[] queue_3 = new String[6];

        //Console menu is displayed
        System.out.println("CONSOLE MENU: ");
        System.out.println("Enter '100 or VFQ' to view all Fuel queue ");
        System.out.println("Enter '101 or VEQ' to view all Empty Fuel queue ");
        System.out.println("Enter '102 or ACQ' to Add a customer to a queue ");
        System.out.println("Enter '103 or RCQ' to Remove a customer from a queue ");
        System.out.println("Enter '104 or PCQ' to Remove a served customer ");
        System.out.println("Enter '105 or VCS' to view Customers sorted in alphabetical order ");
        System.out.println("Enter '106 or SPD' to Store Program data into file ");
        System.out.println("Enter '107 or LPD' to Load Program data from file ");
        System.out.println("Enter '108 or STK' to view Remaining fuel stock ");
        System.out.println("Enter '109 or AFS' to Add fuel stock ");
        System.out.println("Enter '999 or EXT' to Exit Program ");

        //while start = true the program would keep on running
        while (start) {
            //Empty line
            System.out.println();
            //Asking for the user to input option from console menu
            System.out.print("Enter the task you want to perform from the console menu: ");
            Scanner option = new Scanner(System.in);
            //Storing input value in option_in
            String option_in = option.next();

            //View All Fuel Queue
            if (option_in.equals("100") || option_in.equals("VFQ")) {
                System.out.println("FUEL QUEUE 1: ");
                //for loop is used to run through the queue 1 array ( 0 to 5 )
                for (int c = 0; c < queue_1.length; c++) {
                    //Print all elements in the array
                    System.out.println(queue_1[c]);
                }
                //Empty line
                System.out.println();

                //Outputs Queue 2
                System.out.println("FUEL QUEUE 2: ");
                for (int c = 0; c < queue_2.length; c++) {
                    System.out.println(queue_2[c]);
                }
                System.out.println();

                //Outputs Queue 3
                System.out.println("FUEL QUEUE 3: ");
                for (int c = 0; c < queue_3.length; c++) {
                    System.out.println(queue_3[c]);
                }
            }
            //Next option to View Empty Queues
            else if (option_in.equals("101") || option_in.equals("VEQ")) {

                System.out.println("FUEL QUEUE 1: ");
                for (int c = 0; c < queue_1.length; c++) {

                    //If any slot in array is null then the below if statement is executed
                    if (queue_1[c] == null) {
                        empty_count++;
                        System.out.println("The " + (c + 1) + " slot in Queue 1 is EMPTY");
                    }
                }
                //Prints how many slots are empty
                System.out.println("A total of " + empty_count + " slots are EMPTY");
                System.out.println();

                //Empty slots in Queue 2 is printed
                System.out.println("FUEL QUEUE 2: ");
                for (int c = 0; c < queue_2.length; c++) {
                    if (queue_2[c] == null) {
                        empty_count2++;
                        System.out.println("The " + (c + 1) + " slot in Queue 2 is EMPTY");
                    }
                }
                System.out.println("A total of " + empty_count2 + " slots are EMPTY");
                System.out.println();

                //Empty slots in Queue 3 is printed
                System.out.println("FUEL QUEUE 3: ");
                for (int c = 0; c < queue_3.length; c++) {
                    if (queue_3[c] == null) {
                        empty_count3++;
                        System.out.println("The " + (c + 1) + " slot in Queue 3 is EMPTY");
                    }
                }
                System.out.println("A total of " + empty_count3 + " slots are EMPTY");
            }

            //Add customer to Fuel Queue
            else if (option_in.equals("102") || option_in.equals("ACQ")) {
                //Asking which Queue ( 1, 2 or 3 ) the user would like to add customer
                System.out.print("Which queue would you like to join (queue 1, queue 2 or queue 3)  \nEnter 1, 2 or 3: ");
                Scanner queue = new Scanner(System.in);
                String queue_in = queue.next();

                //Queue 1
                if (queue_in.equals("1")) {
                    //Length count is increased by 1 when above if statement is executed
                    length1++;
                    //When length count less than or equal to 6 below is executed
                    if (length1 <= 6) {
                        //Name of the customer is taken from user
                        System.out.print("Enter the customer name: ");
                        Scanner name = new Scanner(System.in);
                        String name_in = name.next();
                        //The count below is used as array element's index ( 0 to 5 ) to store the customer name in that index location in array
                        queue_1[loop_count1] = name_in;
                        //The count gets increased by 1 everytime the above if statement is executed (0 to 5)
                        loop_count1++;
                        //When each customer is added fuel stock (6600) is reduced by 10 litres
                        fuelstock=fuelstock-10;
                        System.out.println("Successfully customer added");
                    }
                    //When length count exceeds 6
                    //If any slot is null after the input of 6 elements in array and then if any customer is removed the else would be executed when trying to input
                    else {
                        for (int c = 0; c < queue_1.length; c++) {
                            if (queue_1[c] == null) {
                                System.out.print("Enter the customer name: ");
                                Scanner name = new Scanner(System.in);
                                String name_in = name.next();
                                queue_1[c] = name_in;
                                fuelstock=fuelstock-10;
                                System.out.println("Successfully customer added");
                            }
                        }
                        //If all slots in array has input name below gets printed
                        System.out.println("Fuel queue 1 is FULL");
                    }

                }
                //The same is executed if input is for Queue 2
                else if (queue_in.equals("2")) {
                    length2++;
                    if (length2 <= 6) {
                        System.out.print("Enter the customer name: ");
                        Scanner name = new Scanner(System.in);
                        String name_in = name.next();
                        queue_2[loop_count2] = name_in;
                        loop_count2++;
                        fuelstock=fuelstock-10;
                        System.out.println("Successfully customer added");
                    }
                    else {
                        for (int c = 0; c < queue_2.length; c++) {
                            if (queue_2[c] == null) {
                                System.out.print("Enter the customer name: ");
                                Scanner name = new Scanner(System.in);
                                String name_in = name.next();
                                queue_2[c] = name_in;
                                fuelstock=fuelstock-10;
                                System.out.println("Successfully customer added");
                            }
                        }
                        System.out.println("Fuel queue 2 is FULL");
                    }

                }
                //Queue 3
                else if (queue_in.equals("3")) {
                    length3++;
                    if (length3 <= 6) {
                        System.out.print("Enter the customer name: ");
                        Scanner name = new Scanner(System.in);
                        String name_in = name.next();
                        queue_3[loop_count3] = name_in;
                        loop_count3++;
                        fuelstock=fuelstock-10;
                        System.out.println("Successfully customer added");
                    }
                    else {
                        for (int c = 0; c < queue_3.length; c++) {
                            if (queue_3[c] == null) {
                                System.out.print("Enter the customer name: ");
                                Scanner name = new Scanner(System.in);
                                String name_in = name.next();
                                queue_3[c] = name_in;
                                fuelstock=fuelstock-10;
                                System.out.println("Successfully customer added");
                            }
                        }
                        System.out.println("Fuel queue 1 is FULL");
                    }
                } else {
                    System.out.println("ERROR!\nPlease enter 1, 2 or 3");
                }
            }
            //Remove customer from queue
            else if (option_in.equals("103") || option_in.equals("RCQ")) {

                //Asking for user input queue (1, 2 or 3) to remove the customer from
                System.out.print("Enter the queue from which you want to remove the customer (queue 1, queue 2 or queue 3)\nEnter 1, 2 or 3: ");
                Scanner remove = new Scanner(System.in);
                String remove_in = remove.next();
                //Queue 1
                if (remove_in.equals("1")) {
                    for (int c = 0; c < queue_1.length; c++) {
                        //Printing all elements oin queue
                        System.out.println((c + 1) + ". " + queue_1[c]);

                    }
                    //Asking the user to input the number in front of customer name printed to remove that slot
                    System.out.print("Enter the number in front of the customer name to remove (1 to 6): ");
                    Scanner element = new Scanner(System.in);
                    int element_in = element.nextInt();
                    //The input has to be within (1 to 6)
                    if (element_in <= 6) {
                        //The input is subtracted by 1 to print null in the array index (0 to 5)
                        queue_1[(element_in - 1)] = null;
                        System.out.println("Successfully removed");
                        //Added back by 10 because a customer is removed from queue without receiving 10 litre fuel
                        fuelstock=fuelstock+10;
                    }
                    //When input is greater than 6 below is printed
                    else {
                        System.out.println("ERROR RETRY!\nEnter a number from 1 to 6");
                    }

                }
                //The same above steps are done to Queue 2
                else if (remove_in.equals("2")) {
                    for (int c = 0; c < queue_2.length; c++) {
                        System.out.println((c + 1) + ". " + queue_2[c]);
                    }
                    System.out.print("Enter the number in front of the customer name to remove (1 to 6): ");
                    Scanner element = new Scanner(System.in);
                    int element_in = element.nextInt();
                    if (element_in <= 6) {
                        queue_2[(element_in - 1)] = null;
                        System.out.println("Successfully removed");
                        fuelstock=fuelstock+10;
                    }
                    else {
                        System.out.println("ERROR RETRY!\nEnter a number from 1 to 6");
                    }

                }
                //Queue 3
                else if (remove_in.equals("3")) {
                    for (int c = 0; c < queue_3.length; c++) {
                        System.out.println((c + 1) + ". " + queue_3[c]);
                    }
                    System.out.print("Enter the number in front of the customer name to remove (1 to 6): ");
                    Scanner element = new Scanner(System.in);
                    int element_in = element.nextInt();
                    if (element_in <= 6) {
                        queue_3[(element_in - 1)] = null;
                        System.out.println("Successfully removed");
                        fuelstock=fuelstock+10;
                    } else {
                        System.out.println("ERROR RETRY!\nEnter a number from 1 to 6");
                    }

                }
                // If user enters something different other than (1, 2 or 3) the below is printed
                else {
                    System.out.println("ERROR!,allowed to enter 1,2 or 3\nPlease retry");
                }

            }
            //Removed served customer
            else if (option_in.equals("104") || option_in.equals("PCQ")) {
                //Asking for the queue number
                System.out.print("Enter the queue number to remove the served customer (queue 1, queue 2 or queue 3)\nEnter (1 , 2 or 3):");
                Scanner served = new Scanner(System.in);
                int served_in = served.nextInt();
                if (served_in == 1) {
                    for (int c = 0; c < queue_1.length; c++) {
                        // null slots in array is omitted
                        if (queue_1[c] != null) {
                            //Prints the name who received fuel
                            System.out.println((c + 1) + ". " + queue_1[c] + " received fuel");

                        }
                    }
                    //Allows user to input the number in front of customer name to change it to null so that the customer is removed
                    System.out.print("Enter the number in front of the customer name(received fuel) to remove (1 to 6): ");
                    Scanner fuel_rec1 = new Scanner(System.in);
                    int fuel_rec_in1 = fuel_rec1.nextInt();
                    queue_1[(fuel_rec_in1 - 1)] = null;
                    System.out.println("Successfully served and removed");

                }
                //Same for Queue 2
                else if (served_in == 2) {
                    for (int c = 0; c < queue_2.length; c++) {
                        if (queue_2[c] != null) {
                            System.out.println((c + 1) + ". " + queue_2[c] + " received fuel");
                        }
                    }
                    System.out.print("Enter the number in front of the customer name(received fuel) to remove (1 to 6): ");
                    Scanner fuel_rec2 = new Scanner(System.in);
                    int fuel_rec_in2 = fuel_rec2.nextInt();
                    queue_2[(fuel_rec_in2 - 1)] = null;
                    System.out.println("Successfully served and removed");

                }
                //Queue 3
                else if (served_in == 3) {
                    for (int c = 0; c < queue_3.length; c++) {
                        if (queue_3[c] != null) {
                            System.out.println((c + 1) + ". " + queue_1[c] + " received fuel");
                        }
                    }

                    System.out.print("Enter the number in front of the customer name(received fuel) to remove (1 to 6): ");
                    Scanner fuel_rec3 = new Scanner(System.in);
                    int fuel_rec_in3 = fuel_rec3.nextInt();
                    queue_3[(fuel_rec_in3 - 1)] = null;
                    System.out.println("Successfully served and removed");
                }
                // If user enters something different other than (1, 2 or 3) the below is printed
                else {
                    System.out.println("ERROR!,allowed to enter 1,2 or 3\nPlease retry");
                }
            }
            //Alphabetical sorting the elements in the array
            else if (option_in.equals("105") || option_in.equals("VCS")) {
                //Asks user for which queue user would like to sort
                System.out.print("Enter the queue number to view the sorted queue (queue 1, queue 2 or queue 3)\nEnter 1, 2 0r 3: ");
                Scanner sort = new Scanner(System.in);
                int sort_in = sort.nextInt();
                //Bubble sort is used
                if (sort_in == 1) {
                    for (int c = 0; c < queue_1.length; c++) {
                        for (int i = c + 1; i < queue_1.length; i++) {
                            if (queue_1[c] != null && queue_1[i] != null) {
                                if (queue_1[c].compareToIgnoreCase(queue_1[i]) > 0) {
                                    //temporary variable 'temp' is created to swap
                                    String temp = queue_1[c];
                                    queue_1[c] = queue_1[i];
                                    queue_1[i] = temp;
                                }
                            }
                        }
                    }
                    //Prints the elements in array after sort
                    System.out.println("SORTED FUEL QUEUE 1: ");
                    for (int c = 0; c < queue_1.length; c++) {
                        System.out.println(queue_1[c]);
                    }
                }
                //Queue 2 Bubble sort
                else if (sort_in == 2) {
                    for (int c = 0; c < queue_2.length; c++) {
                        for (int i = c + 1; i < queue_2.length; i++) {
                            if (queue_2[c] != null && queue_2[i] != null) {
                                if (queue_2[c].compareToIgnoreCase(queue_2[i]) > 0) {
                                    //temporary variable 'temp' is created to swap
                                    String temp = queue_2[c];
                                    queue_2[c] = queue_2[i];
                                    queue_2[i] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("SORTED FUEL QUEUE 2: ");
                    for (int c = 0; c < queue_2.length; c++) {
                        System.out.println(queue_2[c]);
                    }
                }
                //Queue 3 Bubble sort
                else if (sort_in == 3) {
                    for (int c = 0; c < queue_3.length; c++) {
                        for (int i = c + 1; i < queue_3.length; i++) {
                            if (queue_3[c] != null && queue_3[i] != null) {
                                if (queue_3[c].compareToIgnoreCase(queue_3[i]) > 0) {
                                    //temporary variable 'temp' is created to swap
                                    String temp = queue_3[c];
                                    queue_3[c] = queue_3[i];
                                    queue_3[i] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("SORTED FUEL QUEUE 3: ");
                    for (int c = 0; c < queue_3.length; c++) {
                        System.out.println(queue_3[c]);
                    }
                }
                // If user enters something different other than (1, 2 or 3) the below is printed
                else {
                    System.out.println("ERROR!\nPlease enter 1, 2 or 3");
                }

            }
            //Store Program data to a file
            else if (option_in.equals("106") || option_in.equals("SPD")) {
                //Calling Method by passing all 3 arrays as value for the parameters
                FileStorage(queue_1, queue_2, queue_3);

            }
            //Load Program data from file
            else if (option_in.equals("107") || option_in.equals("LPD")) {
                //Calling method
                FileReader();

            }
            //View remaining Fuel
            else if (option_in.equals("108") || option_in.equals("STK")) {
                //Calling Method by passing variable fuelstock
                Fuel_remaining(fuelstock);

            }
            //Add fuel stock
            else if (option_in.equals("109") || option_in.equals("AFS")) {

                //Asking the user to enter the number of litres to add to the fuelstock variable
                System.out.print("Enter the number of litres you want to add to the Fuel Center: ");
                Scanner addfuel = new Scanner(System.in);
                int addfuel_in =addfuel.nextInt();
                //Can add fuel if fuel stock in fuel center is less than 6600
                if (fuelstock<6600){
                    fuelstock = fuelstock + addfuel_in;
                    System.out.println("Successfully Added Fuel");
                    //Fuel stock cannot be more than 6600
                    if (fuelstock>6600){
                        int excess=fuelstock-6600;
                        System.out.println("You added more than the Fuel center storage capacity\nSo the "+excess+" litres of excess is ignored and fuel stock is added only up to 6600 litres");
                        fuelstock=6600;
                    }
                }
                //When user tries to enter fuel when fuel stock is 6600 the below is printed
                else{
                    System.out.println("ERROR!\nAdded Fuel exceeds Fuel Center storage (6600 litres)");
                }

            }
            //Exit Program
            else if (option_in.equals("999") || option_in.equals("EXT")) {
                System.out.println("PROGRAM ENDS");
                //The boolean variable start turns false making the program loop to end so the program stops
                start = false;
            }
            //If user inputs any other value other than the option in the console menu the below is printed
            else{
                System.out.println("ERROR!!!\nPlease enter the option from the Console Menu correctly");
            }
            //When fuel stock reaches 500 or goes below the below is printed
            if (fuelstock<=500){
                System.out.println("WARNING!!!\nPlease add fuel to the Fuel Center as the fuel stock is less than 500 litres");
            }

        }

    }

    //Method used with parameters, Reference: https://youtu.be/lHFlAYaNfdo
    public static void FileStorage(String[] queue1, String[] queue2, String[] queue3) throws IOException { //ignores IOException
        //Creating text file named FUEL QUEUE
        FileWriter file = new FileWriter("C:\\Users\\Dilukshan\\Desktop\\FUEL QUEUE.txt");
        file.write("FUEL QUEUE 1:\n");
        for (int c = 0; c < queue1.length; c++) {
            if (queue1[c] != null) {
                //Writing in file
                file.write((c + 1) + ". " + queue1[c] + '\n');
            }
            else {
                file.write((c + 1) + ". NO ONE\n");
            }
        }
        //new line in file written
        file.write("\n");

        //Writing Queue 2
        file.write("FUEL QUEUE 2:\n");
        for (int c = 0; c < queue2.length; c++) {
            if (queue2[c] != null) {
                file.write((c + 1) + ". " + queue2[c] + '\n');
            } else {
                file.write((c + 1) + ". NO ONE\n");
            }

        }
        file.write("\n");

        //Writing Queue 3
        file.write("FUEL QUEUE 3:\n");
        for (int c = 0; c < queue3.length; c++) {
            if (queue3[c] != null) {
                file.write((c + 1) + ". " + queue3[c] + '\n');
            } else {
                file.write((c + 1) + ". NO ONE\n");
            }
        }
        //Closing the file
        file.close();
    }


    //Method used to load data from file, Reference: https://youtu.be/lHFlAYaNfdo
    public static void FileReader() throws FileNotFoundException { //ignores FileNotFoundException
        //File location
        File file = new File("C:\\Users\\Dilukshan\\Desktop\\FUEL QUEUE.txt");
        //Reading each line from file
        Scanner read = new Scanner(file);

        //To read all lines in file
        while (read.hasNextLine()) {
            //Prints the data from file
            System.out.println(read.nextLine());
        }
    }

    //Method to print the remaining fuel
    public static void Fuel_remaining(int fuel){
            System.out.println("The remaining fuel stock is "+ fuel+" litre");
        }
}




























