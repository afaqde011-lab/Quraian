package su;

import ab.a0;
import kotlin.NoWhenBranchMatchedException;

public final class s {
    public final c a;
    public final d b;
    public final t c;
    public final a d;
    public final int e;
    public final boolean f;
    public final t g;

    public s(c cVar, d dVar, t tVar, a aVar, int i) {
        this(cVar, dVar, tVar, (i & 8) != 0 ? null : aVar, 0, false, null);
    }

    public s(c plan, d recording, t tVar, a aVar, int i, boolean z, t tVar2) {
        kotlin.jvm.internal.m.e(plan, "plan");
        kotlin.jvm.internal.m.e(recording, "recording");
        this.a = plan;
        this.b = recording;
        this.c = tVar;
        this.d = aVar;
        this.e = i;
        this.f = z;
        this.g = tVar2;
    }

    public static s c(s sVar, c cVar, t tVar, a aVar, int i, boolean z, t tVar2, int i2) {
        if ((i2 & 1) != 0) {
            cVar = sVar.a;
        }
        c plan = cVar;
        d recording = sVar.b;
        if ((i2 & 4) != 0) {
            tVar = sVar.c;
        }
        t window = tVar;
        if ((i2 & 8) != 0) {
            aVar = sVar.d;
        }
        a aVar2 = aVar;
        if ((i2 & 16) != 0) {
            i = sVar.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = sVar.f;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            tVar2 = sVar.g;
        }
        kotlin.jvm.internal.m.e(plan, "plan");
        kotlin.jvm.internal.m.e(recording, "recording");
        kotlin.jvm.internal.m.e(window, "window");
        return new s(plan, recording, window, aVar2, i3, z2, tVar2);
    }

    public final s a() {
        t tVar = this.g;
        if (tVar == null) {
            tVar = this.c;
        }
        return c(this, null, tVar, null, 0, false, null, 59);
    }

    public final Integer b(long j) {
        a aVar = this.d;
        if (aVar == null) {
            return null;
        }
        Integer numT = c7.i.T(j, aVar.a);
        int iIntValue = numT != null ? numT.intValue() : aVar.a().A;
        b bVar = this.a.a;
        return Integer.valueOf(a0.y(iIntValue, bVar.a, bVar.b));
    }

    public final r d() {
        if (this.f) {
            return new r(this, h.a);
        }
        int i = this.e + 1;
        Integer num = this.a.b.A;
        if (num != null && i >= num.intValue()) {
            return new r(c(this, null, null, null, i, true, null, 79), new f(this.c.b));
        }
        s sVarA = c(this, null, null, null, i, false, null, 111).a();
        return new r(sVarA, new g(sVarA.c.a));
    }

    public final r e(q qVar) {
        long jLongValue;
        ot.a aVarB;
        ot.a aVarB2;
        if (qVar instanceof n) {
            return d();
        }
        boolean z = qVar instanceof l;
        a aVar = this.d;
        c cVar = this.a;
        Long lValueOf = null;
        boolean z2 = this.f;
        if (z) {
            long j = ((l) qVar).a;
            if (z2) {
                s sVarA = f().a();
                return new r(sVarA, new i(sVarA.c.a));
            }
            Integer numB = b(j);
            if (numB != null) {
                if (numB.intValue() >= cVar.a.b) {
                    numB = null;
                }
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    if (aVar != null && (aVarB2 = aVar.b(iIntValue + 1)) != null) {
                        lValueOf = Long.valueOf(aVarB2.b);
                    }
                    if (lValueOf != null) {
                        return new r(this, new j(lValueOf.longValue()));
                    }
                }
            }
            return d();
        }
        boolean z3 = qVar instanceof m;
        t tVar = this.c;
        if (!z3) {
            if (qVar instanceof o) {
                if (!z2) {
                    return new r(this, h.a);
                }
                s sVarA2 = f().a();
                return new r(sVarA2, new i(sVarA2.c.a));
            }
            if (!(qVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                this = f();
            }
            long j2 = ((p) qVar).a;
            long j3 = tVar.a;
            return new r(this, new j(a0.A(j2, j3, Math.max(j3, tVar.b - 250))));
        }
        long j4 = ((m) qVar).a;
        s sVarF = z2 ? f() : this;
        Integer numB2 = b(j4);
        if (numB2 == null) {
            jLongValue = tVar.a;
        } else {
            if (numB2.intValue() <= cVar.a.a) {
                numB2 = null;
            }
            if (numB2 != null) {
                int iIntValue2 = numB2.intValue();
                if (aVar != null && (aVarB = aVar.b(iIntValue2 - 1)) != null) {
                    lValueOf = Long.valueOf(aVarB.b);
                }
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = tVar.a;
                }
            } else {
                jLongValue = tVar.a;
            }
        }
        return new r(sVarF, new j(jLongValue));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.a, sVar.a) && kotlin.jvm.internal.m.a(this.b, sVar.b) && kotlin.jvm.internal.m.a(this.c, sVar.c) && kotlin.jvm.internal.m.a(this.d, sVar.d) && this.e == sVar.e && this.f == sVar.f && kotlin.jvm.internal.m.a(this.g, sVar.g);
    }

    public final s f() {
        return c(this, null, null, null, 0, false, null, 79);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        a aVar = this.d;
        int iE = w.c.e(w.c.d(this.e, (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.f);
        t tVar = this.g;
        return iE + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "MemorizationSession(plan=" + this.a + ", recording=" + this.b + ", window=" + this.c + ", timeline=" + this.d + ", completedCycles=" + this.e + ", isFinished=" + this.f + ", nextCycleWindow=" + this.g + ")";
    }
}
