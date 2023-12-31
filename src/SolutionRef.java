package src;
import java.util.*;
import java.lang.*;

public class SolutionRef {
  public boolean hasCloseElements(List < Double > numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        /*double distance = numbers.get(i) - numbers.get(j);*/
        double distance = Math.abs(numbers.get(i) + numbers.get(j));
        if (distance < threshold) return true;
      }
    }
    return false;
  }
}