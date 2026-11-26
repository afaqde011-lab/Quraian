package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import com.google.android.gms.internal.measurement.z3;
import h00.g0;
import h00.q;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import r30.h;
import r30.j;
import r30.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"", "stringRepresentation", "", "parseRGBAColor", "(Ljava/lang/String;)I", "alpha", "red", "green", "blue", "colorInt", "(IIII)I", "Lr30/j;", "rgbaColorRegex", "Lr30/j;", "HEX_RADIX", "I", "DEFAULT_ALPHA_HEX", "Ljava/lang/String;", "ALPHA_SHIFT_BITS", "RED_SHIFT_BITS", "GREEN_SHIFT_BITS", "ALPHA_MATCH_GROUP_INDEX", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ColorUtilsKt {
    private static final int ALPHA_MATCH_GROUP_INDEX = 4;
    private static final int ALPHA_SHIFT_BITS = 24;
    private static final String DEFAULT_ALPHA_HEX = "FF";
    private static final int GREEN_SHIFT_BITS = 8;
    private static final int HEX_RADIX = 16;
    private static final int RED_SHIFT_BITS = 16;
    private static final j rgbaColorRegex = new j("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i, int i2, int i3, int i4) {
        return (i << ALPHA_SHIFT_BITS) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static final int parseRGBAColor(String stringRepresentation) {
        m.e(stringRepresentation, "stringRepresentation");
        j jVar = rgbaColorRegex;
        jVar.getClass();
        Matcher matcher = jVar.A.matcher(stringRepresentation);
        m.d(matcher, "matcher(...)");
        Object obj = null;
        h hVar = !matcher.matches() ? null : new h(matcher, stringRepresentation);
        if (hVar == null) {
            return Color.parseColor(stringRepresentation);
        }
        String str = (String) ((g0) hVar.a()).get(1);
        String str2 = (String) ((g0) hVar.a()).get(2);
        String str3 = (String) ((g0) hVar.a()).get(3);
        Object objO0 = q.O0(4, hVar.a());
        String str4 = (String) objO0;
        if (str4 != null && !k.L0(str4)) {
            obj = objO0;
        }
        String str5 = (String) obj;
        if (str5 == null) {
            str5 = DEFAULT_ALPHA_HEX;
        }
        z3.r(16);
        int i = Integer.parseInt(str5, 16);
        z3.r(16);
        int i2 = Integer.parseInt(str, 16);
        z3.r(16);
        int i3 = Integer.parseInt(str2, 16);
        z3.r(16);
        return colorInt(i, i2, i3, Integer.parseInt(str3, 16));
    }
}
