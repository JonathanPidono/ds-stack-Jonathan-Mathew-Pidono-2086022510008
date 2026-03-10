
Question 1 — Balanced Bracket Checker
How to Compile & Run
bashjavac Question1.java
java Question1
What It Does
Checks whether a bracket string is balanced using a stack. The algorithm splits the string in half — the first half is pushed onto a stack, then compared against the second half in reverse.
Input Format
A single string of bracket characters on one line.
Enter bracket string: ({[]})
Balanced: true
Enter bracket string: ([)]
Balanced: false
Assumptions & Edge Cases

An empty string is considered balanced (true).
Strings with an odd length are immediately false.
Only supports (), {}, and []. Other characters will cause the check to fail.
The algorithm assumes the string is structured as mirrored halves (e.g., ({[ + ]})) rather than standard nested bracket validation — so ()[]{} would return false even though it is conventionally balanced.


Question 2 — RPN (Reverse Polish Notation) Evaluator
How to Compile & Run
bashjavac Question2.java
java Question2
What It Does
Evaluates a mathematical expression written in Reverse Polish Notation using a stack.
Input Format
Space-separated tokens (numbers and operators +, -, *, /) on one line.
Masukkan ekspresi RPN: 3 4 + 2 *
14
Masukkan ekspresi RPN: 5 1 2 + 4 * + 3 -
14
Assumptions & Edge Cases

Supports integer arithmetic only.
Division truncates toward zero (e.g., 7 / 2 = 3).
Input is assumed to be a valid RPN expression — no validation is performed for malformed input.
Division by zero will throw a runtime exception.


Question 3 — Stack-Based Number Encoding
How to Compile & Run
bashjavac Question3.java
java Question3
What It Does
Encodes integers as a sequence of operations (1, d+, 1+) that reconstruct the number from 1 using doubling and incrementing. Multiple numbers are processed in reverse order using a stack, with accumulated distortion correction applied between steps.
Input Format
First line: number of test cases n
Next n lines: one integer per line
3
5
3
7
Expected output: a combined encoding string processed in reverse order with distortion accumulation.
Assumptions & Edge Cases

All input values must be positive integers greater than 0.
Numbers are processed in reverse order (last-in, first-processed) via a stack.
Distortion accumulation adjusts each target value by the number of + operations in previously emitted routes.
No input validation — non-integer input will throw a NumberFormatException.


Question 4 — Stack Sorting (Secret Code)
How to Compile & Run
bashjavac Question4.java
java Question4
What It Does
Takes a sequence of integers, pushes them onto a stack, then performs an incremental selection-sort using only stack operations. The final sorted sequence is printed as the "secret code."
Input Format
Space-separated integers on a single line.
Masukkan nilai: 5 3 8 1 4
Kode rahasia: 1 3 4 5 8
Assumptions & Edge Cases

Input must be space-separated integers only.
Sorting is ascending (smallest first in output).
The algorithm uses a secondary buffer stack to perform in-place stack sorting without any array manipulation after the initial load.
Empty input will cause an exception.


Question 5 — Binary Representation via Stack
How to Compile & Run

What It Does
Takes a positive integer, repeatedly divides it by 2, and pushes each intermediate value onto a stack. Popping the stack prints the values in descending order (from original down to 1).
Input Format
A single integer.
Enter a number: 8
1 2 4 8
Enter a number: 10
1 2 5 10
Assumptions & Edge Cases

Input must be a positive integer (> 0).
The output is not a binary representation — it is the sequence of values produced by repeated integer division by 2 from the input down to 1.
Inputting 0 or negative numbers will produce an infinite loop or unexpected output.
Only handles int range values.


  References
[1] Claude AI. "Assisted in Q2 RPN Evaluator 
    and Q4 Stack Sorting logic."

[2] Hanzz. "Assisted in Q3 Stack-Based 
    Number Encoding."
