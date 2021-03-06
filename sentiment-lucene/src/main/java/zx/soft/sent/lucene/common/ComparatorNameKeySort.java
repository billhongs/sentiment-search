package zx.soft.sent.lucene.common;

import java.util.Comparator;

import zx.soft.sent.lucene.domain.NameKeySort;

public class ComparatorNameKeySort implements Comparator<Object> {

	@Override
	public int compare(Object arg0, Object arg1) {
		NameKeySort sort0 = (NameKeySort) arg0;
		NameKeySort sort1 = (NameKeySort) arg1;
		// 首先比较年龄，如果年龄相同，则比较名字
		if (sort0.count > sort1.count) {
			return -1;
		} else if (sort0.count < sort1.count) {
			return 1;
		} else {
			return 0;
		}
	}

}
