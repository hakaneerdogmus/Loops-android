package com.hakanerdogmus.dglerloops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //for loop

        int[] myNumbers = {12, 15, 18, 21, 24} ;

        for (int i=0 ; i<myNumbers.length ; i++){

        int x = myNumbers[i] / 3 * 5;

        //System.out.println(x);

        }

        for (int number: myNumbers){
          //  System.out.println(number / 3 * 5);
    }
        for (int a=0; a<10; a++){
            int b = a *10;
          //  System.out.println(b);
        }



        //WHİLE LOOP

        int j = 0;

        while (j < 10){
            int h = j * 10;
            System.out.println(h);
            j++;

    }





    }
}