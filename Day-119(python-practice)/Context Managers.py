# Q3. Context Managers (with statement)

# Create your own custom context manager FileLogger (using __enter__ and __exit__) that:

# Opens a file for writing.

# Writes "Session Started" on enter and "Session Ended" on exit.

# Allows writing messages inside the with block.

class FileLogger:
    def __init__(self, filename):
        self.filename = filename

    def __enter__(self):
        self.file = open(self.filename, "w")
        self.file.write("Session Started\n")
        return self.file   # gives access to file object inside `with`

    def __exit__(self, exc_type, exc_value, traceback):
        self.file.write("Session Ended\n")
        self.file.close()

# Usage
with FileLogger("log.txt") as f:
    f.write("Logging some activity...\n")
