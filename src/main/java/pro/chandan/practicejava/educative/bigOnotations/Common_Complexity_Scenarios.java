package pro.chandan.practicejava.educative.bigOnotations;

public class Common_Complexity_Scenarios {
/** Big O Notation: Describes how the runtime scales to some input variable.
*       Rules:
 *        1. Different Steps get added - O(a+b) if doStepA(); then doStepB();
 *        2. Drop constants - O(2n) equivalent to O(n)
 *        3. Different input = different variables - O(a*b) for length of array A & B
 *        4. Drop non-dominate terms - O(n) + O(n^2) => O(n^2) - find the fastest growing term.
*       Big O notations
 *        1. O(1) - constant time
 *        2. O(n) - linear time
 *        3. O(n^2) = quadratic time
 *
*/
    public static void main(String[] args) {
        int n = 10000000;

    /**  Simple for-loop with an increment of size 1 */
        for (int i = 0; i < n; i++) {
/*  Running Time Complexity = T(n) = (2n + 2) + cn = (2 + c)n + 2  => O(n)
*        Java increments i from 0 > n-1 times and thus the loop increment
*        stmt occurs a total of n times. The comparison stmt runs n+1 times.
*        The initialization i = 0 runs once.
*
*        Summing them up, we get a running time complexity of the for loop
*        of `n+n+1+1=2n+2` {i++|i < n | i = 0}
*        Now the constant time statements in the loop itself each run n times
*        Suppose the statement inside the loop accounts for a constant running
*        time of `c` in each iteration; they account for a total running time
*        of `cn` throughout the loop's lifetime. Hence the running time
*        complexity is `(2n+2)+cn`
*/
        }
        int k = 10;
        /** For-loop with increments of size k */
        for (int i = 0; i < n; i+=k) {
/*  Running Time Complexity = 2 + n((2 + c) / k ) => O(n)
*       i = 0 runs once; then `i` gets incremented by `k` until it reaches `n`.
*       x will be incremented to [0,k,2k,3k,..,(mk) <n]. Hence, the incrementation
*       part x+=k of the for loop takes FLOOR(n/k)times.
*       The comparison part of the for loop takes the same amount of time
*       and on more iteration for the last comparison. So this loop takes
*       `1+1+(n/k)+(n/k)` => `2+(2n/k)` time. While the statements in the
*       loop itself take c * (n/k) time. Hence in total,
*       `2+(2n/k)+(cn/k)`=`2+n((2+c)/k)` times. Eventually giving us O(n).
*/
        }
        int m = 10000;
        /** Simple nested For-loop */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
/*  Running Time Complexity = nm(2 + c) + 2 + 4n => O(nm)
*       The inner loop is a simple for loop that takes `(2m+2)+cm` time
*       and the outer loop runs it n times, so it takes `n((2m+2)+cm)` time.
*       Additionally, the initialization, increment and test for the outer
*       loop take `2n+2` time so in total, the running time is
*       `n((2m+2)+cm)+2n+2` => `2nm+4n+cnm+2` => `nm(2+c)+4n+2`, which is O(nm).
*/
            }
        }

        /** Nested For-loop with dependent variables */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
/*  Running Time Complexity = O(n^2)
*       Outer loop runs `n` times and for each time the outer loop runs,
*       inner loop runs `i` times. On the first iteration, the inner loop
*       does not run as i = 0; and then it increments with i until i is n-1.
*       So in total it runs `c+2c+3c+...+(n-1)c` times.
*       `cSUM[(i=1 > n-1) i] = c((n-1)((n-1)+1))/2 => cn(n-1)/2`
*       The initialization of j in the inner loop runs once in each iteration
*       of the outer loop and thus incurs a running time of n. In the first
*       iteration of the outer loop, j<i statement runs once, in the second
*       iteration it runs twice, and so on. Total run time of `1+2+3+..+n`
*       which is `n(n+1)/2`.
*       So in total, the inner loop has the running time of
*       `cn(n-1)/2 + n(n+1)/2 + n(n-1)/2 + n`
*       The outer loop initializing, test and increment operation account
*       for  a running time of `2n+2`. That means the entire script has a
*       running time of `2n+2 + cn(n-1)/2 + n + n(n+1)/2 + n(n-1)/2` which
*       is O(n^2).
*/
            }
        }
        /** Nested For-loop With Index Modification */
        for (int i = 0; i < n; i++) {
            i*=2;
            for (int j = 0; j < i; j++) {
/*  Running time complexity = O(n)
*       Outer Loop --v|s-- Inner Loop
*       i = 0         |     i = 0*2 = 0
*       i = 1         |     i = 1*2 = 2
*       i = 3         |     i = 3*2 = 6
*       ...           |     ...
*       i = (n-1)     |     i = 2(n-1)
*       In the outer loop we are iterating by doubling i and then incrementing
*       by 1 and thus following log2(n-1). The inner loop is being executed
*       at about `2n` and since `2n` dominates over `log2(n)` we get O(n) as
*       our Running time complexity.
*       We could have looked at this from the top and come to a rough estimate
*       that the runtime complexity is O(n^2).  Since we go through outer loop
*       `n` times and then the inner loop `n` times, but it wouldn't be as
*       tightly bound.
*/
            }
        }
        /** Loops with Log(n) time complexity */
        int i = 1;
        while (i < n) {
            i*=k;
/*  Running Time Complexity = Logk(n) => O(logk(k))
*       Any loop statement that multiplies or divides the loop variable by
*       a constant would take logk(n) time to execute; where k is a constant.
*/
        }

        /** Challenge 1: Compute the Big O complexity with Addition*/
        n = 10;
        int sum = 0;
        double pie = 3.14;
        for (int x = 0; x < n; x = x+3) { // n/3 steps
            System.out.println("Pie: "+ pie); // n/3 steps
            for (int j = 0; j < n; j = j+2) { // (n/3 * n/2) steps
                sum++;
                System.out.println("Sum = "+sum); // (n/3 * n/2) steps
            }
        }
//        Answer: O(n^2)

        /** Challenge 2: Compute the Big O complexity with Subtraction*/
        for (int x = 0; x >= 1; x = x-3) {
            System.out.println("Pie: "+pie);
            for (int j = 0; j >= 0; j = j-1) {
                sum++;
            }
        }
        System.out.println("Sum = "+sum);
//        Answer: O(n^2)

        /** Challenge 3: Compute the Big O complexity with Multiplication*/
        while (i < n) { //O(log(n))
            System.out.println("Pie: "+pie);
            for (int j = 0; j < i; j++) { //2n
                sum++; // (2n-1)
            }
            i*=2; //O(log(n))
        }
        System.out.println("Sum: "+sum); //O(1)
//        Answer: O(n)

        /** Challenge 4: Nested Loop with Multiplication (basic) */
        n = 10;
        sum = 0;
        i = 1;

        while (i<n) { // O(log3(n))
            System.out.println("Pie: "+pie);
            for (int j = 0; j < n; j = j+2) { //O(log3(n)) * n/2
                sum++; // O((log3(n)) * (n/2) * 2)
            }
            i *=3; // O(log3(n))
        }
        System.out.println("Sum: "+sum);

//        Answer: O(nlog(n))

        /** Challenge 5: Nested Loop with Multiplication (intermediate) */
        n = 10;
        sum = 0;
        i = 1;

        for (int j = 0; j < n; j+=3) { // O(n/3)
            System.out.println("Pie: "+pie);
            i=1; // O(n/3)
            while (i<n) { // O((n/3) * (log3(n)))
                sum+=1; // O((n/3) * (log3(n)))
                i *=3;  // O((n/3) * (log3(n)))
            }
        }
        System.out.println("Sum: "+sum); //O(1)
//        Answer: O(nlog(n))

        /** Challenge 6: Nested Loop with Multiplication (advance) */
        n = 10;
        sum = 0;

        for (int j = 0; j < n; j++) { // O(n)
            int a = 1; // O(n)
            System.out.println("Pie: "+pie); // O(n)
            while (a < j) { // O(n + (log2(j))
                sum+=1;  // O(n + (log2(j))
                a*=2;    // O(n + (log2(j))
            }
        }
        System.out.println("Sum: "+sum); // O(1)
//        Answer: O(n(log(n))
        /** Challenge 7: Nested Loop with Multiplication (pro) */
        n = 10;
        sum = 0;
        i =1;

        for (int j = 0; j < n; j++) { // O(n)
            System.out.println("Pie: "+pie); // O(n)
            while (i < j) { // O(n)
                sum+=1; // O(n)
                i *=2;  // O(n)
            }
        }
        System.out.println("Sum: "+sum);
//        Answer: O(n2)
    }
}
