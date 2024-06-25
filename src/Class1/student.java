package Class1;
 class student {
    String branchName;
    String studentName;
    int rollno;
    int marks;
    

student(int rollno , int marks , String branchName , String studentName){
    this.branchName = "COMPUTER APPLICATION";
    this.studentName = "DEEPAK KUMAR";
    this.rollno = 45;
    this.marks = 339;
    
}
void display()
{
    System.out.println("\n Roll no:- " + rollno + "\n Marks:- " + marks+ "\n branchName:- " + branchName + "\n Student Name: - " + studentName);
}
public static void main(String[] args) {
    student st = new student(0, 0, null, null);
    st.display();
   
}
}


