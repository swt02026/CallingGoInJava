import org.golang.libCallByJava_h;

class CallGO{
    public static void main(String[] args){
        long go_result = libCallByJava_h.Add(1,23);
        System.out.println("go Add result");
        System.out.println(go_result);
    }
}