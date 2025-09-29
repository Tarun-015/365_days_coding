# Q24. Write a custom function with condition
grade <- function(marks) {
  if (marks >= 90) {
    return("A")
  } else if (marks >= 75) {
    return("B")
  } else if (marks >= 60) {
    return("C")
  } else {
    return("Fail")
  }
}

scores <- c(95, 82, 70, 45)
grades <- sapply(scores, grade)
result <- data.frame(Score=scores, Grade=grades)
print(result)


# Concepts: Functions, conditionals, applying over vectors