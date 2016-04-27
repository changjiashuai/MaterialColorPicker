package io.github.changjiashuai.materialcolorpicker.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import io.github.changjiashuai.materialcolorpicker.model.Color;

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 16/4/24 14:39.
 */
public class ColorAdapter extends BaseQuickAdapter<Color> {

    public ColorAdapter(Context context, int layoutResId, List<Color> data) {
        super(context, layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Color color) {

    }
}
