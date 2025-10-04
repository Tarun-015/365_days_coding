# Q39 – Boxplot of Marks by Department
students <- data.frame(
  Marks = c(85, 92, 70, 60, 75, 80, 95, 55),
  Dept = c("IT","IT","HR","HR","Sales","Sales","IT","HR")
)

ggplot(students, aes(x=Dept, y=Marks, fill=Dept)) +
  geom_boxplot() +
  labs(title="Marks Distribution by Department", x="Department", y="Marks") +
  theme_minimal()


# Concepts: Boxplots for visualizing spread, outliers, and medians.