package a1;

import android.content.ClipData;
import android.view.DragEvent;

public final class k2 implements e2.h {
    public final x1 A;
    public final y1 B;
    public final x1 C;
    public final x1 D;
    public final x1 E;
    public final x1 F;

    public k2(x1 x1Var, y1 y1Var, x1 x1Var2, x1 x1Var3, x1 x1Var4, x1 x1Var5) {
        this.A = x1Var;
        this.B = y1Var;
        this.C = x1Var2;
        this.D = x1Var3;
        this.E = x1Var4;
        this.F = x1Var5;
    }

    @Override
    public final void E0(e2.d dVar) {
    }

    @Override
    public final void V0(e2.d dVar) {
        this.C.invoke(dVar);
    }

    @Override
    public final boolean l0(e2.d dVar) {
        String string;
        this.A.invoke(dVar);
        DragEvent dragEvent = dVar.f5049a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        j2 j2Var = (j2) this.B.B;
        j2Var.G1();
        j2Var.S.d();
        int itemCount = clipData.getItemCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < itemCount; i10++) {
            z10 = z10 || clipData.getItemAt(i10).getText() != null;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z11 = false;
            for (int i11 = 0; i11 < itemCount2; i11++) {
                CharSequence text = clipData.getItemAt(i11).getText();
                if (text != null) {
                    if (z11) {
                        sb2.append("\n");
                    }
                    sb2.append(text);
                    z11 = true;
                }
            }
            string = sb2.toString();
        } else {
            string = null;
        }
        b0.a.a(j2Var);
        if (string != null) {
            w2.h(j2Var.Q, string, false, 14);
        }
        return true;
    }

    @Override
    public final void l1(e2.d dVar) {
        this.F.invoke(dVar);
    }

    @Override
    public final void s(e2.d dVar) {
        this.E.invoke(dVar);
    }

    @Override
    public final void v0(e2.d dVar) {
        DragEvent dragEvent = dVar.f5049a;
        float x2 = dragEvent.getX();
        float y10 = dragEvent.getY();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x2)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
        j2 j2Var = this.D.B;
        z2.a0 a0VarB = j2Var.R.b();
        if (a0VarB != null && a0VarB.A()) {
            jFloatToRawIntBits = a0VarB.T(jFloatToRawIntBits);
        }
        int iD = j2Var.R.d(true, jFloatToRawIntBits);
        if (iD >= 0) {
            j2Var.Q.j(m3.h0.b(iD, iD));
        }
        j2Var.S.A(q0.y0.A, jFloatToRawIntBits);
    }
}
