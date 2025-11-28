# Shortest Remaining Time First (SRTF) – Preemptive
# SRTF Scheduling in Python
n = int(input("Enter number of processes: "))

processes = []
for i in range(n):
    arrival = int(input(f"Arrival time of P{i+1}: "))
    burst = int(input(f"Burst time of P{i+1}: "))
    processes.append({'pid': i+1, 'arrival': arrival, 'burst': burst, 'remaining': burst, 'completion': 0})

time = 0
completed = 0

while completed < n:
    idx = -1
    min_remaining = float('inf')
    for i in range(n):
        if processes[i]['arrival'] <= time and processes[i]['remaining'] > 0:
            if processes[i]['remaining'] < min_remaining:
                min_remaining = processes[i]['remaining']
                idx = i
    if idx != -1:
        processes[idx]['remaining'] -= 1
        time += 1
        if processes[idx]['remaining'] == 0:
            processes[idx]['completion'] = time
            completed += 1
    else:
        time += 1

print("\nPID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting")
for p in processes:
    tat = p['completion'] - p['arrival']
    wt = tat - p['burst']
    print(f"{p['pid']}\t{p['arrival']}\t{p['burst']}\t{p['completion']}\t\t{tat}\t\t{wt}")