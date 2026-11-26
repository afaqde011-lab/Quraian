package ek;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Map;

public final class n extends bk.a0 {

    public final int f5436a = 1;

    public final Object f5437b;

    public final bk.a0 f5438c;

    public final Object f5439d;

    public n(bk.m mVar, bk.a0 a0Var, Type type) {
        this.f5437b = mVar;
        this.f5438c = a0Var;
        this.f5439d = type;
    }

    public n(d dVar, n nVar, n nVar2, dk.o oVar) {
        this.f5437b = nVar;
        this.f5438c = nVar2;
        this.f5439d = oVar;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        switch (this.f5436a) {
            case 0:
                int iT0 = aVar.t0();
                if (iT0 == 9) {
                    aVar.p0();
                    return null;
                }
                Map map = (Map) ((dk.o) this.f5439d).j();
                if (iT0 == 1) {
                    aVar.a();
                    while (aVar.G()) {
                        aVar.a();
                        Object objB = ((n) this.f5437b).f5438c.b(aVar);
                        if (map.put(objB, ((n) this.f5438c).f5438c.b(aVar)) != null) {
                            throw new JsonSyntaxException(g4.c.h(objB, "duplicate key: "));
                        }
                        aVar.v();
                    }
                    aVar.v();
                } else {
                    aVar.i();
                    while (aVar.G()) {
                        sg.f.A.getClass();
                        int iR = aVar.G;
                        if (iR == 0) {
                            iR = aVar.r();
                        }
                        if (iR == 13) {
                            aVar.G = 9;
                        } else if (iR == 12) {
                            aVar.G = 8;
                        } else {
                            if (iR != 14) {
                                throw aVar.B0("a name");
                            }
                            aVar.G = 10;
                        }
                        Object objB2 = ((n) this.f5437b).f5438c.b(aVar);
                        if (map.put(objB2, ((n) this.f5438c).f5438c.b(aVar)) != null) {
                            throw new JsonSyntaxException(g4.c.h(objB2, "duplicate key: "));
                        }
                    }
                    aVar.x();
                }
                return map;
            default:
                return this.f5438c.b(aVar);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bk.a0 a0VarD;
        switch (this.f5436a) {
            case 0:
                Map map = (Map) obj;
                n nVar = (n) this.f5438c;
                if (map == null) {
                    bVar.G();
                } else {
                    bVar.l();
                    for (Map.Entry entry : map.entrySet()) {
                        bVar.A(String.valueOf(entry.getKey()));
                        nVar.c(bVar, entry.getValue());
                    }
                    bVar.x();
                }
                break;
            default:
                Type type = (Type) this.f5439d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                bk.a0 a0Var = this.f5438c;
                if (type2 != type) {
                    bk.a0 a0VarF = ((bk.m) this.f5437b).f(TypeToken.get(type2));
                    if (a0VarF instanceof s) {
                        bk.a0 a0Var2 = a0Var;
                        while ((a0Var2 instanceof x) && (a0VarD = ((x) a0Var2).d()) != a0Var2) {
                            a0Var2 = a0VarD;
                        }
                        if (a0Var2 instanceof s) {
                            a0Var = a0VarF;
                        }
                    } else {
                        a0Var = a0VarF;
                    }
                }
                a0Var.c(bVar, obj);
                break;
        }
    }
}
