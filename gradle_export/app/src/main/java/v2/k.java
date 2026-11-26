package v2;

import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.f4;
import java.util.List;

public final class k {

    public final Object f15387a;

    public final f4 f15388b;

    public final int f15389c;

    public final int f15390d;

    public final int f15391e;

    public int f15392f;

    public k(List list, f4 f4Var) {
        this.f15387a = list;
        this.f15388b = f4Var;
        MotionEvent motionEventA = a();
        int i10 = 0;
        this.f15389c = motionEventA != null ? motionEventA.getClassification() : 0;
        MotionEvent motionEventA2 = a();
        this.f15390d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.f15391e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z10 = motionEventA4.getClassification() == 3;
            boolean z11 = motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z10) {
                                    i10 = 10;
                                } else if (!z11) {
                                    i10 = 1;
                                } else {
                                    i10 = 8;
                                }
                                break;
                            case 6:
                                if (z10) {
                                    i10 = 12;
                                } else if (!z11) {
                                    i10 = 2;
                                } else {
                                    i10 = 8;
                                }
                                break;
                            case 7:
                                if (z10) {
                                    i10 = 11;
                                } else if (!z11) {
                                    i10 = 3;
                                } else {
                                    i10 = 8;
                                }
                                break;
                            case 8:
                                i10 = 6;
                                break;
                            case 9:
                                i10 = 4;
                                break;
                            case 10:
                                i10 = 5;
                                break;
                        }
                    } else if (z10) {
                        i10 = 11;
                    } else if (!z11) {
                        i10 = 8;
                    } else {
                        i10 = 3;
                    }
                } else if (z10) {
                    i10 = 12;
                } else if (z11) {
                    i10 = 9;
                } else {
                    i10 = 2;
                }
            } else if (z10) {
                i10 = 10;
            } else if (z11) {
                i10 = 7;
            } else {
                i10 = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i10 < size) {
                    s sVar = (s) list.get(i10);
                    if (r.d(sVar)) {
                        i10 = 2;
                    } else if (r.b(sVar)) {
                        i10 = 1;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = 3;
                }
            }
        }
        this.f15392f = i10;
    }

    public final MotionEvent a() {
        f4 f4Var = this.f15388b;
        if (f4Var != null) {
            return (MotionEvent) ((q3.e0) f4Var.D).C;
        }
        return null;
    }
}
