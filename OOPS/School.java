package JAVA_DSA_Learning.OOPS;
class Subject {
    private String subID ;
    private String subName ;
    private int subMaxMarks ;
    private int subMarksObtain ;

    public Subject(String subID , String subName , int subMaxMarks ){
        this.subID = subID ;
        this.subName = subName ;
        this.subMaxMarks = subMaxMarks;
    }
    public String getSubID(){
        return subID;
    }

    public String getSubName(){ return subName;}
    public int getSubMaxMarks(){return subMaxMarks;}
    public int getSubMarksObtain(){return subMarksObtain;}

    public void setSubMarksObtain(int mm){
        subMarksObtain  = mm;
    }

    boolean isQualified(){
        return subMarksObtain >= subMaxMarks / 10*4 ;
    }
    public String toString(){
        return  "\nSubject ID :"+subID+"\nSubject Name: " +subName+"\nMax Marks: "+subMaxMarks+"\nMarks Obtain : "+subMarksObtain ;
    }
}
public class School {
    public static void main(String [] args){
        Subject sub[] = new Subject[6];  // this is not object // this is reference to a object of subject
        // so we must create an object of subject . Object of subject containing all the properties of Subject class like SubId , SubName , maxMarks etc...
         sub[0] = new Subject("MCA-101","Java",100);
         sub[1] = new Subject("MCA-102","OS",100);
         sub[2] = new Subject("MCA-103","DBMS",100);
         sub[3] = new Subject("MCA-104","Computer Architecture",100);
         sub[4] = new Subject("MCA-105","Math",100);
         sub[5] = new Subject("MCA-106" ,"Web Application",100);
         

         // using for we can only print the value in sub array.  // we can't fill value in sub array by using for loop
        for(Subject s : sub){
            System.out.println(s);
        }


    }
}
