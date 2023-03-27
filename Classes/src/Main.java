import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

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

        //if true program runs
        boolean run = true ;
        while(run) {

            System.out.println();

            //get user's option
            System.out.print("Enter the task you want to perform from the console menu: ");
            Scanner option = new Scanner(System.in);
            //Storing input value in option_in
            String option_in = option.next();
            //View All Fuel Queue

            if (option_in.equals("100") || option_in.equals("VFQ")){

                //All queues printed
                FuelQueue.getArray1();
                FuelQueue.getArray2();
                FuelQueue.getArray3();
                FuelQueue.getArray4();
                FuelQueue.getArray5();

            }

            else if (option_in.equals("101") || option_in.equals("VEQ")){
                //Empty Queues
                FuelQueue.emptyQueue();


            }

            else if (option_in.equals("102") || option_in.equals("ACQ")) {
                //Asking for user input to add to queue
                System.out.println();
                System.out.println("Enter the following details of the customer");
                System.out.print("Enter your First Name: ");
                Scanner fName = new Scanner(System.in);
                String fName_in = fName.next();

                System.out.print("Enter your Second Name: ");
                Scanner sName = new Scanner(System.in);
                String sName_in = sName.next();

                System.out.print("Enter your Vehicle number: ");
                Scanner vehicleNum = new Scanner(System.in);
                int vehicleNum_in = vehicleNum.nextInt();

                System.out.print("Enter number of litres you want to purchase: ");
                Scanner noOfLitres = new Scanner(System.in);
                int noOfLitres_in = noOfLitres.nextInt();

                //Object created and sent to passenger class
                passenger input = new passenger(fName_in, sName_in, vehicleNum_in, noOfLitres_in);

                // Objects are taken and sent to FuelQueue class
                FuelQueue fuelQueue1 = new FuelQueue(input.getInformation(), input.getNumOfLitres());

            }

            //Remove a customer
            else if (option_in.equals("103") || option_in.equals("RCQ")) {
                System.out.println();
                System.out.print("Enter the queue you want to remove the customer from (1 to 5) : ");
                Scanner remove = new Scanner(System.in);
                int remove_in = remove.nextInt();

                //Remove customer
                FuelQueue.removeCustomer(remove_in);


            }

            else if (option_in.equals("104") || option_in.equals("PCQ")) {
                System.out.print("Enter the queue number to remove the served customer (queue 1 to 5)\nEnter (1,2,3,4 or 5): ");
                Scanner served = new Scanner(System.in);
                int served_in = served.nextInt();
                //Remove Served
                FuelQueue.removeServed(served_in);

            }

            else if (option_in.equals("105") || option_in.equals("VCS")) {
                //Alphabetical sort
                FuelQueue.sort();
            }

            else if (option_in.equals("106") || option_in.equals("SPD")){
                //Store program data
                FuelQueue.storeData();
            }

            else if (option_in.equals("107") || option_in.equals("LPD")) {
                //Load program data
                FuelQueue.loadData();
            }

            else if (option_in.equals("108") || option_in.equals("STK")) {
                //The remaining fuel
                System.out.println("There is a remaining of "+ FuelQueue.remainingFuel() + " litres of fuel");
            }

            else if (option_in.equals("109") || option_in.equals("AFS")) {
                //Add fuel to fuel stock only when less than 6600
                if (FuelQueue.remainingFuel() < 6600){
                    System.out.print("Enter the amount of fuel you want to add: ");
                    Scanner addFuel = new Scanner(System.in);
                    int addFuel_in = addFuel.nextInt();
                    FuelQueue.addFuel(addFuel_in);
                }
                else{
                    System.out.println();
                    System.out.println("The fuel storage holds the maximum of 6600 litres now\nPlease add Fuel when fuel in the storage reduces ");
                }
            }

            else if (option_in.equals("110") || option_in.equals("IFQ")) {
                //Income of each queue
                FuelQueue.queueIncome();
            }

            else if (option_in.equals("999") || option_in.equals("EXT")){
                //Exits Program
                System.out.println("Program ends");
                run = false;
            }

            else {
                System.out.println("Enter the option correctly\nPlease Retry!");
            }
            //When fuel is low alert is given
            if (FuelQueue.remainingFuel() <= 500 ){
                System.out.println();
                System.out.println("ATTENTION!\nThe remaining fuel stock is less than 500 litres\nPlease add fuel by entering the options '109' or 'AFS'");
            }
        }

    }

}




