package com.vinhdn.pullpet.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.lcodecore.tkrefreshlayout.IBottomView;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by vinh on 7/28/17.
 */

public class GifImageFooterView extends GifImageView implements IBottomView{

    public GifImageFooterView(Context context) {
        super(context);
    }

    public GifImageFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GifImageFooterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void onPullingUp(float fraction, float maxBottomHeight, float bottomHeight) {

    }

    @Override
    public void startAnim(float maxBottomHeight, float bottomHeight) {

    }

    @Override
    public void onPullReleasing(float fraction, float maxBottomHeight, float bottomHeight) {

    }

    @Override
    public void onFinish() {

    }

    @Override
    public void reset() {

    }
}
