package az;

import a40.a0;
import a40.c0;
import a40.z;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import b3.f2;
import c3.p1;
import c3.t2;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountCodeScreen;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import com.mchutov.quranify.settings.presentation.screen.deletequestionnaire.DeleteAccountQuestionnaireEffect$CloseScreen;
import com.mchutov.quranify.settings.presentation.screen.devices.DevicesEffect$CloseScreen;
import e1.v0;
import g00.b0;
import g1.b8;
import g1.y;
import g1.z7;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import l1.z0;
import q0.r1;
import r3.w;
import ri.t1;
import v2.v;

public final class p extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public p(View view, cd.b bVar, g00.k kVar, List list, k00.c cVar) {
        super(2, cVar);
        this.A = 6;
        tc.b[] bVarArr = tc.b.A;
        this.B = view;
        this.C = kVar;
        this.E = list;
        this.D = bVar;
    }

    public p(Object obj, Object obj2, Object obj3, Object obj4, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.E = obj3;
        this.D = obj4;
    }

    public p(Object obj, Object obj2, Object obj3, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = obj;
        this.E = obj2;
        this.D = obj3;
    }

    public p(u00.a aVar, ol.b bVar, Context context, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = aVar;
        this.D = bVar;
        this.E = context;
    }

    public p(wy.m mVar, u00.a aVar, ol.b bVar, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        this.E = mVar;
        this.C = aVar;
        this.D = bVar;
    }

    public p(zy.l lVar, t2 t2Var, ol.b bVar, String str, k00.c cVar) {
        super(2, cVar);
        this.A = 8;
        this.B = lVar;
        this.C = t2Var;
        this.D = bVar;
        this.E = str;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        int i = this.A;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i) {
            case 0:
                p pVar = new p((u00.a) obj4, (sy.c) obj2, (ol.b) obj3, cVar, 0);
                pVar.B = obj;
                return pVar;
            case 1:
                p pVar2 = new p((u00.a) obj4, (ol.b) obj3, (Context) obj2, cVar);
                pVar2.B = obj;
                return pVar2;
            case 2:
                return new p((f2) this.B, (b8) obj4, (z0) obj2, (z0) obj3, cVar, 2);
            case 3:
                return new p((cc.a) this.B, (Context) obj4, (String) obj2, (String) obj3, cVar, 3);
            case 4:
                return new p((ld.l) this.B, (String) obj4, (ArrayList) obj2, (ArrayList) obj3, cVar, 4);
            case 5:
                p pVar3 = new p((v) obj4, (r1) obj2, (v0) obj3, cVar, 5);
                pVar3.B = obj;
                return pVar3;
            case 6:
                tc.b[] bVarArr = tc.b.A;
                return new p((View) this.B, (cd.b) obj3, (g00.k) obj4, (List) obj2, cVar);
            case 7:
                p pVar4 = new p((wy.m) obj2, (u00.a) obj4, (ol.b) obj3, cVar);
                pVar4.B = obj;
                return pVar4;
            default:
                return new p((zy.l) this.B, (t2) obj4, (ol.b) obj3, (String) obj2, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                p pVar = (p) create((i) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                pVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                p pVar2 = (p) create((bz.l) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                pVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                p pVar3 = (p) create((z) obj, (k00.c) obj2);
                b0 b0Var3 = b0.a;
                pVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                p pVar4 = (p) create((z) obj, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                pVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                p pVar5 = (p) create((z) obj, (k00.c) obj2);
                b0 b0Var5 = b0.a;
                pVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                p pVar6 = (p) create((z) obj, (k00.c) obj2);
                b0 b0Var6 = b0.a;
                pVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                return ((p) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
            case 7:
                p pVar7 = (p) create((wy.j) obj, (k00.c) obj2);
                b0 b0Var7 = b0.a;
                pVar7.invokeSuspend(b0Var7);
                return b0Var7;
            default:
                p pVar8 = (p) create((z) obj, (k00.c) obj2);
                b0 b0Var8 = b0.a;
                pVar8.invokeSuspend(b0Var8);
                return b0Var8;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        switch (i2) {
            case 0:
                i iVar = (i) this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (kotlin.jvm.internal.m.a(iVar, DeleteAccountQuestionnaireEffect$CloseScreen.INSTANCE)) {
                    ((u00.a) obj4).invoke();
                } else if (iVar instanceof g) {
                    sy.c cVar = (sy.c) obj2;
                    DeleteAccountCodeLauncher deleteAccountCodeLauncher = ((g) iVar).a;
                    cVar.getClass();
                    cVar.b.add(new SettingsRoute$DeleteAccountCodeScreen(deleteAccountCodeLauncher));
                } else {
                    if (!(iVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ol.b.a((ol.b) obj3, ((h) iVar).a, ol.c.B, 4);
                }
                return b0Var;
            case 1:
                bz.l lVar = (bz.l) this.B;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (lVar instanceof DevicesEffect$CloseScreen) {
                    ((u00.a) obj4).invoke();
                } else {
                    if (!(lVar instanceof bz.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bz.k kVar = (bz.k) lVar;
                    String string = ((Context) obj2).getString(kVar.a);
                    kotlin.jvm.internal.m.d(string, "getString(...)");
                    ol.b.a((ol.b) obj3, string, kVar.b, 4);
                }
                return b0Var;
            case 2:
                b8 b8Var = (b8) obj4;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                f2 f2Var = (f2) this.B;
                Object obj5 = f2Var.a;
                Boolean bool = Boolean.TRUE;
                if (kotlin.jvm.internal.m.a(obj5, bool)) {
                    ((z0) obj2).setValue(new w(y.a(z7.u(b8Var), (Locale) null, 14), 0L, 6));
                    ((z0) obj3).setValue(new w(y.a(b8Var.c(), (Locale) null, 14), 0L, 6));
                }
                f2Var.a = bool;
                return b0Var;
            case 3:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                for (ic.c font : ((cc.a) this.B).e.values()) {
                    Context context = (Context) obj4;
                    kotlin.jvm.internal.m.d(font, "font");
                    String str = font.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj2);
                    String str2 = font.b;
                    sb.append((Object) str);
                    sb.append((String) obj3);
                    try {
                        Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), sb.toString());
                        try {
                            kotlin.jvm.internal.m.d(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                            kotlin.jvm.internal.m.d(str2, "font.style");
                            boolean zA0 = r30.k.A0(str2, "Italic", false);
                            boolean zA1 = r30.k.A0(str2, "Bold", false);
                            if (zA0 && zA1) {
                                i = 3;
                            } else if (zA0) {
                                i = 2;
                            } else {
                                i = zA1 ? 1 : 0;
                            }
                            if (typefaceWithDefaultStyle.getStyle() != i) {
                                typefaceWithDefaultStyle = Typeface.create(typefaceWithDefaultStyle, i);
                            }
                            font.c = typefaceWithDefaultStyle;
                        } catch (Exception unused) {
                            oc.b.a.getClass();
                        }
                    } catch (Exception unused2) {
                        oc.b.a.getClass();
                    }
                }
                return b0Var;
            case 4:
                String str3 = (String) obj4;
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                ld.l lVar2 = (ld.l) this.B;
                cd.b bVar = lVar2.e;
                if (bVar != null) {
                    bVar.b("--> remove file: " + h00.q.k1(2, r30.k.W0(str3, new String[]{"-"}, 6)) + ", dropped events: " + ((ArrayList) obj2).size() + ", retry events: " + ((ArrayList) obj3).size());
                }
                lVar2.a.i(str3);
                return b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                z zVar = (z) this.B;
                a0 a0Var = a0.D;
                v vVar = (v) obj4;
                c0.y(zVar, null, a0Var, new q0.v0(vVar, (r1) obj2, (k00.c) null, 0), 1);
                c0.y(zVar, null, a0Var, new g6.a(vVar, (v0) obj3, (k00.c) null, 28), 1);
                return b0Var;
            case 6:
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                tc.b[] bVarArr = tc.b.A;
                return tc.a.a((View) this.B, (g00.k) obj4, (List) obj2, (cd.b) obj3);
            case 7:
                u00.a aVar8 = (u00.a) obj4;
                wy.m mVar = (wy.m) obj2;
                wy.j jVar = (wy.j) this.B;
                l00.a aVar9 = l00.a.A;
                t1.O(obj);
                if (!(jVar instanceof wy.h)) {
                    if (!(jVar instanceof wy.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ol.b.a((ol.b) obj3, ((wy.i) jVar).a, null, 6);
                    if (mVar != null) {
                        mVar.a.invoke();
                    } else {
                        aVar8.invoke();
                    }
                } else if (mVar != null) {
                    mVar.a.invoke();
                } else {
                    aVar8.invoke();
                }
                return b0Var;
            default:
                l00.a aVar10 = l00.a.A;
                t1.O(obj);
                if (((zy.l) this.B).j) {
                    p1 p1Var = (t2) obj4;
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    ol.b.a((ol.b) obj3, (String) obj2, ol.c.A, 4);
                }
                return b0Var;
        }
    }
}
