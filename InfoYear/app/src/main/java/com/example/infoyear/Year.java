package com.example.infoyear;
import androidx.appcompat.app.AppCompatActivity;

public class Year extends AppCompatActivity {

    static String result = "";

    public static String getLeap(int in) {
        if (in % 4 != 0) {
           result = yearNotLeap();
        } else {
            if (in % 100 != 0) {
                result = yearIsLeap();
            } else {
                if (in % 400 == 0) {
                    result = yearIsLeap();
                } else result = yearNotLeap();
            }
        }

        return result;
    }

    static public String yearNotLeap(){
        return "Year is not Leap";
    }
    static public String yearIsLeap(){
        return "Year is Leap";
    }

    public static int chinese(int in){
        int src = 0;

        switch (in % 12) {
            case 0: src = R.drawable.monkey; break;
            case 1: src = R.drawable.rooster; break;
            case 2: src = R.drawable.dog; break;
            case 3: src = R.drawable.pig; break;
            case 4: src = R.drawable.rat; break;
            case 5: src = R.drawable.ox; break;
            case 6: src = R.drawable.tiger; break;
            case 7: src = R.drawable.rabbit; break;
            case 8: src = R.drawable.dragon; break;
            case 9: src = R.drawable.snake; break;
            case 10: src = R.drawable.horse; break;
            case 11: src = R.drawable.sheep; break;
        }
        return src;
    }

    }