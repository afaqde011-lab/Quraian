package iv;

import bv.o1;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gv.a0;
import hb.u;
import l1.g0;
import l1.r1;
import l1.z0;
import w.c0;
import w.d0;
import w.s0;
import x.v;

public abstract class k {
    public static final x.r a = new x.r(0.33333334f, 0.6666667f, 0.6666667f, 1.0f);
    public static final float b = 30;

    public static final void a(final o1 uiState, final u00.k onAction, final jk.a backdrop, final long j, b2.r rVar, float f, boolean z, l1.j jVar, final int i, final int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        float f2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        boolean z3;
        l1.j jVar2;
        final b2.r rVar3;
        final float f3;
        final boolean z4;
        r1 r1VarT;
        int i9;
        b2.r rVar4;
        final boolean z5;
        boolean z6;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-27233455);
        if ((i & 6) == 0) {
            i3 = (jVar3.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar3.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= jVar3.i(backdrop) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= jVar3.f(j) ? 2048 : 1024;
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                rVar2 = rVar;
                i3 |= jVar3.g(rVar2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (jVar3.d(f2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((599187 & i8) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i8 & 1, z3)) {
                        if (i11 != 0) {
                            rVar4 = b2.o.A;
                            i9 = i4;
                        } else {
                            i9 = i4;
                            rVar4 = rVar2;
                        }
                        if (i9 != 0) {
                            f2 = 0;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (uiState.W != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        final float f4 = f2;
                        jVar2 = jVar3;
                        c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                d0 AnimatedVisibility = (d0) obj;
                                g0 g0Var = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f4, 7);
                                boolean z7 = uiState.a0;
                                g0 g0Var2 = g0Var;
                                u00.k kVar = onAction;
                                boolean zG = g0Var2.g(kVar);
                                Object objN = g0Var2.N();
                                Object obj4 = l1.i.a;
                                if (zG || objN == obj4) {
                                    objN = new a0(19, kVar);
                                    g0Var2.n0(objN);
                                }
                                u00.a aVar = (u00.a) objN;
                                boolean zG2 = g0Var2.g(kVar);
                                Object objN2 = g0Var2.N();
                                if (zG2 || objN2 == obj4) {
                                    objN2 = new a0(20, kVar);
                                    g0Var2.n0(objN2);
                                }
                                k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                                return b0.a;
                            }
                        }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                        z4 = z5;
                        rVar3 = rVar4;
                        f3 = f4;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar3 = rVar2;
                        f3 = f2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                                return b0.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                z2 = z;
                i8 = i3;
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i8 & 1, z3)) {
                    if (i11 != 0) {
                        rVar4 = b2.o.A;
                        i9 = i4;
                    } else {
                        i9 = i4;
                        rVar4 = rVar2;
                    }
                    if (i9 != 0) {
                        f2 = 0;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (uiState.W != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    final float f5 = f2;
                    jVar2 = jVar3;
                    c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            d0 AnimatedVisibility = (d0) obj;
                            g0 g0Var = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f5, 7);
                            boolean z7 = uiState.a0;
                            g0 g0Var2 = g0Var;
                            u00.k kVar = onAction;
                            boolean zG = g0Var2.g(kVar);
                            Object objN = g0Var2.N();
                            Object obj4 = l1.i.a;
                            if (zG || objN == obj4) {
                                objN = new a0(19, kVar);
                                g0Var2.n0(objN);
                            }
                            u00.a aVar = (u00.a) objN;
                            boolean zG2 = g0Var2.g(kVar);
                            Object objN2 = g0Var2.N();
                            if (zG2 || objN2 == obj4) {
                                objN2 = new a0(20, kVar);
                                g0Var2.n0(objN2);
                            }
                            k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                            return b0.a;
                        }
                    }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                    z4 = z5;
                    rVar3 = rVar4;
                    f3 = f5;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar3 = rVar2;
                    f3 = f2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i8 & 1, z3)) {
                    if (i11 != 0) {
                        rVar4 = b2.o.A;
                        i9 = i4;
                    } else {
                        i9 = i4;
                        rVar4 = rVar2;
                    }
                    if (i9 != 0) {
                        f2 = 0;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (uiState.W != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    final float f6 = f2;
                    jVar2 = jVar3;
                    c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            d0 AnimatedVisibility = (d0) obj;
                            g0 g0Var = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f6, 7);
                            boolean z7 = uiState.a0;
                            g0 g0Var2 = g0Var;
                            u00.k kVar = onAction;
                            boolean zG = g0Var2.g(kVar);
                            Object objN = g0Var2.N();
                            Object obj4 = l1.i.a;
                            if (zG || objN == obj4) {
                                objN = new a0(19, kVar);
                                g0Var2.n0(objN);
                            }
                            u00.a aVar = (u00.a) objN;
                            boolean zG2 = g0Var2.g(kVar);
                            Object objN2 = g0Var2.N();
                            if (zG2 || objN2 == obj4) {
                                objN2 = new a0(20, kVar);
                                g0Var2.n0(objN2);
                            }
                            k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                            return b0.a;
                        }
                    }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                    z4 = z5;
                    rVar3 = rVar4;
                    f3 = f6;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar3 = rVar2;
                    f3 = f2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            i8 = i3;
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i8 & 1, z3)) {
                if (i11 != 0) {
                    rVar4 = b2.o.A;
                    i9 = i4;
                } else {
                    i9 = i4;
                    rVar4 = rVar2;
                }
                if (i9 != 0) {
                    f2 = 0;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (uiState.W != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                final float f7 = f2;
                jVar2 = jVar3;
                c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        d0 AnimatedVisibility = (d0) obj;
                        g0 g0Var = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f7, 7);
                        boolean z7 = uiState.a0;
                        g0 g0Var2 = g0Var;
                        u00.k kVar = onAction;
                        boolean zG = g0Var2.g(kVar);
                        Object objN = g0Var2.N();
                        Object obj4 = l1.i.a;
                        if (zG || objN == obj4) {
                            objN = new a0(19, kVar);
                            g0Var2.n0(objN);
                        }
                        u00.a aVar = (u00.a) objN;
                        boolean zG2 = g0Var2.g(kVar);
                        Object objN2 = g0Var2.N();
                        if (zG2 || objN2 == obj4) {
                            objN2 = new a0(20, kVar);
                            g0Var2.n0(objN2);
                        }
                        k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                        return b0.a;
                    }
                }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                z4 = z5;
                rVar3 = rVar4;
                f3 = f7;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
                f3 = f2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 24576;
        rVar2 = rVar;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (jVar3.d(f2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i8 & 1, z3)) {
                    if (i11 != 0) {
                        rVar4 = b2.o.A;
                        i9 = i4;
                    } else {
                        i9 = i4;
                        rVar4 = rVar2;
                    }
                    if (i9 != 0) {
                        f2 = 0;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (uiState.W != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    final float f8 = f2;
                    jVar2 = jVar3;
                    c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            d0 AnimatedVisibility = (d0) obj;
                            g0 g0Var = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f8, 7);
                            boolean z7 = uiState.a0;
                            g0 g0Var2 = g0Var;
                            u00.k kVar = onAction;
                            boolean zG = g0Var2.g(kVar);
                            Object objN = g0Var2.N();
                            Object obj4 = l1.i.a;
                            if (zG || objN == obj4) {
                                objN = new a0(19, kVar);
                                g0Var2.n0(objN);
                            }
                            u00.a aVar = (u00.a) objN;
                            boolean zG2 = g0Var2.g(kVar);
                            Object objN2 = g0Var2.N();
                            if (zG2 || objN2 == obj4) {
                                objN2 = new a0(20, kVar);
                                g0Var2.n0(objN2);
                            }
                            k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                            return b0.a;
                        }
                    }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                    z4 = z5;
                    rVar3 = rVar4;
                    f3 = f8;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar3 = rVar2;
                    f3 = f2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            z2 = z;
            i8 = i3;
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i8 & 1, z3)) {
                if (i11 != 0) {
                    rVar4 = b2.o.A;
                    i9 = i4;
                } else {
                    i9 = i4;
                    rVar4 = rVar2;
                }
                if (i9 != 0) {
                    f2 = 0;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (uiState.W != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                final float f9 = f2;
                jVar2 = jVar3;
                c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        d0 AnimatedVisibility = (d0) obj;
                        g0 g0Var = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f9, 7);
                        boolean z7 = uiState.a0;
                        g0 g0Var2 = g0Var;
                        u00.k kVar = onAction;
                        boolean zG = g0Var2.g(kVar);
                        Object objN = g0Var2.N();
                        Object obj4 = l1.i.a;
                        if (zG || objN == obj4) {
                            objN = new a0(19, kVar);
                            g0Var2.n0(objN);
                        }
                        u00.a aVar = (u00.a) objN;
                        boolean zG2 = g0Var2.g(kVar);
                        Object objN2 = g0Var2.N();
                        if (zG2 || objN2 == obj4) {
                            objN2 = new a0(20, kVar);
                            g0Var2.n0(objN2);
                        }
                        k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                        return b0.a;
                    }
                }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                z4 = z5;
                rVar3 = rVar4;
                f3 = f9;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
                f3 = f2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 196608;
        f2 = f;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                if (jVar3.h(z2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i8 & 1, z3)) {
                if (i11 != 0) {
                    rVar4 = b2.o.A;
                    i9 = i4;
                } else {
                    i9 = i4;
                    rVar4 = rVar2;
                }
                if (i9 != 0) {
                    f2 = 0;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (uiState.W != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                final float f11 = f2;
                jVar2 = jVar3;
                c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        d0 AnimatedVisibility = (d0) obj;
                        g0 g0Var = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f11, 7);
                        boolean z7 = uiState.a0;
                        g0 g0Var2 = g0Var;
                        u00.k kVar = onAction;
                        boolean zG = g0Var2.g(kVar);
                        Object objN = g0Var2.N();
                        Object obj4 = l1.i.a;
                        if (zG || objN == obj4) {
                            objN = new a0(19, kVar);
                            g0Var2.n0(objN);
                        }
                        u00.a aVar = (u00.a) objN;
                        boolean zG2 = g0Var2.g(kVar);
                        Object objN2 = g0Var2.N();
                        if (zG2 || objN2 == obj4) {
                            objN2 = new a0(20, kVar);
                            g0Var2.n0(objN2);
                        }
                        k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                        return b0.a;
                    }
                }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
                z4 = z5;
                rVar3 = rVar4;
                f3 = f11;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
                f3 = f2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        z2 = z;
        i8 = i3;
        if ((599187 & i8) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i8 & 1, z3)) {
            if (i11 != 0) {
                rVar4 = b2.o.A;
                i9 = i4;
            } else {
                i9 = i4;
                rVar4 = rVar2;
            }
            if (i9 != 0) {
                f2 = 0;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (uiState.W != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            final float f12 = f2;
            jVar2 = jVar3;
            c0.c(z6, rVar4, s0.c(x.c.w(250, 0, (v) null, 6), 2).a(s0.b(x.c.w(250, 0, (v) null, 6), 14)), s0.d(x.c.w(250, 0, (v) null, 6), 2).a(s0.h(x.c.w(250, 0, (v) null, 6), 14)), (String) null, v1.d.d(-269171847, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    d0 AnimatedVisibility = (d0) obj;
                    g0 g0Var = (l1.j) obj2;
                    ((Integer) obj3).getClass();
                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, f12, 7);
                    boolean z7 = uiState.a0;
                    g0 g0Var2 = g0Var;
                    u00.k kVar = onAction;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new a0(19, kVar);
                        g0Var2.n0(objN);
                    }
                    u00.a aVar = (u00.a) objN;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new a0(20, kVar);
                        g0Var2.n0(objN2);
                    }
                    k.b(backdrop, j, aVar, rVarG, z5, z7, (u00.a) objN2, g0Var, 0);
                    return b0.a;
                }
            }, jVar3), jVar2, ((i8 >> 9) & 112) | 200064, 16);
            z4 = z5;
            rVar3 = rVar4;
            f3 = f12;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar3 = rVar2;
            f3 = f2;
            z4 = z2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.a(uiState, onAction, backdrop, j, rVar3, f3, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                    return b0.a;
                }
            };
        }
    }

    public static final void b(final jk.a backdrop, final long j, final u00.a onClick, final b2.r rVar, final boolean z, final boolean z2, final u00.a aVar, l1.j jVar, final int i) {
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1077226248);
        int i2 = i | (g0Var.i(backdrop) ? 4 : 2) | (g0Var.f(j) ? 32 : 16) | (g0Var.i(onClick) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024) | (g0Var.h(z) ? 16384 : 8192) | (g0Var.h(z2) ? 131072 : 65536) | (g0Var.i(aVar) ? 1048576 : 524288);
        if (g0Var.S(i2 & 1, (599187 & i2) != 599186)) {
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = x.c.a(0.0f, 0.01f);
                g0Var.n0(objN);
            }
            x.b bVar = (x.b) objN;
            z0 z0VarG = l1.q.G(Boolean.valueOf(z2), g0Var);
            z0 z0VarG2 = l1.q.G(aVar, g0Var);
            String strU = z3.U(g0Var, 2131887073);
            boolean zG = g0Var.g(z0VarG) | g0Var.g(z0VarG2) | g0Var.i(bVar);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = new ev.p(bVar, z0VarG, z0VarG2, null, 14);
                g0Var.n0(objN2);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN2);
            boolean zG2 = g0Var.g(strU);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                objN3 = new u(strU, 9);
                g0Var.n0(objN3);
            }
            w50.c.f(onClick, backdrop, j3.q.c(rVar, false, (u00.k) objN3), false, false, 38, null, 0L, j, 32, null, 0, v1.d.d(-889639020, new cz.m(1, bVar, strU, z), g0Var), g0Var, ((i2 >> 6) & 14) | 805502976 | ((i2 << 3) & 112) | ((i2 << 21) & 234881024), 432, 1240);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(backdrop, j, onClick, rVar, z, z2, aVar, i) {
                public final jk.a A;
                public final long B;
                public final u00.a C;
                public final b2.r D;
                public final boolean E;
                public final boolean F;
                public final u00.a G;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    k.b(this.A, this.B, this.C, this.D, this.E, this.F, this.G, (l1.j) obj, iK);
                    return b0.a;
                }
            };
        }
    }
}
