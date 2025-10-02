# Q31 – Student marks: group_by + summarize + arrange
students <- data.frame(
  Name = c("A","B","C","D","E","F"),
  Dept = c("IT","IT","HR","HR","Sales","Sales"),
  Marks = c(85, 92, 70, 60, 75, 80)
)

# Step 1: Group by Department
# Step 2: Find average, max, and min marks
dept_summary <- students %>%
  group_by(Dept) %>%
  summarize(
    AvgMarks = mean(Marks),
    MaxMarks = max(Marks),
    MinMarks = min(Marks)
  )

# Step 3: Arrange departments by AvgMarks
dept_sorted <- dept_summary %>% arrange(desc(AvgMarks))

print(dept_sorted)


# Concepts: Multi-stat aggregation using summarize().