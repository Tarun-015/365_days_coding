# FCFS (First Come First Serve)

n = int(input("Enter number of processes: "))

processes = []
for i in range(n):
    at = int(input(f"Arrival Time of P{i+1}: "))
    bt = int(input(f"Burst Time of P{i+1}: "))
    processes.append([f'P{i+1}', at, bt])

# Sort by Arrival Time
processes.sort(key=lambda x: x[1])

# Initialize variables
time = 0
completed = []

for p in processes:
    pid, at, bt = p
    if time < at:
        time = at  # CPU waits till process arrives
    ct = time + bt
    tat = ct - at
    wt = tat - bt
    completed.append([pid, at, bt, ct, tat, wt])
    time = ct

# Print output
print("\nProcess\tAT\tBT\tCT\tTAT\tWT")
for p in completed:
    print("\t".join(str(x) for x in p))

avg_tat = sum(p[4] for p in completed) / n
avg_wt = sum(p[5] for p in completed) / n

print(f"\nAverage Turnaround Time: {avg_tat:.2f} ms")
print(f"Average Waiting Time: {avg_wt:.2f} ms")


# Example Input
# Enter number of processes: 3
# Arrival Time of P1: 0
# Burst Time of P1: 4
# Arrival Time of P2: 1
# Burst Time of P2: 3
# Arrival Time of P3: 2
# Burst Time of P3: 1

# Output
# Process AT  BT  CT  TAT  WT
# P1      0   4   4   4    0
# P2      1   3   7   6    3
# P3      2   1   8   6    5

# Average Turnaround Time: 5.33 ms
# Average Waiting Time: 2.67 ms