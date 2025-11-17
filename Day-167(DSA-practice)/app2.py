# sing Stack + Dictionary (Conceptual Approach)

# Unlike queue (which keeps characters in arrival order),
# a stack reverses order (LIFO), so we can’t directly track “first” non-repeating.

# But we can use a stack to help remove repeating characters from the end — for example,
# to find the last non-repeating or to filter out repeats.

# Here’s one version using a stack + dictionary:


def first_non_repeating_stack(s):
    stack = []
    freq = {}
    result = ""

    for ch in s:
        freq[ch] = freq.get(ch, 0) + 1
        stack.append(ch)

        # Remove characters from top that are repeating
        while stack and freq[stack[-1]] > 1:
            stack.pop()

        # Append result
        if stack:
            result += stack[-1]   # top element (last non-repeating)
        else:
            result += '#'

    return result


# Example
s = "aabc"
print(first_non_repeating_stack(s))