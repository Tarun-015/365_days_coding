# Q43 – Student Marks Performance
students <- data.frame(
  Name = c("A","B","C","D","E","F"),
  Dept = c("IT","IT","HR","HR","Sales","Sales"),
  Marks = c(85, 92, 70, 60, 75, 80)
)

# Step 1: Add Grade column based on Marks
students <- students %>%
  mutate(Grade = case_when(
    Marks >= 90 ~ "A",
    Marks >= 75 ~ "B",
    Marks >= 60 ~ "C",
    TRUE ~ "Fail"
  ))

print(students)

# Step 2: Visualize count of students per Grade
ggplot(students, aes(x=Grade, fill=Grade)) +
  geom_bar() +
  labs(title="Student Grade Distribution", x="Grade", y="Count") +
  theme_minimal()


# Concepts: Conditional column creation + bar chart visualization.