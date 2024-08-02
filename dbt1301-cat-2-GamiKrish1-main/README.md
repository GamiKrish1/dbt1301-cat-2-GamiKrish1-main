# DBT1301: Data Structures and Algorithms
# Instructor: Eric Muhati
# CAT 2 (200 points) - Take Home

## You MUST do this assignment alone! If you use existing internet material for your answers, you must provide a citation. AI code generators are strictly prohibited. Any AI generate code will result in a 0 grade for this assignment, and **you will be reported for misconduct**. Always watch the class Piazza channel for updates on assignments. Read all instructions carefully! You'll find skeleton .java classes in the src folder.

# Due Friday July 30th, 2024
# Part 1 (100 points): Fundamentals of Data Structures

- a) Implement the following data structures in Java. Each implementation should include methods for insertion, deletion, search, and traversal:
  - i) Linked List
  - ii)Stack
  - iii) Queue
  - iv) Binary Search Tree
- b) Choose any two data structures (Linked List, Stack, Queue, Binary Search Tree) and compare their use in solving one of the following problems. Provide reasoning for which data structure you would choose and why.
  - i) **Managing a Task Scheduler**: Tasks need to be added, removed, and retrieved in a specific order.
  - ii) **Implementing Undo Functionality in an Application**: Actions need to be stored and undone in reverse order.
  - iii) **Handling Print Jobs in a Printer Queue**: Print jobs need to be processed in the order they are received.
  - iv) **Creating a Contact List with Efficient Search**: Contacts need to be searchable by name quickly.
  - v) **Maintaining a Navigation History in a Web Browser**: Websites visited need to be stored and navigated back in reverse order.
- c) Describe the pros and cons of each data structure in relation to the chosen problem and justify your choice of the most appropriate data structure for the task.

# Part 2 (50 points): Algorithm Analysis
- a) You manage MPESA which has a large number of transactions. You need to sort these transactions based on the amount transferred and then identify the top 10 highest transactions:
  - i) Design an efficient algorithm to handle this task. **Write the algorithm in pseudocode**.
  - ii) Discuss the time complexity of your algorithm using Big O, Omega (Ω), and Theta (Θ) notations.
  - iii) Implement your algorithm in Java code and test it with various input cases to ensure correctness and efficiency.
  
# Part 3 (50 points): Sorting Algorithm
- a) Write a Java program to generate an array of 100,000 random numbers. Implement the following sorting algorithms and use them to sort the generated array:
  - i) Bubble Sort
  - ii) Selection Sort
  - iii) Insertion Sort
  - iv) Quick Sort
  - v) Merge Sort
  
- b) Measure and record the time taken by each sorting algorithm to sort the array. Plot a graph comparing the performance of each sorting algorithm.
  - i) **x-axis**: The X-axis will represent the percentage of the sorting completed (from 0% to 100%) for Bubble Sort, Selection Sort, Insertion Sort, Quicksort, Merge Sort. 
  - ii) **Y-axis**: The Y-axis will represent the time taken to sort the array (in milliseconds).
  
- c) Discuss the results of the performance comparison. Include the generated array, the recorded times, and the plotted graph in your submission.

# Submission Instructions (read carefully) 
For part 1, submit you .java files for part 1(a) and for part(b) and (c), include your responses in a pdf. For part 2, include your response for (a)(i) and (ii) in your pdf and submit your code for part (iii) together with your input for testing. For part 3, submit your code part (a) together without randomly generated array, then include in your pdf submission your response for part (b) and (c).

**NB**: You will include all pdf content in one pdf. Make a pdf file with your first and last name, plus CAT2. For example, I would have mine as ericmuhati_CAT2.pdf. Ensure the submission has a cover page.

To submit your assignment, commit your changes with the tag (commit message) as “CAT2-final”, within your GitHub account.
