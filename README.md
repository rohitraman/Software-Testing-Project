# Software Testing - Mutation testing

## Overview

Tests can be created to verify the correctness of the implementation of a given software system, but the creation of tests still poses the question whether the tests are correct and sufficiently cover the requirements that have originated the implementation.[6] (This technological problem is itself an instance of a deeper philosophical problem named "Quis custodiet ipsos custodes?" ["Who will guard the guards?"].) The idea behind mutation testing is that if a mutant is introduced, this normally causes a bug in the program's functionality which the tests should find. This way, the tests are tested. If a mutant is not detected by the test suite, this typically indicates that the test suite is unable to locate the faults represented by the mutant, but it can also indicate that the mutation introduces no faults, that is, the mutation is a valid change that does not affect functionality. One (common) way a mutant can be valid is that the code that has been changed is "dead code" that is never executed.

For mutation testing to function at scale, a large number of mutants are usually introduced, leading to the compilation and execution of an extremely large number of copies of the program. This problem of the expense of mutation testing had reduced its practical use as a method of software testing. However, the increased use of object oriented programming languages and unit testing frameworks has led to the creation of mutation testing tools that test individual portions of an application.

## Test Case Strategy

The test strategy focused on a comprehensive approach to mutation testing, aiming to ensure the robustness of the project's algorithms. We targeted a diverse range of potential code alterations, covering mutations in conditionals, arithmetic operations, and return values.

The primary goal was to detect and resolve mutations categorized as 'KILLED,' signifying successful identification and resolution of code changes to maintain algorithm stability and correctness.

Addressing mutations categorized as 'SURVIVED' became a priority, indicating areas where the current test suite lacked coverage. Enhancing test coverage for these scenarios was essential for a more comprehensive testing approach.

Moreover, We aimed to cover areas marked as 'NO_COVERAGE,' intending to fill any potential gaps in the test suite, ensuring a thorough examination of the codebase.

Our strategy followed an iterative process, continuously refining the test suite to adapt to emerging code changes and ultimately bolster the reliability of the algorithms within the project

## Tools Used

### IntelliJ IDEA for Java:
This is a highly acclaimed integrated development environment (IDE) specifically tailored for Java. It's known for its robust set of features, intuitive interface, and extensive customization options. With a powerful array of tools and support for various plugins, IntelliJ IDEA enhances productivity by facilitating efficient code writing, debugging, and testing.

### PIT Mutation Testing Tool:
PIT (Programming Intelligence Tool) is a versatile and user-friendly mutation testing tool primarily designed for Java applications. Mutation testing involves making slight modifications (mutations) to the source code to assess the effectiveness of test cases in detecting these alterations. PIT simplifies this process by automatically creating mutated versions of the code and analyzing the effectiveness of the existing test suite. To integrate PIT seamlessly into the Eclipse IDE, the PITclipse plugin is utilized, enhancing Eclipse's functionality by incorporating PIT's mutation testing capabilities directly into the development environment.
https://pitest.org/ - for more info.

### Mutators

| Mutator             |
|---------------------|
| CONDITIONALS_BOUNDARY|
| EMPTY_RETURNS       |
| FALSE_RETURNS       |
| INCREMENTS          |
| INVERT_NEGS         |
| MATH                |
| NEGATE_CONDITIONALS |
| NULL_RETURNS        |
| PRIMITIVE_RETURNS   |
| TRUE_RETURNS        |
| VOID_METHOD_CALLS   |


### Tabulated Testing Results
## Package Summary

| Package | Classes | Line Coverage | Mutation Coverage | Test Strength |
|---------|---------|---------------|-------------------|---------------|
| org.mutation | 19 | 99% (1025/1037) | 88% (922/1044) | 89% (922/1035) |

## Breakdown by Class

| Class | Line Coverage | Mutation Coverage | Test Strength |
|-------|---------------|-------------------|---------------|
| ArrayAlgo.java | 96% (157/163) | 77% (124/161) | 79% (124/156) |
| ArrayQueue.java | 100% (8/8) | 100% (4/4) | 100% (4/4) |
| BinarySearchAlgo.java | 98% (45/46) | 84% (51/61) | 88% (51/58) |
| BitManipulationAlgo.java | 95% (18/19) | 93% (26/28) | 93% (26/28) |
| Calculator.java | 100% (5/5) | 100% (8/8) | 100% (8/8) |
| CircularQueue.java | 100% (16/16) | 100% (12/12) | 100% (12/12) |
| DPAlgo.java | 99% (267/268) | 92% (314/341) | 92% (314/340) |
| GraphAlgo.java | 98% (47/48) | 79% (11/14) | 79% (11/14) |
| HeapAlgo.java | 100% (32/32) | 94% (34/36) | 94% (34/36) |
| KMP.java | 100% (12/12) | 100% (13/13) | 100% (13/13) |
| LinkedList.java | 100% (35/35) | 100% (18/18) | 100% (18/18) |
| MergeIntervals.java | 92% (11/12) | 75% (9/12) | 75% (9/12) |
| Recursion.java | 100% (27/27) | 81% (25/31) | 81% (25/31) |
| SlidingWindowAlgo.java | 100% (51/51) | 92% (57/62) | 92% (57/62) |
| SortingAlgo.java | 99% (76/77) | 84% (69/82) | 84% (69/82) |
| StackAlgo.java | 100% (83/83) | 86% (60/70) | 86% (60/70) |
| StringAlgo.java | 100% (22/22) | 82% (14/17) | 82% (14/17) |
| StringMatch.java | 100% (13/13) | 93% (13/14) | 93% (13/14) |
| TreeAlgo.java | 100% (100/100) | 100% (60/60) | 100% (60/60) |


