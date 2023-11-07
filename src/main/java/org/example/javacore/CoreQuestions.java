package org.example.javacore;

public class CoreQuestions {

    public static void main(String[] args) {
//        int j=3;
//        for (int i=1; i<=12; i+=2) {
//            System.out.println(i == j);
//            }
        }


    private void continueTestMethod() {
        int[] arr = {1,2,3,4,5};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            if (i%2 == 0)
                continue;
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
