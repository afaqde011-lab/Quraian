package ba;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.Cast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public abstract class f1 {

    public static final List f2274t = Collections.EMPTY_LIST;

    public final View f2275a;

    public WeakReference f2276b;

    public int f2284j;

    public RecyclerView f2290r;

    public g0 f2291s;

    public int f2277c = -1;

    public int f2278d = -1;

    public long f2279e = -1;

    public int f2280f = -1;

    public int f2281g = -1;

    public f1 f2282h = null;

    public f1 f2283i = null;

    public ArrayList f2285k = null;
    public List l = null;
    public int m = 0;

    public v0 f2286n = null;

    public boolean f2287o = false;

    public int f2288p = 0;

    public int f2289q = -1;

    public f1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2275a = view;
    }

    public final void a(int i10) {
        this.f2284j = i10 | this.f2284j;
    }

    public final int b() {
        int i10 = this.f2281g;
        return i10 == -1 ? this.f2277c : i10;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2284j & 1024) != 0 || (arrayList = this.f2285k) == null || arrayList.size() == 0) ? f2274t : this.l;
    }

    public final boolean d() {
        View view = this.f2275a;
        return (view.getParent() == null || view.getParent() == this.f2290r) ? false : true;
    }

    public final boolean e() {
        return (this.f2284j & 1) != 0;
    }

    public final boolean f() {
        return (this.f2284j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f2284j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = z4.j0.f17198a;
        return !this.f2275a.hasTransientState();
    }

    public final boolean h() {
        return (this.f2284j & 8) != 0;
    }

    public final boolean i() {
        return this.f2286n != null;
    }

    public final boolean j() {
        return (this.f2284j & 256) != 0;
    }

    public final boolean k() {
        return (this.f2284j & 2) != 0;
    }

    public final void l(int i10, boolean z10) {
        if (this.f2278d == -1) {
            this.f2278d = this.f2277c;
        }
        if (this.f2281g == -1) {
            this.f2281g = this.f2277c;
        }
        if (z10) {
            this.f2281g += i10;
        }
        this.f2277c += i10;
        View view = this.f2275a;
        if (view.getLayoutParams() != null) {
            ((q0) view.getLayoutParams()).f2394c = true;
        }
    }

    public final void m() {
        if (RecyclerView.f1852b1 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2284j = 0;
        this.f2277c = -1;
        this.f2278d = -1;
        this.f2279e = -1L;
        this.f2281g = -1;
        this.m = 0;
        this.f2282h = null;
        this.f2283i = null;
        ArrayList arrayList = this.f2285k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2284j &= -1025;
        this.f2288p = 0;
        this.f2289q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z10) {
        int i10 = this.m;
        int i11 = z10 ? i10 - 1 : i10 + 1;
        this.m = i11;
        if (i11 < 0) {
            this.m = 0;
            if (RecyclerView.f1852b1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i11 == 1) {
            this.f2284j |= 16;
        } else if (z10 && i11 == 0) {
            this.f2284j &= -17;
        }
        if (RecyclerView.f1853c1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.f2284j & Cast.MAX_NAMESPACE_LENGTH) != 0;
    }

    public final boolean p() {
        return (this.f2284j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2277c + " id=" + this.f2279e + ", oldPos=" + this.f2278d + ", pLpos:" + this.f2281g);
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f2287o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.f2284j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.m + ")");
        }
        if ((this.f2284j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f2275a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
