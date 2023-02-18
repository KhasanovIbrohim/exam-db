package com.example.examdatabase.security;

import java.util.Random;

public class GenerateId {
    public String generateId(){
        String newId = "";
        Random r = new Random();
        for (int i = 0; i < 24; i++) {
            if(i == 4 || i == 9 || i == 14 || i == 19){
                newId += "-";
                newId += (char)(r.nextInt(26) + 'a');
            }
            else {
                newId += (int)(Math.random() * 9) + 1;;
            }
        }
        return newId;
    }
}
