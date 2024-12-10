# Uncommon 'continue' Keyword Behavior in Java 'while' Loop

This repository demonstrates a subtle bug related to the `continue` keyword within a `while` loop in Java.  The example showcases how the `continue` statement can lead to unexpected behavior, especially when dealing with nested loops or intricate conditions.  This type of error can be difficult to identify without careful code review.

## Bug Description:

The Java code in `UncommonBug.java` demonstrates an example where the `continue` statement, though seemingly innocuous, may cause unexpected iterations to be skipped.

## Solution:

The solution in `UncommonBugSolution.java` is provided as a robust approach to address the unexpected behavior caused by the `continue` statement.

## How to Reproduce:

1. Clone this repository.
2. Compile and run `UncommonBug.java`. Observe the output.
3. Compare the output with the expected output, noticing which iterations are unexpectedly skipped.
4. Run `UncommonBugSolution.java` to see the correct output.