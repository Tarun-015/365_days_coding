# Q40 – Faceted Scatter Plot (Marks vs Hours by Dept)
students <- data.frame(
  Marks = c(85, 92, 70, 60, 75, 80, 95, 55),
  Hours = c(5, 6, 4, 3, 4, 5, 7, 2),
  Dept = c("IT","IT","HR","HR","Sales","Sales","IT","HR")
)

ggplot(students, aes(x=Hours, y=Marks)) +
  geom_point(color="darkred", size=3) +
  facet_wrap(~Dept) +
  labs(title="Marks vs Study Hours (Faceted by Dept)", x="Study Hours", y="Marks") +
  theme_minimal()


# Concepts: Faceting to split plots by category.