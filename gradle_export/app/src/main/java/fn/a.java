package fn;

import a40.z;
import android.content.Context;
import bx.c;
import g00.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m00.i;
import u00.n;

public final class a extends i implements n {
    public List A;
    public Map B;
    public Integer C;
    public b D;
    public Context E;
    public Collection F;
    public Iterator G;
    public c H;
    public String I;
    public String J;
    public Collection K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final b P;
    public final Context Q;

    public a(b bVar, Context context, k00.c cVar) {
        super(2, cVar);
        this.P = bVar;
        this.Q = context;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new a(this.P, this.Q, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: fn.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
