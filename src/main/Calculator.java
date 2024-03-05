package main;

import java.util.ArrayList;

public class Calculator {


    public double add(ArrayList<Integer> num){
        int result = 0;
        for (int i = 0; i < num.size(); i++){
            result += num.get(i);
        }
        return result;
    }
    public double minus(ArrayList<Integer> num){
        int result = num.get(0);
        for(int i = 1; i < num.size(); i++){
            result -= num.get(i);
        }
        return result;
    }
    public double divide(ArrayList<Integer> num){
        int result = num.get(0);
        for (int i = 1; i < num.size(); i++){
            result /= num.get(i);
        }
        return result;
    }

    public double multiply(ArrayList<Integer> num) {
        int result = 1;
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) == 0) {
                result = 0;
            }
            result = result * num.get(i);
        }
        return result;
    }
}
