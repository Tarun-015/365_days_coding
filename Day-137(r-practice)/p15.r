# Q15. Data frame subsetting + conditions
df <- data.frame(Name=c("A","B","C","D"), Score=c(70,85,90,60))
high_scorers <- df[df$Score > 80, ]
print(high_scorers)


# Concept: Filtering rows in a data frame using conditions.
# Expected Output:

#   Name Score
# 2    B    85
# 3    C    90