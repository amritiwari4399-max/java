public class arraymarks {
    public static void main(String[] args) {
       String[] names = {"Amrit", "Aman", "Rohit", "Sahil", "Ankit"};
       int[] marks = {85, 90, 78, 92, 88};
       double hieghestMarks = marks[0];
       int hieghestIndex = 0;
       for (int i = 1; i < marks.length; i++) {
           if (marks[i] > hieghestMarks) {
               hieghestMarks = marks[i];
               hieghestIndex = i;
           }
       }
       System.out.println("Student with the highest marks: " + names[hieghestIndex]);
       System.out.println("Highest marks: " + hieghestMarks);

    }
    
}

