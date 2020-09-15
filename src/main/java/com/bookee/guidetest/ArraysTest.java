package com.bookee.guidetest;

import java.util.Arrays;
import java.util.List;

public class ArraysTest {

	/**
	 * Arrays常见操作
	 * sort() 排序
	 * binarySearch() 查找
	 * fill() 填充
	 * equals() 比较
	 * asList() 转列表
	 * toString() 转字符串
	 * copyOf() 复制
	 * @param args
	 */
	public static void main(String[] args) {
		//排序
		int a[]={1,4,2,6,5,8,7,23,12};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		//sort(int[] a,int fromIndex,int toIndex)按升序排列数组的指定范围
		int b[]={1,4,2,6,5,8,7,23,12};
		Arrays.sort(b,2,5);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		int c[] = { 1, 3, 2, 7, 6, 5, 4, 9 };
		// parallelSort(int[] a) 按照数字顺序排列指定的数组(并行的)。同sort方法一样也有按范围的排序
		Arrays.parallelSort(c);
		System.out.println("Arrays.parallelSort(c)：");
		for (int i : c) {
			System.out.print(i);
		}
		// 换行
		System.out.println();

		// parallelSort给字符数组排序，sort也可以
		char d[] = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		Arrays.parallelSort(d);
		System.out.println("Arrays.parallelSort(d)：");
		for (char d2 : d) {
			System.out.print(d2);
		}
		// 换行
		System.out.println();
		
		//查找 binarySearch
		char[] e = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));
		int s = Arrays.binarySearch(e, 'c');
		System.out.println(s);
		
		// *************比较 equals****************
		char[] f = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		char[] g = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		/*
		* 元素数量相同，并且相同位置的元素相同。 另外，如果两个数组引用都是null，则它们被认为是相等的 。
		*/
		// 输出true
		System.out.println("Arrays.equals(e, f):" + Arrays.equals(f,g));
		
		// *************填充fill(批量初始化)****************
		int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6 };
		// 数组中所有元素重新分配值
		Arrays.fill(h, 3);
		System.out.println("Arrays.fill(h, 3)：");
		// 输出结果：333333333
		for (int i : h) {
			System.out.print(i);
		}
		// 换行
		System.out.println();

		int[] q = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
		// 数组中指定范围元素重新分配值
		Arrays.fill(q, 0, 2, 9);
		System.out.println("Arrays.fill(q, 0, 2, 9);：");
		// 输出结果：993333666
		for (int i : q) {
			System.out.print(i);
		}
		// 换行
		System.out.println();
		
		//转列表 asList()
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		System.out.println(stooges);
		
		//转字符串 toString
		char[] k = { 'a', 'f', 'b', 'c', 'e', 'A', 'C', 'B' };
		System.out.println(Arrays.toString(k));
		
		// *************复制 copy****************
		// copyOf 方法实现数组复制,h为数组，6为复制的长度
		int[] w = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
		int i[] = Arrays.copyOf(w, 7);
		System.out.println("Arrays.copyOf(w, 6);：");
		// 输出结果：123333
		for (int j : i) {
			System.out.print(j);
		}
		// 换行
		System.out.println();
		// copyOfRange将指定数组的指定范围复制到新数组中
		int j[] = Arrays.copyOfRange(w, 6, 11);
		System.out.println("Arrays.copyOfRange(w, 6, 11)：");
		// 输出结果66600(h数组只有9个元素这里是从索引6到索引11复制所以不足的就为0)
		for (int j2 : j) {
			System.out.print(j2);
		}
		// 换行
		System.out.println();
	}

}
