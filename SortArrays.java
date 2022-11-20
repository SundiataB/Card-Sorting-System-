import java.util.*;  
// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 2/19/2021
public class SortArrays {

    public static void main(String[] args) {
        System.out.println("Welcome to Sort Arrays! ");
        System.out.println();
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter the size of the Array : ");
        int arraySize;
        arraySize = sc.nextInt();
        sc.close();
        Card[] myCards = new Card[arraySize];
        Integer[] myIntegers = new Integer[arraySize];
        //This for loop is using arraySize to itirate througth cards and integers to bring out the cardtypes and needed values 
        for (int i = 0; i < arraySize; i++) {
            myCards[i] = new Card();
            myCards[i].drawCard();
            myIntegers[i] = (int)(Math.random() * ((arraySize - 0) +  1));
        }
        //These printlines purpose is to print out the integers and cards with the lowest element and the sorted elements
        System.out.print("integer Array : ");
        printArray(myIntegers);
        System.out.println("Lowest Integer Array  : " + findMinArray(myIntegers));
        System.out.println();
        
        System.out.print("Card Array : ");
        printArray(myCards);
        System.out.println("lowest Card : " + findMinArray(myCards));
        System.out.println();
        
        System.out.print("Unsorted integer Array : ");
        printArray(myIntegers);
        System.out.print("Sorted Integer Array  : ");
        bubbleSort(myIntegers,arraySize);
        printArray(myIntegers);
        
        System.out.println();
        System.out.print("Unsorted Card Array : ");
        printArray(myCards);
        System.out.print("Sorted Card Array  : ");
        bubbleSort(myCards,arraySize);
        printArray(myCards);
    }
    
    //This function main purpose is to print out the array that is separeated by commas
    public static <T> void printArray(T myArray[]) {
        for (T element : myArray) {
            System.out.print(element  + ", ");
        }
        System.out.println();
    }

    //This function main purpose is to compare generics between each other and swap specific element with indexes
    public static <T> void swap(T myArray[], int indexA, int indexB) {
        T temp = myArray[indexA];
        myArray[indexA] = myArray[indexB];
        myArray[indexB] = temp;
    }

    //This function main purpose is to find the minium of the array and display this to the minium value 
    public static <T extends Comparable <T>> T findMinArray(T myArray[]) {
        T returnValue = myArray[0];
        for (T element : myArray) {
            if (element.compareTo(returnValue) < 0) {
                returnValue = element;
            }
        }
        return returnValue;
    }

    //This function main purpose is to sor the arrays in the according order then displays them in the correct order
    public static <T extends Comparable <T>> void bubbleSort(T myArray[], int size) {
        int maxElement;
        int index;
        for (maxElement = size - 1; maxElement > 0; maxElement--) {
            for (index = 0; index < maxElement; index++) {
                if (myArray[index].compareTo(myArray[index + 1]) > 0) {
                    swap(myArray, index, index + 1);
                }

            }
        }

    }
}
