package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(5);
        sumFirstNaturalNumbers(5);
        showFirstNaturalNumbers(5);

    }

    public static void positionInAList(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            numbers.add(i); //numeros del 0 al 10
        }

        //buscar
        if (numbers.contains(num)) {
            int position = numbers.indexOf(num);
            System.out.println("El elemento " + num + " se encuentra en la posición: " + position);
        } else {
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }

    }

    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
            System.out.println(sum);
        }
    }

    public static void showFirstNaturalNumbers(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
            }

        }

    }


