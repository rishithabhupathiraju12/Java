public class Day5_loops{
    public static void main(String[] args){
        for(int i=11; i<=19; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}


//public String stringTimes(String str, int n) {
    String result="";
    for(int i=0;i<n;i++){
      result = result + str;
      
    }
    return result;
  }


  //public String frontTimes(String str, int n) {
    String result="";
    int end=3;
    if(str.length()<3){
      end=str.length();
    }
    
    
    
    String front=str.substring(0,end);
    for(int i=0;i<n;i++){
      result = result+front;
    }
    return result;
  }