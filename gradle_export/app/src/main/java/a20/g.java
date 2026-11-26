package a20;

import a1.i;
import a8.i0;
import a8.n0;
import a8.o0;
import android.opengl.GLES20;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b20.f0;
import ba.d0;
import ba.f1;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.p;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e7.u;
import g1.c3;
import h9.b0;
import h9.e0;
import h9.g0;
import h9.k;
import h9.n;
import h9.s;
import h9.t;
import h9.v;
import h9.x;
import j10.l;
import j10.r0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import oj.q;
import p10.c0;
import r40.j;

public class g implements h, b0 {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;

    public g(a8.b0 b0Var, qj.c cVar, byte[] bArr, o0[] o0VarArr, int i) {
        this.A = 6;
        this.C = b0Var;
        this.D = cVar;
        this.E = bArr;
        this.F = o0VarArr;
        this.B = i;
    }

    public g(d0 d0Var) {
        this.A = 1;
        this.B = 0;
        this.C = d0Var;
        this.D = new i0();
        this.E = new ArrayList();
    }

    public g(e0 e0Var, int i) {
        this.A = 4;
        this.F = e0Var;
        this.C = new n0(5, new byte[5]);
        this.D = new SparseArray();
        this.E = new SparseIntArray();
        this.B = i;
    }

    public g(String source) {
        this.A = 5;
        m.e(source, "source");
        c50.h hVar = new c50.h((char) 0, 18);
        hVar.C = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        hVar.D = iArr;
        hVar.B = -1;
        this.C = hVar;
        this.E = new StringBuilder();
        this.F = source;
    }

    public g(String str, String str2) {
        this.A = 3;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.B = iGlCreateProgram;
        e7.d.b();
        d(iGlCreateProgram, str, 35633);
        d(iGlCreateProgram, str2, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        e7.d.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.E = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.C = new gj.e[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.B;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i4 = 0; i4 < i3; i4++) {
                if (bArr[i4] == 0) {
                    i3 = i4;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i3);
            GLES20.glGetAttribLocation(i2, str3);
            gj.e eVar = new gj.e(9);
            ((gj.e[]) this.C)[i] = eVar;
            ((HashMap) this.E).put(str3, eVar);
        }
        this.F = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.B, 35718, iArr4, 0);
        this.D = new hb.f[iArr4[0]];
        for (int i5 = 0; i5 < iArr4[0]; i5++) {
            int i6 = this.B;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i6, 35719, iArr5, 0);
            int i7 = iArr5[0];
            byte[] bArr2 = new byte[i7];
            GLES20.glGetActiveUniform(i6, i5, i7, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i8 = 0; i8 < i7; i8++) {
                if (bArr2[i8] == 0) {
                    i7 = i8;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i7);
            GLES20.glGetUniformLocation(i6, str4);
            hb.f fVar = new hb.f();
            ((hb.f[]) this.D)[i5] = fVar;
            ((HashMap) this.F).put(str4, fVar);
        }
        e7.d.b();
    }

    public g(q c, l lVar, e20.e typeParameterOwner, int i) {
        this.A = 0;
        m.e(c, "c");
        m.e(typeParameterOwner, "typeParameterOwner");
        this.C = c;
        this.D = lVar;
        this.B = i;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.E = linkedHashMap;
        this.F = ((d30.l) ((b) ((q) this.C).B).a).c(new d(this, 1));
    }

    public static void d(int i, String str, int i2) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        e7.d.c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        e7.d.b();
    }

    public static void u(g gVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = gVar.B;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        gVar.t(str, i, str2);
        throw null;
    }

    public int A(int i) {
        i0 i0Var = (i0) this.D;
        if (i < 0) {
            return -1;
        }
        int childCount = ((d0) this.C).a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iC = i - (i2 - i0Var.C(i2));
            if (iC == 0) {
                while (i0Var.E(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iC;
        }
        return -1;
    }

    public View B(int i) {
        return ((d0) this.C).a.getChildAt(i);
    }

    public int C() {
        return ((d0) this.C).a.getChildCount();
    }

    public void D(View view) {
        ((ArrayList) this.E).add(view);
        d0 d0Var = (d0) this.C;
        f1 f1VarM = RecyclerView.M(view);
        if (f1VarM != null) {
            View view2 = f1VarM.a;
            RecyclerView recyclerView = d0Var.a;
            int i = f1VarM.q;
            if (i != -1) {
                f1VarM.p = i;
            } else {
                f1VarM.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.P()) {
                view2.setImportantForAccessibility(4);
            } else {
                f1VarM.q = 4;
                recyclerView.T0.add(f1VarM);
            }
        }
    }

    public String E(String keyToMatch) {
        m.e(keyToMatch, "keyToMatch");
        int i = this.B;
        try {
            if (l() == 6 && m.a(G(), keyToMatch)) {
                this.D = null;
                if (l() == 5) {
                    return G();
                }
            }
            return null;
        } finally {
            this.B = i;
            this.D = null;
        }
    }

    public byte F() {
        String str = (String) this.F;
        int i = this.B;
        while (true) {
            int iH = H(i);
            if (iH == -1) {
                this.B = iH;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iH);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.B = iH;
                return j.g(cCharAt);
            }
            i = iH + 1;
        }
    }

    public String G() {
        if (F() != 1) {
            return null;
        }
        String strP = p();
        this.D = strP;
        return strP;
    }

    public int H(int i) {
        if (i < ((String) this.F).length()) {
            return i;
        }
        return -1;
    }

    public int I() {
        char cCharAt;
        int i = this.B;
        if (i == -1) {
            return i;
        }
        String str = (String) this.F;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.B = i;
        return i;
    }

    public boolean J() {
        int I = I();
        String str = (String) this.F;
        if (I >= str.length() || I == -1 || str.charAt(I) != ',') {
            return false;
        }
        this.B++;
        return true;
    }

    public void K(char c) {
        int i = this.B;
        if (i > 0 && c == '\"') {
            try {
                this.B = i - 1;
                String strQ = q();
                this.B = i;
                if (m.a(strQ, "null")) {
                    t("Expected string literal but 'null' literal was found", this.B - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.B = i;
                throw th;
            }
        }
        v(j.g(c), true);
        throw null;
    }

    public void L(View view) {
        if (((ArrayList) this.E).remove(view)) {
            d0 d0Var = (d0) this.C;
            f1 f1VarM = RecyclerView.M(view);
            if (f1VarM != null) {
                RecyclerView recyclerView = d0Var.a;
                int i = f1VarM.p;
                if (recyclerView.P()) {
                    f1VarM.q = i;
                    recyclerView.T0.add(f1VarM);
                } else {
                    f1VarM.a.setImportantForAccessibility(i);
                }
                f1VarM.p = 0;
            }
        }
    }

    @Override
    public r0 a(c0 javaTypeParameter) {
        m.e(javaTypeParameter, "javaTypeParameter");
        f0 f0Var = (f0) ((d30.j) this.F).invoke(javaTypeParameter);
        return f0Var != null ? f0Var : ((h) ((q) this.C).C).a(javaTypeParameter);
    }

    public void b(u uVar) {
        SparseArray sparseArray;
        n0 n0Var;
        int i;
        h9.c0 xVar;
        h9.c0 xVar2;
        int i2;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.D;
        SparseIntArray sparseIntArray = (SparseIntArray) this.E;
        n0 n0Var2 = (n0) this.C;
        e0 e0Var = (e0) this.F;
        SparseArray sparseArray4 = e0Var.g;
        SparseBooleanArray sparseBooleanArray = e0Var.h;
        if (uVar.A() != 2) {
            return;
        }
        int i3 = 0;
        e7.e0 e0Var2 = (e7.e0) e0Var.b.get(0);
        if ((uVar.A() & 128) == 0) {
            return;
        }
        uVar.O(1);
        int iH = uVar.H();
        int i4 = 3;
        uVar.O(3);
        uVar.k(0, 2, n0Var2.b);
        n0Var2.q(0);
        n0Var2.t(3);
        int i5 = 13;
        e0Var.q = n0Var2.i(13);
        uVar.k(0, 2, n0Var2.b);
        n0Var2.q(0);
        n0Var2.t(4);
        uVar.O(n0Var2.i(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iA = uVar.a();
        while (iA > 0) {
            uVar.k(i3, 5, n0Var2.b);
            n0Var2.q(i3);
            int i6 = n0Var2.i(8);
            n0Var2.t(i4);
            int i7 = n0Var2.i(i5);
            n0Var2.t(4);
            int i8 = n0Var2.i(12);
            int i9 = uVar.b;
            int i11 = i9 + i8;
            String strTrim = null;
            ArrayList arrayList = null;
            int i12 = -1;
            int iA2 = 0;
            while (true) {
                n0Var = n0Var2;
                if (uVar.b < i11) {
                    int iA3 = uVar.A();
                    int iA4 = uVar.b + uVar.A();
                    if (iA4 <= i11) {
                        int i13 = iA;
                        if (iA3 == 5) {
                            long jC = uVar.C();
                            if (jC == 1094921523) {
                                i12 = 129;
                            } else if (jC == 1161904947) {
                                i12 = 135;
                            } else if (jC == 1094921524) {
                                i12 = 172;
                            } else if (jC == 1212503619) {
                                i12 = 36;
                            }
                            i2 = iA4;
                            sparseArray2 = sparseArray4;
                        } else if (iA3 == 106) {
                            i2 = iA4;
                            sparseArray2 = sparseArray4;
                            i12 = 129;
                        } else if (iA3 == 122) {
                            sparseArray2 = sparseArray4;
                            i12 = 135;
                            i2 = iA4;
                        } else if (iA3 == 127) {
                            int iA5 = uVar.A();
                            if (iA5 == 21) {
                                i12 = 172;
                            } else if (iA5 == 14) {
                                i12 = 136;
                            } else if (iA5 == 33) {
                                i12 = 139;
                            }
                            i2 = iA4;
                            sparseArray2 = sparseArray4;
                        } else if (iA3 == 123) {
                            i2 = iA4;
                            sparseArray2 = sparseArray4;
                            i12 = 138;
                        } else if (iA3 == 10) {
                            strTrim = uVar.y(3, StandardCharsets.UTF_8).trim();
                            i2 = iA4;
                            sparseArray2 = sparseArray4;
                            iA2 = uVar.A();
                        } else {
                            int i14 = 3;
                            if (iA3 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (uVar.b < iA4) {
                                    String strTrim2 = uVar.y(i14, StandardCharsets.UTF_8).trim();
                                    uVar.A();
                                    int i15 = iA4;
                                    byte[] bArr = new byte[4];
                                    uVar.k(0, 4, bArr);
                                    arrayList2.add(new h9.f0(strTrim2, bArr));
                                    iA4 = i15;
                                    sparseArray4 = sparseArray4;
                                    i14 = 3;
                                }
                                i2 = iA4;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i12 = 89;
                            } else {
                                i2 = iA4;
                                sparseArray2 = sparseArray4;
                                if (iA3 == 111) {
                                    i12 = 257;
                                }
                            }
                        }
                        uVar.O(i2 - uVar.b);
                        n0Var2 = n0Var;
                        iA = i13;
                        sparseArray4 = sparseArray2;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i16 = iA;
            uVar.N(i11);
            c50.h hVar = new c50.h(i12, strTrim, iA2, arrayList, Arrays.copyOfRange(uVar.a, i9, i11));
            String str = strTrim;
            if (i6 == 6 || i6 == 5) {
                i6 = i12;
            }
            iA = i16 - (i8 + 5);
            if (sparseBooleanArray.get(i7)) {
                i = 3;
            } else {
                h9.f fVar = e0Var.e;
                i = 3;
                if (i6 == 2) {
                    xVar = new x(new k(new h9.d0(1, fVar.b(hVar)), "video/mp2t"));
                } else {
                    if (i6 == 3 || i6 == 4) {
                        xVar2 = new x(new h9.u(str, hVar.o(), "video/mp2t"));
                    } else if (i6 == 21) {
                        xVar = new x(new h9.h());
                    } else if (i6 == 27) {
                        xVar = new x(new h9.q(new h9.d0(0, fVar.b(hVar)), false, false));
                    } else if (i6 == 36) {
                        xVar = new x(new s(new h9.d0(0, fVar.b(hVar))));
                    } else if (i6 == 45) {
                        xVar = new x(new v());
                    } else if (i6 == 89) {
                        xVar = new x(new h9.h((List) hVar.C));
                    } else if (i6 == 172) {
                        xVar2 = new x(new h9.b(hVar.o(), 1, str, "video/mp2t"));
                    } else if (i6 == 257) {
                        xVar = new h9.c0(new i("application/vnd.dvb.ait", 20));
                    } else if (i6 == 138) {
                        xVar2 = new x(new h9.g(str, hVar.o(), 4096));
                    } else if (i6 != 139) {
                        switch (i6) {
                            case 15:
                                xVar2 = new x(new h9.e(hVar.o(), str, "video/mp2t", false));
                                break;
                            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                                xVar = new x(new n(new h9.d0(1, fVar.b(hVar))));
                                break;
                            case 17:
                                xVar2 = new x(new t(str, hVar.o()));
                                break;
                            default:
                                switch (i6) {
                                    case 128:
                                        xVar = new x(new k(new h9.d0(1, fVar.b(hVar)), "video/mp2t"));
                                        break;
                                    case 129:
                                        xVar2 = new x(new h9.b(hVar.o(), 0, str, "video/mp2t"));
                                        break;
                                    case 130:
                                        xVar = null;
                                        break;
                                    default:
                                        switch (i6) {
                                            case 134:
                                                xVar = new h9.c0(new i("application/x-scte35", 20));
                                                break;
                                            case 135:
                                                xVar2 = new x(new h9.b(hVar.o(), 0, str, "video/mp2t"));
                                                break;
                                            case 136:
                                                xVar2 = new x(new h9.g(str, hVar.o(), 4096));
                                                break;
                                            default:
                                                xVar = null;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        xVar2 = new x(new h9.g(str, hVar.o(), 5408));
                    }
                    xVar = xVar2;
                }
                sparseIntArray.put(i7, i7);
                sparseArray3.put(i7, xVar);
            }
            i4 = i;
            n0Var2 = n0Var;
            sparseArray4 = sparseArray5;
            i3 = 0;
            i5 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i17 = 0;
        while (i17 < size) {
            int iKeyAt = sparseIntArray.keyAt(i17);
            int iValueAt = sparseIntArray.valueAt(i17);
            sparseBooleanArray.put(iKeyAt, true);
            e0Var.i.put(iValueAt, true);
            g0 g0Var = (g0) sparseArray3.valueAt(i17);
            if (g0Var != null) {
                g0Var.c(e0Var2, e0Var.l, new c3(iH, iKeyAt, 8192));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, g0Var);
            } else {
                sparseArray = sparseArray6;
            }
            i17++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.B);
        e0Var.m = 0;
        e0Var.l.q();
        e0Var.n = true;
    }

    public void c(e7.e0 e0Var, a8.s sVar, c3 c3Var) {
    }

    public void e(View view, int i, boolean z) {
        RecyclerView recyclerView = ((d0) this.C).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : A(i);
        ((i0) this.D).G(childCount, z);
        if (z) {
            D(view);
        }
        recyclerView.addView(view, childCount);
        f1 f1VarM = RecyclerView.M(view);
        ba.g0 g0Var = recyclerView.M;
        if (g0Var == null || f1VarM == null) {
            return;
        }
        g0Var.onViewAttachedToWindow(f1VarM);
    }

    public int f(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.E).append((char) (w(charSequence, i + 3) + (w(charSequence, i) << 12) + (w(charSequence, i + 1) << 8) + (w(charSequence, i + 2) << 4)));
            return i2;
        }
        this.B = i;
        if (i2 < charSequence.length()) {
            return f(charSequence, this.B);
        }
        u(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((d0) this.C).a;
        int childCount = i < 0 ? recyclerView.getChildCount() : A(i);
        ((i0) this.D).G(childCount, z);
        if (z) {
            D(view);
        }
        f1 f1VarM = RecyclerView.M(view);
        if (f1VarM != null) {
            if (!f1VarM.j() && !f1VarM.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(f1VarM);
                throw new IllegalArgumentException(a1.b.l(recyclerView, sb));
            }
            if (RecyclerView.c1) {
                Log.d("RecyclerView", "reAttach " + f1VarM);
            }
            f1VarM.j &= -257;
        } else if (RecyclerView.b1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(a1.b.l(recyclerView, sb2));
        }
        RecyclerView.a(recyclerView, view, childCount, layoutParams);
    }

    public p h() {
        com.google.android.gms.common.internal.d0.a("Must set register function", ((com.google.android.gms.common.api.internal.q) this.C) != null);
        com.google.android.gms.common.internal.d0.a("Must set unregister function", ((com.google.android.gms.common.api.internal.q) this.D) != null);
        com.google.android.gms.common.internal.d0.a("Must set holder", ((com.google.android.gms.common.api.internal.m) this.E) != null);
        com.google.android.gms.common.api.internal.l lVar = ((com.google.android.gms.common.api.internal.m) this.E).c;
        com.google.android.gms.common.internal.d0.i(lVar, "Key must not be null");
        return new p(new k0(this, (com.google.android.gms.common.api.internal.m) this.E, (pe.d[]) this.F, this.B), new l0(this, lVar));
    }

    public boolean i() {
        int i = this.B;
        if (i == -1) {
            return false;
        }
        String str = (String) this.F;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.B = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.B = i;
        return false;
    }

    public void j(int i, String str) {
        String str2 = (String) this.F;
        if (str2.length() - i < str.length()) {
            u(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                u(this, "Expected valid boolean literal prefix, but had '" + q() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.B = str.length() + i;
    }

    public String k() {
        StringBuilder sb = (StringBuilder) this.E;
        String str = (String) this.F;
        n('\"');
        int i = this.B;
        int iI0 = r30.k.I0(str, '\"', i, 4);
        if (iI0 == -1) {
            q();
            v((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iI0) {
            if (str.charAt(i2) == '\\') {
                int iH = this.B;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iH, i2);
                        int iH2 = H(i2 + 1);
                        if (iH2 == -1) {
                            u(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iF = iH2 + 1;
                        char cCharAt2 = str.charAt(iH2);
                        if (cCharAt2 == 'u') {
                            iF = f(str, iF);
                        } else {
                            char c = cCharAt2 < 'u' ? r40.e.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                u(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iH = H(iF);
                        if (iH == -1) {
                            u(this, "Unexpected EOF", iH, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) str, iH, i2);
                            iH = H(i2);
                            if (iH == -1) {
                                u(this, "Unexpected EOF", iH, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iH;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                String string = !z ? str.subSequence(iH, i2).toString() : r(iH, i2);
                this.B = i2 + 1;
                return string;
            }
            i2++;
        }
        this.B = iI0 + 1;
        String strSubstring = str.substring(i, iI0);
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte l() {
        String str = (String) this.F;
        int i = this.B;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.B = i2;
                return j.g(cCharAt);
            }
            i = i2;
        }
        this.B = str.length();
        return (byte) 10;
    }

    public byte m(byte b) {
        byte bL = l();
        if (bL == b) {
            return bL;
        }
        v(b, true);
        throw null;
    }

    public void n(char c) {
        int i = this.B;
        if (i == -1) {
            K(c);
            throw null;
        }
        String str = (String) this.F;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.B = i2;
                if (cCharAt == c) {
                    return;
                }
                K(c);
                throw null;
            }
            i = i2;
        }
        this.B = -1;
        K(c);
        throw null;
    }

    public long o() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iH = H(I());
        String str = (String) this.F;
        ?? r6 = 0;
        if (iH >= str.length() || iH == -1) {
            u(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iH) == '\"') {
            iH++;
            if (iH == str.length()) {
                u(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iH;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                if (cCharAt == '-' && z4) {
                    if (i == iH) {
                        u(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z;
                    if (cCharAt != '-') {
                        if (j.g(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            u(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * ((long) 10)) + ((long) i2);
                        } else {
                            j3 = (j3 * ((long) 10)) - ((long) i2);
                            if (j3 > 0) {
                                u(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z = z2;
                    } else {
                        if (i != iH) {
                            u(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z = z2;
                        r6 = 0;
                        z5 = true;
                    }
                } else {
                    if (i == iH) {
                        u(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    r6 = 0;
                    z3 = true;
                }
                r6 = 0;
            } else {
                if (i == iH) {
                    u(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iH;
        if (iH == i || (z5 && iH == i - 1)) {
            u(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z2) {
            if (!z6) {
                u(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                u(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.B = i;
        long j4 = j3;
        if (z4) {
            double d = j4;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                u(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                u(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        u(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String p() {
        String str = (String) this.D;
        if (str == null) {
            return k();
        }
        m.b(str);
        this.D = null;
        return str;
    }

    public String q() {
        String str = (String) this.F;
        String str2 = (String) this.D;
        if (str2 != null) {
            m.b(str2);
            this.D = null;
            return str2;
        }
        int I = I();
        if (I >= str.length() || I == -1) {
            u(this, "EOF", I, null, 4);
            throw null;
        }
        byte bG = j.g(str.charAt(I));
        if (bG == 1) {
            return p();
        }
        if (bG != 0) {
            u(this, "Expected beginning of the string, but got " + str.charAt(I), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (j.g(str.charAt(I)) == 0) {
            I++;
            if (I >= str.length()) {
                ((StringBuilder) this.E).append((CharSequence) str, this.B, I);
                int iH = H(I);
                if (iH == -1) {
                    this.B = I;
                    return r(0, 0);
                }
                I = iH;
                z = true;
            }
        }
        String string = !z ? str.subSequence(this.B, I).toString() : r(this.B, I);
        this.B = I;
        return string;
    }

    public String r(int i, int i2) {
        StringBuilder sb = (StringBuilder) this.E;
        sb.append((CharSequence) this.F, i, i2);
        String string = sb.toString();
        m.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public void s(int i) {
        int iA = A(i);
        ((i0) this.D).J(iA);
        RecyclerView recyclerView = ((d0) this.C).a;
        View childAt = recyclerView.getChildAt(iA);
        if (childAt != null) {
            f1 f1VarM = RecyclerView.M(childAt);
            if (f1VarM != null) {
                if (f1VarM.j() && !f1VarM.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(f1VarM);
                    throw new IllegalArgumentException(a1.b.l(recyclerView, sb));
                }
                if (RecyclerView.c1) {
                    Log.d("RecyclerView", "tmpDetach " + f1VarM);
                }
                f1VarM.a(256);
            }
        } else if (RecyclerView.b1) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iA);
            throw new IllegalArgumentException(a1.b.l(recyclerView, sb2));
        }
        RecyclerView.c(recyclerView, iA);
    }

    public void t(String message, int i, String hint) {
        m.e(message, "message");
        m.e(hint, "hint");
        throw j.d(message + " at path: " + ((c50.h) this.C).n() + (hint.length() == 0 ? "" : "\n".concat(hint)), (String) this.F, i);
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return ((i0) this.D).toString() + ", hidden list:" + ((ArrayList) this.E).size();
            case 5:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.F);
                sb.append("', currentPosition=");
                return oi.k.l(sb, this.B, ')');
            default:
                return super.toString();
        }
    }

    public void v(byte b, boolean z) {
        String str = (String) this.F;
        String strR = j.r(b);
        int i = z ? this.B - 1 : this.B;
        u(this, a1.b.q("Expected ", strR, ", but had '", (this.B == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    public int w(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        u(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public int x(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.B, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        e7.d.b();
        return iGlGetAttribLocation;
    }

    public View y(int i) {
        return ((d0) this.C).a.getChildAt(A(i));
    }

    public int z() {
        return ((d0) this.C).a.getChildCount() - ((ArrayList) this.E).size();
    }
}
