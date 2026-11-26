package com.revenuecat.purchases.models;

import g00.k;
import h00.g0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import r30.h;
import w00.a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lg00/k;", "", "Lcom/revenuecat/purchases/models/Period$Unit;", "toPeriod", "(Ljava/lang/String;)Lg00/k;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PeriodKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final k toPeriod(String input) {
        Period.Unit unit;
        double d;
        double d2;
        double d3;
        Pattern patternCompile = Pattern.compile("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$");
        m.d(patternCompile, "compile(...)");
        m.e(input, "input");
        Matcher matcher = patternCompile.matcher(input);
        m.d(matcher, "matcher(...)");
        h hVar = !matcher.matches() ? null : new h(matcher, input);
        if (hVar == null) {
            return new k(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        String str = (String) ((g0) hVar.a()).get(1);
        String str2 = (String) ((g0) hVar.a()).get(2);
        String str3 = (String) ((g0) hVar.a()).get(3);
        String str4 = (String) ((g0) hVar.a()).get(4);
        int iIntValue = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str)).intValue();
        int iIntValue2 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str2)).intValue();
        int iIntValue3 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str3)).intValue();
        int iIntValue4 = ((Number) periodKt$toPeriod$1$toInt$1.invoke((Object) str4)).intValue();
        if (iIntValue4 > 0) {
            unit = Period.Unit.DAY;
        } else if (iIntValue3 > 0) {
            unit = Period.Unit.WEEK;
        } else if (iIntValue2 > 0) {
            unit = Period.Unit.MONTH;
        } else {
            unit = iIntValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i != 1) {
            if (i == 2) {
                d2 = ((double) iIntValue) * 12.0d;
                d3 = iIntValue2;
            } else if (i == 3) {
                d = ((double) iIntValue3) + (((double) iIntValue2) * 4.345238095238096d) + (((double) iIntValue) * 52.142857142857146d);
            } else if (i == 4) {
                d2 = (((double) iIntValue3) * 7.0d) + (((double) iIntValue2) * 30.0d) + (((double) iIntValue) * 365.0d);
                d3 = iIntValue4;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                d = 0.0d;
            }
            d = d2 + d3;
        } else {
            d = iIntValue;
        }
        return new k(Integer.valueOf(a.E(d)), unit);
    }
}
