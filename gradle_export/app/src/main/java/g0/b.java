package g0;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import c3.e1;
import h00.x;
import i2.s0;
import i2.t;
import java.util.ArrayList;
import m3.f;
import m3.h;
import m3.i0;
import me.i;
import q3.p;
import q3.u;
import x3.l;
import x3.o;

public abstract class b {

    public static final StackTraceElement[] f5703a = new StackTraceElement[0];

    public static final e1 a(h hVar) {
        ArrayList arrayList = hVar.C;
        ArrayList arrayList2 = x.A;
        ArrayList arrayList3 = arrayList == null ? arrayList2 : arrayList;
        CharSequence charSequence = hVar.B;
        if (!arrayList3.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            i iVar = new i(27, false);
            iVar.B = Parcel.obtain();
            if (arrayList == null) {
                arrayList = arrayList2;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                f fVar = (f) arrayList.get(i10);
                i0 i0Var = (i0) fVar.f10423a;
                int i11 = fVar.f10424b;
                int i12 = fVar.f10425c;
                ((Parcel) iVar.B).recycle();
                iVar.B = Parcel.obtain();
                o oVar = i0Var.f10457a;
                long j9 = i0Var.l;
                long j10 = i0Var.f10464h;
                int i13 = i10;
                long j11 = i0Var.f10458b;
                ArrayList arrayList4 = arrayList;
                int i14 = size;
                long jA = oVar.a();
                long j12 = t.f7167g;
                if (!t.c(jA, j12)) {
                    iVar.D((byte) 1);
                    ((Parcel) iVar.B).writeLong(i0Var.f10457a.a());
                }
                long j13 = y3.o.f16599c;
                byte b7 = 2;
                if (!y3.o.a(j11, j13)) {
                    iVar.D((byte) 2);
                    iVar.F(j11);
                }
                u uVar = i0Var.f10459c;
                if (uVar != null) {
                    iVar.D((byte) 3);
                    ((Parcel) iVar.B).writeInt(uVar.A);
                }
                q3.o oVar2 = i0Var.f10460d;
                if (oVar2 != null) {
                    int i15 = oVar2.f12746a;
                    iVar.D((byte) 4);
                    iVar.D((i15 != 0 && i15 == 1) ? (byte) 1 : (byte) 0);
                }
                p pVar = i0Var.f10461e;
                if (pVar != null) {
                    int i16 = pVar.f12747a;
                    iVar.D((byte) 5);
                    if (i16 == 0) {
                        b7 = 0;
                    } else if (i16 == 65535) {
                        b7 = 1;
                    } else if (i16 != 1) {
                        if (i16 == 2) {
                            b7 = 3;
                        } else {
                            b7 = 0;
                        }
                    }
                    iVar.D(b7);
                }
                String str = i0Var.f10463g;
                if (str != null) {
                    iVar.D((byte) 6);
                    ((Parcel) iVar.B).writeString(str);
                }
                if (!y3.o.a(j10, j13)) {
                    iVar.D((byte) 7);
                    iVar.F(j10);
                }
                x3.a aVar = i0Var.f10465i;
                if (aVar != null) {
                    float f3 = aVar.f16399a;
                    iVar.D((byte) 8);
                    iVar.E(f3);
                }
                x3.p pVar2 = i0Var.f10466j;
                if (pVar2 != null) {
                    iVar.D((byte) 9);
                    iVar.E(pVar2.f16424a);
                    iVar.E(pVar2.f16425b);
                }
                if (!t.c(j9, j12)) {
                    iVar.D((byte) 10);
                    ((Parcel) iVar.B).writeLong(j9);
                }
                l lVar = i0Var.m;
                if (lVar != null) {
                    iVar.D((byte) 11);
                    ((Parcel) iVar.B).writeInt(lVar.f16420a);
                }
                s0 s0Var = i0Var.f10468n;
                if (s0Var != null) {
                    iVar.D((byte) 12);
                    ((Parcel) iVar.B).writeLong(s0Var.f7159a);
                    long j14 = s0Var.f7160b;
                    iVar.E(Float.intBitsToFloat((int) (j14 >> 32)));
                    iVar.E(Float.intBitsToFloat((int) (j14 & 4294967295L)));
                    iVar.E(s0Var.f7161c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) iVar.B).marshall(), 0)), i11, i12, 33);
                i10 = i13 + 1;
                spannableString = spannableString2;
                arrayList = arrayList4;
                size = i14;
            }
            charSequence = spannableString;
        }
        return new e1(ClipData.newPlainText("plain text", charSequence));
    }
}
