# Q23. Sorting a data frame by column values
df <- data.frame(Name=c("A","B","C","D"),
                 Score=c(75,90,60,85))

print("Sorted by Score (Descending):")
sorted_df <- df[order(-df$Score), ]
print(sorted_df)


# Concepts: Data frame ordering, indexing