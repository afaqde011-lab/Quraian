package e9;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.protobuf.RuntimeVersion;
import d7.b;
import e7.h;
import e7.i0;
import e7.u;
import fh.d2;
import fh.r0;
import fh.t0;
import g4.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import ta.c0;
import x8.j;
import x8.k;

public final class a implements k {
    public final u A = new u();
    public final boolean B;
    public final int C;
    public final int D;
    public final String E;
    public final float F;
    public final int G;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.C = 0;
            this.D = -1;
            this.E = "sans-serif";
            this.B = false;
            this.F = 0.85f;
            this.G = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.C = bArr[24];
        this.D = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.E = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.G = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.B = z10;
        if (z10) {
            this.F = i0.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.F = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override
    public final void D(byte[] bArr, int i10, int i11, j jVar, h hVar) {
        String strY;
        int i12;
        u uVar = this.A;
        uVar.L(i10 + i11, bArr);
        uVar.N(i10);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        c0.s(uVar.a() >= 2);
        int iH = uVar.H();
        if (iH == 0) {
            strY = RuntimeVersion.SUFFIX;
        } else {
            int i16 = uVar.f5183b;
            Charset charsetJ = uVar.J();
            int i17 = iH - (uVar.f5183b - i16);
            if (charsetJ == null) {
                charsetJ = StandardCharsets.UTF_8;
            }
            strY = uVar.y(i17, charsetJ);
        }
        if (strY.isEmpty()) {
            r0 r0Var = t0.B;
            hVar.accept(new x8.a(-9223372036854775807L, -9223372036854775807L, d2.E));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strY);
        b(spannableStringBuilder, this.C, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.D, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.E;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fG = this.F;
        while (uVar.a() >= 8) {
            int i18 = uVar.f5183b;
            int iM = uVar.m();
            int iM2 = uVar.m();
            if (iM2 == 1937013100) {
                c0.s(uVar.a() >= i15 ? i13 : i14);
                int iH2 = uVar.H();
                int i19 = i14;
                while (i19 < iH2) {
                    c0.s(uVar.a() >= 12 ? i13 : i14);
                    int iH3 = uVar.H();
                    int iH4 = uVar.H();
                    uVar.O(i15);
                    int i20 = i19;
                    int iA = uVar.A();
                    uVar.O(i13);
                    int iM3 = uVar.m();
                    if (iH4 > spannableStringBuilder.length()) {
                        StringBuilder sbQ = oi.k.q("Truncating styl end (", iH4, ") to cueText.length() (");
                        sbQ.append(spannableStringBuilder.length());
                        sbQ.append(").");
                        e7.a.m("Tx3gParser", sbQ.toString());
                        iH4 = spannableStringBuilder.length();
                    }
                    if (iH3 >= iH4) {
                        e7.a.m("Tx3gParser", c.e(iH3, iH4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i21 = iH4;
                        b(spannableStringBuilder, iA, this.C, iH3, i21, 0);
                        a(spannableStringBuilder, iM3, this.D, iH3, i21, 0);
                    }
                    i19 = i20 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i12 = i15;
            } else if (iM2 == 1952608120 && this.B) {
                i12 = 2;
                c0.s(uVar.a() >= 2);
                fG = i0.g(uVar.H() / this.G, 0.0f, 0.95f);
            } else {
                i12 = 2;
            }
            uVar.N(i18 + iM);
            i15 = i12;
            i13 = 1;
            i14 = 0;
        }
        hVar.accept(new x8.a(-9223372036854775807L, -9223372036854775807L, t0.s(new b(spannableStringBuilder, null, null, null, fG, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }

    @Override
    public final int p() {
        return 2;
    }
}
