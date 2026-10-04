package com.friday.util;

import java.io.Serializable;
import java.util.Objects;

public final class Pair<First, Second> implements Serializable {
  public First first = null;
	public Second second = null;

  public Pair(First a, Second b) {
		this.first = a;
		this.second = b;
	}

  public static <First, Second> Pair<First, Second> of(First a, Second b) {
    return new Pair<>(a, b);
  }

	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		} else if(!(obj instanceof Pair<?, ?>)) {
			return false;
		}

		Pair<?, ?> other = (Pair<?, ?>)obj;
    return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	}

	@Override
	public int hashCode() {
    return HashCombiner.combine(this.first, this.second);
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", first, second);
	}
}
