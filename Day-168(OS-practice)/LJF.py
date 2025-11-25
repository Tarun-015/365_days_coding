# Longest Job First (Non-Preemptive) Scheduling

n = int(input("Enter number of processes: "))

processes = []
for i in range(n):
    at = int(input(f"Arrival Time of P{i+1}: "))
    bt = int(input(f"Burst Time of P{i+1}: "))
    processes.append([f'P{i+1}', at, bt])

# Sort by Arrival Time
processes.sort(key=lambda x: x[1])

completed = []
time = 0

while processes:
    # Filter processes that have arrived
    ready = [p for p in processes if p[1] <= time]
    
    if not ready:
        time += 1
        continue
    
    # Select process with the longest burst time
    longest = max(ready, key=lambda x: x[2])
    processes.remove(longest)
    
    pid, at, bt = longest
    start = time
    time += bt
    ct = time
    tat = ct - at
    wt = tat - bt
    completed.append([pid, at, bt, ct, tat, wt])

# Output
print("\nProcess\tAT\tBT\tCT\tTAT\tWT")
for p in completed:
    print("\t".join(str(x) for x in p))

avg_tat = sum(p[4] for p in completed) / n
avg_wt = sum(p[5] for p in completed) / n
print(f"\nAverage Turnaround Time: {avg_tat:.2f}")
print(f"Average Waiting Time: {avg_wt:.2f}")


# Example Input
# 3
# P1: AT=0, BT=5
# P2: AT=1, BT=8
# P3: AT=2, BT=3

# Output
# Process AT  BT  CT  TAT  WT
# P1      0   5   5   5    0
# P2      1   8   13  12   4
# P3      2   3   16  14   11

# Average TAT: 10.33
# Average WT: 5.00