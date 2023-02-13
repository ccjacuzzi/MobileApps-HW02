package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;
import android.text.TextUtils;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = mBinding.getRoot();
        setContentView(rootView);
    }

    // TODO 06. **DONE** Avoid updating the text label (userMsgTV) when the text field (userInputET) is empty
    public void showTextMessage(View view) {
        if(TextUtils.isEmpty(mBinding.userInputET.getText().toString())){
            // Change hint if user has not entered a message
            TextView textView = findViewById(R.id.userInputET);
            textView.setHint("You must type something first.");

            // Handler - adds a delay before setting the hint back
            Handler handler1 = new Handler();
            handler1.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // code to be executed after a specified time interval
                    textView.setHint("Write the message.");
                }
            }, 2000); // 5000 milliseconds = 5 seconds
        }
        else{
            // Only run this line to swap the text if the user has entered a message
            mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());
        }
    }


    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
    public void cleanTextField(View view){
        //clean text inside the text field

        // If text field is empty, there is nothing to clean
        if(TextUtils.isEmpty(mBinding.userInputET.getText().toString())){
            TextView textView = findViewById(R.id.userInputET);
            textView.setHint("Text field already clean.");

            // Handler - adds a delay before setting the hint back
            Handler handler2 = new Handler();
            handler2.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // code to be executed after a specified time interval
                    textView.setHint("Write the message.");
                }
            }, 2000); // 5000 milliseconds = 5 seconds

        }
        // If text field is not empty, clean it out
        else{
            mBinding.userInputET.setText("");
            mBinding.userInputET.clearFocus();
        }

    }
}
