package io.zoo.animal.lion.structoral.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite Pattern example.
 * 이해를 위해 class 들을 파일 분리 없이 main에 작성.
 */
public class CompositeApplication {

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.print();


        Tree tree = new Tree();
        tree.add(new Leaf());
        tree.add(new Leaf());
        tree.add(new Leaf());
        tree.add(new Leaf());
        tree.add(new Leaf());

        tree.print();
    }

    interface Graphic {

        void print();
    }

    static class Leaf implements Graphic {

        @Override
        public void print() {
            System.out.println("Leaf:" + hashCode());
        }
    }

    static class Tree implements Graphic {

        private final List<Leaf> trees;

        public Tree() {
            this.trees = new ArrayList<>();
        }

        @Override
        public void print() {
            for (Leaf leaf : trees) {
                leaf.print();
            }
        }

        public void add(Leaf leaf) {
            trees.add(leaf);
        }

        public void remove(Leaf leaf) {
            trees.remove(leaf);
        }
    }
}
