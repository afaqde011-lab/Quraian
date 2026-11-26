package cs;

import g00.b0;
import is.m1;
import java.util.List;
import nx.i0;
import nx.p0;
import ri.t1;
import ss.v;

public final class n extends m00.i implements u00.p {
    public final int A;
    public boolean B;
    public Object C;
    public Object D;
    public final vm.a E;

    public n(vm.a aVar, k00.c cVar, int i) {
        super(4, cVar);
        this.A = i;
        this.E = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                n nVar = new n((p) this.E, (k00.c) obj4, 0);
                nVar.B = zBooleanValue;
                nVar.C = (v) obj2;
                nVar.D = (ss.p) obj3;
                return nVar.invokeSuspend(b0.a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                n nVar2 = new n((p0) this.E, (k00.c) obj4, 1);
                nVar2.C = (List) obj;
                nVar2.D = (List) obj2;
                nVar2.B = zBooleanValue2;
                return nVar2.invokeSuspend(b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int iA;
        int i;
        int iD;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4 = this.A;
        vm.a aVar = this.E;
        switch (i4) {
            case 0:
                m1 m1Var = ((p) aVar).d;
                boolean z3 = this.B;
                v vVar = (v) this.C;
                ss.p pVar = (ss.p) this.D;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (!z3) {
                    vVar = null;
                }
                if (vVar == null) {
                    if (z3) {
                        i = 0;
                    } else {
                        iA = m1Var.a();
                    }
                    if (vVar != null) {
                        if (z3) {
                            i2 = 0;
                        } else {
                            iD = m1Var.d();
                        }
                        if (i > 0 || i < i2) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i3 = i;
                        } else {
                            i3 = i2;
                        }
                        if (z3) {
                            if (vVar != null) {
                                pVar.getClass();
                            } else if (!pVar.b || pVar.a.contains(7)) {
                                z2 = true;
                            }
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        return new m(i, i2, i3, z, z2);
                    }
                    iD = vVar.c;
                    i2 = iD;
                    if (i > 0) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i3 = i;
                    } else {
                        i3 = i2;
                    }
                    if (z3) {
                        z2 = false;
                    } else {
                        if (vVar != null) {
                            pVar.getClass();
                        } else {
                            if (!pVar.b) {
                            }
                            z2 = true;
                        }
                        z2 = false;
                    }
                    return new m(i, i2, i3, z, z2);
                }
                iA = vVar.b;
                i = iA;
                if (vVar != null) {
                    if (z3) {
                        i2 = 0;
                    } else {
                        iD = m1Var.d();
                    }
                    if (i > 0) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i3 = i;
                    } else {
                        i3 = i2;
                    }
                    if (z3) {
                        z2 = false;
                    } else {
                        if (vVar != null) {
                            pVar.getClass();
                        } else {
                            if (!pVar.b) {
                            }
                            z2 = true;
                        }
                        z2 = false;
                    }
                    return new m(i, i2, i3, z, z2);
                }
                iD = vVar.c;
                i2 = iD;
                if (i > 0) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    i3 = i;
                } else {
                    i3 = i2;
                }
                if (z3) {
                    z2 = false;
                } else {
                    if (vVar != null) {
                        pVar.getClass();
                    } else {
                        if (!pVar.b) {
                        }
                        z2 = true;
                    }
                    z2 = false;
                }
                return new m(i, i2, i3, z, z2);
            default:
                List list = (List) this.C;
                List list2 = (List) this.D;
                boolean z4 = this.B;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                return new i0(null, null, ze.d.E(list), list2.contains(new Integer(((p0) aVar).d.getReciterType())), z4, null, 64831);
        }
    }
}
