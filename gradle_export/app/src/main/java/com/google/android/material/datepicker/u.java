package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba.f1;
import ba.g0;
import ba.q0;
import java.util.Calendar;

public final class u extends g0 {

    public final b f4162a;

    public final me.i f4163b;

    public final int f4164c;

    public u(ContextThemeWrapper contextThemeWrapper, b bVar, me.i iVar) {
        q qVar = bVar.A;
        q qVar2 = bVar.B;
        q qVar3 = bVar.D;
        if (qVar.A.compareTo(qVar3.A) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (qVar3.A.compareTo(qVar2.A) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f4164c = (contextThemeWrapper.getResources().getDimensionPixelSize(2131166141) * r.D) + (o.l(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(2131166141) : 0);
        this.f4162a = bVar;
        this.f4163b = iVar;
        setHasStableIds(true);
    }

    @Override
    public final int getItemCount() {
        return this.f4162a.G;
    }

    @Override
    public final long getItemId(int i10) {
        Calendar calendarA = y.a(this.f4162a.A.A);
        calendarA.add(2, i10);
        calendarA.set(5, 1);
        Calendar calendarA2 = y.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override
    public final void onBindViewHolder(f1 f1Var, int i10) {
        t tVar = (t) f1Var;
        b bVar = this.f4162a;
        Calendar calendarA = y.a(bVar.A.A);
        calendarA.add(2, i10);
        q qVar = new q(calendarA);
        tVar.f4160u.setText(qVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f4161v.findViewById(2131362804);
        if (materialCalendarGridView.a() == null || !qVar.equals(materialCalendarGridView.a().A)) {
            new r(qVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override
    public final f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131559115, viewGroup, false);
        if (!o.l(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new t(linearLayout, false);
        }
        linearLayout.setLayoutParams(new q0(-1, this.f4164c));
        return new t(linearLayout, true);
    }
}
