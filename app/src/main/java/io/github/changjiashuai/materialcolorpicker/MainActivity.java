package io.github.changjiashuai.materialcolorpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.changjiashuai.materialcolorpicker.adapter.ColorAdapter;
import io.github.changjiashuai.materialcolorpicker.model.Color;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv_color)RecyclerView mRvColor;
    @Bind(R.id.rv_color_content)RecyclerView mRvColorContent;

    private ColorAdapter mColorAdapter;
    private ColorAdapter mColorContentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mRvColor.setLayoutManager(new LinearLayoutManager(this));
        mRvColorContent.setLayoutManager(new LinearLayoutManager(this));
        mColorAdapter = new ColorAdapter(this, R.layout.activity_main_list_item_title, getColors(19));
        mColorContentAdapter = new ColorAdapter(this, R.layout.activity_main_list_item, getColors(10));
        mRvColor.setAdapter(mColorAdapter);
        mRvColorContent.setAdapter(mColorContentAdapter);
    }

    private List<Color> getColors(int size){
        List<Color> colors = new ArrayList<>();
        for (int i=0;i<size;i++){
            Color color = new Color();
            color.setName("name"+i);
            color.setValue("value"+i);
            colors.add(color);
        }
        return colors;
    }
}
