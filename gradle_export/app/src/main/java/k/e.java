package k;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o9.p0;
import o9.q0;
import o9.s0;
import o9.t0;

public final class e extends Handler {

    public final int f8379a = 0;

    public WeakReference f8380b;

    public e() {
    }

    public e(o9.n0 n0Var) {
        this.f8380b = new WeakReference(n0Var);
    }

    @Override
    public final void handleMessage(Message message) {
        o9.o oVar;
        k7.t tVar;
        o9.r rVar;
        o9.f fVar;
        switch (this.f8379a) {
            case 0:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f8380b.get(), message.what);
                    break;
                } else if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                o9.n0 n0Var = (o9.n0) this.f8380b.get();
                if (n0Var != null) {
                    SparseArray sparseArray = n0Var.f11835h;
                    s0 s0Var = n0Var.f11836i;
                    ArrayList<o9.o0> arrayList = s0Var.K;
                    int i11 = message.what;
                    int i12 = message.arg1;
                    int i13 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    o9.o0 o0Var = null;
                    o9.o0 o0Var2 = null;
                    switch (i11) {
                        case 0:
                            if (i12 == n0Var.f11834g) {
                                n0Var.f11834g = 0;
                                if (s0Var.N == n0Var) {
                                    s0Var.k();
                                }
                            }
                            if (((p0) sparseArray.get(i12)) != null) {
                                sparseArray.remove(i12);
                                p0.a(null, null);
                            }
                            break;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (n0Var.f11833f == 0 && i12 == n0Var.f11834g && i13 >= 1) {
                                    n0Var.f11834g = 0;
                                    n0Var.f11833f = i13;
                                    b20.z zVarA = b20.z.a(bundle);
                                    if (s0Var.N == n0Var) {
                                        s0Var.f(zVarA);
                                    }
                                    if (s0Var.N == n0Var) {
                                        s0Var.O = true;
                                        int size = arrayList.size();
                                        for (int i14 = 0; i14 < size; i14++) {
                                            ((o9.o0) arrayList.get(i14)).b(s0Var.N);
                                        }
                                        o9.n nVar = s0Var.E;
                                        if (nVar != null) {
                                            o9.n0 n0Var2 = s0Var.N;
                                            int i15 = n0Var2.f11831d;
                                            n0Var2.f11831d = i15 + 1;
                                            n0Var2.b(10, i15, 0, nVar.f11826a, null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                p0 p0Var = (p0) sparseArray.get(i12);
                                if (p0Var != null) {
                                    sparseArray.remove(i12);
                                    p0Var.b(bundle2);
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                String string = bundlePeekData != null ? bundlePeekData.getString("error") : null;
                                Bundle bundle3 = (Bundle) obj;
                                if (((p0) sparseArray.get(i12)) != null) {
                                    sparseArray.remove(i12);
                                    p0.a(string, bundle3);
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (n0Var.f11833f != 0) {
                                    b20.z zVarA2 = b20.z.a(bundle4);
                                    if (s0Var.N == n0Var) {
                                        s0Var.f(zVarA2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                p0 p0Var2 = (p0) sparseArray.get(i12);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i12);
                                    p0Var2.b(bundle5);
                                } else {
                                    p0Var2.getClass();
                                    p0.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (n0Var.f11833f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    o9.m mVar = bundle7 != null ? new o9.m(bundle7) : null;
                                    ArrayList<Bundle> parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Bundle bundle8 : parcelableArrayList) {
                                        if (bundle8 == null) {
                                            oVar = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            oVar = new o9.o(bundle9 != null ? new o9.m(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(oVar);
                                    }
                                    if (s0Var.N == n0Var) {
                                        for (o9.o0 o0Var3 : arrayList) {
                                            if (o0Var3.a() == i13) {
                                                o0Var2 = o0Var3;
                                                if (o0Var2 instanceof q0) {
                                                    ((q0) o0Var2).l(mVar, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (o0Var2 instanceof q0) {
                                            ((q0) o0Var2).l(mVar, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (s0Var.N == n0Var) {
                                for (o9.o0 o0Var4 : arrayList) {
                                    if (o0Var4.a() == i13) {
                                        o0Var = o0Var4;
                                        tVar = s0Var.P;
                                        if (tVar != null && (o0Var instanceof o9.r)) {
                                            rVar = (o9.r) o0Var;
                                            fVar = ((t0) tVar.B).f11868b;
                                            if (fVar.f11782e == rVar) {
                                                fVar.l(fVar.c(), 2, true);
                                            }
                                        }
                                        if (o0Var != null) {
                                            arrayList.remove(o0Var);
                                            o0Var.c();
                                            s0Var.l();
                                        }
                                        break;
                                    }
                                }
                                tVar = s0Var.P;
                                if (tVar != null) {
                                    rVar = (o9.r) o0Var;
                                    fVar = ((t0) tVar.B).f11868b;
                                    if (fVar.f11782e == rVar) {
                                        fVar.l(fVar.c(), 2, true);
                                    }
                                }
                                if (o0Var != null) {
                                    arrayList.remove(o0Var);
                                    o0Var.c();
                                    s0Var.l();
                                }
                            }
                            break;
                    }
                    int i16 = s0.Q;
                }
                break;
        }
    }
}
