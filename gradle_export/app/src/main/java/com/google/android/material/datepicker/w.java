package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

public final class w extends ba.w {

    public final int f4165q = 0;

    public w(Context context) {
        super(context);
    }

    public w(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }

    @Override
    public int b(View view, int i10) {
        switch (this.f4165q) {
            case 1:
                return 0;
            default:
                return super.b(view, i10);
        }
    }

    @Override
    public int c(View view, int i10) {
        switch (this.f4165q) {
            case 1:
                return 0;
            default:
                return super.c(view, i10);
        }
    }

    @Override
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f4165q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override
    public PointF f(int i10) {
        switch (this.f4165q) {
            case 1:
                return null;
            default:
                return super.f(i10);
        }
    }
}
