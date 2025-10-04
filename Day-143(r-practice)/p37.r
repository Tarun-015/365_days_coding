# Q37 – Stacked Bar Chart (Employees by Dept & Gender)
library(ggplot2)

dept <- data.frame(
  Dept = rep(c("IT","HR","Sales"), each=2),
  Gender = rep(c("Male","Female"), 3),
  Count = c(40,25, 30,20, 35,30)
)

ggplot(dept, aes(x=Dept, y=Count, fill=Gender)) +
  geom_bar(stat="identity") +
  labs(title="Stacked Employee Count by Department", x="Department", y="Count") +
  theme_minimal()


# Concepts: Stacked bars (default geom_bar(stat="identity") with fill).