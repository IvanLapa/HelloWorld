package com.companyJD1.lecture11_collection_set_map;
import java.util.*;

public class Mission4 {
    public static void main(String[] args) {
        BlackBox<Integer> black_box = new BlackBox<>(new TreeSet<Integer>());
        black_box.addNumber(5);
        black_box.addNumber(7);
        black_box.addNumber(3);
        black_box.addNumber(-2);
        black_box.addNumber(9);
        System.out.println(black_box.return_k_min(3));
        System.out.println(black_box.return_n_max(2));
    }
}
    class BlackBox<Integer> {
        TreeSet<Integer> treeSet;

        BlackBox(TreeSet<Integer> treeSet) {
            this.treeSet = treeSet;
        }

        public void addNumber(Integer n) {
            this.treeSet.add(n);
        }

        public Integer return_k_min(int k) {
            Iterator<Integer> iterator = this.treeSet.iterator();
            int count = 1;
            if (this.treeSet.size() < k) {
                throw new ArrayIndexOutOfBoundsException("Размер ящика меньше");
            }
            while (iterator.hasNext()) {
                Integer k_min = iterator.next();
                if (count == k) {
                    return k_min;
                }
                count++;
            }
            return null;
        }

        public Integer return_n_max(int n) {
            Iterator<Integer> iterator = this.treeSet.iterator();
            int max = this.treeSet.size() + 1 - n;
            int count = 1;
            if (this.treeSet.size() < n) {
                throw new ArrayIndexOutOfBoundsException("Размер ящика меньше");
            }
            while (iterator.hasNext()) {
                Integer n_max = iterator.next();
                if (count == max) {
                    return n_max;
                }
                count++;
            }
            return null;
        }
    }

