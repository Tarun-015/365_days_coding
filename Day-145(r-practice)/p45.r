# Q45 – Employee Department Analysis Project

# Scenario: HR wants insights about employee distribution and salaries.
# Tasks:

# Create a dataset with EmployeeID, Name, Dept, Salary, Gender.

# Calculate average salary per department.

# Find department-wise male/female counts.

# Visualize:

# Average salary per department (bar chart)

# Gender distribution per department (stacked bar chart)

# Concepts: dplyr (group_by, summarize), ggplot2 (geom_bar, position="stack").

library(dplyr)
library(ggplot2)

# Dataset
employees <- data.frame(
  EmployeeID = 1:8,
  Name = c("A","B","C","D","E","F","G","H"),
  Dept = c("IT","IT","HR","HR","Sales","Sales","IT","HR"),
  Salary = c(60000,75000,50000,55000,40000,47000,72000,53000),
  Gender = c("M","F","M","F","M","F","M","F")
)

# Average salary per department
avg_salary <- employees %>%
  group_by(Dept) %>%
  summarize(AverageSalary = mean(Salary))

print(avg_salary)

# Visualize average salary per department
ggplot(avg_salary, aes(x=Dept, y=AverageSalary, fill=Dept)) +
  geom_bar(stat="identity") +
  labs(title="Average Salary by Department", x="Department", y="Average Salary") +
  theme_minimal()

# Gender distribution per department
gender_count <- employees %>%
  group_by(Dept, Gender) %>%
  summarize(Count = n())

# Stacked bar chart
ggplot(gender_count, aes(x=Dept, y=Count, fill=Gender)) +
  geom_bar(stat="identity") +
