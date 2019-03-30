package codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flat {

    public List<Object> result;

    public Flat() {
        result = new ArrayList<Object>();
    }

    public List<Object> flat(Object[] elements, List<Object> result) {
        for(Object element: elements) {

            if(Objects.nonNull(element) && element.getClass().isArray()) {
                flat((Object[]) element, result);
            } else {
                result.add(element);
            }
        }
        return result;
    }
}
