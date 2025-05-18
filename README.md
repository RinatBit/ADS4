# ADS4
All code is inside the src/ folder for compatibility with the original assignment structure.

## Implemented Algorithms

### 1. CustomWeightedGraph.java (original: WeightedGraph.java)
A modified version of the weighted graph class. Changes included support for new structures of edges, different handling of weights, or utility methods.

### 2. CustomBreadthSearch.java (original: BreadthSearch.java)
Implements breadth-first traversal. It has been modified to work with the custom graph but with the same entry point for backwards compatibility.

### 3. CustomDijkstra.java (original: Dijkstra.java)
The Dijkstra algorithm implementation with customized touches. Adjusted to changes in the graph class while adhering to the standard interface as expected by Main.java.

## How to Use

1. Clone this repo, or download the ZIP file.
2. Copy-paste the contents of the src/ folder into the original example/src/ directory, provided in the assignment.
3. Compile and run using the unchanged Main.java.

For example:
```bash
javac src/*.java
java -cp src Main
