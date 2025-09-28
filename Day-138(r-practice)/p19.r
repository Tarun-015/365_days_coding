# Q19. Apply multiple functions at once
nums <- c(10, 20, 30, 40, 50)
summary_stats <- data.frame(
  Min = min(nums),
  Max = max(nums),
  Mean = mean(nums),
  SD = sd(nums)
)
print(summary_stats)


# Concepts: Statistical functions + data frame creation
# Expected Output:

#   Min Max Mean       SD
# 1  10  50   30 15.81139