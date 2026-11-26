package com.amplitude.android.internal.locators;

import android.view.View;
import androidx.compose.ui.node.Owner;
import b2.r;
import b3.j0;
import b3.l0;
import b3.u;
import c3.a2;
import c3.x2;
import c3.z;
import g00.k;
import g00.p;
import h00.q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import rd.a;
import tc.c;
import xc.b;
import z2.a0;
import z2.b1;
import z2.d0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/amplitude/android/internal/locators/ComposeViewTargetLocator;", "Lxc/b;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeViewTargetLocator implements b {

    public final cd.b f3167a;

    public final p f3168b;

    public ComposeViewTargetLocator(cd.b bVar) {
        m.e(bVar, "logger");
        this.f3167a = bVar;
        this.f3168b = a.J(new j0(this, 28));
    }

    @Override
    public final c a(View view, k kVar) {
        h2.c cVarG;
        a0 a0Var;
        tc.b[] bVarArr = tc.b.A;
        m.e((Object) view, "<this>");
        h2.c cVar = null;
        Owner owner = view instanceof Owner ? (Owner) view : null;
        if (owner == null) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(((z) owner).getRoot());
        int i10 = 0;
        boolean z10 = false;
        String str = null;
        String str2 = null;
        while (!arrayDeque.isEmpty()) {
            l0 l0Var = (l0) arrayDeque.poll();
            if (l0Var != null) {
                if (l0Var.K()) {
                    defpackage.b bVar = (defpackage.b) this.f3168b.getValue();
                    bVar.getClass();
                    try {
                        List listV = l0Var.v();
                        Object objN0 = q.N0(listV);
                        b1 b1Var = (b1) objN0;
                        if (b1Var == null || (a0Var = b1Var.f17089b) == null || !a0Var.A()) {
                            objN0 = cVar;
                        }
                        b1 b1Var2 = (b1) objN0;
                        p pVarJ = a.J(new defpackage.a(i10, listV));
                        if (b1Var2 == null) {
                            b1Var2 = (b1) pVarJ.getValue();
                        }
                        ?? r11 = b1Var2 != null ? b1Var2.f17089b : cVar;
                        if (r11 == 0) {
                            r11 = (u) l0Var.f2059g0.D;
                        }
                        cVarG = d0.g(r11, true);
                    } catch (Exception unused) {
                        bVar.f1917a.c("Could not fetch position for LayoutNode");
                        cVarG = cVar;
                    }
                    if ((cVarG == null ? i10 : cVarG.a(ab.a0.d(((Number) kVar.A).floatValue(), ((Number) kVar.B).floatValue()))) != 0) {
                        Iterator it = l0Var.v().iterator();
                        int i11 = i10;
                        while (it.hasNext()) {
                            r rVar = ((b1) it.next()).f17088a;
                            if (rVar instanceof a2) {
                                a2 a2Var = (a2) rVar;
                                String strC = a2Var.c();
                                if (strC != null) {
                                    int iHashCode = strC.hashCode();
                                    if (iHashCode != -1964681502) {
                                        if (iHashCode == -1422466648) {
                                            if (strC.equals("testTag")) {
                                                for (x2 x2Var : a2Var.b()) {
                                                    if (x2Var.f2773a.equals("tag")) {
                                                        Object obj = x2Var.f2774b;
                                                        str = obj instanceof String ? (String) obj : null;
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (iHashCode == -932820115 && strC.equals("semantics")) {
                                            for (x2 x2Var2 : a2Var.b()) {
                                                if (x2Var2.f2773a.equals("properties")) {
                                                    Object obj2 = x2Var2.f2774b;
                                                    if (obj2 instanceof LinkedHashMap) {
                                                        for (Map.Entry entry : ((LinkedHashMap) obj2).entrySet()) {
                                                            m.b(entry);
                                                            Object key = entry.getKey();
                                                            Object value = entry.getValue();
                                                            if (m.a(key, "TestTag")) {
                                                                if (!(value instanceof String)) {
                                                                    str = null;
                                                                    break;
                                                                }
                                                                str = (String) value;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (strC.equals("clickable")) {
                                        i11 = 1;
                                    }
                                }
                                String name = rVar.getClass().getName();
                                if (name.equals("androidx.compose.foundation.ClickableElement") || name.equals("androidx.compose.foundation.CombinedClickableElement")) {
                                    i11 = 1;
                                }
                            }
                        }
                        if (i11 != 0) {
                            tc.b[] bVarArr2 = tc.b.A;
                            str2 = str;
                            z10 = true;
                        }
                    }
                }
                arrayDeque.addAll(l0Var.A().f());
                i10 = 0;
                cVar = null;
            }
        }
        if (z10) {
            return new c(null, null, null, str2, null, "jetpack_compose", null, false, false);
        }
        return null;
    }
}
