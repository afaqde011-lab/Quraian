package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

public final class k {

    public final j f633a;

    public int f634b;

    public int f635c;

    public int f636d = 0;

    public k(j jVar) {
        Charset charset = x.f684a;
        this.f633a = jVar;
        jVar.f632b = this;
    }

    public final int a() {
        int i10 = this.f636d;
        if (i10 != 0) {
            this.f634b = i10;
            this.f636d = 0;
        } else {
            this.f634b = this.f633a.F();
        }
        int i11 = this.f634b;
        if (i11 == 0 || i11 == this.f635c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final void b(Object obj, u0 u0Var, n nVar) {
        int i10 = this.f635c;
        this.f635c = ((this.f634b >>> 3) << 3) | 4;
        try {
            u0Var.e(obj, this, nVar);
            if (this.f634b != this.f635c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f635c = i10;
        } catch (Throwable th2) {
            this.f635c = i10;
            throw th2;
        }
    }

    public final void c(Object obj, u0 u0Var, n nVar) throws InvalidProtocolBufferException {
        j jVar = this.f633a;
        int iG = jVar.G();
        if (jVar.f631a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iN = jVar.n(iG);
        jVar.f631a++;
        u0Var.e(obj, this, nVar);
        jVar.b(0);
        jVar.f631a--;
        jVar.l(iN);
    }

    public final void d(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Boolean.valueOf(jVar.o()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Boolean.valueOf(jVar.o()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final g e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.f633a.p();
    }

    public final void f(w wVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        if ((this.f634b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((s0) wVar).add(e());
            j jVar = this.f633a;
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f634b);
        this.f636d = iF;
    }

    public final void g(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 1) {
            do {
                ((s0) wVar).add(Double.valueOf(jVar.s()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = jVar.G();
        if ((iG & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iH = jVar.h() + iG;
        do {
            ((s0) wVar).add(Double.valueOf(jVar.s()));
        } while (jVar.h() < iH);
    }

    public final void h(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.t()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.t()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final Object i(p1 p1Var, Class cls, n nVar) throws InvalidProtocolBufferException {
        int iOrdinal = p1Var.ordinal();
        j jVar = this.f633a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(jVar.s());
            case 1:
                w(5);
                return Float.valueOf(jVar.w());
            case 2:
                w(0);
                return Long.valueOf(jVar.y());
            case 3:
                w(0);
                return Long.valueOf(jVar.H());
            case 4:
                w(0);
                return Integer.valueOf(jVar.x());
            case 5:
                w(1);
                return Long.valueOf(jVar.v());
            case 6:
                w(5);
                return Integer.valueOf(jVar.u());
            case 7:
                w(0);
                return Boolean.valueOf(jVar.o());
            case 8:
                w(2);
                return jVar.E();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                u0 u0VarA = r0.f672c.a(cls);
                v vVarNewInstance = u0VarA.newInstance();
                c(vVarNewInstance, u0VarA, nVar);
                u0VarA.makeImmutable(vVarNewInstance);
                return vVarNewInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(jVar.G());
            case 13:
                w(0);
                return Integer.valueOf(jVar.t());
            case 14:
                w(5);
                return Integer.valueOf(jVar.z());
            case 15:
                w(1);
                return Long.valueOf(jVar.A());
            case 16:
                w(0);
                return Integer.valueOf(jVar.B());
            case 17:
                w(0);
                return Long.valueOf(jVar.C());
        }
    }

    public final void j(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 2) {
            int iG = jVar.G();
            if ((iG & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iH = jVar.h() + iG;
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.u()));
            } while (jVar.h() < iH);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.u()));
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f634b);
        this.f636d = iF;
    }

    public final void k(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 1) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.v()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = jVar.G();
        if ((iG & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iH = jVar.h() + iG;
        do {
            ((s0) wVar).add(Long.valueOf(jVar.v()));
        } while (jVar.h() < iH);
    }

    public final void l(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 2) {
            int iG = jVar.G();
            if ((iG & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iH = jVar.h() + iG;
            do {
                ((s0) wVar).add(Float.valueOf(jVar.w()));
            } while (jVar.h() < iH);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((s0) wVar).add(Float.valueOf(jVar.w()));
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f634b);
        this.f636d = iF;
    }

    public final void m(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.x()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.x()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void n(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.y()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.y()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void o(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 2) {
            int iG = jVar.G();
            if ((iG & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iH = jVar.h() + iG;
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.z()));
            } while (jVar.h() < iH);
            return;
        }
        if (i10 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.z()));
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f634b);
        this.f636d = iF;
    }

    public final void p(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 1) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.A()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iG = jVar.G();
        if ((iG & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iH = jVar.h() + iG;
        do {
            ((s0) wVar).add(Long.valueOf(jVar.A()));
        } while (jVar.h() < iH);
    }

    public final void q(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.B()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.B()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void r(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.C()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.C()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void s(w wVar, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strD;
        int iF;
        if ((this.f634b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            j jVar = this.f633a;
            if (z10) {
                w(2);
                strD = jVar.E();
            } else {
                w(2);
                strD = jVar.D();
            }
            ((s0) wVar).add(strD);
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f634b);
        this.f636d = iF;
    }

    public final void t(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.G()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.G()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void u(w wVar) throws InvalidProtocolBufferException {
        int iF;
        int i10 = this.f634b & 7;
        j jVar = this.f633a;
        if (i10 == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.H()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f634b);
            this.f636d = iF;
            return;
        }
        if (i10 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iH = jVar.h() + jVar.G();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.H()));
        } while (jVar.h() < iH);
        v(iH);
    }

    public final void v(int i10) throws InvalidProtocolBufferException {
        if (this.f633a.h() != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f634b & 7) != i10) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i10;
        j jVar = this.f633a;
        if (jVar.i() || (i10 = this.f634b) == this.f635c) {
            return false;
        }
        return jVar.I(i10);
    }
}
