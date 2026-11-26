package eu;

import g1.m6;
import g1.t4;
import g1.u4;
import i2.t0;
import l1.g0;
import l1.r1;

public abstract class q {
    public static final float a = 450;

    public static final void a(final boolean z, final u00.a onAuthorizeClicked, final u00.a onRemindLaterClicked, final u00.a onDismiss, m6 m6Var, l1.j jVar, final int i, final int i2) {
        int i3;
        m6 m6Var2;
        int i4;
        boolean z2;
        l1.j jVar2;
        final m6 m6Var3;
        r1 r1VarT;
        u00.n nVar;
        final m6 m6VarF;
        int i5;
        m6 m6Var4;
        Object objN;
        Object obj;
        a40.z zVar;
        boolean zI;
        Object objN2;
        kotlin.jvm.internal.m.e(onAuthorizeClicked, "onAuthorizeClicked");
        kotlin.jvm.internal.m.e(onRemindLaterClicked, "onRemindLaterClicked");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(978839426);
        if ((i & 6) == 0) {
            i3 = (jVar3.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar3.i(onAuthorizeClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= jVar3.i(onRemindLaterClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= jVar3.i(onDismiss) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            m6Var2 = m6Var;
            int i6 = jVar3.g(m6Var2) ? 16384 : 8192;
            i4 = i3 | i6;
            if ((i4 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (jVar3.S(i4 & 1, z2)) {
                jVar3.X();
                if ((i & 1) != 0 || jVar3.A()) {
                    if ((i2 & 16) != 0) {
                        m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
                        i4 &= -57345;
                    }
                    i5 = i4;
                    jVar3.s();
                    if (z) {
                        m6Var4 = m6VarF;
                        objN = jVar3.N();
                        obj = l1.i.a;
                        if (objN == obj) {
                            objN = l1.q.o(jVar3);
                            jVar3.n0(objN);
                        }
                        zVar = (a40.z) objN;
                        zI = jVar3.i(zVar) | ((((57344 & i5) ^ 24576) <= 16384 && jVar3.g(m6Var4)) || (i5 & 24576) == 16384) | ((i5 & 7168) == 2048);
                        objN2 = jVar3.N();
                        if (zI || objN2 == obj) {
                            objN2 = new cz.c(zVar, m6Var4, onDismiss, 1);
                            jVar3.n0(objN2);
                        }
                        jVar2 = jVar3;
                        t4.a((u00.a) objN2, (b2.r) null, m6Var4, 0.0f, false, (t0) null, dl.a.y, 0L, 0.0f, 0L, (u00.n) null, new dm.a(21), (u4) null, v1.d.d(-88335904, new p(0, zVar, m6Var4, onAuthorizeClicked, onRemindLaterClicked, z), jVar3), jVar2, (i5 >> 6) & 896, 3078, 5050);
                        m6Var3 = m6Var4;
                    } else {
                        r1VarT = jVar3.t();
                        if (r1VarT == null) {
                            return;
                        }
                        final int i7 = 0;
                        nVar = new u00.n() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3) {
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj3).getClass();
                                        q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj3).getClass();
                                        q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                    }
                    r1VarT.d = nVar;
                }
                jVar3.V();
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                }
                m6VarF = m6Var2;
                i5 = i4;
                jVar3.s();
                if (z) {
                    r1VarT = jVar3.t();
                    if (r1VarT == null) {
                        return;
                    }
                    final int i8 = 0;
                    nVar = new u00.n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i8) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                } else {
                    m6Var4 = m6VarF;
                    objN = jVar3.N();
                    obj = l1.i.a;
                    if (objN == obj) {
                        objN = l1.q.o(jVar3);
                        jVar3.n0(objN);
                    }
                    zVar = (a40.z) objN;
                    zI = jVar3.i(zVar) | ((((57344 & i5) ^ 24576) <= 16384 && jVar3.g(m6Var4)) || (i5 & 24576) == 16384) | ((i5 & 7168) == 2048);
                    objN2 = jVar3.N();
                    if (zI) {
                        objN2 = new cz.c(zVar, m6Var4, onDismiss, 1);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cz.c(zVar, m6Var4, onDismiss, 1);
                        jVar3.n0(objN2);
                    }
                    jVar2 = jVar3;
                    t4.a((u00.a) objN2, (b2.r) null, m6Var4, 0.0f, false, (t0) null, dl.a.y, 0L, 0.0f, 0L, (u00.n) null, new dm.a(21), (u4) null, v1.d.d(-88335904, new p(0, zVar, m6Var4, onAuthorizeClicked, onRemindLaterClicked, z), jVar3), jVar2, (i5 >> 6) & 896, 3078, 5050);
                    m6Var3 = m6Var4;
                }
                r1VarT.d = nVar;
            }
            jVar2 = jVar3;
            jVar2.V();
            m6Var3 = m6Var2;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                final int i9 = 1;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i9) {
                            case 0:
                                ((Integer) obj3).getClass();
                                q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6Var3, (l1.j) obj2, l1.q.K(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6Var3, (l1.j) obj2, l1.q.K(i | 1), i2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                r1VarT.d = nVar;
            }
        }
        m6Var2 = m6Var;
        i4 = i3 | i6;
        if ((i4 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jVar3.S(i4 & 1, z2)) {
            jVar3.X();
            if ((i & 1) != 0) {
                if ((i2 & 16) != 0) {
                    m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
                    i4 &= -57345;
                } else {
                    m6VarF = m6Var2;
                }
            } else if ((i2 & 16) != 0) {
                m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
                i4 &= -57345;
            } else {
                m6VarF = m6Var2;
            }
            i5 = i4;
            jVar3.s();
            if (z) {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                }
                final int i11 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i11) {
                            case 0:
                                ((Integer) obj3).getClass();
                                q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6VarF, (l1.j) obj2, l1.q.K(i | 1), i2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                m6Var4 = m6VarF;
                objN = jVar3.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = l1.q.o(jVar3);
                    jVar3.n0(objN);
                }
                zVar = (a40.z) objN;
                zI = jVar3.i(zVar) | ((((57344 & i5) ^ 24576) <= 16384 && jVar3.g(m6Var4)) || (i5 & 24576) == 16384) | ((i5 & 7168) == 2048);
                objN2 = jVar3.N();
                if (zI) {
                    objN2 = new cz.c(zVar, m6Var4, onDismiss, 1);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new cz.c(zVar, m6Var4, onDismiss, 1);
                    jVar3.n0(objN2);
                }
                jVar2 = jVar3;
                t4.a((u00.a) objN2, (b2.r) null, m6Var4, 0.0f, false, (t0) null, dl.a.y, 0L, 0.0f, 0L, (u00.n) null, new dm.a(21), (u4) null, v1.d.d(-88335904, new p(0, zVar, m6Var4, onAuthorizeClicked, onRemindLaterClicked, z), jVar3), jVar2, (i5 >> 6) & 896, 3078, 5050);
                m6Var3 = m6Var4;
            }
            r1VarT.d = nVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        m6Var3 = m6Var2;
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i12 = 1;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i12) {
                        case 0:
                            ((Integer) obj3).getClass();
                            q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6Var3, (l1.j) obj2, l1.q.K(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            q.a(z, onAuthorizeClicked, onRemindLaterClicked, onDismiss, m6Var3, (l1.j) obj2, l1.q.K(i | 1), i2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }
}
