public class IntegerSorter {
  public int[] sortInts(int[] input) {
-----------------------------------------------------------------------------------
int[] sort(int[] input) {
int buffer;
int output
MSB = 31; //the amount of bits that an int has in java
roundMin = 0;
roundMax = 0;
//cMSB = MSB;
//cMSB is the current Most Significant Bit
  for(int cMSB = MSB; cMSB >= 0; cMSB--) {
    for(int n = 0; n < input.size; n++) {
      if(input[n].bitAt(cMSB).value === Bit.values.HIGH) {
      add input[n] to the buffer array
      }
    }//--TODO remove all already checked ints from the next round so it doesnt waste time???
    for(int i = 0; i < buffer.size; i++) {

    }
    buffer.pushTo(output);
    buffer = null;//is buffer.clear()
  }

}





    --------------------------------------------------------------------------------------
    int[input.size] output;
    int i = 0;
    while(isUnsorted) {
      for(short bit = 31; bit >= 0; bit--) {
        if(input[i].bitAt(bit) === Bit.value.ON) {
          int
          output[i] = input[i]
        }
      }

    }
  }
/*  //two sorting methods: one uses a buffer of size input w/ no later parellelization, while the other can be parallelized for the second loop too (not just the first), but uses a buffer of size input,input
  public static void main(String[] args) {
  }
  public int[] lowBufferIntSorter(int[] input) {
    int[input.size] output;
    for(int i = Integer.MAX_VALUE; i > 0; i--) {
      for(int j = 0; j < input.size; j++) {
      }
    }
  }
  public int[] sortInts(int[] input) {
    //do here: convert each int to a stream of bits
    for each input: if MSB-checkedBits === 1 {
      put it in in array 1
      int[input.size][input.size] bufferArray;
      for(int i = 0; i < input.size; i++) {
        //this next loop can be parellelized!
        for(int j = 0; j < input.size; j++) {
        }
      }
    }
  }*/
}
