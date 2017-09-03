package com.acer.android.spinner;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] img={R.drawable.man,R.drawable.girl};
    String[] peopl={"Вася","Карен"};
    ImageView image;

    class MyOnItemSelectedListener implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parents,View v,int p,long id){
            image.setImageResource(img[p]);

        }
        @Override
        public void onNothingSelected(AdapterView<?> p){

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=(ImageView)findViewById(R.id.img_people);

        Spinner spinner=(Spinner)findViewById(R.id.all);
        TextView text=(TextView)findViewById(R.id.txt);

        ArrayAdapter arrAdapter=new ArrayAdapter<>(this,R.layout.spinner_item,peopl);
        MyOnItemSelectedListener myListener=new MyOnItemSelectedListener();
        spinner.setAdapter(arrAdapter);
        spinner.setOnItemSelectedListener(myListener);


    }
}
