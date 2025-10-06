# Q47 – Student Performance Dashboard Project

# Scenario: College wants to monitor student marks.
# Tasks:

# Create a dataset with Name, Dept, Marks, HoursStudied.

# Add Grade based on marks using case_when.

# Calculate average marks per department.

# Visualize:

# Grade distribution (bar chart)

# Marks vs Study Hours (scatter plot, color-coded by department)

# Average marks per department (bar chart)

# Concepts: mutate, group_by, summarize, ggplot2 (geom_bar, geom_point).

library(dplyr)
library(ggplot2)

# Dataset
students <- data.frame(
  Name = c("A","B","C","D","E","F"),
  Dept = c("IT","IT","HR","HR","Sales","Sales"),
  Marks = c(85,92,70,60,75,80),
  HoursStudied = c(5,6,4,3,4,5)
)

# Add Grade column
students <- students %>%
  mutate(Grade = case_when(
    Marks >= 90 ~ "A",
    Marks >= 75 ~ "B",
    Marks >= 60 ~ "C",
    TRUE ~ "Fail"
  ))

print(students)

# Grade distribution
ggplot(students, aes(x=Grade, fill=Grade)) +
  geom_bar() +
  labs(title="Student Grade Distribution", x="Grade", y="Count") +
  theme_minimal()

# Marks vs Study Hours scatter plot
ggplot(students, aes(x=HoursStudied, y=Marks, color=Dept)) +
  geom_point(size=3) +
  labs(title="Marks vs Study Hours by Department", x="Hours Studied", y="Marks") +
  theme_minimal()

# Average marks per department
dept_avg <- students %>%
  group_by(Dept) %>%
  summarize(AverageMarks = mean(Marks))

ggplot(dept_avg, aes(x=Dept, y=AverageMarks, fill=Dept)) +
  geom_bar(stat="identity") +
  labs(title="Average Marks per Department", x="Department", y="Average Marks") +
  theme_minimal()
