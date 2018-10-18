package com.company;

public class LoopClass {


    boolean isSimm (int array[]){
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
