package com.google.protobuf;

import a1.b;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import oi.k;

final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    private DoubleArrayList(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.array = dArr;
        this.size = i10;
    }

    private void addDouble(int i10, double d3) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i10));
        }
        double[] dArr = this.array;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[b.A(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.array, i10, dArr2, i10 + 1, this.size - i10);
            this.array = dArr2;
        }
        this.array[i10] = d3;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static DoubleArrayList emptyList() {
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
    public void add(int i10, Double d3) {
        addDouble(i10, d3.doubleValue());
    }

    @Override
    public boolean add(Double d3) {
        addDouble(d3.doubleValue());
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i10 = doubleArrayList.size;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.size;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.array;
        if (i12 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override
    public void addDouble(double d3) {
        ensureIsMutable();
        int i10 = this.size;
        double[] dArr = this.array;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[b.A(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i11 = this.size;
        this.size = i11 + 1;
        dArr3[i11] = d3;
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
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i10 = 0; i10 < this.size; i10++) {
            if (Double.doubleToLongBits(this.array[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override
    public double getDouble(int i10) {
        ensureIndexInRange(i10);
        return this.array[i10];
    }

    @Override
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i10]));
        }
        return iHashLong;
    }

    @Override
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.array[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i10), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Double remove(int i10) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d3 = dArr[i10];
        int i11 = this.size;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d3);
    }

    @Override
    public void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.array;
        System.arraycopy(dArr, i11, dArr, i10, this.size - i11);
        this.size -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override
    public Double set(int i10, Double d3) {
        return Double.valueOf(setDouble(i10, d3.doubleValue()));
    }

    @Override
    public double setDouble(int i10, double d3) {
        ensureIsMutable();
        ensureIndexInRange(i10);
        double[] dArr = this.array;
        double d5 = dArr[i10];
        dArr[i10] = d3;
        return d5;
    }

    @Override
    public int size() {
        return this.size;
    }
}
