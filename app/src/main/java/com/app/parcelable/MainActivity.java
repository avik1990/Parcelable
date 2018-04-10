package com.app.parcelable;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.app.parcelable.databinding.ActivityMainBinding;
import com.app.parcelable.model.Person;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        initview();
    }

    private void initview() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnMove.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == binding.btnMove) {
            Intent toSecondActivity = new Intent(mContext, SecondActivity.class);
            Person p = new Person();
            p.setFirstName("Avik");
            p.setLastName("Android");
            p.setQualification("B.E");
            toSecondActivity.putExtra("person", p);
            startActivity(toSecondActivity);
        }
    }
}
