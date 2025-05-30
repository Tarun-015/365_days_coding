// Class with basic student information

#include <iostream>
#include <string>
using namespace std;

class Student {
public:
    string name;
    int roll;
    float marks;

    void input() {
        cout << "Enter name: ";
        cin >> name;
        cout << "Enter roll number: ";
        cin >> roll;
        cout << "Enter marks: ";
        cin >> marks;
    }

    void display() {
        cout << "\nStudent Details:" << endl;
        cout << "Name: " << name << "\nRoll: " << roll << "\nMarks: " << marks << endl;
    }
};

int main() {
    Student s;
    s.input();
    s.display();
    return 0;
}
