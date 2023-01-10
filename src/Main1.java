import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {

        String setNum = "1,2,3,4,4,5";
        new SetOfNum().input(setNum).printNumbers();
    }
}
class SetOfNum {
    private Set<Integer> numbers;
    public SetOfNum() {
        numbers=new HashSet<>();
    }

    public SetOfNum input(String digits) {
        Matcher m = Pattern.compile("[0-9]+").matcher(digits);
        while (m.find()) {
            numbers.add(Integer.valueOf(digits.substring(m.start(), m.end())));
        }
        return this;
    }
    public void printNumbers() {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}