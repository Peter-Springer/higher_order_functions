import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'localadmin' at '7/13/17 9:49 AM' with Gradle 2.9
 *
 * @author localadmin, @date 7/13/17 9:49 AM
 */
public class Library {
    public  static List<Integer> removeEven(List<Integer> numbers) {
        if(null == numbers) {
            throw new IllegalArgumentException("");
        }
        return numbers
                .stream()
                .filter((Integer theNumber)-> theNumber %2 != 0)
                .collect(Collectors.toList());
    }

    public static List<String> removeSwiftFox(List<String> foxes) {
        if (null == foxes) {
            throw new IllegalArgumentException("");
        }
        return foxes
                .stream()
                .filter((String theFoxes)-> theFoxes != "Swift Fox")
                .collect(Collectors.toList());
    }


    public static List<Person> findAdult(List<Person> personList) {
        if( null == personList)
            throw new IllegalArgumentException();
        return personList;
    }

    public static List<String> oddOrEven(List<Integer> numberType) {
        if (null == numberType) {
        throw new IllegalArgumentException();
    }
        return numberType.isEmpty() ? Collections.emptyList() :
                numberType
                        .stream()
                        .map((number) -> number %2 ==0 ? "even" : "odd" )
                        .collect(Collectors.toList());

    }

    public static List<String> pluck(List<Map<String,String>> plucks,String property) {
        if (null == plucks || null == property || plucks.isEmpty() || property.isEmpty()) {
        throw new IllegalArgumentException();
        }
        return plucks.stream()
                .map((str) ->  str.get(property))
                .collect(Collectors.toList());
    }

    public static String join(List<String> strings, String delimiter) {
        if(null == strings || strings.isEmpty())
        throw new IllegalArgumentException("");
        return strings.stream()
                .reduce((str, del) -> str + del)
                .orElse(" ");

    }

    public static String join(List<String> strings) {
        if(null == strings || strings.isEmpty()) {
            throw new IllegalArgumentException("");
        }
        return strings.stream()
                      .reduce((str, cur) ->  str + " " + cur)
                      .orElse("");

    }


}

