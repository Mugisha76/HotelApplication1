package com.example.hotelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x=item.getItemId();
        switch (x){

            case R.id.fot:
                Intent myintent =new Intent(Hotels.this,fortportal.class);
                startActivity(myintent);
                break;
            case R.id.mbr:
                Intent myintent1 =new Intent(Hotels.this,mbarara.class);
                startActivity(myintent1);
                break;

            case R.id.kla:
                Intent myintent2 =new Intent(Hotels.this,kampala.class);
                startActivity(myintent2);
                break;
            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}

