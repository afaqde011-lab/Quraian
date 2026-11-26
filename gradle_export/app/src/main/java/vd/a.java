package vd;

import a10.h0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import ud.c;
import xd.k;

public final class a implements k {

    public static final String f15606c;

    public static final Set f15607d;

    public static final a f15608e;

    public static final a f15609f;

    public final String f15610a;

    public final String f15611b;

    static {
        String strI = h0.I("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f15606c = strI;
        String strI2 = h0.I("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strI3 = h0.I("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f15607d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new c("proto"), new c("json"))));
        f15608e = new a(strI, null);
        f15609f = new a(strI2, strI3);
    }

    public a(String str, String str2) {
        this.f15610a = str;
        this.f15611b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
