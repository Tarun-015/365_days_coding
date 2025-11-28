# Round Robin Scheduling in Python
from collections import deque

n = int(input("Enter number of processes: "))
quantum = int(input("Enter time quantum: "))

processes = []
for i in range(n):
    arrival = int(input(f"Arrival time of P{i+1}: "))
    burst = int(input(f"Burst time of P{i+1}: "))
    processes.append({'pid': i+1, 'arrival': arrival, 'burst': burst, 'remaining': burst, 'completion': 0})

time = 0
queue = deque()
visited = [False] * n
completed = 0

while completed < n:
    # add processes to queue
    for i in range(n):
        if processes[i]['arrival'] <= time and not visited[i]:
            queue.append(i)
            visited[i] = True
    if queue:
        idx = queue.popleft()
        exec_time = min(quantum, processes[idx]['remaining'])
        processes[idx]['remaining'] -= exec_time
        time += exec_time
        # add new arrivals during execution
        for i in range(n):
            if processes[i]['arrival'] <= time and not visited[i]:
                queue.append(i)
                visited[i] = True
        if processes[idx]['remaining'] > 0:
            queue.append(idx)
        else:
            processes[idx]['completion'] = time
            completed += 1
    else:
        time += 1

print("\nPID\tArrival\tBurst\tCompletion\tTurnaround\tWaiting")
for p in processes:
    tat = p['completion'] - p['arrival']
    wt = tat - p['burst']
    print(f"{p['pid']}\t{p['arrival']}\t{p['burst']}\t{p['completion']}\t\t{tat}\t\t{wt}")
