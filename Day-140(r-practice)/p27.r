# Q27 – Creating new columns with mutate
# Add a new column Bonus (10% of Salary)
df_bonus <- df %>% mutate(Bonus = 0.10 * Salary)
print(df_bonus)


# Concepts: mutate() to create new variables in a data frame.