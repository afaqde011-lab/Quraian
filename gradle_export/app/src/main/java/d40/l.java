package d40;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ActionMode;
import android.view.View;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k9.b4;
import retrofit2.HttpException;
import ri.t1;

public final class l extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final Object C;
    public final Object D;

    public l(Object obj, Object obj2, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.C = obj;
        this.D = obj2;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l((j) this.C, (kotlin.jvm.internal.z) this.D, cVar, 0);
            case 1:
                return new l((fc.n) this.C, (u00.o) this.D, cVar, 1);
            case 2:
                return new l((kt.b) this.C, (mt.a) this.D, cVar, 2);
            case 3:
                return new l((ns.c) this.C, (List) this.D, cVar, 3);
            case 4:
                return new l((AudioPlayerService) this.C, (List) this.D, cVar, 4);
            case 5:
                return new l((AudioPlayerService) this.C, (String) this.D, cVar, 5);
            case 6:
                return new l((v0.f) this.C, (x0.e) this.D, cVar, 6);
            case 7:
                return new l((vn.b0) this.C, (bo.c) this.D, cVar, 7);
            default:
                return new l((x0.c) this.C, (x0.b) this.D, cVar, 8);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((l) create(cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objB;
        ns.l lVar;
        is.c1 c1Var;
        Object objN;
        v0.d dVar;
        int i = this.A;
        int i2 = 10;
        Object obj2 = g00.b0.a;
        k00.c cVar = null;
        Object obj3 = this.C;
        Object obj4 = this.D;
        switch (i) {
            case 0:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj4;
                l00.a aVar = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    j jVar = (j) obj3;
                    eh.l lVar2 = e40.b.b;
                    Object obj5 = zVar.A;
                    if (obj5 == lVar2) {
                        obj5 = null;
                    }
                    this.B = 1;
                    if (jVar.emit(obj5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                zVar.A = null;
                return obj2;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj2;
                }
                t1.O(obj);
                fc.n nVar = (fc.n) obj3;
                h1.g gVar = new h1.g(nVar, 3);
                ev.p pVar = new ev.p((u00.o) obj4, nVar, cVar, i2);
                this.B = 1;
                return h1.f.f(gVar, pVar, this) == aVar2 ? aVar2 : obj2;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    String strA = ((mt.a) obj4).a();
                    this.B = 1;
                    objB = ((kt.b) obj3).b(strA, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objB = obj;
                }
                return ((ft.a) objB).getTranscriptions();
            case 3:
                List list = (List) obj4;
                ns.c cVar2 = (ns.c) obj3;
                l00.a aVar4 = l00.a.A;
                int i6 = this.B;
                try {
                    try {
                        if (i6 != 0) {
                            if (i6 == 1) {
                                t1.O(obj);
                            } else if (i6 == 2) {
                                t1.O(obj);
                                c1Var = cVar2.c;
                                this.B = 3;
                                if (c1Var.a(list, this) == aVar4) {
                                    return aVar4;
                                }
                            } else {
                                if (i6 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t1.O(obj);
                            }
                            lVar = ns.l.A;
                            return lVar;
                        }
                        t1.O(obj);
                        is.p0 p0Var = cVar2.b;
                        this.B = 1;
                        if (p0Var.b(list, this) == aVar4) {
                            return aVar4;
                        }
                        is.c0 c0Var = cVar2.a;
                        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ss.d) it.next()).getFields().a);
                        }
                        this.B = 2;
                        Object objA = c0Var.b.a(arrayList, this);
                        if (objA == l00.a.A) {
                            obj2 = objA;
                        }
                        if (obj2 == aVar4) {
                            return aVar4;
                        }
                        c1Var = cVar2.c;
                        this.B = 3;
                        if (c1Var.a(list, this) == aVar4) {
                            return aVar4;
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    lVar = ns.l.A;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (HttpException e2) {
                    lVar = ns.d.a.contains(new Integer(e2.A)) ? ns.l.B : ns.l.C;
                } catch (Exception unused2) {
                    lVar = ns.l.C;
                }
                return lVar;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i7 = this.B;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                int i8 = AudioPlayerService.j0;
                ov.g gVarY = ((AudioPlayerService) obj3).y();
                List list2 = (List) obj4;
                ArrayList arrayList2 = new ArrayList(h00.r.q0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String mediaId = ((androidx.media3.common.q0) it2.next()).a;
                    kotlin.jvm.internal.m.d(mediaId, "mediaId");
                    arrayList2.add(mediaId);
                }
                this.B = 1;
                Object objE = gVarY.e(arrayList2, this);
                return objE == aVar5 ? aVar5 : objE;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i9 = this.B;
                if (i9 == 0) {
                    t1.O(obj);
                    int i11 = AudioPlayerService.j0;
                    ov.g gVarY2 = ((AudioPlayerService) obj3).y();
                    String str = (String) obj4;
                    this.B = 1;
                    sd.p1 p1Var = gVarY2.g;
                    dh.o oVar = gVarY2.b;
                    rv.p pVar2 = gVarY2.c;
                    if (r30.r.x0(str, "playlist/", false) && !r30.r.x0(str, "pltt/", false)) {
                        objN = gVarY2.i.L(str, this);
                    } else if (r30.r.x0(str, "pltt/", false)) {
                        objN = gVarY2.d.j(str, this);
                    } else if (!r30.r.x0(str, "dl/", false) && !r30.r.x0(str, "surah/", false)) {
                        if (!r30.r.x0(str, "reciter/", false)) {
                            if (!str.equals("stories")) {
                                if (!r30.r.x0(str, "story/", false)) {
                                    switch (str) {
                                        case "tab_home":
                                            objN = oVar.n(str, 2131886232, 2131231177, qv.a.A);
                                            break;
                                        case "fav_surahs":
                                            objN = oVar.n(str, 2131886225, 2131231389, (qv.a) null);
                                            break;
                                        case "tab_collections":
                                            objN = oVar.n(str, 2131886230, 2131231109, qv.a.B);
                                            break;
                                        case "fav_reciters":
                                            objN = oVar.n(str, 2131886224, 2131231368, (qv.a) null);
                                            break;
                                        case "root":
                                            objN = gVarY2.g();
                                            break;
                                        case "tab_favorites":
                                            objN = oVar.n(str, 2131886231, 2131231389, (qv.a) null);
                                            break;
                                        case "tab_reciters":
                                            objN = oVar.n(str, 2131886233, 2131231368, (qv.a) null);
                                            break;
                                        case "downloads":
                                            objN = oVar.n(str, 2131886223, 2131231120, (qv.a) null);
                                            break;
                                        default:
                                            objN = null;
                                            break;
                                    }
                                } else {
                                    objN = p1Var.I(str, this);
                                }
                            } else {
                                objN = p1Var.x(this);
                            }
                        } else {
                            objN = gVarY2.e.n(str, this);
                        }
                    } else {
                        objN = pVar2.g(str, this);
                    }
                    if (objN == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objN = obj;
                }
                androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) objN;
                if (q0Var == null) {
                    return k9.q.b(-3);
                }
                k9.q.e(q0Var);
                return new k9.q(0, SystemClock.elapsedRealtime(), (k9.e1) null, (b4) null, q0Var, 2);
            case 6:
                v0.f fVar = (v0.f) obj3;
                Handler handler = fVar.e;
                View view = fVar.a;
                l00.a aVar7 = l00.a.A;
                int i12 = this.B;
                try {
                    if (i12 == 0) {
                        t1.O(obj);
                        v0.e eVar = new v0.e();
                        x0.e eVar2 = (x0.e) obj4;
                        v0.d dVar2 = new v0.d(eVar, new v0.b(fVar, eVar2, 0), new v0.b(fVar, eVar2, 1), view);
                        u00.k kVar = fVar.b;
                        if (kVar != null && (dVar = (v0.d) kVar.invoke(dVar2)) != null) {
                            dVar2 = dVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (looperMyLooper != (handler2 != null ? handler2.getLooper() : null)) {
                            ab.e eVar3 = fVar.i;
                            if (eVar3 == null) {
                                eVar3 = new ab.e(fVar, dVar2, eVar, 25);
                                fVar.i = eVar3;
                            }
                            view.post(eVar3);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new v0.j(dVar2), 1);
                            if (actionModeStartActionMode == null) {
                                return obj2;
                            }
                            fVar.h = actionModeStartActionMode;
                        }
                        this.B = 1;
                        Object objK = eVar.a.k(this);
                        if (objK != aVar7) {
                            objK = obj2;
                        }
                        if (objK == aVar7) {
                            return aVar7;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    handler.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    handler = view.getHandler();
                    if (looperMyLooper2 != (handler != null ? handler.getLooper() : null)) {
                        m9.f fVar2 = fVar.j;
                        if (fVar2 == null) {
                            fVar2 = new m9.f(fVar, 15);
                            fVar.j = fVar2;
                        }
                        view.post(fVar2);
                    } else {
                        ActionMode actionMode = fVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    ab.e eVar4 = fVar.i;
                    if (eVar4 != null) {
                        view.removeCallbacks(eVar4);
                    }
                    fVar.h = null;
                    return obj2;
                } catch (Throwable th) {
                    handler.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        m9.f fVar3 = fVar.j;
                        if (fVar3 == null) {
                            fVar3 = new m9.f(fVar, 15);
                            fVar.j = fVar3;
                        }
                        view.post(fVar3);
                    } else {
                        ActionMode actionMode2 = fVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    ab.e eVar5 = fVar.i;
                    if (eVar5 != null) {
                        view.removeCallbacks(eVar5);
                    }
                    fVar.h = null;
                    throw th;
                }
            case 7:
                l00.a aVar8 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                this.B = 1;
                Object objB2 = vn.b0.b((vn.b0) obj3, (bo.c) obj4, this);
                return objB2 == aVar8 ? aVar8 : objB2;
            default:
                x0.b bVar = (x0.b) obj4;
                l1.i1 i1Var = ((x0.c) obj3).c;
                l00.a aVar9 = l00.a.A;
                int i14 = this.B;
                try {
                    if (i14 == 0) {
                        t1.O(obj);
                        i1Var.setValue(bVar);
                        this.B = 1;
                        Object objK2 = bVar.b.k(this);
                        if (objK2 != aVar9) {
                            objK2 = obj2;
                        }
                        if (objK2 == aVar9) {
                            return aVar9;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    i1Var.setValue((Object) null);
                    return obj2;
                } catch (Throwable th2) {
                    i1Var.setValue((Object) null);
                    throw th2;
                }
        }
    }
}
