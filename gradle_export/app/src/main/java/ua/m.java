package ua;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class m extends Drawable.ConstantState {

    public int f15218a;

    public l f15219b;

    public ColorStateList f15220c;

    public PorterDuff.Mode f15221d;

    public boolean f15222e;

    public Bitmap f15223f;

    public ColorStateList f15224g;

    public PorterDuff.Mode f15225h;

    public int f15226i;

    public boolean f15227j;

    public boolean f15228k;
    public Paint l;

    @Override
    public int getChangingConfigurations() {
        return this.f15218a;
    }

    @Override
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
