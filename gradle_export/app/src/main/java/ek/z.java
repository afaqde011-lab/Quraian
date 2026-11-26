package ek;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

public final class z extends x {

    public final bk.p f5462a;

    public final bk.m f5463b;

    public final TypeToken f5464c;

    public final bk.b0 f5465d;

    public final sg.f f5466e = new sg.f();

    public final boolean f5467f;

    public volatile bk.a0 f5468g;

    public z(bk.p pVar, bk.m mVar, TypeToken typeToken, bk.b0 b0Var, boolean z10) {
        this.f5462a = pVar;
        this.f5463b = mVar;
        this.f5464c = typeToken;
        this.f5465d = b0Var;
        this.f5467f = z10;
    }

    @Override
    public final Object b(ik.a aVar) {
        boolean z10;
        bk.q qVar;
        bk.p pVar = this.f5462a;
        if (pVar == null) {
            bk.a0 a0VarG = this.f5468g;
            if (a0VarG == null) {
                a0VarG = this.f5463b.g(this.f5465d, this.f5464c);
                this.f5468g = a0VarG;
            }
            return a0VarG.b(aVar);
        }
        try {
            try {
                aVar.t0();
                z10 = false;
                try {
                    qVar = (bk.q) d1.f5426z.b(aVar);
                } catch (EOFException e3) {
                    e = e3;
                    if (!z10) {
                        throw new JsonSyntaxException(e);
                    }
                    qVar = bk.r.A;
                }
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            if (this.f5467f) {
                qVar.getClass();
                if (qVar instanceof bk.r) {
                    return null;
                }
            }
            return pVar.deserialize(qVar, this.f5464c.getType(), this.f5466e);
        } catch (MalformedJsonException e11) {
            throw new JsonSyntaxException(e11);
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) {
        bk.a0 a0VarG = this.f5468g;
        if (a0VarG == null) {
            a0VarG = this.f5463b.g(this.f5465d, this.f5464c);
            this.f5468g = a0VarG;
        }
        a0VarG.c(bVar, obj);
    }

    @Override
    public final bk.a0 d() {
        bk.a0 a0Var = this.f5468g;
        if (a0Var != null) {
            return a0Var;
        }
        bk.a0 a0VarG = this.f5463b.g(this.f5465d, this.f5464c);
        this.f5468g = a0VarG;
        return a0VarG;
    }
}
