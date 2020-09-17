int x = 3;
Student[] studentArray = {
  new Student("Christian", 25, false, "1b"), 
  new Student("Mikkel", 24, false, "1b"), 
  new Student("Jesper", 22, false, "1b"), 
  new Student("Peter", 21, false, "1b"), 
  new Student("Martin", 25, false, "1b"), 
  new Student("Michael", 26, false, "1b"), 
  new Student("Frederik", 28, false, "1b"), 
  new Student("Otto", 22, false, "1b"), 
  new Student("Jacob", 21, false, "1b"), 
  new Student("Tobias", 25, false, "1b")
};


void setup() {
  //returnName(studentArray, x);
  returnName1(studentArray, x);
  searchName(studentArray, "Peter");
}

void returnName(Student[] tempStudentArray, int tempX) {
  for (int i = 0; i < tempStudentArray.length; i++) {
    println(tempStudentArray[i].name) ;
  }
}

void returnName1(Student[] tempStudentArray, int tempX) {
  println(tempStudentArray[tempX].name) ;
}

void searchName(Student[] tempStudentArray, String search) {
  int x = 0;
  for (int i = 0; i < tempStudentArray.length; i++) {
    if (tempStudentArray[i].name == search) {
       println("Index: " + i);
       x++;
    } 
  }
  if (x == 0) {
    println("No name match");
  }
  x = 0;
}
