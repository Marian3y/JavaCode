

public class Assignment5 {
    public static void main(String[] args) {
        // we did this in class on August 8
        String studentName[] = new String[4];

        studentName[2] = "Arianne";
        studentName[1] = "Jayme";
        studentName[0] = "Victoria";
        studentName[3] = "Sam";

        System.out.println("Student First name is: " + studentName[0]);
        System.out.println("Student Second name is: " + studentName[1]);
        System.out.println("Student Third name is: " + studentName[2]);
        System.out.println("Student Fourth name is: " + studentName[3]);
        System.out.println("The length of an array is "+studentName.length);
        System.out.println("The First student in the list is "+studentName[0]);
        System.out.println("The next to last student in the list is "+studentName[studentName.length-2]);
        System.out.println("The Name of the last student in the list is "+studentName[studentName.length-1]);

        int number[] = new int[20];

        number[4] = 10;
        number[9] = 20;
        number[14] = 30;
        number[19] = 40;

        System.out.println("value of 5th is "+number[4]);
        System.out.println("value of 10th is "+number[9]);
        System.out.println("value of 15th is "+number[14]);
        System.out.println("value of 20th is "+number[19]);

        float dollarAmount[] = new float[30];

        dollarAmount[0]= 99.99f;
        dollarAmount[1]= 88.99f;
        dollarAmount[2]= 77.99f;
        dollarAmount[3]= 66.99f;
        dollarAmount[4]= 55.99f;
        dollarAmount[5]= 44.99f;
        dollarAmount[6]= 43.99f;
        dollarAmount[7]= 22.99f;
        dollarAmount[8]= 11.99f;
        dollarAmount[9]= 45.99f;
        dollarAmount[10]= 77.99f;
        dollarAmount[11]= 81.99f;
        dollarAmount[12]= 56.99f;
        dollarAmount[13]= 76.99f;
        dollarAmount[14]= 55.99f;
        dollarAmount[15]= 74.99f;
        dollarAmount[16]= 93.99f;
        dollarAmount[17]= 89.99f;
        dollarAmount[18]= 28.99f;
        dollarAmount[19]= 34.99f;
        dollarAmount[20]= 66.99f;
        dollarAmount[21]= 45.99f;
        dollarAmount[22]= 99.99f;
        dollarAmount[23]= 99.99f;
        dollarAmount[24]= 99.99f;
        dollarAmount[25]= 55.99f;
        dollarAmount[26]= 90.99f;
        dollarAmount[27]= 33.99f;
        dollarAmount[28]= 57.99f;
        dollarAmount[29]= 99.99f;


        System.out.println("The value of First element is "+dollarAmount[0]);
        System.out.println("The value of Last element is "+dollarAmount[dollarAmount.length-1]);



    }
}
