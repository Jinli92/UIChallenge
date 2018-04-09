package com.example.jinliyu.tablayout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jinliyu on 3/30/18.
 */

public class Tab2 extends android.support.v4.app.Fragment {
private int num = 0;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab2, container, false);
        Button btn = v.findViewById(R.id.button);
        tv = v.findViewById(R.id.textView2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num ++;
                tv.setText(String.valueOf(num));
            }
        });


        return v;
    }





}
