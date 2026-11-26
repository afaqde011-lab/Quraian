package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import ba.f1;
import ba.g0;
import java.util.Locale;

public final class a0 extends g0 {

    public final m f4155a;

    public a0(m mVar) {
        this.f4155a = mVar;
    }

    @Override
    public final int getItemCount() {
        return this.f4155a.C.F;
    }

    @Override
    public final void onBindViewHolder(f1 f1Var, int i10) {
        z zVar = (z) f1Var;
        m mVar = this.f4155a;
        int i11 = mVar.C.A.C + i10;
        zVar.f4167u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = zVar.f4167u;
        Context context = textView.getContext();
        textView.setContentDescription(y.b().get(1) == i11 ? String.format(context.getString(2131886873), Integer.valueOf(i11)) : String.format(context.getString(2131886874), Integer.valueOf(i11)));
        c cVar = mVar.F;
        if (y.b().get(1) == i11) {
            sg.f fVar = cVar.f4157b;
        } else {
            sg.f fVar2 = cVar.f4156a;
        }
        throw null;
    }

    @Override
    public final f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new z((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131559119, viewGroup, false));
    }
}
