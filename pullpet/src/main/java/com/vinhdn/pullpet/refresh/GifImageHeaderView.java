package com.vinhdn.pullpet.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.lcodecore.tkrefreshlayout.IHeaderView;
import com.lcodecore.tkrefreshlayout.OnAnimEndListener;

import pl.droidsonroids.gif.GifImageView;

/**
 * Created by vinh on 7/27/17.
 */

public class GifImageHeaderView extends GifImageView implements IHeaderView{
    public GifImageHeaderView(Context context) {
        super(context);
    }

    public GifImageHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GifImageHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void onPullingDown(float fraction, float maxHeadHeight, float headHeight) {

    }

    @Override
    public void onPullReleasing(float fraction, float maxHeadHeight, float headHeight) {

    }

    @Override
    public void startAnim(float maxHeadHeight, float headHeight) {
    }

    @Override
    public void onFinish(OnAnimEndListener listener) {
        listener.onAnimEnd();
    }

    @Override
    public void reset() {

    }
}
