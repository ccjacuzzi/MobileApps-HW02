package com.ualr.firstapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.firstapp.databinding.ActivityMainBinding;
import android.text.TextUtils;
import android.widget.TextView;

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

        }
        else{
            // Only run this line to swap the text if the user has entered a message
            mBinding.userMsgTV.setText(mBinding.userInputET.getText().toString());
        }

    }

    // TODO 07. Create a new method called cleanTextField to delete the text inside the text field
}
