package d0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import c3.o3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import g1.b8;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;

public final class i2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final Object D;

    public i2(TextClassifier textClassifier, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 13;
        this.C = textClassifier;
        this.D = (m00.i) nVar;
    }

    public i2(b8 b8Var, int i10, g2.t tVar, k00.c cVar) {
        super(2, cVar);
        this.A = 29;
        this.C = b8Var;
        this.B = i10;
        this.D = tVar;
    }

    public i2(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
    }

    public i2(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
    }

    public i2(u00.n nVar, ea.r rVar, k00.c cVar) {
        super(2, cVar);
        this.A = 19;
        this.C = (m00.i) nVar;
        this.D = rVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i2((w) this.C, (m2) this.D, cVar, 0);
            case 1:
                return new i2((a40.e1) this.C, (t1) this.D, cVar, 1);
            case 2:
                return new i2((d.n) this.C, (d00.w0) this.D, cVar, 2);
            case 3:
                i2 i2Var = new i2((d40.i) this.D, cVar, 3);
                i2Var.C = obj;
                return i2Var;
            case 4:
                i2 i2Var2 = new i2((e40.u) this.D, cVar, 4);
                i2Var2.C = obj;
                return i2Var2;
            case 5:
                i2 i2Var3 = new i2((l1.x1) this.D, cVar, 5);
                i2Var3.C = obj;
                return i2Var3;
            case 6:
                i2 i2Var4 = new i2((AsyncRequestWorker) this.D, cVar, 6);
                i2Var4.C = obj;
                return i2Var4;
            case 7:
                i2 i2Var5 = new i2((d6.h) this.D, cVar, 7);
                i2Var5.C = obj;
                return i2Var5;
            case 8:
                return new i2((Context) this.C, (d6.f1) this.D, cVar, 8);
            case 9:
                return new i2((db.d) this.C, (c40.t) this.D, cVar, 9);
            case 10:
                return new i2((dq.u) this.C, (ReciterCollectionEvent) this.D, cVar, 10);
            case 11:
                return new i2((du.t0) this.D, cVar, 11);
            case 12:
                return new i2((dz.s) this.C, (u00.a) this.D, cVar, 12);
            case 13:
                return new i2((TextClassifier) this.C, (u00.n) this.D, cVar);
            case 14:
                i2 i2Var6 = new i2((e40.d) this.D, cVar, 14);
                i2Var6.C = obj;
                return i2Var6;
            case 15:
                i2 i2Var7 = new i2((e40.e) this.D, cVar, 15);
                i2Var7.C = obj;
                return i2Var7;
            case 16:
                i2 i2Var8 = new i2((d40.j) this.D, cVar, 16);
                i2Var8.C = obj;
                return i2Var8;
            case 17:
                return new i2((u00.n) this.C, (ea.d0) this.D, cVar, 17);
            case TYPE_SINT64_VALUE:
                return new i2((u00.n) this.C, (kotlin.jvm.internal.z) this.D, cVar, 18);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new i2((u00.n) this.C, (ea.r) this.D, cVar);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                i2 i2Var9 = new i2((eb.b) this.D, cVar, 20);
                i2Var9.C = obj;
                return i2Var9;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new i2((er.d) this.D, cVar, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                i2 i2Var10 = new i2((f1.a) this.D, cVar, 22);
                i2Var10.C = obj;
                return i2Var10;
            case 23:
                return new i2((b50.e) this.C, (x.i) this.D, cVar, 23);
            case 24:
                return new i2((rc.c) this.C, (rc.c) this.D, cVar, 24);
            case 25:
                return new i2((rc.c) this.C, (String) this.D, cVar, 25);
            case RuntimeVersion.MINOR:
                return new i2((z0.g) this.C, (l1.z0) this.D, cVar, 26);
            case 27:
                return new i2((f0.i) this.C, (z1.p) this.D, cVar, 27);
            case 28:
                return new i2((g1.h) this.C, (x.b1) this.D, cVar, 28);
            default:
                return new i2((b8) this.C, this.B, (g2.t) this.D, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InstantiationException, ClassNotFoundException, KotlinNothingValueException, InvocationTargetException {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 3:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((l6.m) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 14:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 15:
                return create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 16:
                return create(obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case TYPE_SINT64_VALUE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 23:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 24:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 25:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                i2 i2VarCreate = create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                i2VarCreate.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InstantiationException, ClassNotFoundException, KotlinNothingValueException, InvocationTargetException {
        byte[] bArr;
        byte[] bArr2;
        String str;
        boolean z10;
        Long releaseAtEpochMillis;
        Object objB;
        Object objA;
        String str2;
        ArrayList arrayListX;
        Object objP;
        Object objK;
        int i10 = 6;
        int i11 = 12;
        int i12 = 10;
        int i13 = 11;
        boolean zA = false;
        k00.c cVar = null;
        int i14 = 1;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    ri.t1.O(obj);
                    w wVar = (w) this.C;
                    float f3 = wVar.f4525b ? -1.0f : 1.0f;
                    u2 u2Var = ((m2) this.D).f4454n0;
                    long jF = y3.q.f(f3, wVar.f4524a);
                    this.B = 1;
                    if (u2Var.b(jF, false, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i16 = this.B;
                if (i16 != 0) {
                    if (i16 == 1) {
                        ri.t1.O(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                a40.e1 e1Var = (a40.e1) this.C;
                this.B = 1;
                if (e1Var.F(this) == aVar2) {
                    return aVar2;
                }
                t1 t1Var = (t1) this.D;
                this.B = 2;
                if (t1Var.e(this) == aVar2) {
                    return aVar2;
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i17 = this.B;
                if (i17 == 0) {
                    ri.t1.O(obj);
                    d40.z0 z0VarC = ((d.n) this.C).getLifecycle().c();
                    a1.c cVar2 = new a1.c((d00.w0) this.D, 8);
                    this.B = 1;
                    if (z0VarC.A.collect(cVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                throw new KotlinNothingValueException();
            case 3:
                l00.a aVar4 = l00.a.A;
                int i18 = this.B;
                if (i18 == 0) {
                    ri.t1.O(obj);
                    c40.t tVar = (c40.t) this.C;
                    d40.i iVar = (d40.i) this.D;
                    androidx.lifecycle.h hVar = new androidx.lifecycle.h(tVar, i14);
                    this.B = 1;
                    if (iVar.collect(hVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i19 = this.B;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                ri.t1.O(obj);
                d40.j jVar = (d40.j) this.C;
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                e40.u uVar = (e40.u) this.D;
                b1.g gVar = new b1.g(vVar, jVar, i10);
                this.B = 1;
                uVar.collect(gVar, this);
                return aVar5;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i20 = this.B;
                if (i20 == 0) {
                    ri.t1.O(obj);
                    a40.c0.y((a40.z) this.C, (k00.i) null, (a40.a0) null, new a1.a0((l1.x1) this.D, cVar, i11), 3);
                    l1.x1 x1Var = (l1.x1) this.D;
                    a40.f1 f1Var = x1Var.f9971y;
                    Object obj2 = g00.b0.a;
                    if (f1Var.S(obj2)) {
                        synchronized (x1Var.f9952d) {
                            x1Var.f9966t = true;
                        }
                    }
                    l1.x1 x1Var2 = (l1.x1) this.D;
                    this.B = 1;
                    Object objT = d40.o.t(x1Var2.f9969w, new d40.l1(2, (k00.c) null, 1), this);
                    if (objT == aVar6) {
                        obj2 = objT;
                    }
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 6:
                AsyncRequestWorker asyncRequestWorker = (AsyncRequestWorker) this.D;
                Context context = asyncRequestWorker.f17397b;
                f6.n nVar = asyncRequestWorker.f865i;
                l00.a aVar7 = l00.a.A;
                switch (this.B) {
                    case 0:
                        ri.t1.O(obj);
                        a40.z zVar = (a40.z) this.C;
                        if (nVar.D()) {
                            f6.m mVarX = nVar.x();
                            d6.f1 f1VarA = d6.a0.a(mVarX.r());
                            if (f1VarA != null) {
                                int[] iArrM1 = h00.q.m1(mVarX.p());
                                this.B = 1;
                                if (f1VarA.d(zVar, context, iArrM1, this) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else if (nVar.y()) {
                            f6.c cVarT = nVar.t();
                            d6.f1 f1VarA2 = d6.a0.a(cVarT.r());
                            if (f1VarA2 != null) {
                                int[] iArrM2 = h00.q.m1(cVarT.p());
                                this.B = 2;
                                if (f1VarA2.a(zVar, context, iArrM2, this) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else if (nVar.z()) {
                            f6.e eVarU = nVar.u();
                            d6.f1 f1VarA3 = d6.a0.a(eVarU.t());
                            if (f1VarA3 != null) {
                                Context context2 = asyncRequestWorker.f17397b;
                                int iR = eVarU.r();
                                String strQ = eVarU.q();
                                this.B = 3;
                                if (f1VarA3.b(zVar, context2, iR, strQ, this) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else if (nVar.C()) {
                            f6.k kVarW = nVar.w();
                            String strR = kVarW.r();
                            androidx.glance.appwidget.protobuf.i iVarQ = kVarW.q();
                            int size = iVarQ.size();
                            if (size == 0) {
                                bArr2 = androidx.glance.appwidget.protobuf.e0.f886b;
                            } else {
                                byte[] bArr3 = new byte[size];
                                iVarQ.e(size, bArr3);
                                bArr2 = bArr3;
                            }
                            int i21 = ActionCallbackBroadcastReceiver.f869a;
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.unmarshall(bArr2, 0, bArr2.length);
                            parcelObtain.setDataPosition(0);
                            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain);
                            parcelObtain.recycle();
                            c6.f fVarF = e6.f.f(bundle);
                            this.B = 4;
                            Class<?> cls = Class.forName(strR);
                            if (!e6.a.class.isAssignableFrom(cls)) {
                                throw new IllegalStateException("Provided class must implement ActionCallback.");
                            }
                            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                            kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
                            Object objA2 = ((e6.a) objNewInstance).a(fVarF, this);
                            if (objA2 != aVar7) {
                                objA2 = g00.b0.a;
                            }
                            if (objA2 == aVar7) {
                                return aVar7;
                            }
                        } else if (nVar.A()) {
                            d6.a1 a1Var = new d6.a1(context);
                            this.B = 5;
                            if (a1Var.a(this) == aVar7) {
                                return aVar7;
                            }
                        } else if (nVar.B()) {
                            f6.i iVarV = nVar.v();
                            d6.f1 f1VarA4 = d6.a0.a(iVarV.t());
                            if (f1VarA4 != null) {
                                Context context3 = asyncRequestWorker.f17397b;
                                int iQ = iVarV.q();
                                androidx.glance.appwidget.protobuf.i iVarR = iVarV.r();
                                int size2 = iVarR.size();
                                if (size2 == 0) {
                                    bArr = androidx.glance.appwidget.protobuf.e0.f886b;
                                } else {
                                    byte[] bArr4 = new byte[size2];
                                    iVarR.e(size2, bArr4);
                                    bArr = bArr4;
                                }
                                Parcel parcelObtain2 = Parcel.obtain();
                                parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                parcelObtain2.setDataPosition(0);
                                Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2);
                                parcelObtain2.recycle();
                                this.B = 6;
                                if (f1VarA4.c(zVar, context3, iQ, bundle2, this) == aVar7) {
                                    return aVar7;
                                }
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ri.t1.O(obj);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return za.t.a();
            case 7:
                l00.a aVar8 = g00.b0.a;
                l00.a aVar9 = l00.a.A;
                int i22 = this.B;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return aVar8;
                }
                ri.t1.O(obj);
                l6.m mVar = (l6.m) this.C;
                String strI = d6.w.i(((d6.h) this.D).f4631a);
                this.B = 1;
                d6.r rVar = (d6.r) mVar.f10037a.remove(strI);
                if (rVar != null) {
                    rVar.f4684d.f((Throwable) null);
                    rVar.f4682b.set(false);
                    rVar.m.i((CancellationException) null);
                }
                return aVar8 == aVar9 ? aVar9 : aVar8;
            case 8:
                l00.a aVar10 = l00.a.A;
                int i23 = this.B;
                try {
                    if (i23 == 0) {
                        ri.t1.O(obj);
                        Context context4 = (Context) this.C;
                        d6.f1 f1Var2 = (d6.f1) this.D;
                        d6.a1 a1Var2 = new d6.a1(context4);
                        d6.p0 p0VarE = f1Var2.e();
                        this.B = 1;
                        if (a1Var2.e(f1Var2, p0VarE, this) == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i23 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    break;
                } catch (CancellationException unused) {
                } catch (Throwable th2) {
                    Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
                }
                return g00.b0.a;
            case 9:
                l00.a aVar11 = l00.a.A;
                int i24 = this.B;
                if (i24 == 0) {
                    ri.t1.O(obj);
                    this.B = 1;
                    if (a40.c0.l(1000L, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                za.v.d().a(db.h.f4853a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((c40.t) this.D).j(new db.b(7));
                return g00.b0.a;
            case 10:
                l00.a aVar12 = l00.a.A;
                int i25 = this.B;
                if (i25 == 0) {
                    ri.t1.O(obj);
                    dq.u uVar2 = (dq.u) this.C;
                    ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) this.D;
                    this.B = 1;
                    if (dq.u.k(uVar2, reciterCollectionEvent, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 11:
                g00.b0 b0Var = g00.b0.a;
                du.t0 t0Var = (du.t0) this.D;
                xw.e eVar = t0Var.w;
                vp.x xVar = t0Var.q;
                wo.c0 c0Var = t0Var.s;
                l00.a aVar13 = l00.a.A;
                int i26 = this.B;
                if (i26 == 0) {
                    ri.t1.O(obj);
                    String premiumAuthPromptLastSeenVersion = c0Var.a.getPremiumAuthPromptLastSeenVersion();
                    if (!t0Var.f.a.getBoolean("onboarding_finished_key", false)) {
                        c0Var.c("2.4.1");
                        return b0Var;
                    }
                    if (kotlin.jvm.internal.m.a(premiumAuthPromptLastSeenVersion, "2.4.1")) {
                        return b0Var;
                    }
                    if (c0Var.a.isAuthorized()) {
                        c0Var.c("2.4.1");
                        return b0Var;
                    }
                    bt.t1 t1Var2 = new bt.t1(xVar.c, 12);
                    this.C = "2.4.1";
                    this.B = 1;
                    if (d40.o.s(t1Var2, this) == aVar13) {
                        return aVar13;
                    }
                    str = "2.4.1";
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.C;
                    ri.t1.O(obj);
                }
                if (kotlin.jvm.internal.m.a(c0Var.a.getPremiumAuthPromptLastSeenVersion(), str)) {
                    return b0Var;
                }
                ReciterCollectionEvent reciterCollectionEvent2 = (ReciterCollectionEvent) eVar.e.getValue();
                long jLongValue = ((Number) eVar.f.getValue()).longValue();
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                kotlin.jvm.internal.m.d(zoneIdSystemDefault, "systemDefault(...)");
                if (reciterCollectionEvent2 != null) {
                    if (reciterCollectionEvent2.getReleaseAtEpochMillis() == null) {
                        z10 = false;
                    } else {
                        Long releaseAtEpochMillis2 = reciterCollectionEvent2.getReleaseAtEpochMillis();
                        z10 = !(releaseAtEpochMillis2 != null && jLongValue >= releaseAtEpochMillis2.longValue());
                    }
                    if (z10 && (releaseAtEpochMillis = reciterCollectionEvent2.getReleaseAtEpochMillis()) != null) {
                        zA = kotlin.jvm.internal.m.a(Instant.ofEpochMilli(releaseAtEpochMillis.longValue()).atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochMilli(jLongValue).atZone(zoneIdSystemDefault).toLocalDate());
                    }
                }
                if (zA) {
                    return b0Var;
                }
                c0Var.c(str);
                if (c0Var.a.isAuthorized() || !xVar.k()) {
                    return b0Var;
                }
                t0Var.o();
                return b0Var;
            case 12:
                l00.a aVar14 = l00.a.A;
                int i27 = this.B;
                if (i27 == 0) {
                    ri.t1.O(obj);
                    d40.i iVarH = ((dz.s) this.C).h();
                    dz.l lVar = new dz.l((u00.a) this.D, (k00.c) null, 0);
                    this.B = 1;
                    if (d40.o.i(iVarH, lVar, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 13:
                l00.a aVar15 = l00.a.A;
                int i28 = this.B;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                TextClassifier textClassifier = (TextClassifier) this.C;
                if (textClassifier == null) {
                    return null;
                }
                m00.i iVar2 = (m00.i) this.D;
                this.B = 1;
                Object objInvoke = iVar2.invoke(textClassifier, this);
                return objInvoke == aVar15 ? aVar15 : objInvoke;
            case 14:
                l00.a aVar16 = l00.a.A;
                int i29 = this.B;
                if (i29 == 0) {
                    ri.t1.O(obj);
                    c40.t tVar2 = (c40.t) this.C;
                    e40.d dVar = (e40.d) this.D;
                    this.B = 1;
                    if (dVar.d(tVar2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 15:
                l00.a aVar17 = l00.a.A;
                int i30 = this.B;
                if (i30 == 0) {
                    ri.t1.O(obj);
                    d40.j jVar2 = (d40.j) this.C;
                    e40.e eVar2 = (e40.e) this.D;
                    this.B = 1;
                    if (eVar2.i(jVar2, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 16:
                l00.a aVar18 = l00.a.A;
                int i31 = this.B;
                if (i31 == 0) {
                    ri.t1.O(obj);
                    Object obj3 = this.C;
                    d40.j jVar3 = (d40.j) this.D;
                    this.B = 1;
                    if (jVar3.emit(obj3, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 17:
                l00.a aVar19 = l00.a.A;
                int i32 = this.B;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                u00.n nVar2 = (u00.n) this.C;
                ea.d0 d0Var = (ea.d0) this.D;
                this.B = 1;
                Object objInvoke2 = nVar2.invoke(d0Var, this);
                return objInvoke2 == aVar19 ? aVar19 : objInvoke2;
            case TYPE_SINT64_VALUE:
                l00.a aVar20 = l00.a.A;
                int i33 = this.B;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                u00.n nVar3 = (u00.n) this.C;
                Object obj4 = ((kotlin.jvm.internal.z) this.D).A;
                this.B = 1;
                Object objInvoke3 = nVar3.invoke(obj4, this);
                return objInvoke3 == aVar20 ? aVar20 : objInvoke3;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                l00.a aVar21 = l00.a.A;
                int i34 = this.B;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                m00.i iVar3 = (m00.i) this.C;
                ea.r rVar2 = (ea.r) this.D;
                this.B = 1;
                Object objInvoke4 = iVar3.invoke(rVar2, this);
                return objInvoke4 == aVar21 ? aVar21 : objInvoke4;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                l00.a aVar22 = l00.a.A;
                int i35 = this.B;
                if (i35 == 0) {
                    ri.t1.O(obj);
                    c40.t tVar3 = (c40.t) this.C;
                    eb.b bVar = (eb.b) this.D;
                    eb.a aVar23 = new eb.a(bVar, tVar3);
                    fb.a aVar24 = bVar.f5239a;
                    aVar24.getClass();
                    synchronized (aVar24.f5582c) {
                        try {
                            if (aVar24.f5583d.add(aVar23)) {
                                if (aVar24.f5583d.size() == 1) {
                                    aVar24.f5584e = aVar24.b();
                                    za.v.d().a(fb.e.f5590a, aVar24.getClass().getSimpleName() + ": initial state = " + aVar24.f5584e);
                                    aVar24.getClass();
                                    za.v.d().a(fb.d.f5589a, aVar24.getClass().getSimpleName().concat(": registering receiver"));
                                    aVar24.f5581b.registerReceiver(aVar24.f5585f, aVar24.a());
                                }
                                aVar23.a(aVar24.f5584e);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    a1.o1 o1Var = new a1.o1((eb.b) this.D, aVar23, i12);
                    this.B = 1;
                    if (w00.a.j(tVar3, o1Var, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                g00.b0 b0Var2 = g00.b0.a;
                er.d dVar2 = (er.d) this.D;
                d40.p1 p1Var = dVar2.g;
                l00.a aVar25 = l00.a.A;
                int i36 = this.B;
                try {
                    if (i36 == 0) {
                        ri.t1.O(obj);
                        this.B = 1;
                        objB = er.d.b(dVar2, this);
                        if (objB == aVar25) {
                        }
                        return aVar25;
                    }
                    if (i36 == 1) {
                        ri.t1.O(obj);
                        objB = obj;
                    } else {
                        if (i36 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) this.C;
                        ri.t1.O(obj);
                        objA = obj;
                    }
                    arrayListX = dVar2.b.X((dr.a) objA);
                    if (arrayListX.isEmpty()) {
                        return b0Var2;
                    }
                    List listU = kh.o.U(arrayListX);
                    p1Var.getClass();
                    p1Var.k((Object) null, listU);
                    dVar2.i = true;
                    er.d.a(dVar2, arrayListX, str2);
                    return b0Var2;
                    String str3 = (String) objB;
                    gr.a aVar26 = dVar2.a;
                    String strD = dVar2.d();
                    this.C = str3;
                    this.B = 2;
                    objA = aVar26.a(strD, str3, this);
                    if (objA != aVar25) {
                        str2 = str3;
                        arrayListX = dVar2.b.X((dr.a) objA);
                        if (arrayListX.isEmpty()) {
                            return b0Var2;
                        }
                        List listU2 = kh.o.U(arrayListX);
                        p1Var.getClass();
                        p1Var.k((Object) null, listU2);
                        dVar2.i = true;
                        er.d.a(dVar2, arrayListX, str2);
                        return b0Var2;
                    }
                    return aVar25;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused2) {
                    ArrayList arrayListE = dVar2.e();
                    if (arrayListE == null) {
                        return b0Var2;
                    }
                    List listU3 = kh.o.U(arrayListE);
                    p1Var.getClass();
                    p1Var.k((Object) null, listU3);
                    return b0Var2;
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                l00.a aVar27 = l00.a.A;
                int i37 = this.B;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                a40.z zVar2 = (a40.z) this.C;
                f1.a aVar28 = (f1.a) this.D;
                d40.d1 d1Var = aVar28.O.f5476a;
                b1.g gVar2 = new b1.g(aVar28, zVar2, i13);
                this.B = 1;
                d1Var.collect(gVar2, this);
                return aVar27;
            case 23:
                l00.a aVar29 = l00.a.A;
                int i38 = this.B;
                if (i38 == 0) {
                    ri.t1.O(obj);
                    x.b bVar2 = (x.b) ((b50.e) this.C).c;
                    Float f10 = new Float(0.0f);
                    x.i iVar4 = (x.i) this.D;
                    this.B = 1;
                    if (x.b.c(bVar2, f10, iVar4, null, this, 12) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 24:
                rc.c cVar3 = (rc.c) this.D;
                rc.c cVar4 = (rc.c) this.C;
                rc.g gVar3 = cVar4.f13151a;
                l00.a aVar30 = l00.a.A;
                int i39 = this.B;
                if (i39 == 0) {
                    ri.t1.O(obj);
                    cVar4.f13159i = gVar3.f13183n.a(cVar3);
                    od.b bVar3 = new od.b(gVar3.f13176e, gVar3.f13172a, gVar3.f13184o, gVar3.a(), "identity", gVar3.f13178g.M(cVar4));
                    cVar4.f13160j = gVar3.f13184o.K(bVar3);
                    this.B = 1;
                    if (rc.c.b(cVar3, bVar3, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return Boolean.TRUE;
            case 25:
                rc.c cVar5 = (rc.c) this.C;
                l00.a aVar31 = l00.a.A;
                int i40 = this.B;
                if (i40 == 0) {
                    ri.t1.O(obj);
                    a40.g0 g0Var = cVar5.m;
                    this.B = 1;
                    objP = g0Var.p(this);
                    if (objP == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    objP = obj;
                }
                if (((Boolean) objP).booleanValue()) {
                    a2.o oVar = cVar5.c().f11937a;
                    od.a aVarB = oVar.b();
                    String str4 = aVarB.f11927a;
                    oVar.f(new od.a((String) this.D, aVarB.f11928b), od.d.B);
                }
                return g00.b0.a;
            case RuntimeVersion.MINOR:
                l00.a aVar32 = l00.a.A;
                int i41 = this.B;
                if (i41 == 0) {
                    ri.t1.O(obj);
                    bt.a2 a2VarJ = l1.q.J(new c00.q((z0.g) this.C, 1));
                    a1.c cVar6 = new a1.c((l1.z0) this.D, i12);
                    this.B = 1;
                    if (a2VarJ.collect(cVar6, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 27:
                l00.a aVar33 = l00.a.A;
                int i42 = this.B;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                d40.d1 d1Var2 = ((f0.i) this.C).f5476a;
                a1.c cVar7 = new a1.c((z1.p) this.D, i13);
                this.B = 1;
                d1Var2.collect(cVar7, this);
                return aVar33;
            case 28:
                g00.b0 b0Var3 = g00.b0.a;
                l00.a aVar34 = l00.a.A;
                int i43 = this.B;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return b0Var3;
                }
                ri.t1.O(obj);
                g1.h hVar2 = (g1.h) this.C;
                x.b1 b1Var = (x.b1) this.D;
                this.B = 1;
                b8 b8Var = hVar2.f5807a;
                if ((b8Var.e() == 0 && g1.h.j(((Number) hVar2.f5812f.f16236e.getValue()).floatValue()) == g1.h.j(hVar2.f5810d)) || (b8Var.e() == 1 && g1.h.j(((Number) hVar2.f5812f.f16236e.getValue()).floatValue()) == g1.h.j(hVar2.f5811e))) {
                    objK = b0Var3;
                } else {
                    float fH = b8Var.e() == 0 ? hVar2.h(hVar2.f5810d) : hVar2.h(hVar2.f5811e);
                    z.e1 e1Var2 = hVar2.f5813g;
                    z.b1 b1Var2 = z.b1.C;
                    g1.f fVar = new g1.f(hVar2, fH, b1Var, null, 0);
                    e1Var2.getClass();
                    objK = a40.c0.k(new o3(b1Var2, e1Var2, fVar, (k00.c) null), this);
                    if (objK != aVar34) {
                        objK = b0Var3;
                    }
                }
                return objK == aVar34 ? aVar34 : b0Var3;
            default:
                l00.a aVar35 = l00.a.A;
                ri.t1.O(obj);
                if (((b8) this.C).e() == this.B) {
                    g2.t.a((g2.t) this.D);
                }
                return g00.b0.a;
        }
    }
}
