Student student1;
Student student2;
Teacher teacher;

void setup() {
  student1 = new Student("Christian", 25, false, "1b");
  student2 = new Student("Mikkel", 24, false, "1b");
  teacher = new Teacher("Jesper", 30, false); 
  println("Teachers name: " + teacher.name);
  println("Student 1 name & class: " + student1.name + ", " + student1.datamatikerTeam);
  println("Student 2 name & class: " + student2.name + ", " + student2.datamatikerTeam);
}
