public class comapre_str {
    public static void main(String[] args) {
        String uid="dIwdGlGEoDaNY8tRKKhsoIIogjS2";
        String uid1="mSEUu0aokESNzXSjkJdQ7OkAfTt2";
        int result=uid.compareTo(uid1);
        System.out.println(result);
        String room="";
        if(result<0){
            room=uid+"_"+uid1;
        }else{
            room=uid1+uid;
        }
        System.out.println(room);
        //  String first="abc";
        //  String second="def";
        // System.out.println(second.compareTo(first));
        // System.out.println(first.compareTo(second));
        String info="";
        if(info.length()==0){
            System.err.println("No info");
        }else{
            System.out.println("Information");
        }
        System.out.println();
        String sen1="1Y+QFL08dxNH/gQoxVC/QA==";
        String sen2="1Y+QFL08dxNH/gQoxVC/QA==";
        if(sen1.equals(sen2)){
            System.out.println("Matched");
        }
    }
}
