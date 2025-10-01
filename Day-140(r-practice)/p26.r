# Q26 – Filtering rows with dplyr
# Filter employees with Salary > 50000
high_salary <- df %>% filter(Salary > 50000)
print(high_salary)


# Concepts: filter() to subset rows based on conditions.