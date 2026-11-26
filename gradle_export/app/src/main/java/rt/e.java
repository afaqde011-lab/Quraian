package rt;

import com.google.android.gms.internal.measurement.g4;
import d40.j;
import g00.b0;
import h00.y;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import ri.t1;
import u00.o;

public final class e extends m00.i implements o {
    public String A;
    public g B;
    public int C;
    public j D;
    public i E;
    public final f F;

    public e(f fVar, k00.c cVar) {
        super(3, cVar);
        this.F = fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e(this.F, (k00.c) obj3);
        eVar.D = (j) obj;
        eVar.E = (i) obj2;
        return eVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        g gVar;
        List list;
        String strB;
        Iterator it;
        Object next;
        ot.o oVar;
        g gVar2;
        String str;
        String str2;
        b bVar;
        g gVar3;
        String str3;
        g gVar4;
        b bVar2;
        Map map;
        g gVarA;
        j jVar = this.D;
        i iVar = this.E;
        l00.a aVar = l00.a.A;
        int i = this.C;
        b0 b0Var = b0.a;
        f fVar = this.F;
        switch (i) {
            case 0:
                t1.O(obj);
                if (iVar.a != ot.d.B) {
                    b bVar3 = fVar.c;
                    this.D = jVar;
                    this.E = iVar;
                    this.C = 1;
                    if (bVar3.a("", this, false) != aVar) {
                        gVar = new g(iVar.a, null, null, 30);
                        this.D = null;
                        this.E = null;
                        this.C = 2;
                        if (jVar.emit(gVar, this) != aVar) {
                            return b0Var;
                        }
                    }
                } else {
                    this.D = jVar;
                    this.E = iVar;
                    this.C = 3;
                    obj = f.a(fVar, this);
                    if (obj != aVar) {
                        list = (List) obj;
                        strB = fVar.d.b(iVar.c, list);
                        if (!list.isEmpty() && !m.a(strB, iVar.c)) {
                            fVar.a.e(ot.e.TRANSCRIPTION, strB);
                        }
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            oVar = (ot.o) next;
                            ot.d dVar = iVar.a;
                            if (oVar != null) {
                                str = oVar.c;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            if (oVar != null) {
                                str2 = oVar.d;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                            gVar2 = new g(dVar, str, str2, 6);
                            if (iVar.b || !iVar.e || iVar.d == null) {
                                bVar = fVar.c;
                                this.D = jVar;
                                this.E = null;
                                this.A = null;
                                this.B = gVar2;
                                this.C = 4;
                                if (bVar.a("", this, false) != aVar) {
                                    gVar3 = gVar2;
                                    this.D = null;
                                    this.E = null;
                                    this.A = null;
                                    this.B = null;
                                    this.C = 5;
                                    if (jVar.emit(gVar3, this) != aVar) {
                                        return b0Var;
                                    }
                                }
                            } else {
                                g gVarA2 = g.a(gVar2, null, 27);
                                this.D = jVar;
                                this.E = iVar;
                                this.A = strB;
                                this.B = gVar2;
                                this.C = 6;
                                if (jVar.emit(gVarA2, this) != aVar) {
                                    str3 = strB;
                                    gVar4 = gVar2;
                                    bVar2 = fVar.c;
                                    this.D = jVar;
                                    this.E = iVar;
                                    this.A = null;
                                    this.B = gVar4;
                                    this.C = 7;
                                    if (bVar2.a(str3, this, true) != aVar) {
                                        b bVar4 = fVar.c;
                                        Integer num = iVar.d;
                                        num.intValue();
                                        map = (Map) bVar4.c.get(num);
                                        if (map == null) {
                                            map = y.A;
                                        }
                                        gVarA = g.a(gVar4, g4.e0(map), 29);
                                        this.D = null;
                                        this.E = null;
                                        this.A = null;
                                        this.B = null;
                                        this.C = 8;
                                        if (jVar.emit(gVarA, this) == aVar) {
                                            return b0Var;
                                        }
                                    }
                                }
                            }
                        } while (!m.a(((ot.o) next).a, strB));
                        oVar = (ot.o) next;
                        ot.d dVar2 = iVar.a;
                        if (oVar != null) {
                            str = oVar.c;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (oVar != null) {
                            str2 = oVar.d;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        gVar2 = new g(dVar2, str, str2, 6);
                        if (iVar.b) {
                            bVar = fVar.c;
                            this.D = jVar;
                            this.E = null;
                            this.A = null;
                            this.B = gVar2;
                            this.C = 4;
                            if (bVar.a("", this, false) != aVar) {
                                gVar3 = gVar2;
                                this.D = null;
                                this.E = null;
                                this.A = null;
                                this.B = null;
                                this.C = 5;
                                if (jVar.emit(gVar3, this) != aVar) {
                                    return b0Var;
                                }
                            }
                        } else {
                            bVar = fVar.c;
                            this.D = jVar;
                            this.E = null;
                            this.A = null;
                            this.B = gVar2;
                            this.C = 4;
                            if (bVar.a("", this, false) != aVar) {
                                gVar3 = gVar2;
                                this.D = null;
                                this.E = null;
                                this.A = null;
                                this.B = null;
                                this.C = 5;
                                if (jVar.emit(gVar3, this) != aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                t1.O(obj);
                gVar = new g(iVar.a, null, null, 30);
                this.D = null;
                this.E = null;
                this.C = 2;
                if (jVar.emit(gVar, this) != aVar) {
                    return aVar;
                }
                return b0Var;
            case 2:
                t1.O(obj);
                return b0Var;
            case 3:
                t1.O(obj);
                list = (List) obj;
                strB = fVar.d.b(iVar.c, list);
                if (!list.isEmpty()) {
                    fVar.a.e(ot.e.TRANSCRIPTION, strB);
                }
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    oVar = (ot.o) next;
                    ot.d dVar3 = iVar.a;
                    if (oVar != null) {
                        str = oVar.c;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (oVar != null) {
                        str2 = oVar.d;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    gVar2 = new g(dVar3, str, str2, 6);
                    if (iVar.b) {
                        bVar = fVar.c;
                        this.D = jVar;
                        this.E = null;
                        this.A = null;
                        this.B = gVar2;
                        this.C = 4;
                        if (bVar.a("", this, false) != aVar) {
                            gVar3 = gVar2;
                            this.D = null;
                            this.E = null;
                            this.A = null;
                            this.B = null;
                            this.C = 5;
                            if (jVar.emit(gVar3, this) != aVar) {
                                return b0Var;
                            }
                        }
                    } else {
                        bVar = fVar.c;
                        this.D = jVar;
                        this.E = null;
                        this.A = null;
                        this.B = gVar2;
                        this.C = 4;
                        if (bVar.a("", this, false) != aVar) {
                            gVar3 = gVar2;
                            this.D = null;
                            this.E = null;
                            this.A = null;
                            this.B = null;
                            this.C = 5;
                            if (jVar.emit(gVar3, this) != aVar) {
                                return b0Var;
                            }
                        }
                    }
                    return aVar;
                } while (!m.a(((ot.o) next).a, strB));
                oVar = (ot.o) next;
                ot.d dVar4 = iVar.a;
                if (oVar != null) {
                    str = oVar.c;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (oVar != null) {
                    str2 = oVar.d;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                gVar2 = new g(dVar4, str, str2, 6);
                if (iVar.b) {
                    bVar = fVar.c;
                    this.D = jVar;
                    this.E = null;
                    this.A = null;
                    this.B = gVar2;
                    this.C = 4;
                    if (bVar.a("", this, false) != aVar) {
                        gVar3 = gVar2;
                        this.D = null;
                        this.E = null;
                        this.A = null;
                        this.B = null;
                        this.C = 5;
                        if (jVar.emit(gVar3, this) != aVar) {
                            return b0Var;
                        }
                    }
                } else {
                    bVar = fVar.c;
                    this.D = jVar;
                    this.E = null;
                    this.A = null;
                    this.B = gVar2;
                    this.C = 4;
                    if (bVar.a("", this, false) != aVar) {
                        gVar3 = gVar2;
                        this.D = null;
                        this.E = null;
                        this.A = null;
                        this.B = null;
                        this.C = 5;
                        if (jVar.emit(gVar3, this) != aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            case 4:
                gVar3 = this.B;
                t1.O(obj);
                this.D = null;
                this.E = null;
                this.A = null;
                this.B = null;
                this.C = 5;
                if (jVar.emit(gVar3, this) != aVar) {
                    return aVar;
                }
                return b0Var;
            case 5:
                t1.O(obj);
                return b0Var;
            case 6:
                gVar4 = this.B;
                str3 = this.A;
                t1.O(obj);
                bVar2 = fVar.c;
                this.D = jVar;
                this.E = iVar;
                this.A = null;
                this.B = gVar4;
                this.C = 7;
                if (bVar2.a(str3, this, true) != aVar) {
                    b bVar5 = fVar.c;
                    Integer num2 = iVar.d;
                    num2.intValue();
                    map = (Map) bVar5.c.get(num2);
                    if (map == null) {
                        map = y.A;
                    }
                    gVarA = g.a(gVar4, g4.e0(map), 29);
                    this.D = null;
                    this.E = null;
                    this.A = null;
                    this.B = null;
                    this.C = 8;
                    if (jVar.emit(gVarA, this) == aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 7:
                gVar4 = this.B;
                t1.O(obj);
                b bVar6 = fVar.c;
                Integer num3 = iVar.d;
                num3.intValue();
                map = (Map) bVar6.c.get(num3);
                if (map == null) {
                    map = y.A;
                }
                gVarA = g.a(gVar4, g4.e0(map), 29);
                this.D = null;
                this.E = null;
                this.A = null;
                this.B = null;
                this.C = 8;
                if (jVar.emit(gVarA, this) == aVar) {
                    return aVar;
                }
                return b0Var;
            case 8:
                t1.O(obj);
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
