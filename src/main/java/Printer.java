import java.util.List;

/**
 * Created by localadmin on 7/13/17.
 */
public class Printer<T> {
    public void print(T type) {
        System.out.println("printing" + type);
    }

    List<T> doubleThenPrint(List<T> number){

        return number;
    }
}
