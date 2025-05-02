import random

class GuessTheNumber:
    def __init__(self, low=1, high=100, max_attempts=10):
        self.low = low
        self.high = high
        self.max_attempts = max_attempts
        self.secret_number = random.randint(self.low, self.high)
        self.attempts = 0

    def get_user_guess(self):
        try:
            guess = int(input(f"Enter your guess ({self.low}-{self.high}): "))
            if guess < self.low or guess > self.high:
                print(f"Please guess a number between {self.low} and {self.high}.")
                return self.get_user_guess()
            return guess
        except ValueError:
            print("Invalid input. Please enter a number.")
            return self.get_user_guess()

    def play(self):
        print(f"Welcome to 'Guess the Number'! You have {self.max_attempts} attempts.")
        while self.attempts < self.max_attempts:
            guess = self.get_user_guess()
            self.attempts += 1

            if guess == self.secret_number:
                print(f"🎉 Congratulations! You guessed it in {self.attempts} tries!")
                return
            elif guess < self.secret_number:
                print("Too low!")
            else:
                print("Too high!")

        print(f"Sorry, you've used all your attempts. The number was {self.secret_number}.")

# Run the game
if __name__ == "__main__":
    game = GuessTheNumber()
    game.play()
