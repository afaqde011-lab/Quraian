package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

public final class l {

    public final androidx.datastore.preferences.protobuf.j f918a;

    public int f919b;

    public int f920c;

    public int f921d = 0;

    public l(androidx.datastore.preferences.protobuf.j jVar) {
        Charset charset = e0.f885a;
        this.f918a = jVar;
        jVar.f632b = this;
    }

    public static void w(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void x(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int a() {
        int i10 = this.f921d;
        if (i10 != 0) {
            this.f919b = i10;
            this.f921d = 0;
        } else {
            this.f919b = this.f918a.F();
        }
        int i11 = this.f919b;
        if (i11 == 0 || i11 == this.f920c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final void b(Object obj, z0 z0Var, r rVar) {
        int i10 = this.f920c;
        this.f920c = ((this.f919b >>> 3) << 3) | 4;
        try {
            z0Var.b(obj, this, rVar);
            if (this.f919b != this.f920c) {
                throw InvalidProtocolBufferException.f();
            }
            this.f920c = i10;
        } catch (Throwable th2) {
            this.f920c = i10;
            throw th2;
        }
    }

    public final void c(Object obj, z0 z0Var, r rVar) throws InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        int iG = jVar.G();
        if (jVar.f631a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iN = jVar.n(iG);
        jVar.f631a++;
        z0Var.b(obj, this, rVar);
        jVar.b(0);
        jVar.f631a--;
        jVar.l(iN);
    }

    public final void d(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof e;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Boolean.valueOf(jVar.o()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Boolean.valueOf(jVar.o()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        e eVar = (e) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                eVar.addBoolean(jVar.o());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            eVar.addBoolean(jVar.o());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final i e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        v(2);
        return this.f918a.q();
    }

    public final void f(d0 d0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        if ((this.f919b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            d0Var.add(e());
            androidx.datastore.preferences.protobuf.j jVar = this.f918a;
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f919b);
        this.f921d = iF;
    }

    public final void g(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof p;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 1) {
                do {
                    d0Var.add(Double.valueOf(jVar.s()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                d0Var.add(Double.valueOf(jVar.s()));
            } while (jVar.h() < iH);
            return;
        }
        p pVar = (p) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 1) {
            do {
                pVar.addDouble(jVar.s());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = jVar.G();
        x(iG2);
        int iH2 = jVar.h() + iG2;
        do {
            pVar.addDouble(jVar.s());
        } while (jVar.h() < iH2);
    }

    public final void h(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Integer.valueOf(jVar.t()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Integer.valueOf(jVar.t()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                a0Var.addInt(jVar.t());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            a0Var.addInt(jVar.t());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void i(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    d0Var.add(Integer.valueOf(jVar.u()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                d0Var.add(Integer.valueOf(jVar.u()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f919b);
            this.f921d = iF;
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                a0Var.addInt(jVar.u());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            a0Var.addInt(jVar.u());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f919b);
        this.f921d = iF2;
    }

    public final void j(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 1) {
                do {
                    d0Var.add(Long.valueOf(jVar.v()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                d0Var.add(Long.valueOf(jVar.v()));
            } while (jVar.h() < iH);
            return;
        }
        i0 i0Var = (i0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(jVar.v());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = jVar.G();
        x(iG2);
        int iH2 = jVar.h() + iG2;
        do {
            i0Var.addLong(jVar.v());
        } while (jVar.h() < iH2);
    }

    public final void k(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof v;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    d0Var.add(Float.valueOf(jVar.w()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                d0Var.add(Float.valueOf(jVar.w()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f919b);
            this.f921d = iF;
            return;
        }
        v vVar = (v) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                vVar.addFloat(jVar.w());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            vVar.addFloat(jVar.w());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f919b);
        this.f921d = iF2;
    }

    public final void l(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Integer.valueOf(jVar.x()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Integer.valueOf(jVar.x()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                a0Var.addInt(jVar.x());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            a0Var.addInt(jVar.x());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void m(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Long.valueOf(jVar.y()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Long.valueOf(jVar.y()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.y());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            i0Var.addLong(jVar.y());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void n(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    d0Var.add(Integer.valueOf(jVar.z()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                d0Var.add(Integer.valueOf(jVar.z()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f919b);
            this.f921d = iF;
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                a0Var.addInt(jVar.z());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            a0Var.addInt(jVar.z());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f919b);
        this.f921d = iF2;
    }

    public final void o(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 1) {
                do {
                    d0Var.add(Long.valueOf(jVar.A()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                d0Var.add(Long.valueOf(jVar.A()));
            } while (jVar.h() < iH);
            return;
        }
        i0 i0Var = (i0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(jVar.A());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = jVar.G();
        x(iG2);
        int iH2 = jVar.h() + iG2;
        do {
            i0Var.addLong(jVar.A());
        } while (jVar.h() < iH2);
    }

    public final void p(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Integer.valueOf(jVar.B()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Integer.valueOf(jVar.B()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                a0Var.addInt(jVar.B());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            a0Var.addInt(jVar.B());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void q(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Long.valueOf(jVar.C()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Long.valueOf(jVar.C()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.C());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            i0Var.addLong(jVar.C());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void r(d0 d0Var, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strD;
        int iF;
        if ((this.f919b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            androidx.datastore.preferences.protobuf.j jVar = this.f918a;
            if (z10) {
                v(2);
                strD = jVar.E();
            } else {
                v(2);
                strD = jVar.D();
            }
            d0Var.add(strD);
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f919b);
        this.f921d = iF;
    }

    public final void s(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof a0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Integer.valueOf(jVar.G()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Integer.valueOf(jVar.G()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        a0 a0Var = (a0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                a0Var.addInt(jVar.G());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            a0Var.addInt(jVar.G());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void t(d0 d0Var) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = d0Var instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f918a;
        if (!z10) {
            int i10 = this.f919b & 7;
            if (i10 == 0) {
                do {
                    d0Var.add(Long.valueOf(jVar.H()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f919b);
                this.f921d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                d0Var.add(Long.valueOf(jVar.H()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) d0Var;
        int i11 = this.f919b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.H());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f919b);
            this.f921d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            i0Var.addLong(jVar.H());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void u(int i10) throws InvalidProtocolBufferException {
        if (this.f918a.h() != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void v(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f919b & 7) != i10) {
            throw InvalidProtocolBufferException.c();
        }
    }
}
