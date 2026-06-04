# Arab Academy for Science, Technology & Maritime Transport

## College of Computing and Information Technology

**Course:** Advanced Programming Applications  
**Sheet:** Week 14 - Threads (Cont'd)

---

## Exercise 1

A train has three cars; each car has an inspector to count the tickets. All inspectors must report to the train supervisor when the car is full. Only one inspector can report to the supervisor at a time.

The number of seats in the cars is:

| Car        | Number of Seats |
| ---------- | --------------- |
| First car  | 50              |
| Second car | 30              |
| Third car  | 20              |

An inspector must stop entering the tickets if the number of passengers exceeds the max capacity and notify the supervisor at once. When the 3 cars are full, the supervisor prints that the train is full.

Write a program to simulate this process using threads.

---

## Exercise 2

Write a program that has an array of size 100,000 filled with integers. Create three tasks to be performed on the array, where each task performs one of the following:

- Find the maximum number in the array.
- Calculate the average of the array.
- Find the index of a given number in the array. The index is `-1` if the number does not exist.

After the 3 tasks are done, print each result.

**Note:** Use a thread pool.

### What happens with each of the following lines of code?

- `ExecutorService executor = Executors.newFixedThreadPool(2);`
- `ExecutorService executor = Executors.newFixedThreadPool(1);`
- `ExecutorService executor = Executors.newCachedThreadPool();`
