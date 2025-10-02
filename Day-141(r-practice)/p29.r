# Q29 – Employee dataset: filter + select + arrange
library(dplyr)

employees <- data.frame(
  ID = 1:6,
  Name = c("A","B","C","D","E","F"),
  Dept = c("IT","HR","Sales","IT","HR","Sales"),
  Salary = c(60000, 50000, 40000, 75000, 52000, 47000)
)

# Step 1: Filter only IT department
it_employees <- employees %>% filter(Dept == "IT")

# Step 2: Select Name and Salary columns
it_selected <- it_employees %>% select(Name, Salary)

# Step 3: Arrange in descending order of Salary
it_sorted <- it_selected %>% arrange(desc(Salary))

print(it_sorted)


# Concepts: Combining filter(), select(), and arrange().