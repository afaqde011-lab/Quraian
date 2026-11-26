package r40;

import kotlin.NoWhenBranchMatchedException;
import l1.q1;
import qd.j0;
import qd.s0;

public final class u extends s0 implements q40.p {
    public final androidx.media3.common.q b;
    public final q40.c c;
    public final x d;
    public final q40.p[] e;
    public final ce.c f;
    public final q1 g;
    public boolean h;
    public String i;
    public String j;

    public u(androidx.media3.common.q composer, q40.c cVar, x xVar, q40.p[] pVarArr) {
        kotlin.jvm.internal.m.e(composer, "composer");
        this.b = composer;
        this.c = cVar;
        this.d = xVar;
        this.e = pVarArr;
        this.f = cVar.b;
        this.g = cVar.a;
        int iOrdinal = xVar.ordinal();
        if (pVarArr != null) {
            q40.p pVar = pVarArr[iOrdinal];
            if (pVar == null && pVar == this) {
                return;
            }
            pVarArr[iOrdinal] = this;
        }
    }

    @Override
    public final void D(String value) {
        kotlin.jvm.internal.m.e(value, "value");
        this.b.q(value);
    }

    @Override
    public final void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        androidx.media3.common.q qVar = this.b;
        qVar.getClass();
        qVar.B = false;
        qVar.l(this.d.B);
    }

    @Override
    public final ce.c b() {
        return this.f;
    }

    @Override
    public final o40.b c(n40.e descriptor) {
        q40.p pVar;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        q40.c cVar = this.c;
        x xVarP = j.p(descriptor, cVar);
        char c = xVarP.A;
        androidx.media3.common.q qVar = this.b;
        qVar.l(c);
        qVar.B = true;
        String str = this.i;
        if (str != null) {
            String strA = this.j;
            if (strA == null) {
                strA = descriptor.a();
            }
            qVar.j();
            D(str);
            qVar.l(':');
            D(strA);
            this.i = null;
            this.j = null;
        }
        if (this.d == xVarP) {
            return this;
        }
        q40.p[] pVarArr = this.e;
        return (pVarArr == null || (pVar = pVarArr[xVarP.ordinal()]) == null) ? new u(qVar, cVar, xVarP, pVarArr) : pVar;
    }

    public final void c0(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        int iOrdinal = this.d.ordinal();
        androidx.media3.common.q qVar = this.b;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!qVar.B) {
                qVar.l(',');
            }
            qVar.j();
            return;
        }
        if (iOrdinal == 2) {
            if (qVar.B) {
                this.h = true;
                qVar.j();
                return;
            }
            if (i % 2 == 0) {
                qVar.l(',');
                qVar.j();
            } else {
                qVar.l(':');
                qVar.r();
                z = false;
            }
            this.h = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!qVar.B) {
                qVar.l(',');
            }
            qVar.j();
            j.n(descriptor, this.c);
            D(descriptor.f(i));
            qVar.l(':');
            qVar.r();
            return;
        }
        if (i == 0) {
            this.h = true;
        }
        if (i == 1) {
            qVar.l(',');
            qVar.r();
            this.h = false;
        }
    }

    @Override
    public final void d() {
        this.b.o("null");
    }

    @Override
    public final void e(double d) {
        boolean z = this.h;
        androidx.media3.common.q qVar = this.b;
        if (z) {
            D(String.valueOf(d));
        } else {
            ((j0) qVar.C).q(String.valueOf(d));
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw j.a(Double.valueOf(d), ((j0) qVar.C).toString());
        }
    }

    @Override
    public final void f(short s) {
        if (this.h) {
            D(String.valueOf((int) s));
        } else {
            this.b.p(s);
        }
    }

    @Override
    public final void g(byte b) {
        if (this.h) {
            D(String.valueOf((int) b));
        } else {
            this.b.k(b);
        }
    }

    @Override
    public final void h(boolean z) {
        if (this.h) {
            D(String.valueOf(z));
        } else {
            ((j0) this.b.C).q(String.valueOf(z));
        }
    }

    @Override
    public final boolean k(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return false;
    }

    @Override
    public final void l(float f) {
        boolean z = this.h;
        androidx.media3.common.q qVar = this.b;
        if (z) {
            D(String.valueOf(f));
        } else {
            ((j0) qVar.C).q(String.valueOf(f));
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw j.a(Float.valueOf(f), ((j0) qVar.C).toString());
        }
    }

    @Override
    public final o40.d o(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        boolean zA = v.a(descriptor);
        x xVar = this.d;
        q40.c cVar = this.c;
        androidx.media3.common.q fVar = this.b;
        if (zA) {
            if (!(fVar instanceof g)) {
                fVar = new g((j0) fVar.C, this.h);
            }
            return new u(fVar, cVar, xVar, null);
        }
        if (descriptor.isInline() && descriptor.equals(q40.m.a)) {
            if (!(fVar instanceof f)) {
                fVar = new f((j0) fVar.C, this.h);
            }
            return new u(fVar, cVar, xVar, null);
        }
        if (this.i != null) {
            this.j = descriptor.a();
        }
        return this;
    }

    @Override
    public final void p(char c) {
        D(String.valueOf(c));
    }

    @Override
    public final void q(n40.e enumDescriptor, int i) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        D(enumDescriptor.f(i));
    }

    @Override
    public final void v(int i) {
        if (this.h) {
            D(String.valueOf(i));
        } else {
            this.b.m(i);
        }
    }

    @Override
    public final void x(n40.e descriptor, int i, l40.a serializer, Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        if (obj != null || this.g.c) {
            super.x(descriptor, i, serializer, obj);
        }
    }

    @Override
    public final void y(l40.a serializer, Object obj) {
        String strI;
        kotlin.jvm.internal.m.e(serializer, "serializer");
        q40.c cVar = this.c;
        q1 q1Var = cVar.a;
        boolean z = serializer instanceof l40.c;
        if (!z) {
            int iOrdinal = ((q40.a) q1Var.g).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    va.a kind = serializer.getDescriptor().getKind();
                    strI = (kotlin.jvm.internal.m.a(kind, n40.i.c) || kotlin.jvm.internal.m.a(kind, n40.i.f)) ? j.i(serializer.getDescriptor(), cVar) : null;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (((q40.a) q1Var.g) != q40.a.A) {
        }
        if (z) {
            l40.c cVar2 = (l40.c) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + cVar2.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            l40.a aVarJ = va.a.J(cVar2, this, obj);
            if (strI != null) {
                j.e(serializer, aVarJ, strI);
            }
            j.h(aVarJ.getDescriptor().getKind());
            serializer = aVarJ;
        }
        if (strI != null) {
            String strA = serializer.getDescriptor().a();
            this.i = strI;
            this.j = strA;
        }
        serializer.serialize(this, obj);
    }

    @Override
    public final void z(long j) {
        if (this.h) {
            D(String.valueOf(j));
        } else {
            this.b.n(j);
        }
    }
}
