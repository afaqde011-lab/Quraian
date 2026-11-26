package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import ba.f1;
import java.util.WeakHashMap;
import z4.j0;

public final class t extends f1 {

    public final TextView f4160u;

    public final MaterialCalendarGridView f4161v;

    public t(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131362809);
        this.f4160u = textView;
        WeakHashMap weakHashMap = j0.f17198a;
        new z4.a0(2131363061, Boolean.class, 0, 28, 1).i(textView, Boolean.TRUE);
        this.f4161v = (MaterialCalendarGridView) linearLayout.findViewById(2131362804);
        if (z10) {
            return;
        }
        textView.setVisibility(8);
    }
}
