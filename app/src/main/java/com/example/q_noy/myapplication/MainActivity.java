package com.example.q_noy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String[] fruitname={"CAU", "MANGGA", "APEL", "KADU", "MELON", "GANAS"};
    String[] desc={"Ini teh Cau", "Ini teh Mangga", "Ini teh Apel", "Ini teh Kadu", "Ini teh Melon", "Ini teh Ganas"};
    Integer[] imgid={R.drawable.banana,R.drawable.mango,R.drawable.apple,R.drawable.durian,R.drawable.melon,R.drawable.pineapple,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst=(ListView) findViewById(R.id.list1);
        CustomListview customListview=new CustomListview(this,fruitname,desc,imgid);
        lst.setAdapter(customListview);
    }


}
