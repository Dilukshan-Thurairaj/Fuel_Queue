import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FuelQueue {
    // Array of object
    private static String[] fuelQueue1 = new String[6];
    private static String[] fuelQueue2 = new String[6];
    private static String[] fuelQueue3 = new String[6];
    private static String[] fuelQueue4 = new String[6];
    private static String[] fuelQueue5 = new String[6];

    // Sort object Array
    private static String[] sortQueue1 = new String[6];
    private static String[] sortQueue2  = new String[6];
    private static String[] sortQueue3  = new String[6];
    private static String[] sortQueue4  = new String[6];
    private static String[] sortQueue5 = new String[6];

    //Storing number of litres object
    private static int[] noOfLitres1= new int [6];
    private static int[] noOfLitres2= new int [6];
    private static int[] noOfLitres3= new int [6];
    private static int[] noOfLitres4= new int [6];
    private static int[] noOfLitres5= new int [6];

    //Waiting Queue
    private static String[] waitingQueue= new String[6];

    //Waiting Queue number of litres
    private static int[] waitingLitres = new int[6];

    //Waiting Queue count
    private static int waitAddCount=0;


    // initialize counts
    private static int count1 = 0;
    private static int count2 = 0;
    private static int count3 = 0;
    private static int count4 = 0;
    private static int count5 = 0;
    private static int fuelQueue_count = 1;
    private static int passengerCount = 0;

    private static int removeCount1=0;
    private static int removeCount2=0;
    private static int removeCount3=0;
    private static int removeCount4=0;
    private static int removeCount5=0;

    private static int fuelstock=6600;

    private static int queueIncome1=0;
    private static int queueIncome2=0;
    private static int queueIncome3=0;
    private static int queueIncome4=0;
    private static int queueIncome5=0;







    //Constructor
    public FuelQueue(String entry, int litres) {

        //To find if any object in array is removed and made nul
        if ((removeCount1 > 0 && removeCount1 < 6) || (removeCount2 > 0 && removeCount2 < 6) || (removeCount3 > 0 && removeCount3 < 6) || (removeCount4 > 0 && removeCount4 < 6) || (removeCount5 > 0 && removeCount5 < 6)){
            //Adds to the Minimum length queue
            if ( ((fuelQueue1.length-removeCount1) <= (fuelQueue2.length-removeCount2)) && ((fuelQueue1.length-removeCount1) <= (fuelQueue3.length-removeCount3)) && ((fuelQueue1.length-removeCount1) <= (fuelQueue4.length-removeCount4)) && ((fuelQueue1.length-removeCount1) <= (fuelQueue5.length-removeCount5)) )
            {
                for (int c = 0; c < fuelQueue1.length; c++) {
                    if (fuelQueue1[c] == null && noOfLitres1[c] == 0) {
                        fuelQueue1[c] = entry;
                        noOfLitres1[c] = litres;
                        removeCount1--;
                        fuelstock= fuelstock - litres;
                        queueIncome1 = queueIncome1 + (litres*430);
                        System.out.println("Added to Queue 1 successfully");
                        break;
                    }
                }
            }

            else if ( ((fuelQueue2.length-removeCount2) <= (fuelQueue1.length-removeCount1)) && ((fuelQueue2.length-removeCount2) <= (fuelQueue3.length-removeCount3)) && ((fuelQueue2.length-removeCount2) <= (fuelQueue4.length-removeCount4)) && ((fuelQueue2.length-removeCount2) <= (fuelQueue5.length-removeCount5)) )
            {
                for (int c = 0; c < fuelQueue2.length; c++) {
                    if (fuelQueue2[c] == null && noOfLitres2[c] == 0) {
                        fuelQueue2[c] = entry;
                        noOfLitres2[c] = litres;
                        removeCount2--;
                        fuelstock= fuelstock - litres;
                        queueIncome2 = queueIncome2 + (litres*430);
                        System.out.println("Added to Queue 2 successfully");
                        break;
                    }
                }
            }
            else if ( ((fuelQueue3.length-removeCount3) <= (fuelQueue1.length-removeCount1)) && ((fuelQueue3.length-removeCount3) <= (fuelQueue2.length-removeCount2)) && ((fuelQueue3.length-removeCount3) <= (fuelQueue4.length-removeCount4)) && ((fuelQueue3.length-removeCount3) <= (fuelQueue5.length-removeCount5)) )
            {
                for (int c = 0; c < fuelQueue3.length; c++) {
                    if (fuelQueue3[c] == null && noOfLitres3[c] == 0) {
                        fuelQueue3[c] = entry;
                        noOfLitres3[c] = litres;
                        removeCount3--;
                        fuelstock= fuelstock - litres;
                        queueIncome3 = queueIncome3 + (litres*430);
                        System.out.println("Added to Queue 3 successfully");
                        break;
                    }
                }
            }
            else if ( ((fuelQueue4.length-removeCount4) <= (fuelQueue1.length-removeCount1)) && ((fuelQueue4.length-removeCount4) <= (fuelQueue2.length-removeCount2)) && ((fuelQueue4.length-removeCount4) <= (fuelQueue3.length-removeCount3)) && ((fuelQueue4.length-removeCount4) <= (fuelQueue5.length-removeCount5)) )
            {
                for (int c = 0; c < fuelQueue4.length; c++) {
                    if (fuelQueue4[c] == null && noOfLitres4[c] == 0) {
                        fuelQueue4[c] = entry;
                        noOfLitres4[c] = litres;
                        removeCount4--;
                        fuelstock= fuelstock - litres;
                        queueIncome4 = queueIncome4 + (litres*430);
                        System.out.println("Added to Queue 4 successfully");
                        break;
                    }
                }
            }

            else if (( (fuelQueue5.length-removeCount5) <= (fuelQueue1.length-removeCount1)) && ((fuelQueue5.length-removeCount5) <= (fuelQueue2.length-removeCount2)) && ((fuelQueue5.length-removeCount5) <= (fuelQueue3.length-removeCount3)) && ((fuelQueue5.length-removeCount5) <= (fuelQueue4.length-removeCount4)) )
            {
                for (int c = 0; c < fuelQueue5.length; c++) {
                    if (fuelQueue5[c] == null && noOfLitres5[c] == 0) {
                        fuelQueue5[c] = entry;
                        noOfLitres5[c] = litres;
                        removeCount5--;
                        fuelstock= fuelstock - litres;
                        queueIncome5 = queueIncome5 + (litres*430);
                        System.out.println("Added to Queue 5 successfully");
                        break;
                    }
                }
            }
        }
        // Adding the objects to the five arrays
        else if (passengerCount < 30) {
            if (fuelQueue_count == 1) {
                fuelQueue1[count1] = entry;
                noOfLitres1[count1]=litres;
                fuelstock= fuelstock - litres;
                queueIncome1 = queueIncome1 + (litres*430);
                count1++;
                fuelQueue_count++;
                System.out.println("Added to Queue 1 successfully");
            }
            else if (fuelQueue_count == 2) {
                fuelQueue2[count2] = entry;
                noOfLitres2[count2]=litres;
                fuelstock= fuelstock - litres;
                queueIncome2 = queueIncome2 + (litres*430);
                count2++;
                fuelQueue_count++;
                System.out.println("Added to Queue 2 successfully");
            }
            else if (fuelQueue_count == 3) {
                fuelQueue3[count3] = entry;
                noOfLitres3[count3]=litres;
                fuelstock= fuelstock - litres;
                queueIncome3 = queueIncome3 + (litres*430);
                count3++;
                fuelQueue_count++;
                System.out.println("Added to Queue 3 successfully");
            }
            else if (fuelQueue_count == 4) {
                fuelQueue4[count4] = entry;
                noOfLitres4[count4]=litres;
                fuelstock= fuelstock - litres;
                queueIncome4 = queueIncome4 + (litres*430);
                count4++;
                fuelQueue_count++;
                System.out.println("Added to Queue 4 successfully");
            }
            else if (fuelQueue_count == 5) {
                fuelQueue5[count5] = entry;
                noOfLitres5[count5]=litres;
                fuelstock= fuelstock - litres;
                queueIncome5 = queueIncome5 + (litres*430);
                count5++;
                fuelQueue_count = 1;
                System.out.println("Added to Queue 5 successfully");
            }
            passengerCount++;
        }
        // Waiting queue when all five queues are full
        else if (passengerCount < 36){
            for (int c =0; c < waitingQueue.length; c++) {
                if( waitingQueue[c] == null) {
                    waitingQueue[c] = entry;
                    waitingLitres[c] = litres;
                    System.out.println();
                    System.out.println("You are now added to the waiting queue\nAll the five fuel queues are full");
                    passengerCount++;
                    break;
                }
            }
        }

        else {
            System.out.println();
            System.out.println("All the five queues and the waiting queue is full\nPlease wait till try again later");
        }
    }


    //Getter to print all arrays
    public static void getArray1() {
        System.out.println("Fuel Queue 1");
        for (int c = 0; c < fuelQueue1.length; c++) {
            System.out.println(fuelQueue1[c]);
        }
    }

    public static void getArray2() {
        System.out.println("Fuel Queue 2");
        for (int c = 0; c < fuelQueue2.length; c++) {
            System.out.println(fuelQueue2[c]);
        }
    }

    public static void getArray3() {
        System.out.println("Fuel Queue 3");
        for (int c = 0; c < fuelQueue3.length; c++) {
            System.out.println(fuelQueue3[c]);
        }
    }

    public static void getArray4() {
        System.out.println("Fuel Queue 4");
        for (int c = 0; c < fuelQueue4.length; c++) {
            System.out.println(fuelQueue4[c]);
        }
    }

    public static void getArray5() {
        System.out.println("Fuel Queue 5");
        for (int c = 0; c < fuelQueue5.length; c++) {
            System.out.println(fuelQueue5[c]);
        }
    }

    //Getter to get the empty slots in queue to be printed
    public static void emptyQueue() {
        System.out.println("Fuel Queue 1");
        for (int c = 0; c < fuelQueue1.length; c++) {
            if (fuelQueue1[c] == null) {
                System.out.println("The" + " " + (c + 1) + " " + "slot is Empty in Queue 1");
            }
        }
        System.out.println("Fuel Queue 2");
        for (int c = 0; c < fuelQueue2.length; c++) {
            if (fuelQueue2[c] == null) {
                System.out.println("The" + " " + (c + 1) + " " + "slot is Empty in Queue 2");
            }
        }
        System.out.println("Fuel Queue 3");
        for (int c = 0; c < fuelQueue3.length; c++) {
            if (fuelQueue3[c] == null) {
                System.out.println("The" + " " + (c + 1) + " " + "slot is Empty in Queue 3");
            }
        }
        System.out.println("Fuel Queue 4");
        for (int c = 0; c < fuelQueue4.length; c++) {
            if (fuelQueue4[c] == null) {
                System.out.println("The" + " " + (c + 1) + " " + "slot is Empty in Queue 4");
            }
        }
        System.out.println("Fuel Queue 5");
        for (int c = 0; c < fuelQueue5.length; c++) {
            if (fuelQueue5[c] == null) {
                System.out.println("The" + " " + (c + 1) + " " + "slot is Empty in Queue 5");
            }
        }

    }

    //Remove an object from the array
    public static void removeCustomer(int remove) {
        if (remove == 1){
            System.out.println("Fuel Queue 1");
             for ( int c=0; c<fuelQueue1.length; c++) {
                 System.out.println((c+1) + " slot holds " + fuelQueue1[c]);
             }
             System.out.println();
             System.out.print("Enter the slot number (1 to 6) you want to remove from queue: ");
             Scanner slot = new Scanner(System.in);
             int slot_in = slot.nextInt();


             if ((slot_in >= 1 && slot_in <= 6) && (fuelQueue1[(slot_in-1)] != null)) {
                 fuelQueue1[(slot_in - 1)] = null;
                 fuelstock=fuelstock+(noOfLitres1[slot_in-1]);
                 queueIncome1 = queueIncome1 - (noOfLitres1[slot_in-1]*430);
                 noOfLitres1[slot_in-1]= 0;
                 removeCount1++;
                 System.out.println("Successfully removed");
             }
             else{
                 System.out.println("ERROR!\nEnter slot (1 to 6)\nElse the slot which your trying to remove can be empty");
             }
        }
        else if (remove == 2){
            System.out.println("Fuel Queue 2");
            for ( int c=0; c<fuelQueue2.length; c++) {
                System.out.println((c+1) + " slot holds " + fuelQueue2[c]);
            }
            System.out.println();
            System.out.print("Enter the slot number (1 to 6) you want to remove from queue: ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();

            if ((slot_in >= 1 && slot_in <= 6) && (fuelQueue2[(slot_in-1)] != null)) {
                fuelQueue2[(slot_in - 1)] = null;
                fuelstock=fuelstock+(noOfLitres2[slot_in-1]);
                queueIncome2 = queueIncome2 - (noOfLitres2[slot_in-1]*430);
                noOfLitres2[slot_in-1]= 0;
                removeCount2++;
                System.out.println("Successfully removed");
            }
            else{
                System.out.println("ERROR!\nEnter slot (1 to 6)\nElse the slot which your trying to remove can be empty");
            }
        }
        else if (remove == 3){
            System.out.println("Fuel Queue 3");
            for ( int c=0; c<fuelQueue3.length; c++) {
                System.out.println((c+1) + " slot holds " + fuelQueue3[c]);
            }
            System.out.println();
            System.out.print("Enter the slot number (1 to 6) you want to remove from queue: ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();

            if ((slot_in >= 1 && slot_in <= 6) && (fuelQueue3[(slot_in-1)] != null)) {
                fuelQueue3[(slot_in - 1)] = null;
                fuelstock=fuelstock+(noOfLitres3[slot_in-1]);
                queueIncome3 = queueIncome3 - (noOfLitres3[slot_in-1]*430);
                noOfLitres3[slot_in-1]= 0;
                removeCount3++;
                System.out.println("Successfully removed");
            }
            else{
                System.out.println("ERROR!\nEnter slot (1 to 6)\nElse the slot which your trying to remove can be empty");
            }
        }
        else if (remove == 4){
            System.out.println("Fuel Queue 4");
            for ( int c=0; c<fuelQueue4.length; c++) {
                System.out.println((c+1) + " slot holds " + fuelQueue4[c]);
            }
            System.out.println();
            System.out.print("Enter the slot number (1 to 6) you want to remove from queue: ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();

            if ((slot_in >= 1 && slot_in <= 6) && (fuelQueue4[(slot_in-1)] != null)) {
                fuelQueue4[(slot_in - 1)] = null;
                fuelstock=fuelstock+(noOfLitres4[slot_in-1]);
                queueIncome4 = queueIncome4 - (noOfLitres4[slot_in-1]*430);
                noOfLitres4[slot_in-1]= 0;
                removeCount4++;
                System.out.println("Successfully removed");
            }
            else{
                System.out.println("ERROR!\nEnter slot (1 to 6)\nElse the slot which your trying to remove can be empty");
            }
        }
        else if (remove == 5){
            System.out.println("Fuel Queue 5");
            for ( int c=0; c<fuelQueue5.length; c++) {
                System.out.println((c+1) + " slot holds " + fuelQueue5[c]);
            }
            System.out.println();
            System.out.print("Enter the slot number (1 to 6) you want to remove from queue: ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();

            if ((slot_in >= 1 && slot_in <= 6) && (fuelQueue5[(slot_in-1)] != null)) {
                fuelQueue5[(slot_in - 1)] = null;
                fuelstock=fuelstock+(noOfLitres5[slot_in-1]);
                queueIncome5 = queueIncome5 - (noOfLitres5[slot_in-1]*430);
                noOfLitres5[slot_in-1]= 0;
                removeCount5++;
                System.out.println("Successfully removed");
            }
            else{
                System.out.println("ERROR!\nEnter slot (1 to 6)\nElse the slot which your trying to remove can be empty");
            }
        }
        else {
                System.out.println("There are only 5 (1 to 5) queues!\nPlease Retry");
        }

    }

    //Removes the served objects from the array
    public static void  removeServed(int served) {
        if (served == 1) {
            System.out.println();
            for (int c = 0; c < fuelQueue1.length; c++) {
                // null slots in array is omitted
                if (fuelQueue1[c] != null) {
                    //Prints the name who received fuel
                    System.out.println((c + 1) + " slot " + fuelQueue1[c] + " received fuel");

                }
            }
            System.out.println();
            //Allows user to input the number in front of customer name to change it to null so that the customer is removed
            System.out.print("Enter the number of the slot in front of the customer name(received fuel) to remove (1 to 6): ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();
            if (fuelQueue1[slot_in - 1] != null) {
                fuelQueue1[(slot_in - 1)] = null;

                //Waiting queue to add customer when one is removed and same is done for queue 1 to 5
                if (waitAddCount < 6) {
                    if (waitAddCount < waitingQueue.length) {
                        if (waitingQueue[waitAddCount] != null) {
                            fuelQueue1[slot_in - 1] = waitingQueue[waitAddCount];
                            noOfLitres1[slot_in - 1] = 0;
                            noOfLitres1[slot_in-1] = waitingLitres[waitAddCount];
                            System.out.println("Successfully removed and added a customer from the waiting queue to the slot");
                            waitingQueue[waitAddCount] = null;
                            waitAddCount++;
                            passengerCount--;
                        } else {
                            removeCount1++;
                            System.out.println("Successfully removed");
                        }
                    }
                }
                else {
                    removeCount1++;
                    System.out.println("Successfully removed");
                    waitAddCount = 0;
                }
            } else {
                System.out.println("ERROR!\nEnter the number in front of the customer name (1 to 6)");
            }
        }

        else if (served == 2) {
            System.out.println();
            for (int c = 0; c < fuelQueue2.length; c++) {
                // null slots in array is omitted
                if (fuelQueue2[c] != null) {
                    //Prints the name who received fuel
                    System.out.println((c + 1) + " slot " + fuelQueue2[c] + " received fuel");

                }
            }
            System.out.println();
            //Allows user to input the number in front of customer name to change it to null so that the customer is removed
            System.out.print("Enter the number of the slot in front of the customer name(received fuel) to remove (1 to 6): ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();
            if (fuelQueue2[slot_in - 1] != null) {
                fuelQueue2[(slot_in - 1)] = null;

                //waiting queue
                if (waitAddCount < 6) {
                    if (waitAddCount < waitingQueue.length) {
                        if (waitingQueue[waitAddCount] != null) {
                            fuelQueue2[slot_in - 1] = waitingQueue[waitAddCount];
                            noOfLitres2[slot_in - 1] = 0;
                            System.out.println("Successfully removed and added a customer from the waiting queue to the slot");
                            waitingQueue[waitAddCount] = null;
                            waitAddCount++;
                            passengerCount--;
                        }

                        else {
                            removeCount2++;
                            System.out.println("Successfully removed");
                        }
                    }
                }

                else {
                    removeCount2++;
                    System.out.println("Successfully removed");
                    waitAddCount = 0;
                }
            }

            else {
                System.out.println("ERROR!\nEnter the number in front of the customer name (1 to 6)");
            }
        }

        else if (served == 3) {
            System.out.println();
            for (int c = 0; c < fuelQueue3.length; c++) {
                // null slots in array is omitted
                if (fuelQueue3[c] != null) {
                    //Prints the name who received fuel
                    System.out.println((c + 1) + " slot " + fuelQueue3[c] + " received fuel");

                }
            }
            System.out.println();
            //Allows user to input the number in front of customer name to change it to null so that the customer is removed
            System.out.print("Enter the number of the slot in front of the customer name(received fuel) to remove (1 to 6): ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();
            if (fuelQueue3[slot_in-1] != null) {
                fuelQueue3[(slot_in - 1)] = null;

                if (waitAddCount < 6) {
                    if (waitAddCount < waitingQueue.length) {
                        if (waitingQueue[waitAddCount] != null) {
                            fuelQueue3[slot_in - 1] = waitingQueue[waitAddCount];
                            noOfLitres3[slot_in - 1] = 0;
                            System.out.println("Successfully removed and added a customer from the waiting queue to the slot");
                            waitingQueue[waitAddCount] = null;
                            waitAddCount++;
                            passengerCount--;
                        }

                        else {
                            removeCount3++;
                            System.out.println("Successfully removed");
                        }
                    }
                }

                else {
                    removeCount3++;
                    System.out.println("Successfully removed");
                    waitAddCount = 0;
                }
            }

            else {
                System.out.println("ERROR!\nEnter the number in front of the customer name (1 to 6)");
            }
        }

        else if (served == 4) {
            System.out.println();
            for (int c = 0; c < fuelQueue4.length; c++) {
                // null slots in array is omitted
                if (fuelQueue4[c] != null) {
                    //Prints the name who received fuel
                    System.out.println((c + 1) + " slot " + fuelQueue4[c] + " received fuel");

                }
            }
            System.out.println();
            //Allows user to input the number in front of customer name to change it to null so that the customer is removed
            System.out.print("Enter the number of the slot in front of the customer name(received fuel) to remove (1 to 6): ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();
            if (fuelQueue4[slot_in-1] != null) {
                fuelQueue4[(slot_in - 1)] = null;

                if (waitAddCount < 6) {
                    if (waitAddCount < waitingQueue.length) {
                        if (waitingQueue[waitAddCount] != null) {
                            fuelQueue4[slot_in - 1] = waitingQueue[waitAddCount];
                            noOfLitres4[slot_in - 1] = 0;
                            System.out.println("Successfully removed and added a customer from the waiting queue to the slot");
                            waitingQueue[waitAddCount] = null;
                            waitAddCount++;
                            passengerCount--;
                        }

                        else {
                            removeCount4++;
                            System.out.println("Successfully removed");
                        }
                    }
                }

                else {
                    removeCount4++;
                    System.out.println("Successfully removed");
                    waitAddCount = 0;
                }
            }

            else {
                System.out.println("ERROR!\nEnter the number in front of the customer name (1 to 6)");
            }
        }

        else if (served == 5) {
            System.out.println();
            for (int c = 0; c < fuelQueue5.length; c++) {
                // null slots in array is omitted
                if (fuelQueue5[c] != null) {
                    //Prints the name who received fuel
                    System.out.println((c + 1) + " slot " + fuelQueue5[c] + " received fuel");

                }
            }
            System.out.println();
            //Allows user to input the number in front of customer name to change it to null so that the customer is removed
            System.out.print("Enter the number of the slot in front of the customer name(received fuel) to remove (1 to 6): ");
            Scanner slot = new Scanner(System.in);
            int slot_in = slot.nextInt();

            if (fuelQueue5[slot_in-1] != null) {
                fuelQueue5[(slot_in - 1)] = null;

                if (waitAddCount < 6) {
                    if (waitAddCount < waitingQueue.length) {
                        if (waitingQueue[waitAddCount] != null) {
                            fuelQueue5[slot_in - 1] = waitingQueue[waitAddCount];
                            noOfLitres5[slot_in - 1] = 0;
                            System.out.println("Successfully removed and added a customer from the waiting queue to the slot");
                            waitingQueue[waitAddCount] = null;
                            waitAddCount++;
                            passengerCount--;
                        }

                        else {
                            removeCount5++;
                            System.out.println("Successfully removed");
                        }
                    }
                }

                else {
                    removeCount5++;
                    System.out.println("Successfully removed");
                    waitAddCount = 0;
                }
            }

            else {
                System.out.println("ERROR!\nEnter the number in front of the customer name (1 to 6)");
            }
        }

        else {
            System.out.println("Enter the correct queue number (1,2,3,4 or 5");
        }
    }

    //Sorts the array of objects and prints it out from the temporary array.
    public static void sort() {

        System.out.print("Enter the queue number to view the sorted queue (queue 1, queue 2, queue 3, queue 4 or queue 5)\nEnter 1, 2, 3, 4 or 5: ");
        Scanner sort = new Scanner(System.in);
        int sort_in = sort.nextInt();
        //Bubble sort is used
        if (sort_in == 1) {
            for (int c = 0; c < sortQueue1.length; c++) {
                sortQueue1[c] = fuelQueue1[c];
            }
            for (int c = 0; c < sortQueue1.length; c++) {
                for (int i = c + 1; i < sortQueue1.length; i++) {
                    if (sortQueue1[c] != null && sortQueue1[i] != null) {
                        if (sortQueue1[c].compareToIgnoreCase(sortQueue1[i]) > 0) {
                            //temporary variable 'temp' is created to swap
                            String temp = sortQueue1[c];
                            sortQueue1[c] = sortQueue1[i];
                            sortQueue1[i] = temp;
                        }
                    }
                }
            }
            //Prints the elements in array after sort
            System.out.println("SORTED FUEL QUEUE 1: ");
            for (int c = 0; c < sortQueue1.length; c++) {
                System.out.println(sortQueue1[c]);
            }
        }

        else if (sort_in == 2) {
            for (int c = 0; c < sortQueue2.length; c++) {
                sortQueue2[c] = fuelQueue2[c];
            }
            for (int c = 0; c < sortQueue2.length; c++) {
                for (int i = c + 1; i < sortQueue2.length; i++) {
                    if (sortQueue2[c] != null && sortQueue2[i] != null) {
                        if (sortQueue2[c].compareToIgnoreCase(sortQueue2[i]) > 0) {
                            //temporary variable 'temp' is created to swap
                            String temp = sortQueue2[c];
                            sortQueue2[c] = sortQueue2[i];
                            sortQueue2[i] = temp;
                        }
                    }
                }
            }
            //Prints the elements in array after sort
            System.out.println("SORTED FUEL QUEUE 1: ");
            for (int c = 0; c < sortQueue2.length; c++) {
                System.out.println(sortQueue2[c]);
            }
        }

        else if (sort_in == 3) {
            for (int c = 0; c < sortQueue3.length; c++) {
                sortQueue3[c] = fuelQueue3[c];
            }
            for (int c = 0; c < sortQueue3.length; c++) {
                for (int i = c + 1; i < sortQueue3.length; i++) {
                    if (sortQueue3[c] != null && sortQueue3[i] != null) {
                        if (sortQueue3[c].compareToIgnoreCase(sortQueue3[i]) > 0) {
                            //temporary variable 'temp' is created to swap
                            String temp = sortQueue3[c];
                            sortQueue3[c] = sortQueue3[i];
                            sortQueue3[i] = temp;
                        }
                    }
                }
            }
            //Prints the elements in array after sort
            System.out.println("SORTED FUEL QUEUE 1: ");
            for (int c = 0; c < sortQueue3.length; c++) {
                System.out.println(sortQueue3[c]);
            }
        }

        else if (sort_in == 4) {
            for (int c = 0; c < sortQueue4.length; c++) {
                sortQueue4[c] = fuelQueue4[c];
            }
            for (int c = 0; c < sortQueue4.length; c++) {
                for (int i = c + 1; i < sortQueue4.length; i++) {
                    if (sortQueue4[c] != null && sortQueue4[i] != null) {
                        if (sortQueue4[c].compareToIgnoreCase(sortQueue4[i]) > 0) {
                            //temporary variable 'temp' is created to swap
                            String temp = sortQueue4[c];
                            sortQueue4[c] = sortQueue4[i];
                            sortQueue4[i] = temp;
                        }
                    }
                }
            }
            //Prints the elements in array after sort
            System.out.println("SORTED FUEL QUEUE 1: ");
            for (int c = 0; c < sortQueue4.length; c++) {
                System.out.println(sortQueue4[c]);
            }
        }

        else if (sort_in == 5) {
            for (int c = 0; c < sortQueue5.length; c++) {
                sortQueue5[c] = fuelQueue5[c];
            }
            for (int c = 0; c < sortQueue5.length; c++) {
                for (int i = c + 1; i < sortQueue5.length; i++) {
                    if (sortQueue5[c] != null && sortQueue5[i] != null) {
                        if (sortQueue5[c].compareToIgnoreCase(sortQueue5[i]) > 0) {
                            //temporary variable 'temp' is created to swap
                            String temp = sortQueue5[c];
                            sortQueue5[c] = sortQueue5[i];
                            sortQueue5[i] = temp;
                        }
                    }
                }
            }
            //Prints the elements in array after sort
            System.out.println("SORTED FUEL QUEUE 1: ");
            for (int c = 0; c < sortQueue5.length; c++) {
                System.out.println(sortQueue5[c]);
            }
        }
        else{
            System.out.println("ERROR!\nEnter a queue number(1,2,3,4 or 5)");
        }
    }

    //Stores the object in the array to the text file
    public static void storeData() throws IOException {

        FileWriter file = new FileWriter("C:\\Users\\Dilukshan\\Desktop\\FUEL QUEUE_ClassVersion.txt");
        file.write("FUEL QUEUE 1:\n");
        for (int c = 0; c < fuelQueue1.length; c++) {
            if (fuelQueue1[c] != null && noOfLitres1[c] != 0 ) {
                //Writing in file
                file.write((c + 1) + " slot " + fuelQueue1[c] + " received fuel " + noOfLitres1[c]+" litres "+"\n");
            }
            else {
                file.write((c + 1) + " slot NO ONE\n");
            }
        }
        //new line in file written
        file.write("\n");

        //Writing Queue 2
        file.write("FUEL QUEUE 2:\n");
        for (int c = 0; c < fuelQueue2.length; c++) {
            if (fuelQueue2[c] != null) {
                file.write((c + 1) + " slot " + fuelQueue2[c] + " received fuel " + noOfLitres2[c] +" litres "+'\n');
            } else {
                file.write((c + 1) + " slot NO ONE\n");
            }

        }
        file.write("\n");

        //Writing Queue 3
        file.write("FUEL QUEUE 3:\n");
        for (int c = 0; c < fuelQueue3.length; c++) {
            if (fuelQueue3[c] != null) {
                file.write((c + 1) + " slot " + fuelQueue3[c] + " received fuel " + noOfLitres3[c] + " litres "+'\n');
            } else {
                file.write((c + 1) + " slot NO ONE\n");
            }
        }
        file.write("\n");

        //Writing Queue 4
        file.write("FUEL QUEUE 4:\n");
        for (int c = 0; c < fuelQueue4.length; c++) {
            if (fuelQueue4[c] != null) {
                file.write((c + 1) + " slot " + fuelQueue4[c] + " received fuel " + noOfLitres4[c] + " litres "+'\n');
            } else {
                file.write((c + 1) + " slot NO ONE\n");
            }
        }
        file.write("\n");

        //Writing Queue 5
        file.write("FUEL QUEUE 5:\n");
        for (int c = 0; c < fuelQueue5.length; c++) {
            if (fuelQueue5[c] != null) {
                file.write((c + 1) + " slot " + fuelQueue5[c] + " received fuel " + noOfLitres5[c] + " litres "+'\n');
            }
            else {
                file.write((c + 1) + " slot NO ONE\n");
            }
        }
        //Closing the file
        file.close();
        System.out.println();
        System.out.println("Data saved successfully");
    }

    //Load the data from text file to IntelliJ
    //Reference: https://youtu.be/lHFlAYaNfdo
    public static void loadData() throws FileNotFoundException { //ignores FileNotFoundException
        //File location
        File file = new File("C:\\Users\\Dilukshan\\Desktop\\FUEL QUEUE_ClassVersion.txt");
        //Reading each line from file
        Scanner read = new Scanner(file);

        //To read all lines in file
        while (read.hasNextLine()) {
            //Prints the data from file
            System.out.println(read.nextLine());
        }
    }

    //Getter to return the fuel stock remaining
    public static int remainingFuel(){
        return fuelstock;
    }

    //Adds fuel to fuel stock but only up to 6600 litres and any fuel more than that is assumed excess and omitted
    public static void addFuel(int add){
        fuelstock = fuelstock + add;
        if (fuelstock > 6600){
            System.out.println();
            System.out.println("You entered more than the fuel center storage capacity (6600 litres)\nSo the excess of " + (fuelstock-6600) + " litres is ignored/returned and only up to 6600 litres, the fuel is added");
            fuelstock = 6600;
        }
        else {
            System.out.println("Fuel Successfully Added");
        }
    }

    //The Income from each pump is sent to main
    public static void queueIncome(){

        System.out.println("The total income of Fuel Queue 1 is Rs." + queueIncome1);
        System.out.println("The total income of Fuel Queue 2 is Rs." + queueIncome2);
        System.out.println("The total income of Fuel Queue 3 is Rs." + queueIncome3);
        System.out.println("The total income of Fuel Queue 4 is Rs." + queueIncome4);
        System.out.println("The total income of Fuel Queue 5 is Rs." + queueIncome5);

        if ( queueIncome1 == 0 && queueIncome2 == 0 && queueIncome3 == 0 && queueIncome4 == 0 && queueIncome5 == 0) {
            System.out.println("No fuel is bought from the five pumps yet");
        }
        else{
            System.out.println("Total income of all queues: Rs." + (queueIncome1 + queueIncome2 + queueIncome3 + queueIncome4 + queueIncome5));
        }

    }

}

