package com.epam.task.decomposition;

public class Task12 {
    public static void main(String[] args) {
            findTwinsNumbers(41);
    }

    public static void findTwinsNumbers(int number) { //добавить проверку на isSimpleNumber() где-то уже был;

        for (int i = number; i <=number*2; i++) {
            for (int j = i; j < number*2; j++) {
                if(j-i==2){
                    System.out.println(i+"  "+j);
                }
            }
        }
    }
}
