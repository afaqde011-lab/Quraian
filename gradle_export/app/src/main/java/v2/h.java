package v2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

public final class h {

    public long f15367a;

    public final SparseLongArray f15368b = new SparseLongArray();

    public final SparseBooleanArray f15369c = new SparseBooleanArray();

    public final ArrayList f15370d = new ArrayList();

    public final u.q f15371e = new u.q((Object) null);

    public int f15372f = -1;

    public int f15373g = -1;

    public boolean f15374h;

    public boolean f15375i;

    public h2.b f15376j;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f15368b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j9 = this.f15367a;
                this.f15367a = 1 + j9;
                sparseLongArray.put(pointerId, j9);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j10 = this.f15367a;
            this.f15367a = 1 + j10;
            sparseLongArray.put(pointerId2, j10);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f15369c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f15372f && source == this.f15373g) {
            return;
        }
        this.f15372f = toolType;
        this.f15373g = source;
        this.f15369c.clear();
        this.f15368b.clear();
    }

    public final q3.e0 c(MotionEvent motionEvent, c3.z zVar) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f15369c;
        if (actionMasked == 3 || actionMasked == 4) {
            this.f15368b.clear();
            sparseBooleanArray.clear();
            this.f15374h = false;
            this.f15375i = false;
            this.f15376j = null;
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.f15370d;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z12 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z13 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z12 || z13) {
                this.f15374h = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.f15375i = false;
            int pointerCount = motionEvent.getPointerCount();
            int i10 = 0;
            while (i10 < pointerCount) {
                arrayList.add(d(zVar, motionEvent, null, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
                i10++;
            }
        } else {
            this.f15375i = true;
            if (motionEvent.getActionMasked() == 0) {
                this.f15376j = new h2.b((((long) Float.floatToRawIntBits(motionEvent.getRawY(0))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(0))) << 32));
            }
            arrayList.add(d(zVar, motionEvent, this.f15376j, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.f15374h = false;
            this.f15375i = false;
            this.f15376j = null;
        }
        e(motionEvent);
        motionEvent.getEventTime();
        return new q3.e0(arrayList, motionEvent, 13);
    }

    public final u d(c3.z zVar, MotionEvent motionEvent, h2.b bVar, int i10, boolean z10) {
        long jValueAt;
        long jFloatToRawIntBits;
        long jG;
        int i11;
        char c10;
        long jFloatToRawIntBits2;
        float fFloatValue;
        long jFloatToRawIntBits3;
        int pointerId = motionEvent.getPointerId(i10);
        SparseLongArray sparseLongArray = this.f15368b;
        int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = sparseLongArray.valueAt(iIndexOfKey);
        } else {
            long j9 = this.f15367a;
            this.f15367a = 1 + j9;
            sparseLongArray.put(pointerId, j9);
            jValueAt = j9;
        }
        float pressure = motionEvent.getPressure(i10);
        char c11 = ' ';
        long j10 = 4294967295L;
        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(motionEvent.getX(i10))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i10))) & 4294967295L);
        if (i10 == 0) {
            if (bVar != null) {
                jFloatToRawIntBits = bVar.f6544a;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L);
            }
            jG = zVar.G(jFloatToRawIntBits);
        } else {
            if (bVar != null) {
                jFloatToRawIntBits = bVar.f6544a;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawX(i10))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY(i10))) & 4294967295L);
            }
            jG = zVar.G(jFloatToRawIntBits);
        }
        long j11 = jFloatToRawIntBits;
        long j12 = jG;
        int toolType = motionEvent.getToolType(i10);
        if (toolType != 0) {
            int i12 = 2;
            if (toolType == 1) {
                i11 = ((motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584)) && (!this.f15374h || this.f15375i)) ? i12 : 1;
            } else if (toolType != 2) {
                if (toolType != 3) {
                    i12 = 4;
                    if (toolType != 4) {
                        i11 = 0;
                    }
                }
            } else {
                i11 = 3;
            }
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i13 = 0;
        while (true) {
            c10 = c11;
            jFloatToRawIntBits2 = 0;
            fFloatValue = 1.0f;
            if (i13 >= historySize) {
                break;
            }
            float historicalX = motionEvent.getHistoricalX(i10, i13);
            float historicalY = motionEvent.getHistoricalY(i10, i13);
            long j13 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(historicalX)) << c10) | (((long) Float.floatToRawIntBits(historicalY)) & j13);
                long historicalEventTime = motionEvent.getHistoricalEventTime(i13);
                float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i10, i13);
                Float fValueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                float fFloatValue2 = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                if (motionEvent.getClassification() == 3) {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i10, i13))) << c10) | (((long) Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i10, i13))) & j13);
                }
                arrayList.add(new b(historicalEventTime, jFloatToRawIntBits5, fFloatValue2, jFloatToRawIntBits2, jFloatToRawIntBits5));
            }
            i13++;
            c11 = c10;
            j10 = j13;
        }
        long j14 = j10;
        if (motionEvent.getActionMasked() == 8) {
            jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j14) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c10);
        } else {
            jFloatToRawIntBits3 = 0;
        }
        if (motionEvent.getClassification() == 5) {
            float axisValue = motionEvent.getAxisValue(52, i10);
            Float fValueOf2 = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
            if (fValueOf2 != null) {
                fFloatValue = fValueOf2.floatValue();
            }
        }
        float f3 = fFloatValue;
        if (motionEvent.getClassification() == 3) {
            jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(50, i10))) << c10) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(51, i10))) & j14);
        }
        return new u(jValueAt, motionEvent.getEventTime(), j11, j12, z10, pressure, i11, this.f15369c.get(motionEvent.getPointerId(i10), false), arrayList, jFloatToRawIntBits3, f3, jFloatToRawIntBits2, jFloatToRawIntBits4);
    }

    public final void e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f15369c;
        SparseLongArray sparseLongArray = this.f15368b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i10) == iKeyAt) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }
}
