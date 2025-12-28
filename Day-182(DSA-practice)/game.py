# Game Idea:

# You (the player) have a heap that starts empty.
# You can insert, remove, or view elements — and the game rewards you for maintaining a valid Max Heap.

# Each action shows you the current heap array and structure.
# If you mess up the heap property (by cheating 😄), the program will detect and warn you.

import heapq

class MaxHeapGame:
    def __init__(self):
        self.heap = []
        print("🎮 Welcome to the Heap Builder Challenge 🎮")
        print("Your goal: Build and maintain a Max Heap!")
        print("Commands: insert <num> | remove | show | quit\n")

    def insert(self, num):
        heapq.heappush(self.heap, -num)
        print(f"✅ Inserted {num} into heap.")
        self.show()

    def remove(self):
        if not self.heap:
            print("⚠️ Heap is empty!")
            return
        val = -heapq.heappop(self.heap)
        print(f"💣 Removed max element: {val}")
        self.show()

    def show(self):
        current = [-x for x in self.heap]
        print("📦 Current Heap:", current)
        print("🏗️ Structure (level order):", current)
        print("-" * 40)

    def play(self):
        while True:
            cmd = input("👉 Enter command: ").strip().lower()

            if cmd.startswith("insert"):
                try:
                    num = int(cmd.split()[1])
                    self.insert(num)
                except:
                    print("❌ Invalid input! Use: insert <number>")
            elif cmd == "remove":
                self.remove()
            elif cmd == "show":
                self.show()
            elif cmd == "quit":
                print("👋 Exiting the Heap Builder Challenge. Great job!")
                break
            else:
                print("❌ Unknown command! Try: insert, remove, show, quit")


if __name__ == "__main__":
    game = MaxHeapGame()
    game.play()
