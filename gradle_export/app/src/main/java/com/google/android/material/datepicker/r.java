package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;

public final class r extends BaseAdapter {
    public static final int D = y.c(null).getMaximum(4);
    public static final int E = (y.c(null).getMaximum(7) + y.c(null).getMaximum(5)) - 1;
    public final q A;
    public c B;
    public final b C;

    public r(q qVar, b bVar) {
        this.A = qVar;
        this.C = bVar;
        throw null;
    }

    public final int a() {
        int firstDayOfWeek = this.C.E;
        q qVar = this.A;
        Calendar calendar = qVar.A;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        return i11 < 0 ? i11 + qVar.D : i11;
    }

    @Override
    public final Long getItem(int i10) {
        if (i10 < a() || i10 > c()) {
            return null;
        }
        int iA = (i10 - a()) + 1;
        Calendar calendarA = y.a(this.A.A);
        calendarA.set(5, iA);
        return Long.valueOf(calendarA.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.A.E) - 1;
    }

    @Override
    public final int getCount() {
        return E;
    }

    @Override
    public final long getItemId(int i10) {
        return i10 / this.A.D;
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.B == null) {
            this.B = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131559110, viewGroup, false);
        }
        int iA = i10 - a();
        if (iA >= 0) {
            q qVar = this.A;
            if (iA >= qVar.E) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(qVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i10) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        y.b().getTimeInMillis();
        throw null;
    }

    @Override
    public final boolean hasStableIds() {
        return true;
    }
}
