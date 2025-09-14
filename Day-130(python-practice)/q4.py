# Q4 (Hero)

# Problem: Create an abstract class Notification with method send(msg). Implement classes for EmailNotification, SMSNotification, and PushNotification.

# Solution:

from abc import ABC, abstractmethod

class Notification(ABC):
    @abstractmethod
    def send(self, msg):
        pass

class EmailNotification(Notification):
    def send(self, msg):
        print(f"Email sent: {msg}")

class SMSNotification(Notification):
    def send(self, msg):
        print(f"SMS sent: {msg}")

class PushNotification(Notification):
    def send(self, msg):
        print(f"Push Notification: {msg}")

n1 = EmailNotification()
n2 = SMSNotification()
n3 = PushNotification()

n1.send("Your order has been shipped!")
n2.send("Your OTP is 123456")
n3.send("You have a new follower")


# Output:

# Email sent: Your order has been shipped!
# SMS sent: Your OTP is 123456
# Push Notification: You have a new follower