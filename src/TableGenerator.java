import java.lang.Math;
import java.util.LinkedList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class TableGenerator {
  public static void main(String[] args) {
    System.out.println("Starting program...");
    LinkedList<TableMember> tableEntries = new LinkedList<>();
    final int Mantissa_MAX_VALUE = (int) (Math.pow(2,11) -1);//23
    for(int mantissa = 0; mantissa < Mantissa_MAX_VALUE; mantissa++) {
      for (int exponent = -126; exponent <= 127; exponent++) {//-126,127
        tableEntries.add(new TableMember(mantissa, exponent));
      }
    }
    System.out.println("SORTING TABLE...");
    tableEntries = sortTable(tableEntries);
    try {
      PrintWriter PW = new PrintWriter(new FileWriter(new File("Table.txt")));
      PW.printf("%nM: %d\tE: %d\tV: %.32f", tableEntries.get(0).M, tableEntries.get(0).E, tableEntries.get(0).val);
      for(int i = 1; i < tableEntries.size(); i++) {
        PW.printf("%nM: %d\tE: %d\tV: %32.32f", tableEntries.get(i).M, tableEntries.get(i).E, tableEntries.get(i).val-tableEntries.get(i-1).val);
      }
      PW.close();
    }
    catch(IOException ex) {
      System.err.println(ex);
      System.exit(1);
    }
    System.out.print("\nEND OF PROGRAM");
  }

  public static class TableMember {
    int M, E;
    double val;
    //float val;
    public TableMember(int m, int e) {
      this.M = m;
      this.E = e;
      this.val = Math.pow(M, E);
    }
  }

  static LinkedList<TableMember> sortTable(LinkedList<TableMember> table) {
    TableMember temp = null;
    //need to change this from bubblesort
    quickSort(table.toArray(new TableMember[table.size()]), 0, table.size());
    return table;
  }
  public static void quickSort(TableMember arr[], int begin, int end)
    {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            // Recursively sort elements of the 2 sub-arrays
            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(TableMember arr[], int begin, int end)
    {
        double pivot = arr[end-1].val;
        int i = (begin-1);

        for (int j=begin; j<end; j++)
        {
            if (arr[j].val <= pivot) {
                i++;

                TableMember swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        TableMember swapTemp = arr[i];
        arr[i] = arr[end-1];
        arr[end-1] = swapTemp;

        return i+1;
    }

}
