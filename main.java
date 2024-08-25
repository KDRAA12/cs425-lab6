public class main{
    public static void printHelloWorld(int[] numbers) {
    for (int num : numbers) {
        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("HelloWorld");
        } else if (num % 5 == 0) {
            System.out.println("Hello");
        } else if (num % 7 == 0) {
            System.out.println("World");
        }
    }
}

public static int findSecondBiggest(int[] numbers) {
    int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
    for (int num : numbers) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num > secondLargest && num != largest) {
            secondLargest = num;
        }
    }
    return secondLargest;
}

}