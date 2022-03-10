package pro.chandan.practicejava.educative.bigOnotations;

public class BigONotation_ProblemSet {
    void problemSet1_insertionSort(int[] input) {
//        input is a sorted array
        for (int i = 1; i < input.length; i++) { // O(n)
            int key = input[i]; //O(n)
            for (int j = i - 1; j >= 0; j--) { // O(n)
                if (input[j] > key) { // not happen input[0] always > input[1]
                    int tmp = input[j]; //
                    input[j] = key;
                    input[j + 1] = tmp;
                }
            }
        }
//        The algorithm represents insertion sort. However, the way the code is written,
//        there’s no short-circuiting for the nested loop when the values are already
//        sorted so even in the best case, i.e. when the array is sorted the inner loops
//        runs from the start of the array to the end. Unlike the implementation of
//        insertion sort in the lesson, the short-circuiting would never make the inner
//        loop run when the input array is already sorted. The best case time would be
//        linear and not quadratic. However for the above snippet, the best case would
//        still be quadratic. The point to drive home, is to exercise caution as slight
//        implementation changes can change complexities for the same algorithm

        int j = 0;
//       array is already sorted in ascending order.
        for (int i = 0; i < input.length; i++) {
            int key = input[i];
            j = i -1;
            while (j >= 0 && input[j] > key) {
                if (input[j] > key) {
                    int tmp = input[j];
                    input[j] = key;
                    input[j+1] = tmp;
                    j--;
                }
            }
        }
//        The executions for the outer loop would remain the same which is 22.
//        The inner loop will never run any iterations as the key would always
//        be bigger than the preceding element. The two conditions of the inner
//        loop would be evaluated for each iteration of the outer loop for a
//        total of 5 * 2 = 10. The total instructions executed would be 22 + 10 = 32.

//        The instruction executions for the outer loop will remain the same,
//        i.e. [ 2 x (n + 1) + 2n ]. In the inner loop, for each of the total n
//        iterations of the outer loop, the two inner loop conditions will get
//        tested for n * 2 times. Summing the count for the two loops would yield
//        6n + 2. Note this is a linear function of the input size whereas the worst
//        case is a quadratic function of the input size.
    }

    void problemSet2_analysisNotation(int[] input) {
/**  Q1: Suppose your friend discovers a new algorithm and in his
*        excitement tells you that his algorithm has a lower bound of
*        O(n^2). Can you explain why your friend's statement makes no sense?
*/   //  lower bound of n^2 = 0 ... how can you have a lower bound then that.

/**  Q2: Does O(n^(2n)) equal O(2^n)
 */  //  No. (n^n) >> (2^n)

/**  Q3: Give an example of an algorithm whose best case is equal to its worst case?
 */  //  DK
        

    }
}
