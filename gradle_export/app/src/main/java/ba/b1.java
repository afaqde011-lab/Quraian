package ba;

import com.google.android.gms.internal.measurement.x5;

public final class b1 {

    public int f2238a;

    public int f2239b;

    public int f2240c;

    public int f2241d;

    public int f2242e;

    public boolean f2243f;

    public boolean f2244g;

    public boolean f2245h;

    public boolean f2246i;

    public boolean f2247j;

    public boolean f2248k;
    public int l;
    public long m;

    public int f2249n;

    public final void a(int i10) {
        if ((this.f2241d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2241d));
    }

    public final int b() {
        return this.f2244g ? this.f2239b - this.f2240c : this.f2242e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f2238a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f2242e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f2246i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f2239b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f2240c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f2243f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f2244g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f2247j);
        sb2.append(", mRunPredictiveAnimations=");
        return x5.o(sb2, this.f2248k, '}');
    }
}
