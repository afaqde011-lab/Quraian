package w3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import k2.e;
import k2.g;
import k2.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public final class a extends CharacterStyle implements UpdateAppearance {
    public final e A;

    public a(e eVar) {
        this.A = eVar;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) throws NoWhenBranchMatchedException {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            g gVar = g.f8922a;
            e eVar = this.A;
            if (m.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.f8923a);
            textPaint.setStrokeMiter(hVar.f8924b);
            int i10 = hVar.f8926d;
            if (i10 == 0) {
                join = Paint.Join.MITER;
            } else if (i10 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i11 = hVar.f8925c;
            if (i11 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i11 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            i2.h hVar2 = hVar.f8927e;
            textPaint.setPathEffect(hVar2 != null ? hVar2.f7136a : null);
        }
    }
}
