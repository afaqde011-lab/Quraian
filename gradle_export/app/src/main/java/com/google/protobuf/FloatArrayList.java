package com.google.protobuf;

import a1.b;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import oi.k;

final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = new FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    public FloatArrayList() {
        this(new float[10], 0, true);
    }

    private FloatArrayList(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.array = fArr;
        this.size = i10;
    }

    private void addFloat(int i10, float f3) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
        float[] fArr = this.array;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[b.A(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.array, i10, fArr2, i10 + 1, this.size - i10);
            this.array = fArr2;
        }
        this.array[i10] = f3;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i10) {
        if (i10 < 0 || i10 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i10) {
        StringBuilder sbQ = k.q("Index:", i10, ", Size:");
        sbQ.append(this.size);
        return sbQ.toString();
    }

    @Override
    public void add(int i10, Float f3) {
        addFloat(i10, f3.floatValue());
    }

    @Override
    public boolean add(Float f3) {
        addFloat(f3.floatValue());
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i10 = floatArrayList.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.array;
        if (i12 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public void addFloat(float f3) {
        ensureIsMutable();
        int i10 = this.size;
        float[] fArr = this.array;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[b.A(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        fArr3[i11] = f3;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (Float.floatToIntBits(this.array[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override
    public float getFloat(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i10]);
        }
        return iFloatToIntBits;
    }

    @Override
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Float remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        float[] fArr = this.array;
        float f3 = fArr[i10];
        int i11 = this.size;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f3);
    }

    @Override
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.array;
        System.arraycopy(fArr, i11, fArr, i10, this.size - i11);
        this.size -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override
    public Float set(int i10, Float f3) {
        return Float.valueOf(setFloat(i10, f3.floatValue()));
    }

    @Override
    public float setFloat(int i10, float f3) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        float[] fArr = this.array;
        float f10 = fArr[i10];
        fArr[i10] = f3;
        return f10;
    }

    @Override
    public int size() {
        return this.size;
    }
}
