import javax.swing.text.StyledEditorKit.StyledTextAction;

/*
 * Filename: d:\11zijing\git\java\loop.java
 * Path: d:\11zijing\git\java
 * Created Date: Monday, May 3rd 2021, 10:17:14 am
 * Author: zijing
 * 
 * Copyright (c) 2021 Your Company
 */
public class loop {
    public static void main(String[] args){
        int sum = 0;
        int i = 0;
        for (i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        i = 1;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 1;
        do {
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println(sum);
    }
}
