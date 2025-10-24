package ua.opnu.list;

import java.util.Comparator;

public class MarkSorter implements Comparator {

    private boolean order;

    public MarkSorter(boolean order) {
        this.order = order;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;

            if (order) {
                if (s1.getAvgMark() > s2.getAvgMark())
                    return 1;
                if (s1.getAvgMark() == s2.getAvgMark())
                    return 0;
                if (s1.getAvgMark() < s2.getAvgMark())
                    return -1;
            } else {
                if (s2.getAvgMark() > s1.getAvgMark())
                    return 1;
                if (s2.getAvgMark() == s1.getAvgMark())
                    return 0;
                if (s2.getAvgMark() < s1.getAvgMark())
                    return -1;
            }

        }
        return 0;
    }
}