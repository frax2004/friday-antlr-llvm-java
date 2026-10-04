package com.friday.util;


public final class HashCombiner {
	private static final int DEFAULT_SEED = 0;

	private static int combine(int lhs, int rhs) {
		final int c1 = 0xCC9E2D51;
		final int c2 = 0x1B873593;
		final int r1 = 15;
		final int r2 = 13;
		final int m = 5;
		final int n = 0xE6546B64;

		
		int k = rhs;
		k = k * c1;
		k = (k << r1) | (k >>> (32 - r1));
		k = k * c2;

		lhs = lhs ^ k;
		lhs = (lhs << r2) | (lhs >>> (32 - r2));
		lhs = lhs * m + n;

		return lhs;
	}

	private static int combine(int lhs, Object obj) {
		return HashCombiner.combine(lhs, obj != null ? obj.hashCode() : 0);
	}

	public static int combineWithSeed(int seed, Object... data) {
		int hash = seed;
		for(Object obj : data) {
			hash = HashCombiner.combine(hash, obj);
		}
		hash = hash ^ (data.length * 4);
		hash = hash ^ (hash >>> 16);
		hash = hash * 0x85EBCA6B;
		hash = hash ^ (hash >>> 13);
		hash = hash * 0xC2B2AE35;
		hash = hash ^ (hash >>> 16);
		return hash;
	}

	public static int combineWithSeed(int seed, int... data) {
		int hash = seed;
		for(int code : data) {
			hash = HashCombiner.combine(hash, code);
		}
		hash = hash ^ (data.length * 4);
		hash = hash ^ (hash >>> 16);
		hash = hash * 0x85EBCA6B;
		hash = hash ^ (hash >>> 13);
		hash = hash * 0xC2B2AE35;
		hash = hash ^ (hash >>> 16);
		return hash;
	}

	public static int combine(Object... data) {
		return HashCombiner.combineWithSeed(HashCombiner.DEFAULT_SEED, data);
	}

	public static int combine(int... data) {
		return HashCombiner.combineWithSeed(HashCombiner.DEFAULT_SEED, data);
	}
}
