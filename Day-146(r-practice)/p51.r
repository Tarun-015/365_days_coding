# Q51 – Student Marks vs Study Hours Regression

# Scenario: Predict marks based on study hours.

students <- data.frame(
  Name = c("A","B","C","D","E"),
  HoursStudied = c(2,4,5,3,6),
  Marks = c(50,65,70,60,80)
)

# Linear regression model
model <- lm(Marks ~ HoursStudied, data=students)
summary(model)

# Predict marks for 7 study hours
predict(model, data.frame(HoursStudied=7))

# Scatter plot with regression line
library(ggplot2)
ggplot(students, aes(x=HoursStudied, y=Marks)) +
  geom_point(color="blue", size=3) +
  geom_smooth(method="lm", color="red") +
  labs(title="Marks vs Study Hours", x="Hours Studied", y="Marks") +
  theme_minimal()
