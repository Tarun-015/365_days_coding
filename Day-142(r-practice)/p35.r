# Q35 – Grouped Bar Chart by Department
dept <- data.frame(
  Dept = rep(c("IT","HR","Sales"), each=2),
  Gender = rep(c("Male","Female"), 3),
  Count = c(40,25, 30,20, 35,30)
)

ggplot(dept, aes(x=Dept, y=Count, fill=Gender)) +
  geom_bar(stat="identity", position="dodge") +
  labs(title="Employee Count by Dept & Gender", x="Department", y="Count") +
  theme_minimal()


# Concepts: Grouped bar plot with fill and position="dodge".