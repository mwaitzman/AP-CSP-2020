import java.math.pow;
import java.util.ArrayList;
public class TableGenerator {
  ArrayList<tableMember> tableEntries = new ArrayList<>();
  final int Mantissa_MAX_VALUE = (Math.pow(2,23) -1);
  for (int mantissa = 0; mantissa < Mantissa_MAX_VALUE; mantissa++) {
    for (int exponent = -126; exponent =< 127; exponent++) {
      tableValues.add(new tableMember(mantissa, exponent))
    }
  }

  private class tableMember {
    int M, E;
    float val;
    private tableMember(int m, e) {
      this.M = m;
      this.E = e;
      this.val = Math.pow(M, E);
    }
  }

}
