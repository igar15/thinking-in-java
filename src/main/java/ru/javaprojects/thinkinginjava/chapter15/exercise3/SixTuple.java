package ru.javaprojects.thinkinginjava.chapter15.exercise3;

public class SixTuple<A, B, C, D, E, F> extends TwoTuple<A, B> {
    public final C third;
    public final D forth;
    public final E fifth;
    public final F sixth;

    public SixTuple(A first, B second, C third, D forth, E fifth, F sixth) {
        super(first, second);
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "third=" + third +
                ", forth=" + forth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}
