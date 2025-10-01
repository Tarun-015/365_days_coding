# Q25 – Selecting columns with dplyr
library(dplyr)

df <- data.frame(
  Name = c("A", "B", "C", "D"),
  Dept = c("IT", "HR", "IT", "Sales"),
  Salary = c(60000, 50000, 70000, 45000)
)

# Select only Name and Salary columns
selected_df <- df %>% select(Name, Salary)
print(selected_df)


# Concepts: select() to pick specific columns from a data frame.