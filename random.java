/*
 * Filename: d:\11zijing\git\java\random.java
 * Path: d:\11zijing\git\java
 * Created Date: Monday, May 3rd 2021, 10:59:21 am
 * Author: zijing
 * 
 * Copyright (c) 2021 Your Company
 */
import java.util.Random;

public class random {
    public static void main(String[] args){
        Random rd = new Random();
        
        for(int i = 0; i < 3; i++){
            System.out.println(rd.nextInt(10));
        }
    }
}
