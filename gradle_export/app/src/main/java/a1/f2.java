package a1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.ExoPlayer;
import bv.e3;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.SurahModel;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.onboarding.presentation.screen.OnboardingEffect;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerEffect;
import g1.b8;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f2 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final Object C;
    public final Object D;

    public f2(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = obj;
        this.D = obj2;
        this.C = obj3;
    }

    public f2(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.C = obj2;
    }

    public f2(v2.v vVar, q0.r1 r1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 20;
        this.C = vVar;
        this.D = r1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                f2 f2Var = new f2((j2) this.D, (v2.v) this.C, cVar, 0);
                f2Var.B = obj;
                return f2Var;
            case 1:
                f2 f2Var2 = new f2((b1.e0) this.D, (v2.v) this.C, cVar, 1);
                f2Var2.B = obj;
                return f2Var2;
            case 2:
                f2 f2Var3 = new f2((kotlin.jvm.internal.v) this.D, (e3) this.C, cVar, 2);
                f2Var3.B = obj;
                return f2Var3;
            case 3:
                f2 f2Var4 = new f2((String) this.D, (String) this.C, cVar, 3);
                f2Var4.B = obj;
                return f2Var4;
            case 4:
                return new f2((nm.b) this.B, (androidx.lifecycle.w) this.D, (du.t0) this.C, cVar, 4);
            case 5:
                return new f2((List) this.B, (List) this.D, (List) this.C, cVar, 5);
            case 6:
                f2 f2Var5 = new f2((cq.a) this.D, (aq.a) this.C, cVar, 6);
                f2Var5.B = obj;
                return f2Var5;
            case 7:
                return new f2((List) this.B, (List) this.D, (fy.c0) this.C, cVar, 7);
            case 8:
                return new f2((b3.f2) this.B, (g1.h) this.D, (b8) this.C, cVar, 8);
            case 9:
                return new f2((cc.a) this.B, (Context) this.D, (String) this.C, cVar, 9);
            case 10:
                f2 f2Var6 = new f2((ExoPlayer) this.D, (u00.a) this.C, cVar, 10);
                f2Var6.B = obj;
                return f2Var6;
            case 11:
                return new f2((nm.b) this.B, (androidx.lifecycle.w) this.D, (gz.m1) this.C, cVar, 11);
            case 12:
                return new f2((d0.n2) this.B, (l1.z0) this.D, (l1.z0) this.C, cVar, 12);
            case 13:
                f2 f2Var7 = new f2((hp.a) this.D, (ol.b) this.C, cVar, 13);
                f2Var7.B = obj;
                return f2Var7;
            case 14:
                return new f2((ld.l) this.B, (String) this.D, (JSONArray) this.C, cVar, 14);
            case 15:
                f2 f2Var8 = new f2((cu.a) this.D, (e.j) this.C, cVar, 15);
                f2Var8.B = obj;
                return f2Var8;
            case 16:
                return new f2((String) this.B, (byte[]) this.D, (ms.a) this.C, cVar, 16);
            case 17:
                f2 f2Var9 = new f2((x.b) this.D, (x.b) this.C, cVar, 17);
                f2Var9.B = obj;
                return f2Var9;
            case TYPE_SINT64_VALUE:
                return new f2((AudioPlayerService) this.B, (ho.a) this.D, (ho.g) this.C, cVar, 18);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                f2 f2Var10 = new f2((Context) this.D, (Bitmap) this.C, cVar, 19);
                f2Var10.B = obj;
                return f2Var10;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                f2 f2Var11 = new f2((v2.v) this.C, (q0.r1) this.D, cVar);
                f2Var11.B = obj;
                return f2Var11;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                f2 f2Var12 = new f2((kotlin.jvm.internal.v) this.D, (PlayerItem) this.C, cVar, 21);
                f2Var12.B = obj;
                return f2Var12;
            default:
                f2 f2Var13 = new f2((t5.d) this.D, (Long) this.C, cVar, 22);
                f2Var13.B = obj;
                return f2Var13;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws JSONException, NoWhenBranchMatchedException, IOException {
        switch (this.A) {
            case 0:
                f2 f2VarCreate = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                f2VarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                f2 f2VarCreate2 = create((su.s) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                f2VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 3:
                return create((t5.b) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                f2 f2VarCreate3 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                f2VarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                f2 f2VarCreate4 = create((fy.q) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                f2VarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                f2 f2VarCreate5 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                f2VarCreate5.invokeSuspend(b0Var5);
                return b0Var5;
            case 9:
                f2 f2VarCreate6 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                f2VarCreate6.invokeSuspend(b0Var6);
                return b0Var6;
            case 10:
                f2 f2VarCreate7 = create((c00.h) obj, (k00.c) obj2);
                g00.b0 b0Var7 = g00.b0.a;
                f2VarCreate7.invokeSuspend(b0Var7);
                return b0Var7;
            case 11:
                f2 f2VarCreate8 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var8 = g00.b0.a;
                f2VarCreate8.invokeSuspend(b0Var8);
                return b0Var8;
            case 12:
                f2 f2VarCreate9 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var9 = g00.b0.a;
                f2VarCreate9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                f2 f2VarCreate10 = create((jp.w) obj, (k00.c) obj2);
                g00.b0 b0Var10 = g00.b0.a;
                f2VarCreate10.invokeSuspend(b0Var10);
                return b0Var10;
            case 14:
                f2 f2VarCreate11 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var11 = g00.b0.a;
                f2VarCreate11.invokeSuspend(b0Var11);
                return b0Var11;
            case 15:
                f2 f2VarCreate12 = create((lu.r) obj, (k00.c) obj2);
                g00.b0 b0Var12 = g00.b0.a;
                f2VarCreate12.invokeSuspend(b0Var12);
                return b0Var12;
            case 16:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                f2 f2VarCreate13 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var13 = g00.b0.a;
                f2VarCreate13.invokeSuspend(b0Var13);
                return b0Var13;
            case TYPE_SINT64_VALUE:
                f2 f2VarCreate14 = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var14 = g00.b0.a;
                f2VarCreate14.invokeSuspend(b0Var14);
                return b0Var14;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((DownloadedSurahModel) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                f2 f2VarCreate15 = create((t5.b) obj, (k00.c) obj2);
                g00.b0 b0Var15 = g00.b0.a;
                f2VarCreate15.invokeSuspend(b0Var15);
                return b0Var15;
        }
    }

    public final Object invokeSuspend(Object obj) throws JSONException, NoWhenBranchMatchedException, IOException {
        qr.a aVar;
        qr.s sVar;
        String strC;
        Uri uriS;
        int i10 = this.A;
        int i11 = 10;
        int i12 = 2;
        boolean z10 = false;
        int i13 = 0;
        k00.c cVar = null;
        int i14 = 1;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.C;
        Object obj3 = this.D;
        switch (i10) {
            case 0:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar = (a40.z) this.B;
                j2 j2Var = (j2) obj3;
                b1.e0 e0Var = j2Var.S;
                v2.v vVar = (v2.v) obj2;
                o1 o1Var = new o1(e0Var, j2Var, i14);
                a40.a0 a0Var = a40.a0.D;
                k00.c cVar2 = null;
                a40.c0.y(zVar, (k00.i) null, a0Var, new d2(e0Var, vVar, cVar2, z10 ? 1 : 0), 1);
                a40.c0.y(zVar, (k00.i) null, a0Var, new g(j2Var, e0Var, vVar, o1Var, null, 1), 1);
                a40.c0.y(zVar, (k00.i) null, a0Var, new e2(e0Var, vVar, o1Var, cVar2, 0), 1);
                return b0Var;
            case 1:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar2 = (a40.z) this.B;
                a40.a0 a0Var2 = a40.a0.D;
                b1.e0 e0Var2 = (b1.e0) obj3;
                v2.v vVar2 = (v2.v) obj2;
                k00.c cVar3 = null;
                a40.c0.y(zVar2, (k00.i) null, a0Var2, new d2(e0Var2, vVar2, cVar3, 1), 1);
                a40.c0.y(zVar2, (k00.i) null, a0Var2, new d2(e0Var2, vVar2, cVar3, i12), 1);
                return a40.c0.y(zVar2, (k00.i) null, a0Var2, new d2(vVar2, e0Var2, null), 1);
            case 2:
                e3 e3Var = (e3) obj2;
                pm.b bVar = ((vm.a) e3Var).c;
                su.s sVar2 = (su.s) this.B;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) obj3;
                boolean z11 = (vVar3.A || sVar2 == null) ? false : true;
                vVar3.A = sVar2 != null;
                e3Var.i(bv.o1.a((bv.o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, (PlayerItem) null, false, false, 0, false, false, false, (zz.a) null, (u30.b) null, (u30.b) null, (u30.b) null, (u30.b) null, (u30.b) null, false, (yu.g) null, false, false, false, false, false, false, false, (ru.d) null, false, false, (u30.b) null, (Integer) null, (u30.f) null, (ot.b) null, (String) null, (u30.f) null, false, (String) null, (String) null, (String) null, (rt.g) null, 0, false, false, false, false, (ot.e) null, false, sVar2 != null ? sVar2.a : null, sVar2 != null ? sVar2.c : null, false, (yu.a) null, z11 ? true : sVar2 != null ? ((bv.o1) bVar.d.getValue()).a0 : false, false, false, -1, 15532031));
                return b0Var;
            case 3:
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                t5.b bVar2 = (t5.b) this.B;
                t5.b bVarG = bVar2.g();
                String str = (String) obj3;
                String str2 = (String) obj2;
                t5.d dVar = d6.a1.f4617g;
                h00.z zVar3 = (Set) bVar2.c(dVar);
                if (zVar3 == null) {
                    zVar3 = h00.z.A;
                }
                bVarG.f(dVar, h00.j0.r0(zVar3, str));
                bVarG.f(d6.t0.a(d6.a1.f4614d, str), str2);
                return bVarG.h();
            case 4:
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                a10.h0.G(new d40.z(((nm.b) this.B).a("FORCED_LOGOUT_NAVIGATION_KEY"), new du.j0((du.t0) obj2, (k00.c) null, 0), 1), (androidx.lifecycle.w) obj3);
                return b0Var;
            case 5:
                l00.a aVar7 = l00.a.A;
                ri.t1.O(obj);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                List list = (List) this.B;
                int iP = h00.d0.P(h00.r.q0(list, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Object obj4 : list) {
                    linkedHashMap.put(new Integer(((bx.c) obj4).a), obj4);
                }
                List list2 = (List) obj3;
                int iP2 = h00.d0.P(h00.r.q0(list2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP2 >= 16 ? iP2 : 16);
                for (Object obj5 : list2) {
                    linkedHashMap2.put(new Integer(((dw.a) obj5).a), obj5);
                }
                for (yt.b bVar3 : (List) obj2) {
                    Integer num = bVar3.e;
                    long j9 = bVar3.g;
                    Integer num2 = bVar3.e;
                    int i15 = bVar3.a;
                    if (num == null) {
                        bx.c cVar4 = (bx.c) linkedHashMap.get(new Integer(i15));
                        qr.s sVar3 = (qr.s) map.get(new Integer(i15));
                        if (sVar3 != null) {
                            int i16 = sVar3.c + 1;
                            long j10 = sVar3.d + j9;
                            int i17 = sVar3.a;
                            String str3 = sVar3.b;
                            String str4 = sVar3.e;
                            kotlin.jvm.internal.m.e(str3, "reciterName");
                            sVar = new qr.s(i17, i16, j10, str3, str4);
                        } else {
                            int i18 = bVar3.a;
                            String str5 = cVar4 != null ? cVar4.b : null;
                            String str6 = str5 == null ? RuntimeVersion.SUFFIX : str5;
                            long j11 = bVar3.g;
                            String str7 = cVar4 != null ? cVar4.e : null;
                            sVar = new qr.s(i18, 1, j11, str6, str7 == null ? RuntimeVersion.SUFFIX : str7);
                        }
                        map.put(new Integer(i15), sVar);
                    } else {
                        dw.a aVar8 = (dw.a) linkedHashMap2.get(num);
                        qr.a aVar9 = (qr.a) map2.get(num2);
                        if (aVar9 != null) {
                            int i19 = aVar9.d + 1;
                            long j12 = aVar9.e + j9;
                            int i20 = aVar9.a;
                            String str8 = aVar9.b;
                            String str9 = aVar9.c;
                            kotlin.jvm.internal.m.e(str8, "title");
                            aVar = new qr.a(i20, i19, j12, str8, str9);
                        } else {
                            int iIntValue = num2.intValue();
                            String str10 = aVar8 != null ? aVar8.c : null;
                            String str11 = str10 == null ? RuntimeVersion.SUFFIX : str10;
                            long j13 = bVar3.g;
                            String str12 = aVar8 != null ? aVar8.f : null;
                            aVar = new qr.a(iIntValue, 1, j13, str11, str12 == null ? RuntimeVersion.SUFFIX : str12);
                        }
                        map2.put(num2, aVar);
                    }
                }
                Collection collectionValues = map.values();
                kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
                List listN1 = h00.q.n1(collectionValues);
                Collection collectionValues2 = map2.values();
                kotlin.jvm.internal.m.d(collectionValues2, "<get-values>(...)");
                return new g00.k(listN1, h00.q.n1(collectionValues2));
            case 6:
                cq.a aVar10 = (cq.a) obj3;
                fy.n nVar = (fy.q) this.B;
                l00.a aVar11 = l00.a.A;
                ri.t1.O(obj);
                if (nVar instanceof fy.n) {
                    aVar10.d(new ReciterRoute.ReciterScreen(new ReciterLauncher(nVar.a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
                } else if (nVar instanceof fy.m) {
                    aVar10.d(new SearchRoute.PlaylistScreen(new PlaylistLauncher(((fy.m) nVar).a)));
                } else if (!(nVar instanceof fy.l)) {
                    if (nVar instanceof fy.o) {
                        aVar10.a.b(cq.f.b);
                    } else {
                        if (!(nVar instanceof fy.p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((aq.a) obj2).f(true, zp.b.B);
                    }
                }
                return b0Var;
            case 7:
                l00.a aVar12 = l00.a.A;
                ri.t1.O(obj);
                List<bx.c> list3 = (List) this.B;
                List list4 = (List) obj3;
                ArrayList<cy.m> arrayList = ((fy.c0) obj2).s;
                int iP3 = h00.d0.P(h00.r.q0(list3, 10));
                if (iP3 < 16) {
                    iP3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP3);
                for (Object obj6 : list3) {
                    linkedHashMap3.put(Integer.valueOf(((bx.c) obj6).a), obj6);
                }
                kotlin.jvm.internal.m.e(list4, "playlists");
                kotlin.jvm.internal.m.e(arrayList, "surahs");
                int iP4 = h00.d0.P(h00.r.q0(arrayList, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iP4 >= 16 ? iP4 : 16);
                for (Object obj7 : arrayList) {
                    linkedHashMap4.put(Integer.valueOf(((cy.m) obj7).a), obj7);
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list3, 10));
                for (bx.c cVar5 : list3) {
                    kotlin.jvm.internal.m.e(cVar5, "reciter");
                    ArrayList arrayListA = ay.d.a(h00.q.Y0(cVar5.j, va.a.R(cVar5.b)));
                    List listR = va.a.R(cVar5.i);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj8 : listR) {
                        if (!r30.k.L0((String) obj8)) {
                            arrayList3.add(obj8);
                        }
                    }
                    ArrayList arrayListA2 = ay.d.a(h00.q.Y0(cVar5.k, arrayList3));
                    String str13 = cVar5.c;
                    if (str13 == null) {
                        strC = null;
                    } else {
                        if (r30.k.L0(str13)) {
                            str13 = null;
                        }
                        if (str13 != null) {
                            strC = ay.e.c(str13);
                            if (strC.length() <= 0) {
                                strC = null;
                            }
                        } else {
                            strC = null;
                        }
                    }
                    arrayList2.add(new cy.k(cVar5, arrayListA, arrayListA2, strC));
                }
                ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList, 10));
                for (cy.m mVar : arrayList) {
                    kotlin.jvm.internal.m.e(mVar, "surah");
                    r30.j jVar = ay.e.a;
                    arrayList4.add(new cy.l(mVar, ay.e.c(mVar.b), ay.e.c(mVar.c), ay.e.c(mVar.d), String.valueOf(mVar.a), String.valueOf(mVar.e)));
                }
                ArrayList arrayList5 = new ArrayList(h00.r.q0(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    dw.a aVar13 = (dw.a) it.next();
                    kotlin.jvm.internal.m.e(aVar13, "playlist");
                    i00.b bVarS = va.a.s();
                    bVarS.add(aVar13.c);
                    String str14 = aVar13.d;
                    if (!r30.k.L0(str14)) {
                        bVarS.add(str14);
                    }
                    bVarS.addAll(aVar13.h);
                    ArrayList arrayListA3 = ay.d.a(va.a.k(bVarS));
                    u30.b bVar4 = aVar13.i;
                    ArrayList arrayList6 = new ArrayList(h00.r.q0(bVar4, i11));
                    Iterator it2 = bVar4.iterator();
                    while (it2.hasNext()) {
                        dw.b bVar5 = (dw.b) it2.next();
                        cy.m mVar2 = (cy.m) linkedHashMap4.get(Integer.valueOf(bVar5.e));
                        int i21 = bVar5.e;
                        String strValueOf = String.valueOf(i21);
                        LinkedHashMap linkedHashMap5 = linkedHashMap4;
                        ArrayList arrayListA4 = ay.d.a(h00.n.C0(new String[]{mVar2 != null ? mVar2.b : null, mVar2 != null ? mVar2.c : null, mVar2 != null ? mVar2.d : null}));
                        dw.c cVar6 = bVar5.f;
                        int i22 = cVar6.a;
                        Iterator it3 = it;
                        i00.b bVarS2 = va.a.s();
                        Iterator it4 = it2;
                        String str15 = bVar5.b;
                        if (str15 != null) {
                            if (r30.k.L0(str15)) {
                                str15 = null;
                            }
                            if (str15 != null) {
                                bVarS2.add(str15);
                            }
                        }
                        bVarS2.addAll(bVar5.c);
                        bx.c cVar7 = (bx.c) linkedHashMap3.get(Integer.valueOf(i22));
                        if (cVar7 != null) {
                            i00.b bVarS3 = va.a.s();
                            bVarS3.add(cVar7.b);
                            String str16 = cVar7.i;
                            if (!r30.k.L0(str16)) {
                                bVarS3.add(str16);
                            }
                            String str17 = cVar7.c;
                            if (str17 != null) {
                                if (r30.k.L0(str17)) {
                                    str17 = null;
                                }
                                if (str17 != null) {
                                    bVarS3.add(str17);
                                }
                            }
                            bVarS3.addAll(cVar7.j);
                            bVarS3.addAll(cVar7.k);
                            u30.b bVar6 = cVar7.d;
                            ArrayList arrayList7 = new ArrayList(h00.r.q0(bVar6, 10));
                            Iterator it5 = bVar6.iterator();
                            while (it5.hasNext()) {
                                arrayList7.add(((bx.b) it5.next()).b);
                            }
                            bVarS3.addAll(arrayList7);
                            bVarS3.add(String.valueOf(cVar7.a));
                            bVarS2.addAll(va.a.k(bVarS3));
                        } else {
                            bVarS2.addAll(va.a.S(cVar6.b, String.valueOf(i22)));
                        }
                        arrayList6.add(new cy.h(i21, strValueOf, arrayListA4, ay.d.a(va.a.k(bVarS2))));
                        linkedHashMap4 = linkedHashMap5;
                        it = it3;
                        it2 = it4;
                        linkedHashMap3 = linkedHashMap3;
                        arrayList4 = arrayList4;
                    }
                    arrayList5.add(new cy.j(aVar13, arrayListA3, arrayList6));
                    arrayList4 = arrayList4;
                    i11 = 10;
                }
                return new cy.i(arrayList2, arrayList4, arrayList5);
            case 8:
                b8 b8Var = (b8) obj2;
                g1.h hVar = (g1.h) obj3;
                l00.a aVar14 = l00.a.A;
                ri.t1.O(obj);
                b3.f2 f2Var = (b3.f2) this.B;
                Object obj9 = f2Var.f2025a;
                Boolean bool = Boolean.TRUE;
                if (kotlin.jvm.internal.m.a(obj9, bool)) {
                    hVar.a(b8Var.g());
                    hVar.b(b8Var.c());
                }
                f2Var.f2025a = bool;
                return b0Var;
            case 9:
                l00.a aVar15 = l00.a.A;
                ri.t1.O(obj);
                for (cc.j jVar2 : ((cc.a) this.B).f3109d.values()) {
                    kotlin.jvm.internal.m.d(jVar2, "asset");
                    String str18 = jVar2.f3133c;
                    if (jVar2.f3134d == null && r30.r.x0(str18, "data:", false) && r30.k.J0(str18, "base64,", 0, false, 6) > 0) {
                        try {
                            String strSubstring = str18.substring(r30.k.I0(str18, ',', 0, 6) + 1);
                            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                            byte[] bArrDecode = Base64.decode(strSubstring, 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            jVar2.f3134d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e3) {
                            oc.b.b("data URL did not have correct base64 format.", e3);
                        }
                    }
                    Context context = (Context) obj3;
                    String str19 = (String) obj2;
                    if (jVar2.f3134d == null && str19 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str19 + ((Object) str18));
                            kotlin.jvm.internal.m.d(inputStreamOpen, "try {\n        context.as…, e)\n        return\n    }");
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                jVar2.f3134d = oc.e.e(BitmapFactory.decodeStream(inputStreamOpen, null, options2), jVar2.f3131a, jVar2.f3132b);
                            } catch (IllegalArgumentException e10) {
                                oc.b.b("Unable to decode image.", e10);
                            }
                        } catch (IOException e11) {
                            oc.b.b("Unable to open asset.", e11);
                        }
                    }
                    break;
                }
                return b0Var;
            case 10:
                c00.g gVar = (c00.h) this.B;
                l00.a aVar16 = l00.a.A;
                ri.t1.O(obj);
                ExoPlayer exoPlayer = (ExoPlayer) obj3;
                u00.a aVar17 = (u00.a) obj2;
                if (gVar instanceof SoundEffectPickerEffect.CloseScreen) {
                    aVar17.invoke();
                } else {
                    if (!(gVar instanceof c00.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zz.a aVar18 = gVar.a;
                    if (aVar18 == null) {
                        ((androidx.media3.common.f) exoPlayer).clearMediaItems();
                    } else {
                        androidx.media3.common.f fVar = (androidx.media3.common.f) exoPlayer;
                        fVar.setMediaItem(androidx.media3.common.q0.b(Uri.parse(aVar18.c)));
                        ((i7.z) exoPlayer).prepare();
                        fVar.play();
                    }
                }
                return b0Var;
            case 11:
                l00.a aVar19 = l00.a.A;
                ri.t1.O(obj);
                a10.h0.G(new d40.z(((nm.b) this.B).a("ACCOUNT_DELETED_NAVIGATION_KEY"), new gz.c1((gz.m1) obj2, (k00.c) null, 0), 1), (androidx.lifecycle.w) obj3);
                return b0Var;
            case 12:
                l00.a aVar20 = l00.a.A;
                ri.t1.O(obj);
                float f3 = hv.v.a;
                if (!((Boolean) ((l1.z0) obj3).getValue()).booleanValue() && !((d0.n2) this.B).a()) {
                    ((l1.z0) obj2).setValue(Boolean.FALSE);
                }
                return b0Var;
            case 13:
                hp.a aVar21 = (hp.a) obj3;
                jp.v vVar4 = (jp.w) this.B;
                l00.a aVar22 = l00.a.A;
                ri.t1.O(obj);
                if (!(vVar4 instanceof jp.u)) {
                    if (!(vVar4 instanceof jp.v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ol.b.a((ol.b) obj2, vVar4.a, (ol.c) null, 6);
                    if (aVar21 != null) {
                        aVar21.a();
                    }
                } else if (aVar21 != null) {
                    aVar21.dismiss();
                }
                return b0Var;
            case 14:
                l00.a aVar23 = l00.a.A;
                ri.t1.O(obj);
                ad.f fVar2 = ((ld.l) this.B).f10277a;
                String str20 = (String) obj3;
                JSONArray jSONArray = (JSONArray) obj2;
                kotlin.jvm.internal.m.e(str20, "filePath");
                ld.h hVar2 = fVar2.f446c;
                File file = hVar2.f10266a;
                File file2 = new File(str20);
                if (file2.exists()) {
                    String name = file2.getName();
                    File file3 = new File(file, w.c.j(name, "-1.tmp"));
                    File file4 = new File(file, w.c.j(name, "-2.tmp"));
                    int length = jSONArray.length() / 2;
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    z00.d it6 = ab.a0.I0(0, jSONArray.length()).iterator();
                    while (true) {
                        z00.d dVar2 = it6;
                        if (dVar2.C) {
                            int iNextInt = dVar2.nextInt();
                            if (iNextInt < length) {
                                JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                                kotlin.jvm.internal.m.d(jSONObject, "getJSONObject(...)");
                                arrayList8.add(jSONObject);
                            } else {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                                kotlin.jvm.internal.m.d(jSONObject2, "getJSONObject(...)");
                                arrayList9.add(jSONObject2);
                            }
                        } else {
                            hVar2.j(arrayList8, file3, true);
                            hVar2.j(arrayList9, file4, true);
                            hVar2.f(str20);
                        }
                    }
                }
                return b0Var;
            case 15:
                lu.r rVar = (lu.r) this.B;
                l00.a aVar24 = l00.a.A;
                ri.t1.O(obj);
                cu.a aVar25 = (cu.a) obj3;
                e.j jVar3 = (e.j) obj2;
                float f10 = lu.y.a;
                if (rVar instanceof OnboardingEffect.CloseScreen) {
                    z1.p pVar = aVar25.a;
                    h00.v.z0(pVar);
                    pVar.add(cu.b.INSTANCE);
                } else {
                    if (!(rVar instanceof lu.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar3.a("android.permission.POST_NOTIFICATIONS", null);
                }
                return b0Var;
            case 16:
                l00.a aVar26 = l00.a.A;
                ri.t1.O(obj);
                ce.c cVar8 = new ce.c(18);
                cVar8.H((String) this.B);
                byte[] bArr = (byte[]) obj3;
                int length2 = bArr.length;
                kotlin.jvm.internal.m.e(bArr, "<this>");
                y40.b.c(bArr.length, 0, length2);
                cVar8.B("PUT", new x40.y(length2, bArr));
                x40.b0 b0VarF = ((ms.a) obj2).a.a(cVar8.r()).f();
                try {
                    Integer num3 = new Integer(b0VarF.D);
                    b0VarF.close();
                    return num3;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ta.c0.C(b0VarF, th2);
                        throw th3;
                    }
                }
            case 17:
                a40.z zVar4 = (a40.z) this.B;
                l00.a aVar27 = l00.a.A;
                ri.t1.O(obj);
                x.q1 q1VarW = x.c.w(880, 0, x.x.f16384a, 2);
                ta.c0.M(zVar4, null, null, null, new mu.l((x.b) obj3, q1VarW, (k00.c) null, 0), 31);
                ta.c0.M(zVar4, null, null, null, new mu.l((x.b) obj2, q1VarW, (k00.c) null, 1), 31);
                return b0Var;
            case TYPE_SINT64_VALUE:
                l00.a aVar28 = l00.a.A;
                ri.t1.O(obj);
                ((go.a) ((AudioPlayerService) this.B).Z.getValue()).x((ho.a) obj3, (ho.g) obj2, ho.o.C, false);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                l00.a aVar29 = l00.a.A;
                ri.t1.O(obj);
                Context context2 = (Context) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                try {
                    File file5 = new File(context2.getCacheDir(), "share");
                    file5.mkdirs();
                    File file6 = new File(file5, "artwork.png");
                    FileOutputStream fileOutputStream = new FileOutputStream(file6);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        uriS = FileProvider.d(context2, context2.getPackageName() + ".share", file6);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            ta.c0.C(fileOutputStream, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    uriS = ri.t1.s(th6);
                }
                if (uriS instanceof g00.m) {
                    return null;
                }
                return uriS;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                l00.a aVar30 = l00.a.A;
                ri.t1.O(obj);
                a40.z zVar5 = (a40.z) this.B;
                a40.a0 a0Var3 = a40.a0.D;
                v2.v vVar5 = (v2.v) obj2;
                q0.r1 r1Var = (q0.r1) obj3;
                a40.c0.y(zVar5, (k00.i) null, a0Var3, new q0.v0(vVar5, r1Var, cVar, i14), 1);
                return a40.c0.y(zVar5, (k00.i) null, a0Var3, new q0.v0(vVar5, r1Var, cVar, i12), 1);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) this.B;
                l00.a aVar31 = l00.a.A;
                ri.t1.O(obj);
                List surahsList = downloadedSurahModel.getSurahsList();
                kotlin.jvm.internal.m.d(surahsList, "getSurahsList(...)");
                PlayerItem playerItem = (PlayerItem) obj2;
                Iterator it7 = h00.q.o1(surahsList).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        SurahModel surahModel = (SurahModel) it7.next();
                        if (surahModel.getReciterId() != playerItem.getReciterId() || surahModel.getSurahId() != playerItem.getSurahId()) {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                    }
                }
                if (i13 < 0) {
                    return downloadedSurahModel;
                }
                ((kotlin.jvm.internal.v) obj3).A = true;
                ym.r builder = downloadedSurahModel.toBuilder();
                builder.d(i13);
                GeneratedMessageLite generatedMessageLiteBuild = builder.build();
                kotlin.jvm.internal.m.d(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            default:
                l00.a aVar32 = l00.a.A;
                ri.t1.O(obj);
                ((t5.b) this.B).e((t5.d) obj3, (Long) obj2);
                return b0Var;
        }
    }
}
