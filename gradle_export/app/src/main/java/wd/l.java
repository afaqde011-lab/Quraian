package wd;

import com.google.android.gms.internal.measurement.x5;

public final class l extends a {

    public final Integer f16031a;

    public final String f16032b;

    public final String f16033c;

    public final String f16034d;

    public final String f16035e;

    public final String f16036f;

    public final String f16037g;

    public final String f16038h;

    public final String f16039i;

    public final String f16040j;

    public final String f16041k;
    public final String l;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f16031a = num;
        this.f16032b = str;
        this.f16033c = str2;
        this.f16034d = str3;
        this.f16035e = str4;
        this.f16036f = str5;
        this.f16037g = str6;
        this.f16038h = str7;
        this.f16039i = str8;
        this.f16040j = str9;
        this.f16041k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f16031a;
            if (num != null ? num.equals(((l) aVar).f16031a) : ((l) aVar).f16031a == null) {
                String str = this.f16032b;
                if (str != null ? str.equals(((l) aVar).f16032b) : ((l) aVar).f16032b == null) {
                    String str2 = this.f16033c;
                    if (str2 != null ? str2.equals(((l) aVar).f16033c) : ((l) aVar).f16033c == null) {
                        String str3 = this.f16034d;
                        if (str3 != null ? str3.equals(((l) aVar).f16034d) : ((l) aVar).f16034d == null) {
                            String str4 = this.f16035e;
                            if (str4 != null ? str4.equals(((l) aVar).f16035e) : ((l) aVar).f16035e == null) {
                                String str5 = this.f16036f;
                                if (str5 != null ? str5.equals(((l) aVar).f16036f) : ((l) aVar).f16036f == null) {
                                    String str6 = this.f16037g;
                                    if (str6 != null ? str6.equals(((l) aVar).f16037g) : ((l) aVar).f16037g == null) {
                                        String str7 = this.f16038h;
                                        if (str7 != null ? str7.equals(((l) aVar).f16038h) : ((l) aVar).f16038h == null) {
                                            String str8 = this.f16039i;
                                            if (str8 != null ? str8.equals(((l) aVar).f16039i) : ((l) aVar).f16039i == null) {
                                                String str9 = this.f16040j;
                                                if (str9 != null ? str9.equals(((l) aVar).f16040j) : ((l) aVar).f16040j == null) {
                                                    String str10 = this.f16041k;
                                                    if (str10 != null ? str10.equals(((l) aVar).f16041k) : ((l) aVar).f16041k == null) {
                                                        String str11 = this.l;
                                                        if (str11 != null ? str11.equals(((l) aVar).l) : ((l) aVar).l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f16031a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f16032b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16033c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16034d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16035e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f16036f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f16037g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f16038h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f16039i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f16040j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f16041k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f16031a);
        sb2.append(", model=");
        sb2.append(this.f16032b);
        sb2.append(", hardware=");
        sb2.append(this.f16033c);
        sb2.append(", device=");
        sb2.append(this.f16034d);
        sb2.append(", product=");
        sb2.append(this.f16035e);
        sb2.append(", osBuild=");
        sb2.append(this.f16036f);
        sb2.append(", manufacturer=");
        sb2.append(this.f16037g);
        sb2.append(", fingerprint=");
        sb2.append(this.f16038h);
        sb2.append(", locale=");
        sb2.append(this.f16039i);
        sb2.append(", country=");
        sb2.append(this.f16040j);
        sb2.append(", mccMnc=");
        sb2.append(this.f16041k);
        sb2.append(", applicationBuild=");
        return x5.n(sb2, this.l, "}");
    }
}
