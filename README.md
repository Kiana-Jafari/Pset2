Source code files for the Advanced Programming course, problem set 2, by Kiana Jafari, Computer Engineering Student

Dear Dr. Riahi,

I am so grateful that I have had the privilege to take my AP course with you.
Special thanks for everything you taught during this semester!

I am writing this to clarify my reasoning for the design I chose to solve Question 4:

Unfortunately, I couldn't exactly understand the wording "Course should be inherited from both Lesson and Teacher (which I called the class 'Lecturer'). Based on my understanding of OOP, we can use inheritance only if there's an `IS-A` relationship. 
A Course *might* be a `Lesson` (that is, possible to be inherited from the class `Lesson`), but it's not a `Teacher`. Therefore, I thought it would have been more appropriate to use `composition`, i.e., `HAS-A` relationship, rather than `inheritance`.

The Lesson will be taught in a Course and in different semesters, and by different Lecturers, for instance. Thus, from what I concluded, a course actually HAS A lesson AND a lecturer.

Furthermore, `interface` wouldn't have been an appropriate choice, since it has `IS-A` relationship in its underlying building blocks and structure.

The UML of my design is as follows:

```bash
          Person (abstract)
          /              \
    Student           Teacher

Lesson (abstract)

Course
 ├── Lesson lesson
 ├── Teacher teacher
 └── Student[] students

```

I'd love to hear from you and get a feedback in case I misunderstood any part of the assignment or lectures.

Thank you so much for the time you take!