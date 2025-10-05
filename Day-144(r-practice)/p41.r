# Q41 – Employee Salary Analysis
library(dplyr)
library(ggplot2)

employees <- data.frame(
  Name = c("A","B","C","D","E","F"),
  Dept = c("IT","IT","HR","HR","Sales","Sales"),
  Salary = c(60000, 75000, 50000, 55000, 40000, 47000)
)

# Step 1: Average salary per department
avg_salary <- employees %>%
  group_by(Dept) %>%
  summarize(AverageSalary = mean(Salary))

print(avg_salary)

# Step 2: Visualize average salary per department
ggplot(avg_salary, aes(x=Dept, y=AverageSalary, fill=Dept)) +
  geom_bar(stat="identity") +
  labs(title="Average Salary by Department", x="Department", y="Average Salary") +
  theme_minimal()


# Concepts: Grouping + summarization + bar chart visualization.