package ek;

import com.google.gson.reflect.TypeToken;
import com.mchutov.core.compose.widgets.lce.ResourceTextAdapter;

public final class y implements bk.b0 {
    public final TypeToken A;
    public final boolean B;
    public final bk.p C;

    public y(ResourceTextAdapter resourceTextAdapter, TypeToken typeToken, boolean z10) {
        this.C = resourceTextAdapter;
        this.A = typeToken;
        this.B = z10;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        TypeToken typeToken2 = this.A;
        if (typeToken2 == null) {
            typeToken.getRawType();
            throw null;
        }
        if (typeToken2.equals(typeToken) || (this.B && typeToken2.getType() == typeToken.getRawType())) {
            return new z(this.C, mVar, typeToken, this, true);
        }
        return null;
    }
}
