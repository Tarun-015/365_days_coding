# Q17. Merge two data frames
students <- data.frame(ID=c(1,2,3), Name=c("A","B","C"))
marks <- data.frame(ID=c(1,2,3), Score=c(85,90,75))

merged <- merge(students, marks, by="ID")
print(merged)


# Concepts: Data frames, joins/merging
# Expected Output:

#   ID Name Score
# 1  1    A    85
# 2  2    B    90
# 3  3    C    75