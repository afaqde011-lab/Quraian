package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public final class l {

    public final androidx.datastore.preferences.protobuf.j f4284a;

    public int f4285b;

    public int f4286c;

    public int f4287d = 0;

    public l(androidx.datastore.preferences.protobuf.j jVar) {
        b0.a(jVar, "input");
        this.f4284a = jVar;
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
        int i10 = this.f4287d;
        if (i10 != 0) {
            this.f4285b = i10;
            this.f4287d = 0;
        } else {
            this.f4285b = this.f4284a.F();
        }
        int i11 = this.f4285b;
        if (i11 == 0 || i11 == this.f4286c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final void b(Object obj, a1 a1Var, p pVar) {
        int i10 = this.f4286c;
        this.f4286c = ((this.f4285b >>> 3) << 3) | 4;
        try {
            a1Var.e(obj, this, pVar);
            if (this.f4285b != this.f4286c) {
                throw InvalidProtocolBufferException.f();
            }
            this.f4286c = i10;
        } catch (Throwable th2) {
            this.f4286c = i10;
            throw th2;
        }
    }

    public final void c(Object obj, a1 a1Var, p pVar) throws InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        int iG = jVar.G();
        if (jVar.f631a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iN = jVar.n(iG);
        jVar.f631a++;
        a1Var.e(obj, this, pVar);
        jVar.b(0);
        jVar.f631a--;
        jVar.l(iN);
    }

    public final void d(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof e;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(jVar.o()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Boolean.valueOf(jVar.o()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        e eVar = (e) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                eVar.addBoolean(jVar.o());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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
        return this.f4284a.r();
    }

    public final void f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        if ((this.f4285b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(e());
            androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f4285b);
        this.f4287d = iF;
    }

    public final void g(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof n;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(jVar.s()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                list.add(Double.valueOf(jVar.s()));
            } while (jVar.h() < iH);
            return;
        }
        n nVar = (n) list;
        int i11 = this.f4285b & 7;
        if (i11 == 1) {
            do {
                nVar.addDouble(jVar.s());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iG2 = jVar.G();
        x(iG2);
        int iH2 = jVar.h() + iG2;
        do {
            nVar.addDouble(jVar.s());
        } while (jVar.h() < iH2);
    }

    public final void h(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.t()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Integer.valueOf(jVar.t()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(jVar.t());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            yVar.addInt(jVar.t());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void i(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    list.add(Integer.valueOf(jVar.u()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(jVar.u()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f4285b);
            this.f4287d = iF;
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                yVar.addInt(jVar.u());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            yVar.addInt(jVar.u());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f4285b);
        this.f4287d = iF2;
    }

    public final void j(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(jVar.v()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                list.add(Long.valueOf(jVar.v()));
            } while (jVar.h() < iH);
            return;
        }
        i0 i0Var = (i0) list;
        int i11 = this.f4285b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(jVar.v());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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

    public final void k(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof t;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    list.add(Float.valueOf(jVar.w()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(jVar.w()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f4285b);
            this.f4287d = iF;
            return;
        }
        t tVar = (t) list;
        int i11 = this.f4285b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                tVar.addFloat(jVar.w());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            tVar.addFloat(jVar.w());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f4285b);
        this.f4287d = iF2;
    }

    public final void l(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.x()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Integer.valueOf(jVar.x()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(jVar.x());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            yVar.addInt(jVar.x());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.y()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Long.valueOf(jVar.y()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.y());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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

    public final void n(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 2) {
                int iG = jVar.G();
                w(iG);
                int iH = jVar.h() + iG;
                do {
                    list.add(Integer.valueOf(jVar.z()));
                } while (jVar.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(jVar.z()));
                if (jVar.i()) {
                    return;
                } else {
                    iF = jVar.F();
                }
            } while (iF == this.f4285b);
            this.f4287d = iF;
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 2) {
            int iG2 = jVar.G();
            w(iG2);
            int iH2 = jVar.h() + iG2;
            do {
                yVar.addInt(jVar.z());
            } while (jVar.h() < iH2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            yVar.addInt(jVar.z());
            if (jVar.i()) {
                return;
            } else {
                iF2 = jVar.F();
            }
        } while (iF2 == this.f4285b);
        this.f4287d = iF2;
    }

    public final void o(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(jVar.A()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iG = jVar.G();
            x(iG);
            int iH = jVar.h() + iG;
            do {
                list.add(Long.valueOf(jVar.A()));
            } while (jVar.h() < iH);
            return;
        }
        i0 i0Var = (i0) list;
        int i11 = this.f4285b & 7;
        if (i11 == 1) {
            do {
                i0Var.addLong(jVar.A());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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

    public final void p(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.B()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Integer.valueOf(jVar.B()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(jVar.B());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            yVar.addInt(jVar.B());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void q(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.C()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Long.valueOf(jVar.C()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.C());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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

    public final void r(List list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strD;
        int iF;
        int iF2;
        if ((this.f4285b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z11 = list instanceof e0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (z11 && !z10) {
            e0 e0Var = (e0) list;
            do {
                e0Var.g(e());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        do {
            if (z10) {
                v(2);
                strD = jVar.E();
            } else {
                v(2);
                strD = jVar.D();
            }
            list.add(strD);
            if (jVar.i()) {
                return;
            } else {
                iF = jVar.F();
            }
        } while (iF == this.f4285b);
        this.f4287d = iF;
    }

    public final void s(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof y;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.G()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Integer.valueOf(jVar.G()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        y yVar = (y) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                yVar.addInt(jVar.G());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int iH2 = jVar.h() + jVar.G();
        do {
            yVar.addInt(jVar.G());
        } while (jVar.h() < iH2);
        u(iH2);
    }

    public final void t(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z10 = list instanceof i0;
        androidx.datastore.preferences.protobuf.j jVar = this.f4284a;
        if (!z10) {
            int i10 = this.f4285b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.H()));
                    if (jVar.i()) {
                        return;
                    } else {
                        iF = jVar.F();
                    }
                } while (iF == this.f4285b);
                this.f4287d = iF;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int iH = jVar.h() + jVar.G();
            do {
                list.add(Long.valueOf(jVar.H()));
            } while (jVar.h() < iH);
            u(iH);
            return;
        }
        i0 i0Var = (i0) list;
        int i11 = this.f4285b & 7;
        if (i11 == 0) {
            do {
                i0Var.addLong(jVar.H());
                if (jVar.i()) {
                    return;
                } else {
                    iF2 = jVar.F();
                }
            } while (iF2 == this.f4285b);
            this.f4287d = iF2;
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
        if (this.f4284a.h() != i10) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void v(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f4285b & 7) != i10) {
            throw InvalidProtocolBufferException.c();
        }
    }
}
