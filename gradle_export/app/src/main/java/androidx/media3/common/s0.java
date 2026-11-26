package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

public final class s0 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public fh.t0 I;

    public CharSequence f1515a;

    public CharSequence f1516b;

    public CharSequence f1517c;

    public CharSequence f1518d;

    public CharSequence f1519e;

    public CharSequence f1520f;

    public CharSequence f1521g;

    public Long f1522h;

    public g1 f1523i;

    public g1 f1524j;

    public byte[] f1525k;
    public Integer l;
    public Uri m;

    public Integer f1526n;

    public Integer f1527o;

    public Integer f1528p;

    public Boolean f1529q;

    public Boolean f1530r;

    public Integer f1531s;

    public Integer f1532t;

    public Integer f1533u;

    public Integer f1534v;

    public Integer f1535w;

    public Integer f1536x;

    public CharSequence f1537y;

    public CharSequence f1538z;

    public s0() {
        fh.r0 r0Var = fh.t0.B;
        this.I = fh.d2.E;
    }

    public final void a(int i10, byte[] bArr) {
        if (this.f1525k == null || i10 == 3 || !Objects.equals(this.l, 3)) {
            this.f1525k = (byte[]) bArr.clone();
            this.l = Integer.valueOf(i10);
        }
    }

    public final void b(t0 t0Var) {
        if (t0Var == null) {
            return;
        }
        fh.t0 t0Var2 = t0Var.J;
        byte[] bArr = t0Var.f1637k;
        CharSequence charSequence = t0Var.f1627a;
        if (charSequence != null) {
            this.f1515a = charSequence;
        }
        CharSequence charSequence2 = t0Var.f1628b;
        if (charSequence2 != null) {
            this.f1516b = charSequence2;
        }
        CharSequence charSequence3 = t0Var.f1629c;
        if (charSequence3 != null) {
            this.f1517c = charSequence3;
        }
        CharSequence charSequence4 = t0Var.f1630d;
        if (charSequence4 != null) {
            this.f1518d = charSequence4;
        }
        CharSequence charSequence5 = t0Var.f1631e;
        if (charSequence5 != null) {
            this.f1519e = charSequence5;
        }
        CharSequence charSequence6 = t0Var.f1632f;
        if (charSequence6 != null) {
            this.f1520f = charSequence6;
        }
        CharSequence charSequence7 = t0Var.f1633g;
        if (charSequence7 != null) {
            this.f1521g = charSequence7;
        }
        Long l = t0Var.f1634h;
        if (l != null) {
            d(l);
        }
        g1 g1Var = t0Var.f1635i;
        if (g1Var != null) {
            this.f1523i = g1Var;
        }
        g1 g1Var2 = t0Var.f1636j;
        if (g1Var2 != null) {
            this.f1524j = g1Var2;
        }
        Uri uri = t0Var.m;
        if (uri != null || bArr != null) {
            this.m = uri;
            c(bArr, t0Var.l);
        }
        Integer num = t0Var.f1638n;
        if (num != null) {
            this.f1526n = num;
        }
        Integer num2 = t0Var.f1639o;
        if (num2 != null) {
            this.f1527o = num2;
        }
        Integer num3 = t0Var.f1640p;
        if (num3 != null) {
            this.f1528p = num3;
        }
        Boolean bool = t0Var.f1641q;
        if (bool != null) {
            this.f1529q = bool;
        }
        Boolean bool2 = t0Var.f1642r;
        if (bool2 != null) {
            this.f1530r = bool2;
        }
        Integer num4 = t0Var.f1643s;
        if (num4 != null) {
            this.f1531s = num4;
        }
        Integer num5 = t0Var.f1644t;
        if (num5 != null) {
            this.f1531s = num5;
        }
        Integer num6 = t0Var.f1645u;
        if (num6 != null) {
            this.f1532t = num6;
        }
        Integer num7 = t0Var.f1646v;
        if (num7 != null) {
            this.f1533u = num7;
        }
        Integer num8 = t0Var.f1647w;
        if (num8 != null) {
            this.f1534v = num8;
        }
        Integer num9 = t0Var.f1648x;
        if (num9 != null) {
            this.f1535w = num9;
        }
        Integer num10 = t0Var.f1649y;
        if (num10 != null) {
            this.f1536x = num10;
        }
        CharSequence charSequence8 = t0Var.f1650z;
        if (charSequence8 != null) {
            this.f1537y = charSequence8;
        }
        CharSequence charSequence9 = t0Var.A;
        if (charSequence9 != null) {
            this.f1538z = charSequence9;
        }
        CharSequence charSequence10 = t0Var.B;
        if (charSequence10 != null) {
            this.A = charSequence10;
        }
        Integer num11 = t0Var.C;
        if (num11 != null) {
            this.B = num11;
        }
        Integer num12 = t0Var.D;
        if (num12 != null) {
            this.C = num12;
        }
        CharSequence charSequence11 = t0Var.E;
        if (charSequence11 != null) {
            this.D = charSequence11;
        }
        CharSequence charSequence12 = t0Var.F;
        if (charSequence12 != null) {
            this.E = charSequence12;
        }
        CharSequence charSequence13 = t0Var.G;
        if (charSequence13 != null) {
            this.F = charSequence13;
        }
        Integer num13 = t0Var.H;
        if (num13 != null) {
            this.G = num13;
        }
        Bundle bundle = t0Var.I;
        if (bundle != null) {
            this.H = bundle;
        }
        if (t0Var2.isEmpty()) {
            return;
        }
        this.I = fh.t0.o(t0Var2);
    }

    public final void c(byte[] bArr, Integer num) {
        this.f1525k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = num;
    }

    public final void d(Long l) {
        ta.c0.s(l == null || l.longValue() >= 0);
        this.f1522h = l;
    }
}
