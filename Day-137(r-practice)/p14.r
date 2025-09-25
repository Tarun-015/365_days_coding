# Q14. Grouping & summarizing with tapply()
scores <- c(85, 90, 75, 88, 92, 70)
group <- c("A","A","B","B","C","C")
avg_scores <- tapply(scores, group, mean)
print(avg_scores)


# Concept: Apply function to subsets of data.
# Expected Output:

#   A   B   C 
# 87.5 81.5 81.0