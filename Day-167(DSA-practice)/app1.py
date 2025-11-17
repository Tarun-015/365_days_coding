from collections import deque

#using queue
def first_non_repeating(s):
    freq = {}
    q = deque()
    result = ""

    for ch in s:
        freq[ch] = freq.get(ch, 0) + 1
        q.append(ch)

        # Remove characters from front that are repeating
        while q and freq[q[0]] > 1:
            q.popleft()

        # Append result
        if q:
            result += q[0]
        else:
            result += '#'

    return result

# Example
s = "aabc"
print(first_non_repeating(s))   # Output: a#bb
