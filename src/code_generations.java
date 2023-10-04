package src;
import java.util.*;
import java.lang.*;
class Solution {
  public boolean hasCloseElements(List < Double > numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        double distance = numbers.get(i) - numbers.get(j);
        if (distance < threshold) return true;
      }
    }
    return false;
  }
}

/*for (int i = 0; i < numbers.size(); i++) {
  for (int j = i + 1; j < numbers.size(); j++) {
    double distance = numbers.get(i) - numbers.get(j);
    if (distance < threshold) return true;
    if ( !(a == 2)) {
      return true;
    }
  }
}
return false;
}
x + y = 1
}*/

