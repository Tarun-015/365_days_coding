# Q28 – Grouping and summarizing data with group_by + summarize
# Average salary per department
avg_salary <- df %>%
  group_by(Dept) %>%
  summarize(AverageSalary = mean(Salary))
print(avg_salary)


Concepts:

# group_by() to group data by a column

# summarize() to compute aggregate statistics