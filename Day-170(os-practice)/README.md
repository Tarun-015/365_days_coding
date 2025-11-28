CPU Scheduling Algorithms Implemented

    LRTF (Longest Remaining Time First)

Type: Preemptive

Logic: Always executes the process with the longest remaining burst time.

Use Case: Rarely used in real systems; useful for understanding preemptive priority based on burst length.

    SRTF (Shortest Remaining Time First)

Type: Preemptive

Logic: Always executes the process with the shortest remaining burst time.

Advantage: Minimizes average waiting time compared to FCFS and LJF.

    Round Robin (RR)

Type: Preemptive

Logic: Each process gets a fixed time quantum in cyclic order.

Advantage: Fair to all processes; suitable for time-sharing systems.

Key Parameter: Time quantum, which affects responsiveness and throughput.
