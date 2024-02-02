package org.sergioAyala.Chaining;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("hola").append("como").append("estas");
        Chainer chainer = new Chainer();
        Chainer chainer1 = chainer.sayhi();
        Chainer chainer2 = chainer.sayBye();
        chainer.sayhi().sayBye();

    }

    static class Chainer{
        public Chainer sayhi(){
            System.out.println("hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("adios");
            return this;
        }
    }
}
