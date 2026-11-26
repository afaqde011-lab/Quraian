package ek;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class d1 {
    public static final t0 A;
    public static final i B;

    public static final t0 f5403a;

    public static final t0 f5404b;

    public static final x0 f5405c;

    public static final v0 f5406d;

    public static final v0 f5407e;

    public static final v0 f5408f;

    public static final v0 f5409g;

    public static final t0 f5410h;

    public static final t0 f5411i;

    public static final t0 f5412j;

    public static final b0 f5413k;
    public static final v0 l;
    public static final g0 m;

    public static final h0 f5414n;

    public static final i0 f5415o;

    public static final t0 f5416p;

    public static final t0 f5417q;

    public static final t0 f5418r;

    public static final t0 f5419s;

    public static final t0 f5420t;

    public static final t0 f5421u;

    public static final t0 f5422v;

    public static final t0 f5423w;

    public static final o f5424x;

    public static final t0 f5425y;

    public static final m f5426z;

    static {
        int i10 = 0;
        f5403a = new t0(Class.class, new k0().a(), i10);
        f5404b = new t0(BitSet.class, new u0().a(), i10);
        w0 w0Var = new w0();
        f5405c = new x0();
        f5406d = new v0(Boolean.TYPE, Boolean.class, w0Var);
        f5407e = new v0(Byte.TYPE, Byte.class, new y0());
        f5408f = new v0(Short.TYPE, Short.class, new z0());
        f5409g = new v0(Integer.TYPE, Integer.class, new a1());
        int i11 = 0;
        f5410h = new t0(AtomicInteger.class, new b1().a(), i11);
        f5411i = new t0(AtomicBoolean.class, new c1().a(), i11);
        f5412j = new t0(AtomicIntegerArray.class, new a0().a(), i11);
        f5413k = new b0();
        new c0();
        new d0();
        l = new v0(Character.TYPE, Character.class, new e0());
        f0 f0Var = new f0();
        m = new g0();
        f5414n = new h0();
        f5415o = new i0();
        int i12 = 0;
        f5416p = new t0(String.class, f0Var, i12);
        f5417q = new t0(StringBuilder.class, new j0(), i12);
        f5418r = new t0(StringBuffer.class, new l0(), i12);
        f5419s = new t0(URL.class, new m0(), i12);
        f5420t = new t0(URI.class, new n0(), i12);
        f5421u = new t0(InetAddress.class, new o0(), 1);
        int i13 = 0;
        f5422v = new t0(UUID.class, new p0(), i13);
        f5423w = new t0(Currency.class, new q0().a(), i13);
        f5424x = new o(new r0(), 2);
        f5425y = new t0(Locale.class, new s0(), 0);
        m mVar = m.f5435a;
        f5426z = mVar;
        A = new t0(bk.q.class, mVar, 1);
        B = j.f5431d;
    }
}
