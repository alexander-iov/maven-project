package src;

import org.apache.commons.collections4.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"a","b","c"};
        CollectionUtils.reverseArray(strings);
        System.out.println(Arrays.toString(strings));

        List<String> emptyList = new ArrayList<>();
        System.out.println(CollectionUtils.isEmpty(emptyList));
        System.out.println(CollectionUtils.isEmpty(null));

        emptyList.addAll(Arrays.asList(strings));
        System.out.println(CollectionUtils.isEmpty(emptyList));
    }
}
