# Q49 – Employee Performance Score

# Scenario: HR wants to rank employees based on salary and experience.

library(dplyr)
library(ggplot2)

# Dataset
employees <- data.frame(
  Name = c("A","B","C","D","E"),
  Dept = c("IT","IT","HR","HR","Sales"),
  Salary = c(60000,75000,50000,55000,40000),
  Experience = c(2,5,3,4,1)
)

# Performance score = Salary + 1000 * Experience
employees <- employees %>% mutate(PerformanceScore = Salary + 1000 * Experience)

# Top 3 performers
top_performers <- employees %>% arrange(desc(PerformanceScore)) %>% head(3)
print(top_performers)

# Visualization
ggplot(employees, aes(x=Name, y=PerformanceScore, fill=Dept)) +
  geom_bar(stat="identity") +
  labs(title="Employee Performance Scores", x="Employee", y="Score") +
  theme_minimal()