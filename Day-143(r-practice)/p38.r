# Q38 – Histogram of Student Marks
students <- data.frame(
  Marks = c(85, 92, 70, 60, 75, 80, 95, 55, 68, 74, 88, 90)
)

ggplot(students, aes(x=Marks)) +
  geom_histogram(binwidth=10, fill="steelblue", color="black") +
  labs(title="Distribution of Student Marks", x="Marks", y="Frequency") +
  theme_minimal()


# Concepts: Histogram to show frequency distribution.