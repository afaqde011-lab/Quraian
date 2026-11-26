package v10;

import g00.k;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import m20.g;
import p30.f;
import s10.n0;

public final class b extends f {
    public final n0 b;

    public b(Metadata metadata) throws InvalidProtocolBufferException {
        k kVarF = g.f(f50.k.B(metadata), metadata.d2());
        n0 n0VarU0 = f.u0((i20.k) kVarF.B, (m20.f) kVarF.A, new a(metadata.mv()).compareTo(new a(1, 4, 0)) < 0, 4);
        new a(metadata.mv());
        metadata.xi();
        this.b = n0VarU0;
    }
}
