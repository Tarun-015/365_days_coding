# Q16. Custom function with default arguments
greet <- function(name="Student", course="R Programming") {
  cat("Hello", name, "! Welcome to", course, "\n")
}
greet("Tarun")
greet()


# Concept: User-defined functions with default parameters.
# Expected Output:

# Hello Tarun ! Welcome to R Programming 
# Hello Student ! Welcome to R Programming
