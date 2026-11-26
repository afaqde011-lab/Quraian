package vb;

import android.graphics.Bitmap;
import db.g;
import g00.i;
import k50.c0;
import kotlin.jvm.internal.m;
import r30.k;
import x40.b0;
import x40.p;

public final class b {

    public final Object f15584a;

    public final Object f15585b;

    public final long f15586c;

    public final long f15587d;

    public final boolean f15588e;

    public final p f15589f;

    public b(c0 c0Var) {
        i iVar = i.C;
        this.f15584a = rd.a.I(iVar, new a(this, 0));
        this.f15585b = rd.a.I(iVar, new a(this, 1 == true ? 1 : 0));
        this.f15586c = Long.parseLong(c0Var.z(Long.MAX_VALUE));
        this.f15587d = Long.parseLong(c0Var.z(Long.MAX_VALUE));
        this.f15588e = Integer.parseInt(c0Var.z(Long.MAX_VALUE)) > 0;
        int i10 = Integer.parseInt(c0Var.z(Long.MAX_VALUE));
        g gVar = new g(9, (byte) 0);
        for (int i11 = 0; i11 < i10; i11++) {
            String strZ = c0Var.z(Long.MAX_VALUE);
            Bitmap.Config[] configArr = bc.d.f2480a;
            int iI0 = k.I0(strZ, ':', 0, 6);
            if (iI0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strZ).toString());
            }
            String strSubstring = strZ.substring(0, iI0);
            m.d(strSubstring, "substring(...)");
            String string = k.j1(strSubstring).toString();
            String strSubstring2 = strZ.substring(iI0 + 1);
            m.d(strSubstring2, "substring(...)");
            gVar.g(string, strSubstring2);
        }
        this.f15589f = gVar.j();
    }

    public b(b0 b0Var) {
        i iVar = i.C;
        this.f15584a = rd.a.I(iVar, new a(this, 0));
        this.f15585b = rd.a.I(iVar, new a(this, 1));
        this.f15586c = b0Var.K;
        this.f15587d = b0Var.L;
        this.f15588e = b0Var.E != null;
        this.f15589f = b0Var.F;
    }

    public final void a(k50.b0 b0Var) {
        b0Var.h0(this.f15586c);
        b0Var.writeByte(10);
        b0Var.h0(this.f15587d);
        b0Var.writeByte(10);
        b0Var.h0(this.f15588e ? 1L : 0L);
        b0Var.writeByte(10);
        p pVar = this.f15589f;
        b0Var.h0(pVar.size());
        b0Var.writeByte(10);
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0Var.K(pVar.c(i10));
            b0Var.K(": ");
            b0Var.K(pVar.h(i10));
            b0Var.writeByte(10);
        }
    }
}
