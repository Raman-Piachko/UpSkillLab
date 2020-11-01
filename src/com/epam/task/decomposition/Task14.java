package com.epam.task.decomposition;

import static com.epam.task.decomposition.Task10.calculateLengthOfNumber;
import static com.epam.task.decomposition.Task12.calculateSumOfDigits;


public class Task14 {
    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная-????
    // в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
    // Для решения задачи использовать декомпозицию.

    //Числом Армстронга называется такое натуральное число, которое равно сумме всех своих цифр, возведённых-????? в степень,
    // равную количеству цифр данного числа.
    public static void main(String[] args) {
            findArmstrongNumbers(408);
    }

    public static void findArmstrongNumbers(int k) {
        for (int i = 1; i <= k; i++) {
            if(Math.pow(calculateSumOfDigits(i), calculateLengthOfNumber(i))==i){
                System.out.println(i);
            }
        }
    }
}
