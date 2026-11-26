package t7;

import a8.k0;
import a8.l0;
import a8.p;
import androidx.media3.common.n;
import androidx.media3.common.o;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import e7.i0;
import e7.u;
import fh.t0;
import java.util.ArrayList;
import java.util.UUID;

public final class b implements l0 {

    public final int f14363a;

    public final t f14364b;

    public final p f14365c = new p();

    public final c f14366d;

    public t f14367e;

    public l0 f14368f;

    public long f14369g;

    public b(int i10, int i11, t tVar, c cVar) {
        this.f14363a = i11;
        this.f14364b = tVar;
        this.f14366d = cVar;
    }

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) {
        l0 l0Var = this.f14368f;
        String str = i0.f5136a;
        return l0Var.a(jVar, i10, z10);
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, k0 k0Var) {
        long j10 = this.f14369g;
        if (j10 != -9223372036854775807L && j9 >= j10) {
            this.f14368f = this.f14365c;
        }
        l0 l0Var = this.f14368f;
        String str = i0.f5136a;
        l0Var.d(j9, i10, i11, i12, k0Var);
    }

    @Override
    public final void e(u uVar, int i10, int i11) {
        l0 l0Var = this.f14368f;
        String str = i0.f5136a;
        l0Var.g(i10, uVar);
    }

    @Override
    public final void f(t tVar) {
        String str;
        t0 t0Var;
        String str2;
        String str3;
        v0 v0Var;
        float f3;
        o oVar;
        o oVar2;
        ArrayList arrayList;
        String str4;
        o oVar3;
        int size;
        n[] nVarArr;
        int length;
        int i10;
        n nVar;
        int i11;
        int i12;
        UUID uuid;
        int i13;
        n[] nVarArr2;
        int length2;
        int i14;
        n nVar2;
        String string;
        b bVar = this;
        t tVar2 = tVar;
        bVar.f14366d.getClass();
        t tVar3 = bVar.f14364b;
        if (tVar3 == null) {
            bVar = this;
            tVar2 = tVar;
        } else if (tVar2 == tVar3) {
            tVar2.getClass();
        } else {
            int iH = x0.h(tVar2.f1594n);
            String str5 = tVar3.f1583a;
            v0 v0VarB = tVar3.l;
            t0 t0Var2 = tVar3.f1585c;
            int i15 = tVar3.M;
            int i16 = tVar3.N;
            String str6 = tVar3.f1584b;
            if (str6 == null) {
                str6 = tVar2.f1584b;
            }
            if (t0Var2.isEmpty()) {
                t0Var2 = tVar2.f1585c;
            }
            String str7 = tVar2.f1586d;
            if ((iH == 3 || iH == 1) && (str = tVar3.f1586d) != null) {
                str7 = str;
            }
            int i17 = tVar2.f1590h;
            if (i17 == -1) {
                i17 = tVar3.f1590h;
            }
            int i18 = tVar2.f1591i;
            if (i18 == -1) {
                i18 = tVar3.f1591i;
            }
            String str8 = tVar2.f1593k;
            if (str8 == null) {
                String[] strArrT = i0.T(tVar3.f1593k);
                if (strArrT.length == 0) {
                    t0Var = t0Var2;
                    str2 = str8;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    t0Var = t0Var2;
                    int length3 = strArrT.length;
                    str2 = str8;
                    int i19 = 0;
                    while (i19 < length3) {
                        int i20 = length3;
                        String str9 = strArrT[i19];
                        int i21 = i19;
                        if (iH == x0.h(x0.d(str9))) {
                            if (sb2.length() > 0) {
                                sb2.append(",");
                            }
                            sb2.append(str9);
                        }
                        i19 = i21 + 1;
                        length3 = i20;
                    }
                    if (sb2.length() > 0) {
                        string = sb2.toString();
                    }
                    if (i0.T(string).length == 1) {
                        str3 = string;
                    }
                    v0Var = tVar2.l;
                    if (v0Var != null) {
                        v0VarB = v0Var.b(v0VarB);
                    }
                    f3 = tVar2.f1605y;
                    if (f3 == -1.0f && iH == 2) {
                        f3 = tVar3.f1605y;
                    }
                    int i22 = tVar2.f1587e | tVar3.f1587e;
                    int i23 = tVar2.f1588f | tVar3.f1588f;
                    oVar = tVar3.f1598r;
                    oVar2 = tVar2.f1598r;
                    arrayList = new ArrayList();
                    if (oVar != null) {
                        String str10 = oVar.C;
                        nVarArr2 = oVar.A;
                        length2 = nVarArr2.length;
                        i14 = 0;
                        while (i14 < length2) {
                            int i24 = length2;
                            nVar2 = nVarArr2[i14];
                            int i25 = i14;
                            if (nVar2.E != null) {
                                arrayList.add(nVar2);
                            }
                            i14 = i25 + 1;
                            length2 = i24;
                        }
                        str4 = str10;
                    } else {
                        str4 = null;
                    }
                    if (oVar2 != null) {
                        if (str4 == null) {
                            str4 = oVar2.C;
                        }
                        size = arrayList.size();
                        nVarArr = oVar2.A;
                        String str11 = str4;
                        length = nVarArr.length;
                        i10 = 0;
                        while (i10 < length) {
                            int i26 = length;
                            nVar = nVarArr[i10];
                            int i27 = i10;
                            if (nVar.E != null) {
                                uuid = nVar.B;
                                i12 = i16;
                                i13 = 0;
                                while (true) {
                                    if (i13 >= size) {
                                        i11 = size;
                                        arrayList.add(nVar);
                                        break;
                                    } else {
                                        i11 = size;
                                        if (((n) arrayList.get(i13)).B.equals(uuid)) {
                                            break;
                                        }
                                        i13++;
                                        size = i11;
                                    }
                                }
                            } else {
                                i11 = size;
                                i12 = i16;
                            }
                            i10 = i27 + 1;
                            length = i26;
                            i16 = i12;
                            size = i11;
                        }
                        str4 = str11;
                    }
                    int i28 = i16;
                    if (arrayList.isEmpty()) {
                        oVar3 = null;
                    } else {
                        oVar3 = new o(str4, arrayList);
                    }
                    s sVarA = tVar.a();
                    sVarA.f1491a = str5;
                    sVarA.f1492b = str6;
                    sVarA.f1493c = t0.o(t0Var);
                    sVarA.f1494d = str7;
                    sVarA.f1495e = i22;
                    sVarA.f1496f = i23;
                    sVarA.f1498h = i17;
                    sVarA.f1499i = i18;
                    sVarA.f1500j = str3;
                    sVarA.f1501k = v0VarB;
                    sVarA.f1505q = oVar3;
                    sVarA.f1512x = f3;
                    sVarA.L = i15;
                    sVarA.M = i28;
                    tVar2 = new t(sVarA);
                    bVar = this;
                }
                string = null;
                if (i0.T(string).length == 1) {
                    str3 = string;
                }
                v0Var = tVar2.l;
                if (v0Var != null) {
                    v0VarB = v0Var.b(v0VarB);
                }
                f3 = tVar2.f1605y;
                if (f3 == -1.0f) {
                    f3 = tVar3.f1605y;
                }
                int i29 = tVar2.f1587e | tVar3.f1587e;
                int i210 = tVar2.f1588f | tVar3.f1588f;
                oVar = tVar3.f1598r;
                oVar2 = tVar2.f1598r;
                arrayList = new ArrayList();
                if (oVar != null) {
                    String str12 = oVar.C;
                    nVarArr2 = oVar.A;
                    length2 = nVarArr2.length;
                    i14 = 0;
                    while (i14 < length2) {
                        int i211 = length2;
                        nVar2 = nVarArr2[i14];
                        int i212 = i14;
                        if (nVar2.E != null) {
                            arrayList.add(nVar2);
                        }
                        i14 = i212 + 1;
                        length2 = i211;
                    }
                    str4 = str12;
                } else {
                    str4 = null;
                }
                if (oVar2 != null) {
                    if (str4 == null) {
                        str4 = oVar2.C;
                    }
                    size = arrayList.size();
                    nVarArr = oVar2.A;
                    String str13 = str4;
                    length = nVarArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        int i213 = length;
                        nVar = nVarArr[i10];
                        int i214 = i10;
                        if (nVar.E != null) {
                            uuid = nVar.B;
                            i12 = i16;
                            i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    i11 = size;
                                    arrayList.add(nVar);
                                    break;
                                    break;
                                } else {
                                    i11 = size;
                                    if (((n) arrayList.get(i13)).B.equals(uuid)) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        size = i11;
                                    }
                                }
                            }
                        } else {
                            i11 = size;
                            i12 = i16;
                        }
                        i10 = i214 + 1;
                        length = i213;
                        i16 = i12;
                        size = i11;
                    }
                    str4 = str13;
                }
                int i215 = i16;
                if (arrayList.isEmpty()) {
                    oVar3 = null;
                } else {
                    oVar3 = new o(str4, arrayList);
                }
                s sVarA2 = tVar.a();
                sVarA2.f1491a = str5;
                sVarA2.f1492b = str6;
                sVarA2.f1493c = t0.o(t0Var);
                sVarA2.f1494d = str7;
                sVarA2.f1495e = i29;
                sVarA2.f1496f = i210;
                sVarA2.f1498h = i17;
                sVarA2.f1499i = i18;
                sVarA2.f1500j = str3;
                sVarA2.f1501k = v0VarB;
                sVarA2.f1505q = oVar3;
                sVarA2.f1512x = f3;
                sVarA2.L = i15;
                sVarA2.M = i215;
                tVar2 = new t(sVarA2);
                bVar = this;
            } else {
                t0Var = t0Var2;
                str2 = str8;
            }
            str3 = str2;
            v0Var = tVar2.l;
            if (v0Var != null) {
                v0VarB = v0Var.b(v0VarB);
            }
            f3 = tVar2.f1605y;
            if (f3 == -1.0f) {
                f3 = tVar3.f1605y;
            }
            int i216 = tVar2.f1587e | tVar3.f1587e;
            int i217 = tVar2.f1588f | tVar3.f1588f;
            oVar = tVar3.f1598r;
            oVar2 = tVar2.f1598r;
            arrayList = new ArrayList();
            if (oVar != null) {
                String str14 = oVar.C;
                nVarArr2 = oVar.A;
                length2 = nVarArr2.length;
                i14 = 0;
                while (i14 < length2) {
                    int i218 = length2;
                    nVar2 = nVarArr2[i14];
                    int i219 = i14;
                    if (nVar2.E != null) {
                        arrayList.add(nVar2);
                    }
                    i14 = i219 + 1;
                    length2 = i218;
                }
                str4 = str14;
            } else {
                str4 = null;
            }
            if (oVar2 != null) {
                if (str4 == null) {
                    str4 = oVar2.C;
                }
                size = arrayList.size();
                nVarArr = oVar2.A;
                String str15 = str4;
                length = nVarArr.length;
                i10 = 0;
                while (i10 < length) {
                    int i2110 = length;
                    nVar = nVarArr[i10];
                    int i2111 = i10;
                    if (nVar.E != null) {
                        uuid = nVar.B;
                        i12 = i16;
                        i13 = 0;
                        while (true) {
                            if (i13 >= size) {
                                i11 = size;
                                arrayList.add(nVar);
                                break;
                                break;
                            } else {
                                i11 = size;
                                if (((n) arrayList.get(i13)).B.equals(uuid)) {
                                    break;
                                    break;
                                } else {
                                    i13++;
                                    size = i11;
                                }
                            }
                        }
                    } else {
                        i11 = size;
                        i12 = i16;
                    }
                    i10 = i2111 + 1;
                    length = i2110;
                    i16 = i12;
                    size = i11;
                }
                str4 = str15;
            }
            int i2112 = i16;
            if (arrayList.isEmpty()) {
                oVar3 = null;
            } else {
                oVar3 = new o(str4, arrayList);
            }
            s sVarA3 = tVar.a();
            sVarA3.f1491a = str5;
            sVarA3.f1492b = str6;
            sVarA3.f1493c = t0.o(t0Var);
            sVarA3.f1494d = str7;
            sVarA3.f1495e = i216;
            sVarA3.f1496f = i217;
            sVarA3.f1498h = i17;
            sVarA3.f1499i = i18;
            sVarA3.f1500j = str3;
            sVarA3.f1501k = v0VarB;
            sVarA3.f1505q = oVar3;
            sVarA3.f1512x = f3;
            sVarA3.L = i15;
            sVarA3.M = i2112;
            tVar2 = new t(sVarA3);
            bVar = this;
        }
        bVar.f14367e = tVar2;
        l0 l0Var = bVar.f14368f;
        String str16 = i0.f5136a;
        l0Var.f(tVar2);
    }
}
