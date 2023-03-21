package com.algorithm.ch1;

import com.algorithm.utils.ArrayUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Chen haoyu
 * @description
 * @date 2023/3/20
 */
public class TestAndVerify {

    private void testSort(Sort sort, int length) {
        List<Integer> list = ArrayUtils.generatorArray(length);
        long begin = System.currentTimeMillis();
        sort.sort(list);
        System.out.println("Time consumed:" + (System.currentTimeMillis() - begin) + " ms.");
        ArrayUtils.assertArrayAsc(list);
    }


    /**
     * 10_0000  855ms
     * 100_0000 283000ms
     */
    @Test
    public void testInsertSort() {
        InsertSort insertSort = new InsertSort();
        testSort(insertSort, 1000000);
    }

    /**
     * 10_0000   138ms
     * 100_0000  471ms
     * 1000_0000 5406ms
     */
    @Test
    public void  testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        testSort(mergeSort, 10000000);
    }

    /**
     * 10_0000   29ms
     * 100_0000  213ms
     * 1000_0000 4569ms
     */
    @Test
    public void  testBenchmark() {
        Benchmark mergeSort = new Benchmark();
        testSort(mergeSort, 10000000);
    }
}
