public class ub3 {
    public static void main(String args[]) {
        int count = 0;
          int i = 11;
  if (i != 4) {
    i = i + 4;
    if (i != 6) {
      count++;
      while (i < 15) {
        i = i + 5;
        count++;
      }
    } else {
      count++;
      count++;
    }
  } else {
    count++;
    count++;
  }
  if (i > 4) {
    i = i + 1;
    while (i < 19) {
      i = i + 2;
      count++;
      while (i < 29) {
        i = i + 6;
        count++;
      }
    }
  } else {
    count++;
    count++;
  }
  System.out.println(count);
    }
}
