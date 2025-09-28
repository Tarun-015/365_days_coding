# Q18. Aggregate function on grouped data
df <- data.frame(Dept=c("IT","IT","HR","HR","Sales","Sales"),
                 Salary=c(60000,70000,50000,55000,40000,45000))

avg_salary <- aggregate(Salary ~ Dept, df, mean)
print(avg_salary)


# Concepts: Grouping & summarization in R
# Expected Output:

#     Dept Salary
# 1     HR 52500
# 2     IT 65000
# 3  Sales 42500