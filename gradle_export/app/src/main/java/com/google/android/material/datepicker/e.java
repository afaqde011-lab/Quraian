package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

public final class e extends BaseAdapter {
    public final Calendar A;
    public final int B;
    public final int C;

    public e() {
        Calendar calendarC = y.c(null);
        this.A = calendarC;
        this.B = calendarC.getMaximum(7);
        this.C = calendarC.getFirstDayOfWeek();
    }

    public e(int i10) {
        Calendar calendarC = y.c(null);
        this.A = calendarC;
        this.B = calendarC.getMaximum(7);
        this.C = i10;
    }

    @Override
    public final int getCount() {
        return this.B;
    }

    @Override
    public final Object getItem(int i10) {
        int i11 = this.B;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.C;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131559111, viewGroup, false);
        }
        int i11 = i10 + this.C;
        int i12 = this.B;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.A;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(2131886867), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
