package ad;

import android.content.Context;
import android.content.SharedPreferences;
import g00.b0;
import h1.l;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ri.t1;
import sd.p1;

public final class b {

    public final int f435a;

    public final rc.c f436b;

    public final f f437c;

    public final l f438d;

    public final f f439e;

    public final ArrayList f440f;

    public b(rc.c cVar, rc.g gVar, int i10) {
        this.f435a = i10;
        switch (i10) {
            case 1:
                m.e(gVar, "configuration");
                this.f436b = cVar;
                ArrayList arrayList = new ArrayList();
                this.f440f = arrayList;
                StringBuilder sb2 = new StringBuilder("amplitude-android-");
                String str = gVar.f13176e;
                sb2.append(str);
                this.f437c = a(gVar, "amplitude-disk-queue", sb2.toString());
                this.f439e = a(gVar, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str);
                File dir = gVar.f13173b.getDir("amplitude-kotlin-" + str, 0);
                String str2 = gVar.f13176e;
                String str3 = gVar.f13172a;
                sg.f fVar = gVar.f13184o;
                cd.b bVarM = gVar.f13178g.M(cVar);
                String strO = a1.b.o("amplitude-identity-", str);
                m.b(dir);
                od.b bVar = new od.b(str2, str3, fVar, dir, strO, bVarM);
                arrayList.add(dir);
                this.f438d = new l(bVar);
                break;
            default:
                m.e(gVar, "configuration");
                this.f436b = cVar;
                ArrayList arrayList2 = new ArrayList();
                this.f440f = arrayList2;
                StringBuilder sb3 = new StringBuilder("amplitude-android-");
                String str4 = gVar.f13172a;
                sb3.append(str4);
                this.f437c = a(gVar, "amplitude-disk-queue", sb3.toString());
                this.f439e = a(gVar, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str4);
                Context context = gVar.f13173b;
                StringBuilder sb4 = new StringBuilder("amplitude-kotlin-");
                String str5 = gVar.f13176e;
                sb4.append(str5);
                File dir2 = context.getDir(sb4.toString(), 0);
                String str6 = gVar.f13176e;
                String str7 = gVar.f13172a;
                sg.f fVar2 = gVar.f13184o;
                cd.b bVarM2 = gVar.f13178g.M(cVar);
                String strO2 = a1.b.o("amplitude-identity-", str5);
                m.b(dir2);
                od.b bVar2 = new od.b(str6, str7, fVar2, dir2, strO2, bVarM2);
                arrayList2.add(dir2);
                this.f438d = new l(bVar2);
                break;
        }
    }

    public final f a(rc.g gVar, String str, String str2) {
        switch (this.f435a) {
            case 0:
                File dir = gVar.f13173b.getDir(str, 0);
                m.b(dir);
                this.f440f.add(dir);
                SharedPreferences sharedPreferences = gVar.f13173b.getSharedPreferences(str2, 0);
                String str3 = gVar.f13172a;
                qj.c cVar = gVar.f13178g;
                rc.c cVar2 = this.f436b;
                cd.b bVarM = cVar.M(cVar2);
                m.b(sharedPreferences);
                return new f(str3, bVarM, sharedPreferences, dir, cVar2.f13162n);
            default:
                File dir2 = gVar.f13173b.getDir(str, 0);
                m.b(dir2);
                this.f440f.add(dir2);
                SharedPreferences sharedPreferences2 = gVar.f13173b.getSharedPreferences(str2, 0);
                String str4 = gVar.f13176e;
                qj.c cVar3 = gVar.f13178g;
                rc.c cVar4 = this.f436b;
                cd.b bVarM2 = cVar3.M(cVar4);
                m.b(sharedPreferences2);
                return new f(str4, bVarM2, sharedPreferences2, dir2, cVar4.f13162n);
        }
    }

    public final Object b(m00.c cVar) {
        a aVar;
        String[] list;
        c cVar2;
        f fVar;
        p1 p1Var;
        switch (this.f435a) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i10 = aVar.D;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.D = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(this, cVar);
                    }
                } else {
                    aVar = new a(this, cVar);
                }
                Object obj = aVar.B;
                l00.a aVar2 = l00.a.A;
                int i11 = aVar.D;
                if (i11 != 0) {
                    if (i11 == 1) {
                        this = aVar.A;
                        t1.O(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this = aVar.A;
                        t1.O(obj);
                    }
                    for (File file : this.f440f) {
                        list = file.list();
                        if (list == null && list.length == 0) {
                            file.delete();
                        }
                    }
                    return b0.a;
                }
                t1.O(obj);
                rc.c cVar3 = this.f436b;
                new p1(this.f438d, cVar3.e(), cVar3.f()).p();
                fd.d dVarG = cVar3.g();
                f fVar2 = dVarG instanceof f ? (f) dVarG : null;
                if (fVar2 != null) {
                    p1 p1Var2 = new p1(this.f437c, fVar2, cVar3.f());
                    aVar.A = this;
                    aVar.D = 1;
                    if (p1Var2.o(aVar) == aVar2) {
                        return aVar2;
                    }
                }
                fd.d dVarD = this.f436b.d();
                f fVar3 = dVarD instanceof f ? (f) dVarD : null;
                if (fVar3 != null) {
                    p1 p1Var3 = new p1(this.f439e, fVar3, this.f436b.f());
                    aVar.A = this;
                    aVar.D = 2;
                    if (p1Var3.o(aVar) == aVar2) {
                        return aVar2;
                    }
                }
                while (r9.hasNext()) {
                    list = file.list();
                    if (list == null) {
                    }
                }
                return b0.a;
            default:
                if (cVar instanceof c) {
                    cVar2 = (c) cVar;
                    int i12 = cVar2.D;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        cVar2.D = i12 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new c(this, cVar);
                    }
                } else {
                    cVar2 = new c(this, cVar);
                }
                Object obj2 = cVar2.B;
                l00.a aVar3 = l00.a.A;
                int i13 = cVar2.D;
                if (i13 == 0) {
                    t1.O(obj2);
                    rc.c cVar4 = this.f436b;
                    new p1(this.f438d, cVar4.e(), cVar4.f()).p();
                    if (m.a(cVar4.f13151a.f13176e, "$default_instance")) {
                        fd.d dVarG2 = cVar4.g();
                        f fVar4 = dVarG2 instanceof f ? (f) dVarG2 : null;
                        if (fVar4 != null) {
                            p1 p1Var4 = new p1(this.f437c, fVar4, cVar4.f());
                            cVar2.A = this;
                            cVar2.D = 1;
                            if (p1Var4.o(cVar2) == aVar3) {
                                return aVar3;
                            }
                        }
                        fd.d dVarD2 = this.f436b.d();
                        if (dVarD2 instanceof f) {
                        }
                        if (fVar != null) {
                            p1Var = new p1(this.f439e, fVar, this.f436b.f());
                            cVar2.A = this;
                            cVar2.D = 2;
                            if (p1Var.o(cVar2) == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                } else if (i13 == 1) {
                    this = cVar2.A;
                    t1.O(obj2);
                    fd.d dVarD3 = this.f436b.d();
                    fVar = dVarD3 instanceof f ? (f) dVarD3 : null;
                    if (fVar != null) {
                        p1Var = new p1(this.f439e, fVar, this.f436b.f());
                        cVar2.A = this;
                        cVar2.D = 2;
                        if (p1Var.o(cVar2) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = cVar2.A;
                    t1.O(obj2);
                }
                for (File file2 : this.f440f) {
                    String[] list2 = file2.list();
                    if (list2 != null && list2.length == 0) {
                        file2.delete();
                    }
                }
                return b0.a;
        }
    }
}
