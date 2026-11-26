package tz;

import ck.b;
import com.google.android.gms.internal.measurement.x5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0004R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Ltz/a;", "", "", "Ltz/a$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @b("items")
    private final List<C0022a> items;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\n\u0010\u0005R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Ltz/a$a;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "code", "b", "d", "title", "c", "e", "videoUrl", "soundUrl", "iconUrl", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isNew", "g", "isPaid", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0022a {

        @b("code")
        private final String code;

        @b("title")
        private final String title;

        @b("video_url")
        private final String videoUrl;

        @b("sound_url")
        private final String soundUrl;

        @b("icon_url")
        private final String iconUrl;

        @b("is_new")
        private final Boolean isNew;

        @b("is_paid")
        private final Boolean isPaid;

        public final String getCode() {
            return this.code;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getSoundUrl() {
            return this.soundUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0022a)) {
                return false;
            }
            C0022a c0022a = (C0022a) obj;
            return m.a(this.code, c0022a.code) && m.a(this.title, c0022a.title) && m.a(this.videoUrl, c0022a.videoUrl) && m.a(this.soundUrl, c0022a.soundUrl) && m.a(this.iconUrl, c0022a.iconUrl) && m.a(this.isNew, c0022a.isNew) && m.a(this.isPaid, c0022a.isPaid);
        }

        public final Boolean getIsNew() {
            return this.isNew;
        }

        public final Boolean getIsPaid() {
            return this.isPaid;
        }

        public final int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iE = x5.e(x5.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.videoUrl, 31), this.soundUrl, 31);
            String str3 = this.iconUrl;
            int iHashCode2 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isNew;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isPaid;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.code;
            String str2 = this.title;
            String str3 = this.videoUrl;
            String str4 = this.soundUrl;
            String str5 = this.iconUrl;
            Boolean bool = this.isNew;
            Boolean bool2 = this.isPaid;
            StringBuilder sbS = a1.b.s("SoundEffect(code=", str, ", title=", str2, ", videoUrl=");
            a1.b.z(sbS, str3, ", soundUrl=", str4, ", iconUrl=");
            sbS.append(str5);
            sbS.append(", isNew=");
            sbS.append(bool);
            sbS.append(", isPaid=");
            sbS.append(bool2);
            sbS.append(")");
            return sbS.toString();
        }
    }

    public final List getItems() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m.a(this.items, ((a) obj).items);
    }

    public final int hashCode() {
        List<C0022a> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "SoundEffectsApiModel(items=" + this.items + ")";
    }
}
