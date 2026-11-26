package com.revenuecat.purchases.utils.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.e;
import o40.c;
import o40.d;
import q40.j;
import q40.l;
import q40.x;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;", "", "T", "Ll40/a;", "delegate", "", "resilient", "<init>", "(Ll40/a;Z)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/lang/Object;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/lang/Object;)V", "Ll40/a;", "Z", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EmptyObjectToNullSerializer<T> implements a {
    private final a delegate;
    private final e descriptor;
    private final boolean resilient;

    public EmptyObjectToNullSerializer(a delegate, boolean z) {
        m.e(delegate, "delegate");
        this.delegate = delegate;
        this.resilient = z;
        this.descriptor = delegate.getDescriptor();
    }

    public EmptyObjectToNullSerializer(a aVar, boolean z, int i, f fVar) {
        this(aVar, (i & 2) != 0 ? true : z);
    }

    @Override
    public T deserialize(c decoder) {
        m.e(decoder, "decoder");
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            return (T) this.delegate.deserialize(decoder);
        }
        l lVarM = jVar.m();
        if ((lVarM instanceof x) && !((x) lVarM).A.isEmpty()) {
            if (!this.resilient) {
                return (T) jVar.y().a(this.delegate, lVarM);
            }
            try {
                return (T) jVar.y().a(this.delegate, lVarM);
            } catch (SerializationException unused) {
            }
        }
        return null;
    }

    @Override
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(d encoder, T value) {
        m.e(encoder, "encoder");
        if (value != null) {
            this.delegate.serialize(encoder, value);
        }
    }
}
