package tf;

public enum r1 {
    STORAGE(s1.AD_STORAGE, s1.ANALYTICS_STORAGE),
    DMA(s1.AD_USER_DATA);

    public final s1[] A;

    r1(s1... s1VarArr) {
        this.A = s1VarArr;
    }
}
