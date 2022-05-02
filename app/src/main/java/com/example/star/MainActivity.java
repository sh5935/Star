package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Hosung.Kim", getStar3(5));
    }
    String getStar1(int height) {
        /*

        *
        **
        ***
        ****
        *****

0~height-1
층수 +1 별이반복

        */
        String starStr = "star \n\n";
        for (int i=0; i<height; i++) {
            for (int j=0; j<i+1; j++) {
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }

        return starStr;
    }

    String getStar2(int height) {
        /*

        ***** 0 5
        ****  1 4
        ***   2 3
        **    3 2
        *     4 1

         */

        String starStr = "star \n\n";
        for (int i=0; i<height; i++){
            for (int j=0; j<height-i; j++){
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }


        return starStr;
    }

    String getStar3(int height) {

        /*
                     i
        @@@@*\n      0 1
        @@@***\n     1 3
        @@*****\n    2 5
        @*******\n   3 7
        *********\n  4 9

         */


        String starStr = "star \n\n";
        for (int i=0; i<height; i++){
            for (int j=0; j<height-i-1; j++){
                starStr = starStr + " ";

            }
            for (int j=0; j<i*2+1; j++){
                starStr = starStr + "*";
            }
            starStr = starStr + "\n";
        }
        return starStr;
    }
}