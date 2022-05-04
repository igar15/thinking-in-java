package ru.javaprojects.thinkinginjava.chapter3.exercise2;

public class AliasingTest {

    public static void main(String[] args) {
        Data data1 = new Data(3.2f);
        Data data2 = new Data(6.1f);
        data2 = data1;
        System.out.println(data1.f);
        System.out.println(data2.f);
    }


    public static class Data {
        private float f;

        public Data(float f) {
            this.f = f;
        }

        public float getF() {
            return f;
        }

        public void setF(float f) {
            this.f = f;
        }
    }
}
