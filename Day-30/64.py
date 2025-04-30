# Create a class Time with the following specification:

# Attributes

# time: int, represents time in seconds

# Methods

# (1) __init__: accept time in seconds as an argument and assign it to the corresponding attribute

# (2) seconds_to_minutes: convert the value of time into minutes and return a string in the format: "<minutes> min <seconds> sec". For example: if the value of the attribute time is 
# 170
# 170, this method should return the string "2 min 50 sec"

# (3) seconds_to_hours: convert the value of time into hours and return a string in the format: "<hours> hrs <minutes> min <seconds> sec". For example: if the value of the attribute time is 
# 10890
# 10890, this method should return the string "3 hrs 1 min 30 sec"

# (4) seconds_to_days: convert the value of time into days and return a string in the format: "<days> days <hours> hrs <minutes> min <seconds> sec". For example: if the value of the attribute time is 
# 86460
# 86460, this method should return the string "1 days 0 hrs 1 min 0 sec"

# (1) Each test case corresponds to one or more method calls. We will use T to denote the name of the object.

# (2) You do not have to accept input from the user or print output to the console. You just have to define the class based on the specifications given in the question.

class Time:
    def __init__(self, time):
        self.time = time
    def seconds_to_minutes(self):
        self.minutes = self.time // 60
        self.seconds = self.time % 60
        return f'{self.minutes} min {self.seconds} sec'

    def seconds_to_hours(self):
        self.seconds_to_minutes()
        self.hours = self.minutes // 60
        self.minutes = self.minutes % 60
        return f'{self.hours} hrs {self.minutes} min {self.seconds} sec'

    def seconds_to_days(self):
        self.seconds_to_hours()
        self.days = self.hours // 24
        self.hours = self.hours % 24
        return f'{self.days} days {self.hours} hrs {self.minutes} min {self.seconds} sec'        
