package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // call function1 to start the chain of function calls
        function1();
    }

    // function 1
    private void function1()
    {
        Log.d("MyApp", "Function 1");
        // call function2
        function2();
    }

    // function 2
    private void function2()
    {
        Log.d("MyApp", "Function 2");
        try
        {
            // call function3, which may throw an exception
            function3();
        } catch (Exception e)
        {
            // handle the exception gracefully without crashing the application
            Log.e("MyApp", "Exception caught in Function 2: " + e.getMessage());
        }
    }

    // function 3
    private void function3() throws NullPointerException
    {
        Log.d("MyApp", "Function 3");
        // generate a NullPointerException
        throw new NullPointerException("NullPointerException occurred in Function 3");
    }
}
