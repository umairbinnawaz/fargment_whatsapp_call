package com.example.fargment_27_10_20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayOut;
    ViewPager viewpage;
    myAdapter adapter;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayOut=findViewById(R.id.tabLayOut);
        viewpage=findViewById(R.id.viewpage);
        adapter=new myAdapter(getSupportFragmentManager(),getApplicationContext());
        adapter.addFragment(new CALL(),"CALL");
        adapter.addFragment(new CHATS(),"CHATS");
        adapter.addFragment(new STATUS(),"STATUS");
        viewpage.setAdapter(adapter);
        tabLayOut.setupWithViewPager(viewpage);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.men_drop,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getGroupId()){
            case R.id.first:
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                return true;
                case R.id.thid:
                    Toast.makeText(this, "Call", Toast.LENGTH_SHORT).show();
                return true;
                case R.id.fouth:
                    Toast.makeText(this, "new broadcast", Toast.LENGTH_SHORT).show();
                return true;
                case R.id.item3:
                return true;
                case R.id.secand:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}