package com.app.parcelable;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.app.parcelable.databinding.SecActivityMainBinding;
import com.app.parcelable.model.Person;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    SecActivityMainBinding binding;
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.sec_activity_main);
         person =getIntent().getParcelableExtra("person");

        initview();
    }

    private void initview() {
        binding = DataBindingUtil.setContentView(this, R.layout.sec_activity_main);
        binding.tvtext.setOnClickListener(this);
        binding.tvtext.setText("FirstName "+person.getFirstName()+" LastName "+person.getLastName()+" Qualification "+person.getQualification());
    }

    @Override
    public void onClick(View view) {
       /* if(view==binding.tvtext){

        }*/
    }
}
