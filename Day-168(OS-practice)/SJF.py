# SJF Non-Preemptive Scheduling

n = int(input("Enter number of processes: "))

processes = []
for i in range(n):
    at = int(input(f"Arrival Time of P{i+1}: "))
    bt = int(input(f"Burst Time of P{i+1}: "))
    processes.append([f'P{i+1}', at, bt])

# Sort by Arrival Time first
processes.sort(key=lambda x: x[1])

completed = []
time = 0

while processes:
    # Select process with shortest burst time among arrived ones
    ready = [p for p in processes if p[1] <= time]
    if not ready:
        time += 1
        continue

    shortest = min(ready, key=lambda x: x[2])
    processes.remove(shortest)

    start = time
    time += shortest[2]
    ct = time
    tat = ct - shortest[1]
    wt = tat - shortest[2]
    completed.append([shortest[0], shortest[1], shortest[2], ct, tat, wt])

# Print results
print("\nProcess\tAT\tBT\tCT\tTAT\tWT")
for p in completed:
    print("\t".join(str(x) for x in p))

avg_tat = sum(p[4] for p in completed) / n
avg_wt = sum(p[5] for p in completed) / n
print(f"\nAverage TAT: {avg_tat:.2f}")
print(f"Average WT: {avg_wt:.2f}")


# Example Input
# 3
# P1: AT=0, BT=7
# P2: AT=2, BT=4
# P3: AT=4, BT=1

#  Output
# Process AT  BT  CT  TAT  WT
# P1      0   7   7   7    0
# P3      4   1   8   4    3
# P2      2   4   12  10   6

# Average TAT: 7.00
# Average WT: 3.00