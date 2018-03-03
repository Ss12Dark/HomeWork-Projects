package com.example.ss12dark.homeproject;

import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void diagonals(View v){

        TableLayout tl = (TableLayout) findViewById(R.id.table);
        tl.removeAllViews();
        EditText numberOf = (EditText) findViewById(R.id.number);
        int matrix = Integer.parseInt(numberOf.getText().toString());

        if(matrix>3 || matrix<100) {
            for (int i = 0; i < matrix; i++) {
                // Creation row
                final TableRow tableRow = new TableRow(this);
                tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

                for (int j = 0; j < matrix; j++) {
                    // Creation textView
                    final TextView text = new TextView(this);
                    if (j == i || j + i == matrix - 1) {
                        text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol2) );
                    } else {
                        text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol) );
                    }
                    text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));


                    tableRow.addView(text);
                }

                tl.addView(tableRow);
            }
        }else{
            Toast.makeText(this,"number need to be between 3 and 100",Toast.LENGTH_SHORT).show();
        }
    }

    public void upper(View v){

        TableLayout tl = (TableLayout) findViewById(R.id.table);
        tl.removeAllViews();
        EditText numberOf = (EditText) findViewById(R.id.number);
        int matrix = Integer.parseInt(numberOf.getText().toString());

        if(matrix>3 || matrix<100) {
        for (int i = 0; i < matrix; i++) {
            // Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < matrix; j++) {
                // Creation textView
                final TextView text = new TextView(this);
                if (j+i<matrix-1 || j+i==matrix-1){
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol2) );
                } else {
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol) );
                }
                text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));


                tableRow.addView(text);
            }

            tl.addView(tableRow);
        }
        }else{
            Toast.makeText(this,"number need to be between 3 and 100",Toast.LENGTH_SHORT).show();
        }
    }

    public void bottom(View v){

        TableLayout tl = (TableLayout) findViewById(R.id.table);
        tl.removeAllViews();
        EditText numberOf = (EditText) findViewById(R.id.number);
        int matrix = Integer.parseInt(numberOf.getText().toString());
        if(matrix>3 || matrix<100) {
        for (int i = 0; i < matrix; i++) {
            // Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < matrix; j++) {
                // Creation textView
                final TextView text = new TextView(this);
                if (j+i>matrix-1|| j+i==matrix-1){
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol2) );
                } else {
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol) );
                }
                text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));


                tableRow.addView(text);
            }

            tl.addView(tableRow);
        }
        }else{
            Toast.makeText(this,"number need to be between 3 and 100",Toast.LENGTH_SHORT).show();
        }
    }

    public void borders(View v){

        TableLayout tl = (TableLayout) findViewById(R.id.table);
        tl.removeAllViews();
        EditText numberOf = (EditText) findViewById(R.id.number);
        int matrix = Integer.parseInt(numberOf.getText().toString());
        if(matrix>3 || matrix<100) {
        for (int i = 0; i < matrix; i++) {
            // Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < matrix; j++) {
                // Creation textView
                final TextView text = new TextView(this);
                if (j==0 ||i==0|| j==matrix-1||i==matrix-1){
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol2) );
                } else {
                    text.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.lol) );
                }
                text.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));


                tableRow.addView(text);
            }

            tl.addView(tableRow);
        }
        }else{
            Toast.makeText(this,"number need to be between 3 and 100",Toast.LENGTH_SHORT).show();
        }
    }











}
