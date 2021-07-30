
package javaexample52stringoperationpart3stringbuffer;


public class JavaExample52StringOperationPart3StringBuffer {

    
    // using StringBuffer
    // append two strings
    // StringBuffer is used suitably in multi-threads programming
    
    
    public static void main(String[] args) {
        
        
        StringBuffer sb1=new StringBuffer("abcdefghijkl");
        
        StringBuffer sb2=new StringBuffer("*******");        
        
        String str ="...mnop...";
        
        System.out.println("first: "+sb1);
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");
        System.out.println("second: "+sb1.append(str));
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");
        System.out.println("third: "+sb1.append(sb2));                
        System.out.println("sb1 capacity is: "+sb1.capacity());
        System.out.println("sb1 length is: "+sb1.length());
        System.out.println("---");

    }
    
}
