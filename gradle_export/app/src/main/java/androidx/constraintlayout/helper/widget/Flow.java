package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import g4.d;
import g4.e;
import g4.g;
import g4.h;
import g4.i;
import h4.b;
import j4.f;
import j4.r;
import j4.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Flow extends t {
    public final h J;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new int[32];
        this.G = new HashMap();
        this.C = context;
        super.g(attributeSet);
        h hVar = new h();
        hVar.f6190r0 = 0;
        hVar.f6191s0 = 0;
        hVar.f6192t0 = 0;
        hVar.f6193u0 = 0;
        hVar.f6194v0 = 0;
        hVar.f6195w0 = 0;
        hVar.f6196x0 = false;
        hVar.f6197y0 = 0;
        hVar.f6198z0 = 0;
        hVar.A0 = new b();
        hVar.B0 = null;
        hVar.C0 = -1;
        hVar.D0 = -1;
        hVar.E0 = -1;
        hVar.F0 = -1;
        hVar.G0 = -1;
        hVar.H0 = -1;
        hVar.I0 = 0.5f;
        hVar.J0 = 0.5f;
        hVar.K0 = 0.5f;
        hVar.L0 = 0.5f;
        hVar.M0 = 0.5f;
        hVar.N0 = 0.5f;
        hVar.O0 = 0;
        hVar.P0 = 0;
        hVar.Q0 = 2;
        hVar.R0 = 2;
        hVar.S0 = 0;
        hVar.T0 = -1;
        hVar.U0 = 0;
        hVar.V0 = new ArrayList();
        hVar.W0 = null;
        hVar.X0 = null;
        hVar.Y0 = null;
        hVar.f6189a1 = 0;
        this.J = hVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f8157b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.J.U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar2 = this.J;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f6190r0 = dimensionPixelSize;
                    hVar2.f6191s0 = dimensionPixelSize;
                    hVar2.f6192t0 = dimensionPixelSize;
                    hVar2.f6193u0 = dimensionPixelSize;
                } else if (index == 18) {
                    h hVar3 = this.J;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar3.f6192t0 = dimensionPixelSize2;
                    hVar3.f6194v0 = dimensionPixelSize2;
                    hVar3.f6195w0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.J.f6193u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.J.f6194v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.J.f6190r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.J.f6195w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.J.f6191s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.J.S0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.J.C0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.J.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.J.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.J.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.J.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.J.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.J.I0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.J.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.J.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.J.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.J.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.J.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.J.Q0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.J.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.J.O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.J.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.J.T0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.D = this.J;
        i();
    }

    @Override
    public final void h(e eVar, boolean z10) {
        h hVar = this.J;
        int i10 = hVar.f6192t0;
        if (i10 > 0 || hVar.f6193u0 > 0) {
            if (z10) {
                hVar.f6194v0 = hVar.f6193u0;
                hVar.f6195w0 = i10;
            } else {
                hVar.f6194v0 = i10;
                hVar.f6195w0 = hVar.f6193u0;
            }
        }
    }

    @Override
    public final void j(h hVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        e[] eVarArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        e[] eVarArr2;
        int i23;
        int i24;
        int i25;
        int[] iArr2;
        int i26;
        int i27;
        int i28;
        char c10;
        int i29;
        g gVar;
        int i30;
        char c11;
        int i31;
        int i32;
        boolean z10;
        int i33;
        char c12;
        int[] iArr3;
        int i34;
        d dVar;
        d dVar2;
        g gVar2;
        int i35;
        g gVar3;
        int i36;
        int i37;
        int i38;
        int i39;
        e eVar;
        int iO;
        boolean z11;
        int i40;
        int size;
        int[] iArr4;
        int i41;
        boolean z12;
        d dVar3;
        int i42;
        int i43;
        int i44;
        int i45;
        d dVar4;
        d dVar5;
        d dVar6;
        int i46;
        int iMax;
        int i47;
        g gVar4;
        int i48;
        int iD;
        int iC;
        int i49;
        g gVar5;
        g gVar6;
        int i50;
        int i51;
        e eVar2;
        int iP;
        int i52;
        int i53;
        boolean z13;
        e eVar3;
        int i54;
        int i55;
        int i56;
        int i57;
        int iCeil;
        int iCeil2;
        int i58;
        int i59;
        int i60;
        e eVar4;
        int iO2;
        boolean z14;
        e[] eVarArr3;
        e[] eVarArr4;
        int i61;
        int i62;
        int i63;
        int iP2;
        int i64;
        int iO3;
        e eVar5;
        e eVar6;
        int i65;
        int i66;
        int i67;
        int i68;
        e eVar7;
        e[] eVarArr5;
        e eVar8;
        e eVar9;
        int i69;
        int i70;
        int i71;
        e eVar10;
        int iP3;
        int i72;
        int i73;
        e eVar11;
        int i74;
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size3 = View.MeasureSpec.getSize(i11);
        int i75 = 0;
        if (hVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ArrayList arrayList = hVar.V0;
        if (hVar.f6206q0 > 0) {
            b bVar = hVar.A0;
            e eVar12 = hVar.S;
            f fVar = eVar12 != null ? ((g4.f) eVar12).f6166t0 : null;
            if (fVar == null) {
                hVar.f6197y0 = 0;
                hVar.f6198z0 = 0;
                hVar.f6196x0 = false;
            } else {
                int i76 = 0;
                while (i76 < hVar.f6206q0) {
                    e eVar13 = hVar.f6205p0[i76];
                    if (eVar13 != null && !(eVar13 instanceof i)) {
                        int iJ = eVar13.j(i75);
                        int iJ2 = eVar13.j(1);
                        if (iJ != 3 || eVar13.f6152q == 1 || iJ2 != 3 || eVar13.f6153r == 1) {
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            bVar.f6565a = iJ;
                            bVar.f6566b = iJ2;
                            bVar.f6567c = eVar13.n();
                            bVar.f6568d = eVar13.k();
                            fVar.b(eVar13, bVar);
                            eVar13.J(bVar.f6569e);
                            eVar13.G(bVar.f6570f);
                            eVar13.D(bVar.f6571g);
                        }
                    }
                    i76++;
                    i75 = 0;
                }
                i12 = hVar.f6194v0;
                i13 = hVar.f6195w0;
                i14 = hVar.f6190r0;
                i15 = hVar.f6191s0;
                iArr = new int[2];
                i16 = (size2 - i12) - i13;
                i17 = hVar.U0;
                if (i17 == 1) {
                    i16 = (size3 - i14) - i15;
                }
                if (i17 == 0) {
                    if (hVar.C0 == -1) {
                        i74 = 0;
                        hVar.C0 = 0;
                    } else {
                        i74 = 0;
                    }
                    if (hVar.D0 == -1) {
                        hVar.D0 = i74;
                    }
                } else {
                    if (hVar.C0 == -1) {
                        hVar.C0 = 0;
                    }
                    if (hVar.D0 == -1) {
                        hVar.D0 = 0;
                    }
                }
                eVarArr = hVar.f6205p0;
                i18 = 0;
                i19 = 0;
                while (true) {
                    i20 = hVar.f6206q0;
                    i21 = i14;
                    if (i18 < i20) {
                        break;
                    }
                    if (hVar.f6205p0[i18].f6134f0 == 8) {
                        i19++;
                    }
                    i18++;
                    i14 = i21;
                }
                if (i19 > 0) {
                    eVarArr = new e[i20 - i19];
                    i72 = 0;
                    i73 = 0;
                    while (i72 < hVar.f6206q0) {
                        eVar11 = hVar.f6205p0[i72];
                        int i77 = i72;
                        if (eVar11.f6134f0 != 8) {
                            eVarArr[i73] = eVar11;
                            i73++;
                        }
                        i72 = i77 + 1;
                    }
                    i22 = i73;
                } else {
                    i22 = i20;
                }
                eVarArr2 = eVarArr;
                hVar.Z0 = eVarArr2;
                hVar.f6189a1 = i22;
                i23 = hVar.S0;
                if (i23 != 0) {
                    if (i23 != 1) {
                        i33 = i15;
                        c12 = 1;
                        iArr3 = iArr;
                        i34 = hVar.U0;
                        dVar = hVar.K;
                        dVar2 = hVar.J;
                        if (i22 == 0) {
                            arrayList.clear();
                            i35 = i16;
                            i26 = i12;
                            c10 = 1;
                            i27 = i13;
                            i28 = i21;
                            i24 = i33;
                            iArr2 = iArr3;
                            gVar2 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                            arrayList.add(gVar2);
                            if (i34 == 0) {
                                gVar6 = gVar2;
                                i50 = 0;
                                i39 = 0;
                                i51 = 0;
                                while (i50 < i22) {
                                    eVar2 = eVarArr2[i50];
                                    iP = hVar.P(eVar2, i35);
                                    i52 = i50;
                                    if (eVar2.f6150o0[0] == 3) {
                                        i39++;
                                    }
                                    i53 = i39;
                                    z13 = (i51 != i35 || (hVar.O0 + i51) + iP > i35) && gVar6.f6174b != null;
                                    if (!z13 && i52 > 0 && (i56 = hVar.T0) > 0 && i52 % i56 == 0) {
                                        z13 = true;
                                    }
                                    if (z13) {
                                        i54 = i53;
                                        eVar3 = eVar2;
                                        i55 = i52;
                                        g gVar7 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                                        gVar7.f6184n = i55;
                                        arrayList.add(gVar7);
                                        gVar6 = gVar7;
                                    } else {
                                        eVar3 = eVar2;
                                        i54 = i53;
                                        i55 = i52;
                                        if (i55 > 0) {
                                            i51 = hVar.O0 + iP + i51;
                                        }
                                        gVar6.a(eVar3);
                                        i50 = i55 + 1;
                                        i39 = i54;
                                    }
                                    i51 = iP;
                                    gVar6.a(eVar3);
                                    i50 = i55 + 1;
                                    i39 = i54;
                                }
                            } else {
                                gVar3 = gVar2;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                while (i36 < i22) {
                                    eVar = eVarArr2[i36];
                                    iO = hVar.O(eVar, i35);
                                    if (eVar.f6150o0[1] == 3) {
                                        i37++;
                                    }
                                    int i78 = i37;
                                    z11 = (i38 != i35 || (hVar.P0 + i38) + iO > i35) && gVar3.f6174b != null;
                                    if (!z11 && i36 > 0 && (i40 = hVar.T0) > 0 && i36 % i40 == 0) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        g gVar8 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                                        gVar8.f6184n = i36;
                                        arrayList.add(gVar8);
                                        gVar3 = gVar8;
                                    } else {
                                        if (i36 > 0) {
                                            i38 = hVar.P0 + iO + i38;
                                        }
                                        gVar3.a(eVar);
                                        i36++;
                                        i37 = i78;
                                    }
                                    i38 = iO;
                                    gVar3.a(eVar);
                                    i36++;
                                    i37 = i78;
                                }
                                i39 = i37;
                            }
                            size = arrayList.size();
                            d dVar7 = hVar.H;
                            d dVar8 = hVar.I;
                            int i79 = hVar.f6194v0;
                            int i80 = hVar.f6190r0;
                            int i81 = hVar.f6195w0;
                            int i82 = hVar.f6191s0;
                            iArr4 = hVar.f6150o0;
                            i41 = i34;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (i39 > 0 && z12) {
                                for (i49 = 0; i49 < size; i49++) {
                                    gVar5 = (g) arrayList.get(i49);
                                    if (i41 == 0) {
                                        gVar5.e(i35 - gVar5.d());
                                    } else {
                                        gVar5.e(i35 - gVar5.c());
                                    }
                                }
                            }
                            dVar3 = dVar8;
                            i42 = i79;
                            i43 = i80;
                            i44 = i81;
                            i45 = i82;
                            dVar4 = dVar;
                            dVar5 = dVar7;
                            dVar6 = dVar2;
                            i46 = 0;
                            iMax = 0;
                            i47 = 0;
                            while (i46 < size) {
                                gVar4 = (g) arrayList.get(i46);
                                if (i41 == 0) {
                                    if (i46 < size - 1) {
                                        dVar4 = ((g) arrayList.get(i46 + 1)).f6174b.I;
                                        i45 = 0;
                                    } else {
                                        i45 = hVar.f6191s0;
                                        dVar4 = dVar;
                                    }
                                    d dVar9 = gVar4.f6174b.K;
                                    i48 = i41;
                                    gVar4.f(i48, dVar5, dVar3, dVar6, dVar4, i42, i43, i44, i45, i35);
                                    iMax = Math.max(iMax, gVar4.d());
                                    iC = gVar4.c() + i47;
                                    if (i46 > 0) {
                                        iC += hVar.P0;
                                    }
                                    i47 = iC;
                                    dVar3 = dVar9;
                                    i43 = 0;
                                } else {
                                    i48 = i41;
                                    if (i46 < size - 1) {
                                        dVar6 = ((g) arrayList.get(i46 + 1)).f6174b.H;
                                        i44 = 0;
                                    } else {
                                        i44 = hVar.f6195w0;
                                        dVar6 = dVar2;
                                    }
                                    d dVar10 = gVar4.f6174b.J;
                                    gVar4.f(i48, dVar5, dVar3, dVar6, dVar4, i42, i43, i44, i45, i35);
                                    iD = gVar4.d() + iMax;
                                    int iMax2 = Math.max(i47, gVar4.c());
                                    if (i46 > 0) {
                                        iD += hVar.O0;
                                    }
                                    i47 = iMax2;
                                    iMax = iD;
                                    dVar5 = dVar10;
                                    i42 = 0;
                                }
                                i46++;
                                i41 = i48;
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i47;
                        }
                        c11 = 0;
                    } else if (i23 != 2) {
                        i24 = i15;
                        iArr2 = iArr;
                        i26 = i12;
                        i27 = i13;
                        i28 = i21;
                        c11 = 0;
                        c10 = 1;
                    } else {
                        i57 = hVar.U0;
                        if (i57 == 0) {
                            i69 = hVar.T0;
                            if (i69 <= 0) {
                                i70 = 0;
                                i71 = 0;
                                iCeil2 = 0;
                                while (true) {
                                    i33 = i15;
                                    if (i70 >= i22) {
                                        break;
                                    }
                                    if (i70 > 0) {
                                        i71 += hVar.O0;
                                    }
                                    eVar10 = eVarArr2[i70];
                                    if (eVar10 != null) {
                                        iP3 = hVar.P(eVar10, i16) + i71;
                                        if (iP3 > i16) {
                                            break;
                                        }
                                        iCeil2++;
                                        i71 = iP3;
                                    }
                                    i70++;
                                    i15 = i33;
                                }
                            } else {
                                i33 = i15;
                                iCeil2 = i69;
                            }
                            iCeil = 0;
                        } else {
                            i33 = i15;
                            iCeil = hVar.T0;
                            if (iCeil <= 0) {
                                i59 = 0;
                                i60 = 0;
                                for (i58 = 0; i58 < i22; i58++) {
                                    if (i58 > 0) {
                                        i59 += hVar.P0;
                                    }
                                    eVar4 = eVarArr2[i58];
                                    if (eVar4 != null) {
                                        iO2 = hVar.O(eVar4, i16) + i59;
                                        if (iO2 > i16) {
                                            break;
                                        }
                                        i60++;
                                        i59 = iO2;
                                    }
                                }
                                iCeil = i60;
                            }
                            iCeil2 = 0;
                        }
                        if (hVar.Y0 == null) {
                            hVar.Y0 = new int[2];
                        }
                        z14 = (iCeil != 0 && i57 == 1) || (iCeil2 == 0 && i57 == 0);
                        while (!z14) {
                            if (i57 == 0) {
                                iCeil = (int) Math.ceil(i22 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i22 / iCeil);
                                iCeil = iCeil;
                            }
                            eVarArr3 = hVar.X0;
                            int[] iArr5 = iArr;
                            if (eVarArr3 != null || eVarArr3.length < iCeil2) {
                                hVar.X0 = new e[iCeil2];
                            } else {
                                Arrays.fill(eVarArr3, (Object) null);
                            }
                            eVarArr4 = hVar.W0;
                            if (eVarArr4 != null || eVarArr4.length < iCeil) {
                                hVar.W0 = new e[iCeil];
                            } else {
                                Arrays.fill(eVarArr4, (Object) null);
                            }
                            i61 = 0;
                            while (i61 < iCeil2) {
                                i65 = 0;
                                while (i65 < iCeil) {
                                    i66 = (i65 * iCeil2) + i61;
                                    i67 = i61;
                                    if (i57 == 1) {
                                        i66 = (i67 * iCeil) + i65;
                                    }
                                    int i83 = i57;
                                    i68 = i66;
                                    if (i68 >= eVarArr2.length && (eVar7 = eVarArr2[i68]) != null) {
                                        int iP4 = hVar.P(eVar7, i16);
                                        eVarArr5 = eVarArr2;
                                        eVar8 = hVar.X0[i67];
                                        if (eVar8 != null || eVar8.n() < iP4) {
                                            hVar.X0[i67] = eVar7;
                                        }
                                        int iO4 = hVar.O(eVar7, i16);
                                        eVar9 = hVar.W0[i65];
                                        if (eVar9 != null || eVar9.k() < iO4) {
                                            hVar.W0[i65] = eVar7;
                                        }
                                    } else {
                                        eVarArr5 = eVarArr2;
                                    }
                                    i65++;
                                    i61 = i67;
                                    i57 = i83;
                                    eVarArr2 = eVarArr5;
                                }
                                i61++;
                            }
                            e[] eVarArr6 = eVarArr2;
                            i62 = i57;
                            iP2 = 0;
                            for (i63 = 0; i63 < iCeil2; i63++) {
                                eVar6 = hVar.X0[i63];
                                if (eVar6 == null) {
                                    if (i63 > 0) {
                                        iP2 += hVar.O0;
                                    }
                                    iP2 = hVar.P(eVar6, i16) + iP2;
                                }
                            }
                            i64 = 0;
                            iO3 = 0;
                            while (i64 < iCeil) {
                                eVar5 = hVar.W0[i64];
                                int i84 = i64;
                                if (eVar5 == null) {
                                    if (i64 > 0) {
                                        iO3 += hVar.P0;
                                    }
                                    iO3 = hVar.O(eVar5, i16) + iO3;
                                }
                                i64 = i84 + 1;
                            }
                            iArr5[0] = iP2;
                            iArr5[1] = iO3;
                            if (i62 == 0) {
                                if (iP2 > i16 || iCeil2 <= 1) {
                                    z14 = true;
                                } else {
                                    iCeil2--;
                                    z14 = z14;
                                }
                            } else if (iO3 > i16 || iCeil <= 1) {
                                z14 = true;
                            } else {
                                iCeil--;
                                z14 = z14;
                            }
                            iArr = iArr5;
                            i57 = i62;
                            eVarArr2 = eVarArr6;
                        }
                        iArr3 = iArr;
                        c12 = 1;
                        int[] iArr6 = hVar.Y0;
                        iArr6[0] = iCeil2;
                        iArr6[1] = iCeil;
                    }
                    c10 = c12;
                    i26 = i12;
                    i27 = i13;
                    i28 = i21;
                    i24 = i33;
                    iArr2 = iArr3;
                    c11 = 0;
                } else {
                    i24 = i15;
                    i25 = i16;
                    iArr2 = iArr;
                    i26 = i12;
                    i27 = i13;
                    i28 = i21;
                    c10 = 1;
                    i29 = hVar.U0;
                    if (i22 == 0) {
                        c11 = 0;
                    } else {
                        if (arrayList.size() == 0) {
                            gVar = new g(hVar, i29, hVar.H, hVar.I, hVar.J, hVar.K, i25);
                            arrayList.add(gVar);
                        } else {
                            g gVar9 = (g) arrayList.get(0);
                            gVar9.f6175c = 0;
                            gVar9.f6174b = null;
                            gVar9.l = 0;
                            gVar9.m = 0;
                            gVar9.f6184n = 0;
                            gVar9.f6185o = 0;
                            gVar9.f6186p = 0;
                            gVar9.f(i29, hVar.H, hVar.I, hVar.J, hVar.K, hVar.f6194v0, hVar.f6190r0, hVar.f6195w0, hVar.f6191s0, i25);
                            gVar = gVar9;
                        }
                        for (i30 = 0; i30 < i22; i30++) {
                            gVar.a(eVarArr2[i30]);
                        }
                        c11 = 0;
                        iArr2[0] = gVar.d();
                        iArr2[1] = gVar.c();
                    }
                }
                i31 = iArr2[c11] + i26 + i27;
                i32 = iArr2[c10] + i28 + i24;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size2 = Math.min(i31, size2);
                    } else if (mode == 0) {
                        size2 = i31;
                    } else {
                        size2 = 0;
                    }
                }
                if (mode2 != 1073741824) {
                    if (mode2 == Integer.MIN_VALUE) {
                        size3 = Math.min(i32, size3);
                    } else if (mode2 == 0) {
                        size3 = i32;
                    } else {
                        size3 = 0;
                    }
                }
                hVar.f6197y0 = size2;
                hVar.f6198z0 = size3;
                hVar.J(size2);
                hVar.G(size3);
                if (hVar.f6206q0 > 0) {
                    z10 = c10;
                } else {
                    z10 = 0;
                }
                hVar.f6196x0 = z10;
            }
        } else {
            i12 = hVar.f6194v0;
            i13 = hVar.f6195w0;
            i14 = hVar.f6190r0;
            i15 = hVar.f6191s0;
            iArr = new int[2];
            i16 = (size2 - i12) - i13;
            i17 = hVar.U0;
            if (i17 == 1) {
                i16 = (size3 - i14) - i15;
            }
            if (i17 == 0) {
                if (hVar.C0 == -1) {
                    i74 = 0;
                    hVar.C0 = 0;
                } else {
                    i74 = 0;
                }
                if (hVar.D0 == -1) {
                    hVar.D0 = i74;
                }
            } else {
                if (hVar.C0 == -1) {
                    hVar.C0 = 0;
                }
                if (hVar.D0 == -1) {
                    hVar.D0 = 0;
                }
            }
            eVarArr = hVar.f6205p0;
            i18 = 0;
            i19 = 0;
            while (true) {
                i20 = hVar.f6206q0;
                i21 = i14;
                if (i18 < i20) {
                    break;
                    break;
                }
                if (hVar.f6205p0[i18].f6134f0 == 8) {
                    i19++;
                }
                i18++;
                i14 = i21;
            }
            if (i19 > 0) {
                eVarArr = new e[i20 - i19];
                i72 = 0;
                i73 = 0;
                while (i72 < hVar.f6206q0) {
                    eVar11 = hVar.f6205p0[i72];
                    int i710 = i72;
                    if (eVar11.f6134f0 != 8) {
                        eVarArr[i73] = eVar11;
                        i73++;
                    }
                    i72 = i710 + 1;
                }
                i22 = i73;
            } else {
                i22 = i20;
            }
            eVarArr2 = eVarArr;
            hVar.Z0 = eVarArr2;
            hVar.f6189a1 = i22;
            i23 = hVar.S0;
            if (i23 != 0) {
                if (i23 != 1) {
                    i33 = i15;
                    c12 = 1;
                    iArr3 = iArr;
                    i34 = hVar.U0;
                    dVar = hVar.K;
                    dVar2 = hVar.J;
                    if (i22 == 0) {
                        arrayList.clear();
                        i35 = i16;
                        i26 = i12;
                        c10 = 1;
                        i27 = i13;
                        i28 = i21;
                        i24 = i33;
                        iArr2 = iArr3;
                        gVar2 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                        arrayList.add(gVar2);
                        if (i34 == 0) {
                            gVar6 = gVar2;
                            i50 = 0;
                            i39 = 0;
                            i51 = 0;
                            while (i50 < i22) {
                                eVar2 = eVarArr2[i50];
                                iP = hVar.P(eVar2, i35);
                                i52 = i50;
                                if (eVar2.f6150o0[0] == 3) {
                                    i39++;
                                }
                                i53 = i39;
                                if (i51 != i35) {
                                }
                                if (!z13) {
                                    z13 = true;
                                }
                                if (z13) {
                                    i54 = i53;
                                    eVar3 = eVar2;
                                    i55 = i52;
                                    g gVar10 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                                    gVar10.f6184n = i55;
                                    arrayList.add(gVar10);
                                    gVar6 = gVar10;
                                } else {
                                    eVar3 = eVar2;
                                    i54 = i53;
                                    i55 = i52;
                                    if (i55 > 0) {
                                        i51 = hVar.O0 + iP + i51;
                                    }
                                    gVar6.a(eVar3);
                                    i50 = i55 + 1;
                                    i39 = i54;
                                }
                                i51 = iP;
                                gVar6.a(eVar3);
                                i50 = i55 + 1;
                                i39 = i54;
                            }
                        } else {
                            gVar3 = gVar2;
                            i36 = 0;
                            i37 = 0;
                            i38 = 0;
                            while (i36 < i22) {
                                eVar = eVarArr2[i36];
                                iO = hVar.O(eVar, i35);
                                if (eVar.f6150o0[1] == 3) {
                                    i37++;
                                }
                                int i711 = i37;
                                if (i38 != i35) {
                                }
                                if (!z11) {
                                    z11 = true;
                                }
                                if (z11) {
                                    g gVar11 = new g(hVar, i34, hVar.H, hVar.I, hVar.J, hVar.K, i35);
                                    gVar11.f6184n = i36;
                                    arrayList.add(gVar11);
                                    gVar3 = gVar11;
                                } else {
                                    if (i36 > 0) {
                                        i38 = hVar.P0 + iO + i38;
                                    }
                                    gVar3.a(eVar);
                                    i36++;
                                    i37 = i711;
                                }
                                i38 = iO;
                                gVar3.a(eVar);
                                i36++;
                                i37 = i711;
                            }
                            i39 = i37;
                        }
                        size = arrayList.size();
                        d dVar11 = hVar.H;
                        d dVar12 = hVar.I;
                        int i712 = hVar.f6194v0;
                        int i85 = hVar.f6190r0;
                        int i86 = hVar.f6195w0;
                        int i87 = hVar.f6191s0;
                        iArr4 = hVar.f6150o0;
                        i41 = i34;
                        if (iArr4[0] != 2) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (i39 > 0) {
                            while (i49 < size) {
                                gVar5 = (g) arrayList.get(i49);
                                if (i41 == 0) {
                                    gVar5.e(i35 - gVar5.d());
                                } else {
                                    gVar5.e(i35 - gVar5.c());
                                }
                            }
                        }
                        dVar3 = dVar12;
                        i42 = i712;
                        i43 = i85;
                        i44 = i86;
                        i45 = i87;
                        dVar4 = dVar;
                        dVar5 = dVar11;
                        dVar6 = dVar2;
                        i46 = 0;
                        iMax = 0;
                        i47 = 0;
                        while (i46 < size) {
                            gVar4 = (g) arrayList.get(i46);
                            if (i41 == 0) {
                                if (i46 < size - 1) {
                                    dVar4 = ((g) arrayList.get(i46 + 1)).f6174b.I;
                                    i45 = 0;
                                } else {
                                    i45 = hVar.f6191s0;
                                    dVar4 = dVar;
                                }
                                d dVar13 = gVar4.f6174b.K;
                                i48 = i41;
                                gVar4.f(i48, dVar5, dVar3, dVar6, dVar4, i42, i43, i44, i45, i35);
                                iMax = Math.max(iMax, gVar4.d());
                                iC = gVar4.c() + i47;
                                if (i46 > 0) {
                                    iC += hVar.P0;
                                }
                                i47 = iC;
                                dVar3 = dVar13;
                                i43 = 0;
                            } else {
                                i48 = i41;
                                if (i46 < size - 1) {
                                    dVar6 = ((g) arrayList.get(i46 + 1)).f6174b.H;
                                    i44 = 0;
                                } else {
                                    i44 = hVar.f6195w0;
                                    dVar6 = dVar2;
                                }
                                d dVar14 = gVar4.f6174b.J;
                                gVar4.f(i48, dVar5, dVar3, dVar6, dVar4, i42, i43, i44, i45, i35);
                                iD = gVar4.d() + iMax;
                                int iMax3 = Math.max(i47, gVar4.c());
                                if (i46 > 0) {
                                    iD += hVar.O0;
                                }
                                i47 = iMax3;
                                iMax = iD;
                                dVar5 = dVar14;
                                i42 = 0;
                            }
                            i46++;
                            i41 = i48;
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i47;
                    }
                    c11 = 0;
                } else if (i23 != 2) {
                    i24 = i15;
                    iArr2 = iArr;
                    i26 = i12;
                    i27 = i13;
                    i28 = i21;
                    c11 = 0;
                    c10 = 1;
                } else {
                    i57 = hVar.U0;
                    if (i57 == 0) {
                        i69 = hVar.T0;
                        if (i69 <= 0) {
                            i70 = 0;
                            i71 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i33 = i15;
                                if (i70 >= i22) {
                                    break;
                                    break;
                                }
                                if (i70 > 0) {
                                    i71 += hVar.O0;
                                }
                                eVar10 = eVarArr2[i70];
                                if (eVar10 != null) {
                                    iP3 = hVar.P(eVar10, i16) + i71;
                                    if (iP3 > i16) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i71 = iP3;
                                    }
                                }
                                i70++;
                                i15 = i33;
                            }
                        } else {
                            i33 = i15;
                            iCeil2 = i69;
                        }
                        iCeil = 0;
                    } else {
                        i33 = i15;
                        iCeil = hVar.T0;
                        if (iCeil <= 0) {
                            i59 = 0;
                            i60 = 0;
                            while (i58 < i22) {
                                if (i58 > 0) {
                                    i59 += hVar.P0;
                                }
                                eVar4 = eVarArr2[i58];
                                if (eVar4 != null) {
                                    iO2 = hVar.O(eVar4, i16) + i59;
                                    if (iO2 > i16) {
                                        break;
                                        break;
                                    } else {
                                        i60++;
                                        i59 = iO2;
                                    }
                                }
                            }
                            iCeil = i60;
                        }
                        iCeil2 = 0;
                    }
                    if (hVar.Y0 == null) {
                        hVar.Y0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z14) {
                        if (i57 == 0) {
                            iCeil = (int) Math.ceil(i22 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i22 / iCeil);
                            iCeil = iCeil;
                        }
                        eVarArr3 = hVar.X0;
                        int[] iArr7 = iArr;
                        if (eVarArr3 != null) {
                            hVar.X0 = new e[iCeil2];
                        } else {
                            hVar.X0 = new e[iCeil2];
                        }
                        eVarArr4 = hVar.W0;
                        if (eVarArr4 != null) {
                            hVar.W0 = new e[iCeil];
                        } else {
                            hVar.W0 = new e[iCeil];
                        }
                        i61 = 0;
                        while (i61 < iCeil2) {
                            i65 = 0;
                            while (i65 < iCeil) {
                                i66 = (i65 * iCeil2) + i61;
                                i67 = i61;
                                if (i57 == 1) {
                                    i66 = (i67 * iCeil) + i65;
                                }
                                int i88 = i57;
                                i68 = i66;
                                if (i68 >= eVarArr2.length) {
                                    eVarArr5 = eVarArr2;
                                } else {
                                    int iP5 = hVar.P(eVar7, i16);
                                    eVarArr5 = eVarArr2;
                                    eVar8 = hVar.X0[i67];
                                    if (eVar8 != null) {
                                        hVar.X0[i67] = eVar7;
                                    } else {
                                        hVar.X0[i67] = eVar7;
                                    }
                                    int iO5 = hVar.O(eVar7, i16);
                                    eVar9 = hVar.W0[i65];
                                    if (eVar9 != null) {
                                        hVar.W0[i65] = eVar7;
                                    } else {
                                        hVar.W0[i65] = eVar7;
                                    }
                                }
                                i65++;
                                i61 = i67;
                                i57 = i88;
                                eVarArr2 = eVarArr5;
                            }
                            i61++;
                        }
                        e[] eVarArr7 = eVarArr2;
                        i62 = i57;
                        iP2 = 0;
                        while (i63 < iCeil2) {
                            eVar6 = hVar.X0[i63];
                            if (eVar6 == null) {
                                if (i63 > 0) {
                                    iP2 += hVar.O0;
                                }
                                iP2 = hVar.P(eVar6, i16) + iP2;
                            }
                        }
                        i64 = 0;
                        iO3 = 0;
                        while (i64 < iCeil) {
                            eVar5 = hVar.W0[i64];
                            int i89 = i64;
                            if (eVar5 == null) {
                                if (i64 > 0) {
                                    iO3 += hVar.P0;
                                }
                                iO3 = hVar.O(eVar5, i16) + iO3;
                            }
                            i64 = i89 + 1;
                        }
                        iArr7[0] = iP2;
                        iArr7[1] = iO3;
                        if (i62 == 0) {
                            if (iP2 > i16) {
                            }
                            z14 = true;
                        } else {
                            if (iO3 > i16) {
                            }
                            z14 = true;
                        }
                        iArr = iArr7;
                        i57 = i62;
                        eVarArr2 = eVarArr7;
                    }
                    iArr3 = iArr;
                    c12 = 1;
                    int[] iArr8 = hVar.Y0;
                    iArr8[0] = iCeil2;
                    iArr8[1] = iCeil;
                }
                c10 = c12;
                i26 = i12;
                i27 = i13;
                i28 = i21;
                i24 = i33;
                iArr2 = iArr3;
                c11 = 0;
            } else {
                i24 = i15;
                i25 = i16;
                iArr2 = iArr;
                i26 = i12;
                i27 = i13;
                i28 = i21;
                c10 = 1;
                i29 = hVar.U0;
                if (i22 == 0) {
                    c11 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        gVar = new g(hVar, i29, hVar.H, hVar.I, hVar.J, hVar.K, i25);
                        arrayList.add(gVar);
                    } else {
                        g gVar12 = (g) arrayList.get(0);
                        gVar12.f6175c = 0;
                        gVar12.f6174b = null;
                        gVar12.l = 0;
                        gVar12.m = 0;
                        gVar12.f6184n = 0;
                        gVar12.f6185o = 0;
                        gVar12.f6186p = 0;
                        gVar12.f(i29, hVar.H, hVar.I, hVar.J, hVar.K, hVar.f6194v0, hVar.f6190r0, hVar.f6195w0, hVar.f6191s0, i25);
                        gVar = gVar12;
                    }
                    while (i30 < i22) {
                        gVar.a(eVarArr2[i30]);
                    }
                    c11 = 0;
                    iArr2[0] = gVar.d();
                    iArr2[1] = gVar.c();
                }
            }
            i31 = iArr2[c11] + i26 + i27;
            i32 = iArr2[c10] + i28 + i24;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(i31, size2);
                } else if (mode == 0) {
                    size2 = i31;
                } else {
                    size2 = 0;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size3 = Math.min(i32, size3);
                } else if (mode2 == 0) {
                    size3 = i32;
                } else {
                    size3 = 0;
                }
            }
            hVar.f6197y0 = size2;
            hVar.f6198z0 = size3;
            hVar.J(size2);
            hVar.G(size3);
            if (hVar.f6206q0 > 0) {
                z10 = c10;
            } else {
                z10 = 0;
            }
            hVar.f6196x0 = z10;
        }
        setMeasuredDimension(hVar.f6197y0, hVar.f6198z0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j(this.J, i10, i11);
    }

    public void setFirstHorizontalBias(float f3) {
        this.J.K0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.J.E0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.J.L0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.J.F0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.J.Q0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.J.I0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.J.O0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.J.C0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.J.T0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.J.U0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        h hVar = this.J;
        hVar.f6190r0 = i10;
        hVar.f6191s0 = i10;
        hVar.f6192t0 = i10;
        hVar.f6193u0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.J.f6191s0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.J.f6194v0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.J.f6195w0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.J.f6190r0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.J.R0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.J.J0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.J.P0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.J.D0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.J.S0 = i10;
        requestLayout();
    }
}
