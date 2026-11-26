package com.amplitude.android.internal.compose;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import uc.a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/amplitude/android/internal/compose/AmpFrustrationIgnoreElement;", "Lb3/e1;", "Luc/a;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AmpFrustrationIgnoreElement extends e1 {
    @Override
    public final q d() {
        return new a();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof AmpFrustrationIgnoreElement);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "ampIgnoreFrustrationAnalytics";
        y2 y2Var = d2Var.f2646c;
        Boolean bool = Boolean.FALSE;
        y2Var.c(bool, "ignoreRageClick");
        y2Var.c(bool, "ignoreDeadClick");
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(false) * 31);
    }

    @Override
    public final void i(q qVar) {
        m.e((a) qVar, "node");
    }

    public final String toString() {
        return "AmpFrustrationIgnoreElement(ignoreRageClick=false, ignoreDeadClick=false)";
    }
}
