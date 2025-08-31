# Q3 (Advanced)

# Problem: Write a generator that reads a text file line by line and yields only the lines containing a given keyword.

def search_in_file(filepath, keyword):
    with open(filepath, "r") as f:
        for line in f:
            if keyword in line:
                yield line.strip()

# Example usage:
for line in search_in_file("log.txt", "error"):
    print(line)
