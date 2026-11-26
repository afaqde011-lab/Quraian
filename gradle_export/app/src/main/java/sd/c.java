package sd;

import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;

public final class c extends com.google.android.gms.internal.play_billing.q1 {
    public c(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", RuntimeVersion.SUFFIX));
    }

    public static int H0(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return -1;
        }
        return i10 - 87;
    }

    public final String I0() {
        int iH0;
        if (y()) {
            return null;
        }
        char cCharAt = ((String) this.f4032d).charAt(this.f4030b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f4030b++;
        int iIntValue = L().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = L().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = L().intValue();
                    } else {
                        int iH1 = H0(iIntValue);
                        if (iH1 != -1) {
                            for (int i10 = 1; i10 <= 5 && (iH0 = H0((iIntValue = L().intValue()))) != -1; i10++) {
                                iH1 = (iH1 * 16) + iH0;
                            }
                            sb2.append((char) iH1);
                        }
                    }
                }
            }
            sb2.append((char) iIntValue);
            iIntValue = L().intValue();
        }
        return sb2.toString();
    }

    public final String J0() {
        int i10;
        int i11;
        String str = (String) this.f4032d;
        if (y()) {
            i11 = this.f4030b;
        } else {
            int i12 = this.f4030b;
            int iCharAt = str.charAt(i12);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i12;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i10 = this.f4030b;
            }
            this.f4030b = i12;
            i11 = i10;
        }
        int i13 = this.f4030b;
        if (i11 == i13) {
            return null;
        }
        String strSubstring = str.substring(i13, i11);
        this.f4030b = i11;
        return strSubstring;
    }

    public final ArrayList K0() {
        ArrayList arrayList;
        int i10;
        ?? nVar;
        int i11;
        String strO;
        ?? r10;
        int i12;
        i9.d dVarA;
        ?? r11;
        androidx.media3.common.w0 w0Var;
        ?? r12;
        ?? r13;
        ?? r14;
        androidx.media3.common.w0 w0Var2;
        ?? r15;
        f fVar;
        Object obj;
        ?? r16;
        ArrayList arrayListK0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj2;
        String str = null;
        if (y()) {
            return null;
        }
        ?? r4 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        m mVar = new m();
        while (!y() && !y()) {
            int i13 = this.f4030b;
            ArrayList arrayList5 = mVar.f14022a;
            int i14 = 2;
            boolean z10 = false;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                i10 = 0;
            } else if (u('>')) {
                c0();
                i10 = 2;
            } else if (u('+')) {
                c0();
                i10 = 3;
            } else {
                i10 = 0;
            }
            if (u('*')) {
                nVar = new n(i10, str);
            } else {
                String strJ0 = J0();
                if (strJ0 != null) {
                    n nVar2 = new n(i10, strJ0);
                    mVar.f14023b += r4;
                    nVar = nVar2;
                } else {
                    nVar = str;
                }
            }
            while (!y()) {
                if (u('.')) {
                    if (nVar == 0) {
                        nVar = new n(i10, str);
                    }
                    String strJ1 = J0();
                    if (strJ1 == null) {
                        throw new a("Invalid \".class\" simpleSelectors");
                    }
                    nVar.a("class", i14, strJ1);
                    mVar.a();
                } else if (u('#')) {
                    if (nVar == 0) {
                        nVar = new n(i10, str);
                    }
                    String strJ2 = J0();
                    if (strJ2 == null) {
                        throw new a("Invalid \"#id\" simpleSelectors");
                    }
                    nVar.a("id", i14, strJ2);
                    mVar.f14023b += 1000000;
                } else if (u('[')) {
                    if (nVar == 0) {
                        nVar = new n(i10, str);
                    }
                    c0();
                    String strJ3 = J0();
                    if (strJ3 == null) {
                        throw new a("Invalid attribute simpleSelectors");
                    }
                    c0();
                    if (u('=')) {
                        i11 = i14;
                    } else if (v("~=")) {
                        i11 = 3;
                    } else {
                        i11 = v("|=") ? 4 : z10 ? 1 : 0;
                    }
                    if (i11 != 0) {
                        c0();
                        if (y()) {
                            strO = str;
                        } else {
                            strO = O();
                            if (strO == null) {
                                strO = J0();
                            }
                        }
                        if (strO == null) {
                            throw new a("Invalid attribute simpleSelectors");
                        }
                        c0();
                    } else {
                        strO = str;
                    }
                    if (!u(']')) {
                        throw new a("Invalid attribute simpleSelectors");
                    }
                    if (i11 == 0) {
                        i11 = r4 == true ? 1 : 0;
                    }
                    nVar.a(strJ3, i11, strO);
                    mVar.a();
                } else {
                    ?? nVar3 = nVar;
                    if (u(':')) {
                        if (nVar == 0) {
                            nVar3 = new n(i10, str);
                        }
                        String strJ4 = J0();
                        if (strJ4 == null) {
                            throw new a("Invalid pseudo class");
                        }
                        h hVar = (h) h.E.get(strJ4);
                        if (hVar == null) {
                            hVar = h.D;
                        }
                        switch (hVar.ordinal()) {
                            case 0:
                                r10 = nVar3;
                                g gVar = new g(2);
                                mVar.a();
                                obj = gVar;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 1:
                                r10 = nVar3;
                                g gVar2 = new g(1);
                                mVar.a();
                                obj = gVar2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z11 = (hVar == h.A || hVar == h.B) ? r4 == true ? 1 : 0 : z10 ? 1 : 0;
                                boolean z12 = (hVar == h.B || hVar == h.C) ? r4 == true ? 1 : 0 : z10 ? 1 : 0;
                                int i15 = this.f4031c;
                                String str2 = (String) this.f4032d;
                                if (y()) {
                                    r13 = str;
                                    r15 = nVar3;
                                } else {
                                    int i16 = this.f4030b;
                                    if (u('(')) {
                                        c0();
                                        if (v("odd")) {
                                            w0Var2 = new androidx.media3.common.w0(2, r4 == true ? 1 : 0);
                                        } else {
                                            if (v("even")) {
                                                w0Var2 = new androidx.media3.common.w0(2, z10 ? 1 : 0);
                                            } else {
                                                int i17 = (!u('+') && u('-')) ? -1 : r4 == true ? 1 : 0;
                                                i9.d dVarA2 = i9.d.a(this.f4030b, str2, i15);
                                                if (dVarA2 != null) {
                                                    this.f4030b = dVarA2.f7552a;
                                                }
                                                if (u('n') || u('N')) {
                                                    if (dVarA2 == null) {
                                                        dVarA2 = new i9.d(1L, this.f4030b);
                                                    }
                                                    c0();
                                                    boolean zU = u('+');
                                                    i12 = (zU || !(zU = u('-'))) ? 1 : -1;
                                                    if (zU) {
                                                        c0();
                                                        dVarA = i9.d.a(this.f4030b, str2, i15);
                                                        if (dVarA != null) {
                                                            this.f4030b = dVarA.f7552a;
                                                            r11 = nVar3;
                                                        } else {
                                                            this.f4030b = i16;
                                                            r12 = nVar3;
                                                        }
                                                    } else {
                                                        dVarA = null;
                                                        r11 = nVar3;
                                                    }
                                                } else {
                                                    dVarA = dVarA2;
                                                    r11 = nVar3;
                                                    i12 = i17 == true ? 1 : 0;
                                                    dVarA2 = null;
                                                    i17 = 1;
                                                }
                                                new androidx.media3.common.w0(dVarA2 == null ? 0 : i17 * ((int) dVarA2.f7553b), dVarA == null ? 0 : i12 * ((int) dVarA.f7553b));
                                                w0Var = r11;
                                                r14 = r11;
                                                c0();
                                                r13 = w0Var;
                                                r15 = r14;
                                                if (!u(')')) {
                                                    this.f4030b = i16;
                                                    r12 = r14;
                                                }
                                            }
                                            r13 = 0;
                                            r15 = r12;
                                        }
                                        r14 = nVar3;
                                        w0Var = w0Var2;
                                        c0();
                                        r13 = w0Var;
                                        r15 = r14;
                                        if (!u(')')) {
                                            this.f4030b = i16;
                                            r12 = r14;
                                            r13 = 0;
                                            r15 = r12;
                                        }
                                    } else {
                                        r13 = str;
                                        r15 = nVar3;
                                    }
                                }
                                if (r13 == 0) {
                                    throw new a("Invalid or missing parameter section for pseudo class: ".concat(strJ4));
                                }
                                fVar = new f(r13.f1663a, r13.f1664b, z11, z12, r15.f14026b);
                                mVar.a();
                                r16 = r15;
                                obj = fVar;
                                r10 = r16;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                                break;
                            case 6:
                                f fVar2 = new f(0, 1, true, false, null);
                                mVar.a();
                                r10 = nVar3;
                                obj = fVar2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 7:
                                f fVar3 = new f(0, 1, false, false, null);
                                mVar.a();
                                r10 = nVar3;
                                obj = fVar3;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 8:
                                f fVar4 = new f(0, 1, true, true, nVar3.f14026b);
                                mVar.a();
                                r10 = nVar3;
                                obj = fVar4;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 9:
                                fVar = new f(0, 1, false, true, nVar3.f14026b);
                                mVar.a();
                                r16 = nVar3;
                                obj = fVar;
                                r10 = r16;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 10:
                                k kVar = new k(str, z10);
                                mVar.a();
                                obj2 = kVar;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 11:
                                k kVar2 = new k(nVar3.f14026b, r4);
                                mVar.a();
                                obj2 = kVar2;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 12:
                                g gVar3 = new g(0);
                                mVar.a();
                                obj2 = gVar3;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 13:
                                if (y()) {
                                    arrayListK0 = str;
                                } else {
                                    int i18 = this.f4030b;
                                    if (u('(')) {
                                        c0();
                                        arrayListK0 = K0();
                                        if (arrayListK0 != null && u(')')) {
                                            Iterator it = arrayListK0.iterator();
                                            while (it.hasNext() && (arrayList2 = ((m) it.next()).f14022a) != null) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((n) it2.next()).f14028d) != null) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((e) it3.next()) instanceof i) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f4030b = i18;
                                        }
                                        arrayListK0 = str;
                                    } else {
                                        arrayListK0 = str;
                                    }
                                }
                                if (arrayListK0 == null) {
                                    throw new a("Invalid or missing parameter section for pseudo class: ".concat(strJ4));
                                }
                                i iVar = new i();
                                iVar.f13998a = arrayListK0;
                                Iterator it4 = arrayListK0.iterator();
                                int i19 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i20 = ((m) it4.next()).f14023b;
                                    if (i20 > i19) {
                                        i19 = i20;
                                    }
                                }
                                mVar.f14023b = i19;
                                obj2 = iVar;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                                break;
                            case 14:
                                if (!y()) {
                                    int i21 = this.f4030b;
                                    if (u('(')) {
                                        c0();
                                        ?? arrayList6 = str;
                                        while (true) {
                                            String strJ5 = J0();
                                            arrayList6 = arrayList6;
                                            if (strJ5 == null) {
                                                this.f4030b = i21;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(strJ5);
                                                c0();
                                                if (!b0()) {
                                                    if (!u(')')) {
                                                        this.f4030b = i21;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                j jVar = new j(strJ4);
                                mVar.a();
                                obj2 = jVar;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            case 15:
                            case 16:
                            case 17:
                            case TYPE_SINT64_VALUE:
                            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                            case 23:
                                j jVar2 = new j(strJ4);
                                mVar.a();
                                obj2 = jVar2;
                                r10 = nVar3;
                                obj = obj2;
                                if (r10.f14028d == null) {
                                    r10.f14028d = new ArrayList();
                                }
                                r10.f14028d.add(obj);
                                nVar = r10;
                                str = null;
                                r4 = 1;
                                i14 = 2;
                                z10 = false;
                                break;
                            default:
                                throw new a("Unsupported pseudo class: ".concat(strJ4));
                        }
                    } else {
                        if (nVar != 0) {
                            this.f4030b = i13;
                            arrayList = mVar.f14022a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList4.add(mVar);
                            }
                            return arrayList4;
                        }
                        if (mVar.f14022a == null) {
                            mVar.f14022a = new ArrayList();
                        }
                        mVar.f14022a.add(nVar);
                        if (!b0()) {
                            arrayList4.add(mVar);
                            mVar = new m();
                        }
                        str = null;
                        r4 = 1;
                    }
                }
            }
            if (nVar != 0) {
                this.f4030b = i13;
                arrayList = mVar.f14022a;
                if (arrayList != null) {
                    arrayList4.add(mVar);
                }
                return arrayList4;
            }
            if (mVar.f14022a == null) {
                mVar.f14022a = new ArrayList();
            }
            mVar.f14022a.add(nVar);
            if (!b0()) {
                arrayList4.add(mVar);
                mVar = new m();
            }
            str = null;
            r4 = 1;
        }
        arrayList = mVar.f14022a;
        if (arrayList != null) {
            arrayList4.add(mVar);
        }
        return arrayList4;
    }
}
