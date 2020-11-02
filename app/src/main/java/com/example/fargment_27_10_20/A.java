package com.example.fargment_27_10_20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class A extends BaseAdapter {
    ImageView imag1,imag2;
    TextView ted1;
    Context context;
    String number1[];
    int pic1[];
    int pic2[];
    LayoutInflater inflater;

    public A(Context context,int[] pic1,String[] number1,int[] pic2 ){
        this.context=context;
        this.pic1=pic1;
        this.pic2=pic2;
        this.number1=number1;
        inflater=(LayoutInflater.from(context));

    }
    @Override
    public int getCount() {
        return number1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int postion, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.listview,null);
        imag1=view.findViewById(R.id.imag1);
        imag2=view.findViewById(R.id.imag2);
        ted1=view.findViewById(R.id.ted1);

        imag1.setImageResource(pic1[postion]);
        imag2.setImageResource(pic2[postion]);
        ted1.setText(number1[postion]);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "WHATSAPP"+postion, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

