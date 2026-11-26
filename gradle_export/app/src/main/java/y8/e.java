package y8;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import ta.c0;

public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    public static final int f16805v = c(2, 2, 2, 0);

    public static final int f16806w;

    public static final int[] f16807x;

    public static final int[] f16808y;

    public static final int[] f16809z;

    public final ArrayList f16810a = new ArrayList();

    public final SpannableStringBuilder f16811b = new SpannableStringBuilder();

    public boolean f16812c;

    public boolean f16813d;

    public int f16814e;

    public boolean f16815f;

    public int f16816g;

    public int f16817h;

    public int f16818i;

    public int f16819j;

    public int f16820k;
    public int l;
    public int m;

    public int f16821n;

    public int f16822o;

    public int f16823p;

    public int f16824q;

    public int f16825r;

    public int f16826s;

    public int f16827t;

    public int f16828u;

    static {
        int iC = c(0, 0, 0, 0);
        f16806w = iC;
        int iC2 = c(0, 0, 0, 3);
        f16807x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f16808y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f16809z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        c0.u(i10, 4);
        c0.u(i11, 4);
        c0.u(i12, 4);
        c0.u(i13, 4);
        if (i13 == 0 || i13 == 1) {
            i14 = 255;
        } else if (i13 == 2) {
            i14 = 127;
        } else if (i13 != 3) {
            i14 = 255;
        } else {
            i14 = 0;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f16811b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f16810a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f16822o != -1) {
            this.f16822o = 0;
        }
        if (this.f16823p != -1) {
            this.f16823p = 0;
        }
        if (this.f16824q != -1) {
            this.f16824q = 0;
        }
        if (this.f16826s != -1) {
            this.f16826s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f16819j && arrayList.size() < 15) {
                this.f16828u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16811b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f16822o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f16822o, length, 33);
            }
            if (this.f16823p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f16823p, length, 33);
            }
            if (this.f16824q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16825r), this.f16824q, length, 33);
            }
            if (this.f16826s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f16827t), this.f16826s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f16810a.clear();
        this.f16811b.clear();
        this.f16822o = -1;
        this.f16823p = -1;
        this.f16824q = -1;
        this.f16826s = -1;
        this.f16828u = 0;
        this.f16812c = false;
        this.f16813d = false;
        this.f16814e = 4;
        this.f16815f = false;
        this.f16816g = 0;
        this.f16817h = 0;
        this.f16818i = 0;
        this.f16819j = 15;
        this.f16820k = 0;
        this.l = 0;
        this.m = 0;
        int i10 = f16806w;
        this.f16821n = i10;
        this.f16825r = f16805v;
        this.f16827t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f16822o;
        SpannableStringBuilder spannableStringBuilder = this.f16811b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f16822o, spannableStringBuilder.length(), 33);
                this.f16822o = -1;
            }
        } else if (z10) {
            this.f16822o = spannableStringBuilder.length();
        }
        if (this.f16823p == -1) {
            if (z11) {
                this.f16823p = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f16823p, spannableStringBuilder.length(), 33);
            this.f16823p = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f16824q;
        SpannableStringBuilder spannableStringBuilder = this.f16811b;
        if (i12 != -1 && this.f16825r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f16825r), this.f16824q, spannableStringBuilder.length(), 33);
        }
        if (i10 != f16805v) {
            this.f16824q = spannableStringBuilder.length();
            this.f16825r = i10;
        }
        if (this.f16826s != -1 && this.f16827t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f16827t), this.f16826s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f16806w) {
            this.f16826s = spannableStringBuilder.length();
            this.f16827t = i11;
        }
    }
}
