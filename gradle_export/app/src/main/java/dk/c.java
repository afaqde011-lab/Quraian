package dk;

import bk.a0;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;

public final class c extends a0 {

    public volatile a0 f4915a;

    public final boolean f4916b;

    public final boolean f4917c;

    public final bk.m f4918d;

    public final TypeToken f4919e;

    public final d f4920f;

    public c(d dVar, boolean z10, boolean z11, bk.m mVar, TypeToken typeToken) {
        this.f4920f = dVar;
        this.f4916b = z10;
        this.f4917c = z11;
        this.f4918d = mVar;
        this.f4919e = typeToken;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        if (this.f4916b) {
            aVar.z0();
            return null;
        }
        a0 a0VarG = this.f4915a;
        if (a0VarG == null) {
            a0VarG = this.f4918d.g(this.f4920f, this.f4919e);
            this.f4915a = a0VarG;
        }
        return a0VarG.b(aVar);
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        if (this.f4917c) {
            bVar.G();
            return;
        }
        a0 a0VarG = this.f4915a;
        if (a0VarG == null) {
            a0VarG = this.f4918d.g(this.f4920f, this.f4919e);
            this.f4915a = a0VarG;
        }
        a0VarG.c(bVar, obj);
    }
}
