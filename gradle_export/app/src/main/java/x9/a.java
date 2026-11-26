package x9;

import a40.c0;
import a40.m0;
import android.net.Uri;
import android.view.InputEvent;
import b40.c;
import kh.v;
import kotlin.jvm.internal.m;
import l6.d;
import pz.k;
import ri.t1;
import y9.b;
import y9.e;
import y9.f;

public final class a {

    public final b f16503a;

    public a(b bVar) {
        this.f16503a = bVar;
    }

    public v a(y9.a aVar) {
        m.e(aVar, "deletionRequest");
        throw null;
    }

    public v b() {
        return t1.j(c0.g(c0.c(m0.a), (c) null, new d(this, null, 21), 3));
    }

    public v c(Uri uri, InputEvent inputEvent) {
        m.e(uri, "attributionSource");
        return t1.j(c0.g(c0.c(m0.a), (c) null, new k(this, uri, inputEvent, (k00.c) null, 22), 3));
    }

    public v d(y9.d dVar) {
        m.e(dVar, "request");
        throw null;
    }

    public v e(Uri uri) {
        m.e(uri, "trigger");
        return t1.j(c0.g(c0.c(m0.a), (c) null, new rm.c(this, uri, (k00.c) null, 24), 3));
    }

    public v f(e eVar) {
        m.e(eVar, "request");
        throw null;
    }

    public v g(f fVar) {
        m.e(fVar, "request");
        throw null;
    }
}
