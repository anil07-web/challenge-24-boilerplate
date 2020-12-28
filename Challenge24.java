import java.util.Scanner;
public class Challenge24 {
       static float sum=0,hig=0;
       static  int n,index=0;
       static String []stn=new String[100];
       static  int []rl=new int[100];
       static  float []math=new float[100];
       static  float []sci=new float[100];
       static  float []eng=new float[100];
       static   float []lang=new float[100];
       static   float []ss=new float[100];
       static float []total=new float[100];
       static float []avg=new float[100];
       static char  []grade=new char[100];
       static  int count=0;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("The number of students");
        n=obj.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the student name");
        stn[i]=obj.next();
        System.out.println("Enter the his/her Roll NUmber");
        rl[i]=obj.nextInt();
        System.out.println("Enter the his/her Marks in math");
        math[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Science");
        sci[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in English");
        eng[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Language");
        lang[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Social Studies");
        ss[i]=obj.nextFloat();
        } 
        Challenge24 object = new Challenge24();
        object.TotalMarks();
        object.Passed();
        object.Reportcard();
        object.Histogram();
    }
        public void TotalMarks() {
        System.out.println("Studentname");
        for(int j=0;j<n;j++){
         total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]);
         System.out.println(stn[j]+"\t\t\t"+total[j]+" (Total marks)");
         if(j==0)
          hig=total[j];
         if(total[j]>hig){
          hig=total[j];
          index=j;
         }
        }
        System.out.println("\nTopper name");
        System.out.println(stn[index]+"\t\t\t"+rl[index]+" (Roll No.)");
        System.out.println("\nAverage marks in each subject of the students:");
         for(int i=0;i<n;i++){
          sum=sum+math[i];
          if(i==n-1)
          System.out.println("\nAverage marks in math "+sum/n);
          }
         sum=0;
         for(int i=0;i<n;i++){
          sum=sum+sci[i];
          if(i==n-1)
          System.out.println("\nAverage marks in science "+sum/n);
         }
         sum=0;
         for(int i=0;i<n;i++){
          sum=sum+eng[i];
          if(i==n-1)
          System.out.println("\nAverage marks in english "+sum/n);
         }
         sum=0;
         for(int i=0;i<n;i++){
          sum=sum+lang[i];
          if(i==n-1)
          System.out.println("\nAverage marks in language "+sum/n);
         }
         sum=0;
         for(int i=0;i<n;i++){
          sum=sum+ss[i];
          if(i==n-1)
          System.out.println("\nAverage marks in social studies "+sum/n);
         }
        }
         public void Passed() {
         System.out.println("Passed: ");
        System.out.println("Studentname");
         for(int j=0;j<n;j++){
        if(math[j]>=35&&sci[j]>=35&&eng[j]>=35&&lang[j]>=35&&ss[j]>=35){
         count=count+1;
        System.out.println(stn[j]+"   \t\t"+rl[j]+" (Roll No.)");
        }
        }
        System.out.println("The number of students who have cleared the examination "+count);
        System.out.println("------------------------------------------------------------------ ");
        count=0;
        System.out.println("Failed: ");
        System.out.println("Studentname");
        for(int j=0;j<n;j++){
        if(math[j]<35 || sci[j]<35 || lang[j]<35 || lang[j]<35 || ss[j]<35){
        count=count+1;
        System.out.println(stn[j]+"    \t\t"+rl[j]+" (Roll No.)");
        }
        }
        System.out.println("The number of students who needs to mandatorily repeat the examination "+count+"\n");
        }
        public void Reportcard() {
            System.out.println();
            for(int j=0;j<n;j++){
            avg[j]=total[j]/5;
            if(avg[j]>=90)
              grade[j]='O';
             else if(avg[j]>=80&&avg[j]<90)
              grade[j]='A';
             else if(avg[j]>=70&&avg[j]<80)
              grade[j]='B';
             else if(avg[j]>=60&&avg[j]<70)
              grade[j]='C';
             else if(avg[j]>=50&&avg[j]<60)
              grade[j]='D';
             else 
              grade[j]='E';
            } 
            System.out.println("Student name");
            for(int j=0;j<n;j++){
              if(grade[j]=='E')
             System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
              }
            for(int j=0;j<n;j++){
              if(grade[j]=='D')
              System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
              }
            for(int j=0;j<n;j++){
              if(grade[j]=='C')
              System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
            }
            for(int j=0;j<n;j++){
              if(grade[j]=='B')
              System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
              }
            for(int j=0;j<n;j++){
               if(grade[j]=='A')
               System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
                }
            for(int j=0;j<n;j++){
                if(grade[j]=='O')
               System.out.println(stn[j]+"     \t\t"+grade[j]+"(Grade)\t"+total[j]+"(Total Marks)\t\t"+avg[j]+"(Average Marks)");
                  }
               System.out.println("\nscore card for a student:\n");
                for(int j=0;j<n;j++){
                System.out.println("Name: "+stn[j]+"       Roll number: "+rl[j]);
                System.out.println("Subject Name          Marks");
                System.out.println("Math                  "+math[j]);
                System.out.println("Science               "+sci[j]);
                System.out.println("English               "+eng[j]);
                System.out.println("Language              "+lang[j]);
                System.out.println("Social Studies        "+ss[j]);
                System.out.println("          Total Marks:"+total[j]+" Grade: "+grade[j]);
                System.out.println();
                }      
               }
               public void Histogram() {
                int i=0;
                for(int j=0;j<n;j++){
                total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]);
                avg[j]=total[j]/5;
                }
                for(int j=0;j<n;j++){
                if(avg[j]>=90)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=80)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=70)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=60)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=50)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                } 
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=40)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }  
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=30)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=20)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                if(avg[j]>=10)
                {     
                System.out.print("*");
                System.out.print("   ");
                }
                else{
                System.out.print("    ");
                }
                }
                System.out.println();
                for(int j=0;j<n;j++){
                System.out.print(rl[j]+"  ");
                }
             } 
                   
            
}
