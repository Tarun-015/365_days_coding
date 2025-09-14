# Q3 (Advanced)

# Problem: Create an abstract class Database with methods connect() and disconnect(). Implement MySQLDatabase and MongoDBDatabase.

# Solution:

from abc import ABC, abstractmethod

class Database(ABC):
    @abstractmethod
    def connect(self): pass
    
    @abstractmethod
    def disconnect(self): pass

class MySQLDatabase(Database):
    def connect(self):
        return "Connected to MySQL"
    def disconnect(self):
        return "Disconnected from MySQL"

class MongoDBDatabase(Database):
    def connect(self):
        return "Connected to MongoDB"
    def disconnect(self):
        return "Disconnected from MongoDB"

db1 = MySQLDatabase()
print(db1.connect())
print(db1.disconnect())

db2 = MongoDBDatabase()
print(db2.connect())
print(db2.disconnect())


# Output:

# Connected to MySQL
# Disconnected from MySQL
# Connected to MongoDB
# Disconnected from MongoDB
