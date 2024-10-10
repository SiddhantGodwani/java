class Student{
    String name;
    int marks;
    int rollno;
}

public class Array
    {
       public static void main(String args[])
        {
            Student s1= new Student();
            s1.name= "Sid";
            s1.marks= 19;
            s1.rollno= 120;

            Student s2= new Student();
            s2.name= "ddd";
            s2.marks= 11;
            s2.rollno= 10;

            Student s3= new Student();
            s3.name= "nnn";
            s3.marks= 18;
            s3.rollno= 20;

            //Students array
            Student students[] = new Student[3];
            //Assigning values to array 
            students[0]=s1;
            students[1]=s2;
            students[2]=s3;

            // for(int i=0;i<3;i++)
            //     {//students[i] will print the address only
            //         System.out.println(students[i]+":"+students[i].name+":"+ students[i].marks);
            //     }

            //enhanced for loop
            for(Student nums: students)
                {
                    System.out.println(nums.name+ ":"+ nums.rollno+":"+nums);
                }


        // Numbers array
            int nums[]= new int[4];
            nums[0]=1;
            nums[1]=2;
            nums[2]=3;
            nums[3]=4;

            // for(int i= 0;i<4;i++)
            //     {
            //         System.out.println(nums[i]);
            //     }

//enhanced for loop:

                for(int n:nums)
                {
                    System.out.println(n);
                }

        } 
    }