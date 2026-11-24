use std::io;

fn main() {
    const PASS_MARKS: f64 = 40.0;

    let mut name = String::new();
    let mut age = String::new();
    let mut marks = String::new();

    println!("===== STUDENT INFORMATION SYSTEM =====");

    println!("Enter your name:");
    io::stdin().read_line(&mut name).expect("Input error");

    println!("Enter your age:");
    io::stdin().read_line(&mut age).expect("Input error");

    println!("Enter your marks:");
    io::stdin().read_line(&mut marks).expect("Input error");

    let age: u32 = age.trim().parse().expect("Enter a valid age");
    let marks: f64 = marks.trim().parse().expect("Enter valid marks");

    let result = if marks >= PASS_MARKS {
        "PASS"
    } else {
        "FAIL"
    };

    println!("\n===== STUDENT REPORT =====");
    println!("Name: {}", name.trim());
    println!("Age: {}", age);
    println!("Marks: {}", marks);
    println!("Result: {}", result);
}