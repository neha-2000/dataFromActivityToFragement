package com.example.datafromactivitytofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(view ->{
            OpenFragment();
        });

    }

    private void OpenFragment(){
        Fragment1 myfragment=new Fragment1();

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

        Bundle data=new Bundle();
        data.putString("myData","Hello from mainActivity");

        myfragment.setArguments(data);
        fragmentTransaction.replace(R.id.frg3,myfragment).commit();
    }
}