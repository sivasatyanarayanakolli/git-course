class Student{
    int roll;
    String name;
    int marks;
}


public class Array {
    public static void main(String a[])
    {
        
    //     int nums[][]=new int[3][];
    //     nums[0]=new int [3];
    //     nums[1]=new int[4];
    //     nums[2]=new int[2];



    //     for(int i=0;i<nums.length;i++){
    //         for(int j=0;j<nums[i].length;j++){
    
    //            nums[i][j]=(int)(Math.random()*100);
    //         }
    //     }
        
    // for(int n[]:nums)
    // {
    //     for(int m:n)
    //     {
    //         System.out.print(m+" ");
    //     }
    //     System.out.println();
    // }
    // // }
    // Student s1=new Student();
    // s1.roll=4;
    // s1.name="siva";

    Student s2=new Student();
    s2.roll=4;
    s2.name="siva";

    Student s3=new Student();
    s3.roll=4;
    s3.name="siva";

    Student students[]=new Student[3];
   // students[0]=s1;
    students[1]=s2;
    students[2]=s3;

        for(int i=0;i<=students.length;i++)
        {
            System.out.println(students[i].name+":"+students[i].roll);
        }
}
}