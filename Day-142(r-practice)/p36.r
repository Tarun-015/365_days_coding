# Q36 – Scatter Plot with Categories
students <- data.frame(
  Marks = c(85, 92, 70, 60, 75, 80, 95, 55),
  Hours = c(5, 6, 4, 3, 4, 5, 7, 2),
  Dept = c("IT","IT","HR","HR","Sales","Sales","IT","HR")
)

ggplot(students, aes(x=Hours, y=Marks, color=Dept)) +
  geom_point(size=3) +
  labs(title="Marks vs Study Hours by Department", x="Study Hours", y="Marks") +
  theme_minimal()


# Concepts: Scatter plot with categories using color.